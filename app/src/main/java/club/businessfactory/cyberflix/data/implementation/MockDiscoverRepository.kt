package club.businessfactory.cyberflix.data.implementation

import club.businessfactory.cyberflix.data.entity.MockResults
import club.businessfactory.cyberflix.data.entity.Results
import club.businessfactory.cyberflix.data.entity.ResultsResponse
import club.businessfactory.cyberflix.data.repository.DiscoverRepository

class MockDiscoverRepository : DiscoverRepository {

    override suspend fun getResults(): ResultsResponse {
        val resultList: MutableList<Results> = mutableListOf()

        for (i in 0..2) {
            val result = Results(
                MockResults.id,
                MockResults.voteAverage,
                MockResults.title,
                MockResults.releaseDate,
                MockResults.overview,
                MockResults.posterPath
            )
            resultList.add(result)
        }

        return ResultsResponse(resultList)
    }

}