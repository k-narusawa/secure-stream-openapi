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
 * @param appid 
 * @param authnSel 
 * @param exts 
 */
data class WebauthnRegistrationExtensions(

    @Schema(example = "https://example.com", description = "")
    @get:JsonProperty("appid") val appid: kotlin.String? = null,

    @Schema(example = "required", description = "")
    @get:JsonProperty("authnSel") val authnSel: kotlin.String? = null,

    @Schema(example = "true", description = "")
    @get:JsonProperty("exts") val exts: kotlin.Boolean? = null
) {

}

