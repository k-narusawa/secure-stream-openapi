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
 * @param clientDataJSON 
 * @param attestationObject 
 */
data class RegisterWebauthnRequestResponse(

    @Schema(example = "eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiNGdiQUJ6VklSWWlua21TMmxPZkpZUSIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6MzAwMCIsImNyb3NzT3JpZ2luIjpmYWxzZX0", description = "")
    @get:JsonProperty("clientDataJSON") val clientDataJSON: kotlin.String? = null,

    @Schema(example = "o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YViUSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NdAAAAALraVWanqkAfvZZFYZpVEg0AELbzI49OSD1XLYjfmxnqiBylAQIDJiABIVgg4V7Ijs6Eqkd8kQYbDhxBne5Nbw9K5AinMUKL6TQCPfoiWCD1v-X3uCDewz3rA7SKU-vY3O3CVc1n5IEocIduZ77ETw", description = "")
    @get:JsonProperty("attestationObject") val attestationObject: kotlin.String? = null
) {

}

