package club.businessfactory.cyberflix.domain.gateway.dataprovider

import club.businessfactory.cyberflix.domain.entity.ResultsCore

interface HomeDataProviderGateway {

    suspend fun getResults(): List<ResultsCore>
}