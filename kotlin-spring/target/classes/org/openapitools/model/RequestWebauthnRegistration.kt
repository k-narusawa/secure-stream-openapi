package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.RequestWebauthnRegistrationAuthenticatorSelection
import org.openapitools.model.RequestWebauthnRegistrationExcludeCredentialsInner
import org.openapitools.model.RequestWebauthnRegistrationExtensions
import org.openapitools.model.RequestWebauthnRegistrationPubKeyCredParamsInner
import org.openapitools.model.RequestWebauthnRegistrationRp
import org.openapitools.model.RequestWebauthnRegistrationUser
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
data class RequestWebauthnRegistration(

    @get:JsonProperty("flowId", required = true) val flowId: kotlin.String,

    @field:Valid
    @get:JsonProperty("rp", required = true) val rp: RequestWebauthnRegistrationRp,

    @field:Valid
    @get:JsonProperty("user", required = true) val user: RequestWebauthnRegistrationUser,

    @get:JsonProperty("challenge", required = true) val challenge: kotlin.String,

    @field:Valid
    @get:JsonProperty("pubKeyCredParams", required = true) val pubKeyCredParams: kotlin.collections.List<RequestWebauthnRegistrationPubKeyCredParamsInner>,

    @get:JsonProperty("timeout", required = true) val timeout: kotlin.Int,

    @field:Valid
    @get:JsonProperty("excludeCredentials", required = true) val excludeCredentials: kotlin.collections.List<RequestWebauthnRegistrationExcludeCredentialsInner>,

    @field:Valid
    @get:JsonProperty("authenticatorSelection", required = true) val authenticatorSelection: RequestWebauthnRegistrationAuthenticatorSelection,

    @get:JsonProperty("attestation", required = true) val attestation: kotlin.String,

    @field:Valid
    @get:JsonProperty("extensions") val extensions: RequestWebauthnRegistrationExtensions? = null
) {

}

