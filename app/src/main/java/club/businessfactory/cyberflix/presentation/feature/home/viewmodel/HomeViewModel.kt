package club.businessfactory.cyberflix.presentation.feature.home.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import club.businessfactory.cyberflix.domain.entity.ResultsCore
import club.businessfactory.cyberflix.domain.gateway.usecase.HomeUseCaseGateway
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class HomeViewModel : ViewModel(), KoinComponent{
    private val homeUseCase: HomeUseCaseGateway by inject()
    val resultsLiveData: MutableLiveData<List<ResultsCore>> = MutableLiveData()

    fun getResults(){
        CoroutineScope(Dispatchers.Main).launch {
            val resultsList = homeUseCase.getResults()
            resultsLiveData.postValue(resultsList)
        }
    }

}