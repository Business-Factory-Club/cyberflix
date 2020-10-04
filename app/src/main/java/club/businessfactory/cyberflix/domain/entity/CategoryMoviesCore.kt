package club.businessfactory.cyberflix.domain.entity

data class CategoryMoviesCore(
    var name: String = "",
    var movies: List<ResultsCore> = mutableListOf()
)
