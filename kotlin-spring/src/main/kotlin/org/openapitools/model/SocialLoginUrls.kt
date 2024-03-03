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
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param google Googleの認可コードリクエストURL
 * @param github GitHubの認可コードリクエストURL
 */
data class SocialLoginUrls(

    @Schema(example = "https://accounts.google.com/o/oauth2/v2/auth?client_id=1234567890-abcdefghijklmnopqrstuvwxyz.apps.googleusercontent.com&redirect_uri=https://example.com/oauth2callback&response_type=code&scope=openid%20email&access_type=offline&prompt=consent", required = true, description = "Googleの認可コードリクエストURL")
    @get:JsonProperty("google", required = true) val google: kotlin.String,

    @Schema(example = "https://accounts.google.com/o/oauth2/v2/auth?client_id=1234567890-abcdefghijklmnopqrstuvwxyz.apps.googleusercontent.com&redirect_uri=https://example.com/oauth2callback&response_type=code&scope=openid%20email&access_type=offline&prompt=consent", required = true, description = "GitHubの認可コードリクエストURL")
    @get:JsonProperty("github", required = true) val github: kotlin.String
) {

}

