package club.businessfactory.cyberflix.data.dataprovider.mapper

import club.businessfactory.cyberflix.data.entity.ResultsResponse
import club.businessfactory.cyberflix.domain.entity.ResultsCore

class ResultsMapper {

    companion object {
        fun responseToCore(resultsResponse: ResultsResponse): List<ResultsCore> {
            val results = resultsResponse.results
            val resultsList: MutableList<ResultsCore> = mutableListOf()

            results.forEach { results ->
                val resultsCore = ResultsCore(
                    id = results.id,
                    voteAverage = results.voteAverage,
                    title = results.title,
                    releaseDate = results.releaseDate,
                    overview = results.overview,
                    posterPath = results.posterPath
                )
                resultsList.add(resultsCore)
            }

            return resultsList
        }
    }

}