package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.SocialLoginUrlsUrlsInner
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
 * @param urls 
 */
data class SocialLoginUrls(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("urls", required = true) val urls: kotlin.collections.List<SocialLoginUrlsUrlsInner>
) {

}

