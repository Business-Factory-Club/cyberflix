package club.businessfactory.cyberflix.data.dataprovider

import club.businessfactory.cyberflix.data.dataprovider.mapper.ResultsMapper
import club.businessfactory.cyberflix.data.repository.DiscoverRepository
import club.businessfactory.cyberflix.domain.entity.ResultsCore
import club.businessfactory.cyberflix.domain.gateway.dataprovider.HomeDataProviderGateway
import org.koin.core.KoinComponent
import org.koin.core.inject

class ResultsDataProvider: KoinComponent, HomeDataProviderGateway {

    private val discoverRepository: DiscoverRepository by inject()

    override suspend fun getResults(): List<ResultsCore> {
        val response = discoverRepository.getResults()
        return ResultsMapper.responseToCore(response)
    }

}