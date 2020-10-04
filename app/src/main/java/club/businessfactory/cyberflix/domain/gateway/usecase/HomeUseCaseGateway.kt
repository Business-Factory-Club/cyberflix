package club.businessfactory.cyberflix.domain.gateway.usecase

import club.businessfactory.cyberflix.domain.entity.ResultsCore

interface HomeUseCaseGateway {

    suspend fun getResults(): List<ResultsCore>
}