package club.businessfactory.cyberflix.data.implementation

import club.businessfactory.cyberflix.data.entity.ResultsResponse
import club.businessfactory.cyberflix.data.repository.DiscoverRepository
import club.businessfactory.cyberflix.data.service.DiscoverService
import kotlinx.coroutines.coroutineScope
import org.koin.core.KoinComponent
import org.koin.core.inject
import retrofit2.Retrofit

class RetrofitDiscoverRepository: DiscoverRepository, KoinComponent{

    private val retrofit: Retrofit by inject()

    override suspend fun getResults(): ResultsResponse {
        return coroutineScope {
            val discoverService = retrofit.create(DiscoverService::class.java)
            discoverService.getResults("252bfe2b09304c349d741a6d90557176")
        }
    }
}