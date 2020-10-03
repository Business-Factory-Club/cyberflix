package club.businessfactory.cyberflix.data.entity

import com.google.gson.annotations.SerializedName

data class ResultsResponse(
    @SerializedName("results")
    val results: List<Results>
)

