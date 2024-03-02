package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Provider
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
 * @param provider 
 * @param url 
 */
data class SocialLoginUrlsUrlsInner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("provider", required = true) val provider: Provider,

    @Schema(example = "http://localhost:8081/api/v1/users/social_login/google", required = true, description = "")
    @get:JsonProperty("url", required = true) val url: kotlin.String
) {

}

