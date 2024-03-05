package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.RegisterWebauthnRequestResponse
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
 * @param id 
 * @param rawId 
 * @param type 
 * @param response 
 */
data class RegisterWebauthnRequest(

    @get:JsonProperty("flowId", required = true) val flowId: kotlin.String,

    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:JsonProperty("rawId", required = true) val rawId: kotlin.String,

    @get:JsonProperty("type", required = true) val type: kotlin.String,

    @field:Valid
    @get:JsonProperty("response", required = true) val response: RegisterWebauthnRequestResponse
) {

}

