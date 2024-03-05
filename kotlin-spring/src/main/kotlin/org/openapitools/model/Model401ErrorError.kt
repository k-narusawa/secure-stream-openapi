package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param requestId リクエストID
 * @param code エラーコード | エラーコード | 説明 | |-|-| | ID401E001 | アクセストークン期限切れ | 
 * @param message エラーメッセージ
 */
data class Model401ErrorError(

    @get:JsonProperty("request_id", required = true) val requestId: kotlin.String,

    @get:JsonProperty("code", required = true) val code: Model401ErrorError.Code,

    @get:JsonProperty("message", required = true) val message: kotlin.String
) {

    /**
    * エラーコード | エラーコード | 説明 | |-|-| | ID401E001 | アクセストークン期限切れ | 
    * Values: ID401_E001
    */
    enum class Code(val value: kotlin.String) {

        @JsonProperty("ID401E001") ID401_E001("ID401E001")
    }

}

