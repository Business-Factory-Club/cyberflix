package club.businessfactory.cyberflix.presentation.feature.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import club.businessfactory.cyberflix.R
import club.businessfactory.cyberflix.presentation.feature.home.adapter.HomeMovieListAdapter
import club.businessfactory.cyberflix.presentation.feature.home.viewmodel.HomeViewModel
import kotlinx.android.synthetic.main.activity_home.*
import org.koin.android.ext.android.inject

class HomeActivity : AppCompatActivity() {

    private val viewModel: HomeViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        returnTesting()
    }

    private fun returnTesting(){
        viewModel.getResults()

        viewModel.resultsLiveData.observe(this, Observer { resultsList ->
            rcvHome.adapter = HomeMovieListAdapter(resultsList, this)
        })
    }
}