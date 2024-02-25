package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.WebauthnRegistrationAuthenticatorSelection
import org.openapitools.model.WebauthnRegistrationExtensions
import org.openapitools.model.WebauthnRegistrationPubKeyCredParamsInner
import org.openapitools.model.WebauthnRegistrationRp
import org.openapitools.model.WebauthnRegistrationUser
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
 * @param flowId 
 * @param rp 
 * @param user 
 * @param challenge 
 * @param pubKeyCredParams 
 * @param timeout 
 * @param excludeCredentials 
 * @param authenticatorSelection 
 * @param attestation 
 * @param extensions 
 */
data class WebauthnRegistration(

    @Schema(example = "456dbe73-8a57-48c9-8c0c-1d6385587fea", required = true, description = "")
    @get:JsonProperty("flowId", required = true) val flowId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("rp", required = true) val rp: WebauthnRegistrationRp,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("user", required = true) val user: WebauthnRegistrationUser,

    @Schema(example = "R_g3M58WQWSas4mjL2SVKg", required = true, description = "")
    @get:JsonProperty("challenge", required = true) val challenge: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("pubKeyCredParams", required = true) val pubKeyCredParams: kotlin.collections.List<WebauthnRegistrationPubKeyCredParamsInner>,

    @Schema(example = "60000", required = true, description = "")
    @get:JsonProperty("timeout", required = true) val timeout: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("excludeCredentials", required = true) val excludeCredentials: kotlin.collections.List<WebauthnRegistrationPubKeyCredParamsInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("authenticatorSelection", required = true) val authenticatorSelection: WebauthnRegistrationAuthenticatorSelection,

    @Schema(example = "none", required = true, description = "")
    @get:JsonProperty("attestation", required = true) val attestation: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("extensions") val extensions: WebauthnRegistrationExtensions? = null
) {

}

