package club.businessfactory.cyberflix.presentation.feature.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import club.businessfactory.cyberflix.R
import club.businessfactory.cyberflix.domain.entity.CategoryMoviesCore
import club.businessfactory.cyberflix.domain.entity.ResultsCore
import kotlinx.android.synthetic.main.home_list_item.view.*

class HomeMovieListAdapter(private val categories: List<CategoryMoviesCore>, private val context: Context) :
    RecyclerView.Adapter<HomeMovieListAdapter.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.home_list_item, parent, false)

        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.populateView(categories[position].name)
        holder.populateMovies(categories[position].movies, context)
    }

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun populateView(category: String) {
            itemView.txtCategory.text = category
        }

        fun populateMovies(movies: List<ResultsCore>, context: Context) {
            itemView.rcvMovies.adapter = MovieListAdapter(movies, context)
        }
    }
}