package club.businessfactory.cyberflix.domain.usecase

import club.businessfactory.cyberflix.domain.entity.CategoryMoviesCore
import club.businessfactory.cyberflix.domain.gateway.dataprovider.HomeDataProviderGateway
import club.businessfactory.cyberflix.domain.gateway.usecase.HomeUseCaseGateway
import club.businessfactory.cyberflix.domain.usecase.mapper.HomeUseCaseMapper
import org.koin.core.KoinComponent
import org.koin.core.inject

class HomeUseCase : HomeUseCaseGateway, KoinComponent {

    private val resultsDataProvider: HomeDataProviderGateway by inject()

    override suspend fun getResults(): List<CategoryMoviesCore> {
        val results = resultsDataProvider.getResults()
        return HomeUseCaseMapper.resultListToCategoryMovieList(results)
    }

}