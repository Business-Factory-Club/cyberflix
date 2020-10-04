package club.businessfactory.cyberflix.presentation.feature.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import club.businessfactory.cyberflix.R
import club.businessfactory.cyberflix.presentation.feature.home.viewmodel.HomeViewModel
import org.koin.android.ext.android.inject

class HomeActivity : AppCompatActivity() {

    val viewModel: HomeViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        returnTesting()
    }

    fun returnTesting(){
        viewModel.getResults()

        viewModel.resultsLiveData.observe(this, Observer { resultsList ->
            println(resultsList[0].title)
        })
    }
}