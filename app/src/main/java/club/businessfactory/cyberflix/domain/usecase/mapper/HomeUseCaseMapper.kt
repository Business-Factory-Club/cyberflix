package club.businessfactory.cyberflix.domain.usecase.mapper

import club.businessfactory.cyberflix.domain.constants.Category
import club.businessfactory.cyberflix.domain.entity.CategoryMoviesCore
import club.businessfactory.cyberflix.domain.entity.ResultsCore

class HomeUseCaseMapper {
    companion object {
        fun resultListToCategoryMovieList(results: List<ResultsCore>) : List<CategoryMoviesCore> {
            val categoryList: MutableList<CategoryMoviesCore> = mutableListOf()
            val genreIds = getCategoryIds(results)

            genreIds.forEach { genre ->
                val movies = results.asSequence().filter { it.genres[0] == genre }.toList()
                val name = getGenreName(genre)

                categoryList.add(CategoryMoviesCore(name, movies))
            }

            return categoryList
        }

        private fun getGenreName(genre: Int): String {
            return when(genre) {
                Category.ACTION.code -> "Ação"
                Category.CRIME.code -> "Crime"
                Category.DRAMA.code -> "Drama"
                Category.FAMILY.code -> "Família"
                Category.ANIMATION.code -> "Animação"
                Category.HORROR.code -> "Terror"
                Category.SCI_FI.code -> "Ficação Científica"
                else -> "Indefinido"
            }
        }

        private fun getCategoryIds(results: List<ResultsCore>) : List<Int> {
            val genresIds: MutableList<Int> = mutableListOf()

            results.forEach { result ->
                if(!genresIds.contains(result.genres[0])) {
                    genresIds.add(result.genres[0])
                }
            }

            return genresIds
        }
    }
}