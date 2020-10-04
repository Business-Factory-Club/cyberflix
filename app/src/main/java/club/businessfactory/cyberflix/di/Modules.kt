package club.businessfactory.cyberflix.di

import club.businessfactory.cyberflix.data.dataprovider.ResultsDataProvider
import club.businessfactory.cyberflix.data.implementation.MockDiscoverRepository
import club.businessfactory.cyberflix.data.implementation.RetrofitDiscoverRepository
import club.businessfactory.cyberflix.data.repository.DiscoverRepository
import club.businessfactory.cyberflix.domain.gateway.dataprovider.HomeDataProviderGateway
import club.businessfactory.cyberflix.domain.gateway.usecase.HomeUseCaseGateway
import club.businessfactory.cyberflix.domain.usecase.HomeUseCase
import club.businessfactory.cyberflix.presentation.feature.home.viewmodel.HomeViewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val applicationModule = module (override = true){
    factory { HomeViewModel() }
    factory <HomeUseCaseGateway> { HomeUseCase() }
    factory <HomeDataProviderGateway> { ResultsDataProvider() }
    factory <DiscoverRepository> {  RetrofitDiscoverRepository() }
//    factory <DiscoverRepository> {  MockDiscoverRepository() }

    single <Retrofit> {
        Retrofit.Builder()
            .baseUrl(Endpoint.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}