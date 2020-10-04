package club.businessfactory.cyberflix.presentation.feature.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import club.businessfactory.cyberflix.R
import club.businessfactory.cyberflix.domain.entity.ResultsCore
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_category_list_item.view.*

class MovieListAdapter(private val movies: List<ResultsCore>, private val context: Context) :
    RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.movie_category_list_item, parent, false)

        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.getMoviePhoto(movies[position].posterPath)
    }

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun getMoviePhoto(movieUrl: String) {

            Picasso.get().load("https://image.tmdb.org/t/p/w300$movieUrl").into(itemView.imgMovie)
        }
    }
}