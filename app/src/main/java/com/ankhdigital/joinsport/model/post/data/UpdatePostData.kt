package com.ankhdigital.joinsport.model.post.data

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 23/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class UpdatePostData(
    @SerializedName("image") val image : String,
    @SerializedName("caption") val caption : String
)
