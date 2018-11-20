/*
 * MIT License
 *
 * Copyright (c) 2018 Eton Otieno
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.eton.voler.api.service

import com.eton.voler.BuildConfig
import com.eton.voler.api.Constants
import com.eton.voler.api.model.LufthansaToken
import kotlinx.coroutines.Deferred
import retrofit2.http.*

interface AuthService {

    @FormUrlEncoded
    @POST(Constants.TOKEN_ENDPOINT)
    fun getToken(
        @Field("client_id") clientId: String = BuildConfig.LUFTHANSA_API_KEY,
        @Field("client_secret") clientSecret: String = BuildConfig.LUFTHANSA_SECRET,
        @Field("grant_type") grantType: String = "client_credentials"
    ): Deferred<LufthansaToken>

}