package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.WebauthnRegistration1Response
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
 * @param id 
 * @param rawId 
 * @param type 
 * @param response 
 */
data class WebauthnRegistration1(

    @Schema(example = "456dbe73-8a57-48c9-8c0c-1d6385587fea", required = true, description = "")
    @get:JsonProperty("flowId", required = true) val flowId: kotlin.String,

    @Schema(example = "tvMjj05IPVctiN", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "tvMjj05IPVctiN", required = true, description = "")
    @get:JsonProperty("rawId", required = true) val rawId: kotlin.String,

    @Schema(example = "public-key", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("response", required = true) val response: WebauthnRegistration1Response
) {

}

