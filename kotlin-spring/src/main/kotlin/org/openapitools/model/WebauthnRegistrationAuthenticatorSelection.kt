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
 * @param authenticatorAttachment 
 * @param requireResidentKey 
 * @param userVerification 
 */
data class WebauthnRegistrationAuthenticatorSelection(

    @Schema(example = "cross-platform", description = "")
    @get:JsonProperty("authenticatorAttachment") val authenticatorAttachment: kotlin.String? = null,

    @Schema(example = "false", description = "")
    @get:JsonProperty("requireResidentKey") val requireResidentKey: kotlin.Boolean? = null,

    @Schema(example = "required", description = "")
    @get:JsonProperty("userVerification") val userVerification: kotlin.String? = null
) {

}

