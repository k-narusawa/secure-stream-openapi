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
 * @param credentialId 登録したWebauthnの識別子
 * @param aaguid セキュリティキーの識別子
 */
data class WebauthnRegistration(

    @get:JsonProperty("credential_id", required = true) val credentialId: kotlin.String,

    @get:JsonProperty("aaguid", required = true) val aaguid: kotlin.String
) {

}

