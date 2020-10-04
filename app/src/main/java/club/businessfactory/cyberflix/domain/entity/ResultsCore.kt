package club.businessfactory.cyberflix.domain.entity

data class ResultsCore (
    val id: Int,
    val voteAverage: Double,
    val title: String,
    val releaseDate: String,
    val overview: String,
    val posterPath: String,
    val genres: Array<Int>
)