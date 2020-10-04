package club.businessfactory.cyberflix.data.dataprovider.mapper

import club.businessfactory.cyberflix.data.entity.ResultsResponse
import club.businessfactory.cyberflix.domain.entity.ResultsCore

class ResultsMapper {

    companion object {
        fun responseToCore(resultsResponse: ResultsResponse): List<ResultsCore> {
            val results = resultsResponse.results
            val resultsList: MutableList<ResultsCore> = mutableListOf()

            results.forEach { result ->
                val resultsCore = ResultsCore(
                    id = result.id,
                    voteAverage = result.voteAverage,
                    title = result.title,
                    releaseDate = result.releaseDate,
                    overview = result.overview,
                    posterPath = result.posterPath,
                    genres = result.genres
                )
                resultsList.add(resultsCore)
            }

            return resultsList
        }
    }

}