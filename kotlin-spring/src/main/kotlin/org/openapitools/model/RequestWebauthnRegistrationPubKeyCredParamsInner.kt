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
 * @param alg 
 * @param type 
 */
data class RequestWebauthnRegistrationPubKeyCredParamsInner(

    @get:JsonProperty("alg") val alg: kotlin.Long? = null,

    @get:JsonProperty("type") val type: kotlin.String? = null
) {

}

