package club.businessfactory.cyberflix.domain.usecase

import club.businessfactory.cyberflix.domain.entity.ResultsCore
import club.businessfactory.cyberflix.domain.gateway.dataprovider.HomeDataProviderGateway
import club.businessfactory.cyberflix.domain.gateway.usecase.HomeUseCaseGateway
import org.koin.core.KoinComponent
import org.koin.core.inject

class HomeUseCase : HomeUseCaseGateway, KoinComponent {

    private val resultsDataProvider: HomeDataProviderGateway by inject()

    override suspend fun getResults(): List<ResultsCore> {
        return resultsDataProvider.getResults()
    }

}