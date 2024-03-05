package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid

/**
 * 
 * @param google Googleの認可コードリクエストURL
 * @param github GitHubの認可コードリクエストURL
 */
data class SocialLoginUrls(

    @get:JsonProperty("google", required = true) val google: kotlin.String,

    @get:JsonProperty("github", required = true) val github: kotlin.String
) {

}

