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
 * @param id 
 * @param type 
 */
data class RequestWebauthnRegistrationPubKeyCredParamsInner(

    @Schema(example = "public-key", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "public-key", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null
) {

}

