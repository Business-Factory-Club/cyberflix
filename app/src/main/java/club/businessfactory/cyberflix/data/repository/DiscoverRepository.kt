package club.businessfactory.cyberflix.data.repository

import club.businessfactory.cyberflix.data.entity.ResultsResponse

interface DiscoverRepository {
    suspend fun getResults(): ResultsResponse
}