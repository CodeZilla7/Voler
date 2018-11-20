package com.eton.voler.api.model

data class LufthansaToken(
    val access_token: String,
    val token_type: String,
    val expires_in: Int
)