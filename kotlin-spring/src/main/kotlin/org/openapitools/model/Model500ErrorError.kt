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
 * @param code エラーコード | エラーコード | 説明 | |-|-| | 500-001 | 予期せぬエラー | 
 * @param message エラーメッセージ
 */
data class Model500ErrorError(

    @get:JsonProperty("request_id", required = true) val requestId: kotlin.String,

    @get:JsonProperty("code", required = true) val code: Model500ErrorError.Code,

    @get:JsonProperty("message", required = true) val message: kotlin.String
) {

    /**
    * エラーコード | エラーコード | 説明 | |-|-| | 500-001 | 予期せぬエラー | 
    * Values: _500minus001
    */
    enum class Code(val value: kotlin.String) {

        @JsonProperty("500-001") _500minus001("500-001")
    }

}

