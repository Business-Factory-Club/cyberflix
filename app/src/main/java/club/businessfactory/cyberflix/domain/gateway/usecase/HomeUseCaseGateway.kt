package club.businessfactory.cyberflix.domain.gateway.usecase

import club.businessfactory.cyberflix.domain.entity.CategoryMoviesCore

interface HomeUseCaseGateway {

    suspend fun getResults(): List<CategoryMoviesCore>
}