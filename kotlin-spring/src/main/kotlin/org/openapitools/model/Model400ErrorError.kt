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
 * @param code エラーコード | エラーコード | 説明 | |-|-| | ID400E001 | 入力値が不正 | | ID400E001 | パスワードが弱い | 
 * @param message エラーメッセージ
 */
data class Model400ErrorError(

    @get:JsonProperty("request_id", required = true) val requestId: kotlin.String,

    @get:JsonProperty("code", required = true) val code: Model400ErrorError.Code,

    @get:JsonProperty("message", required = true) val message: kotlin.String
) {

    /**
    * エラーコード | エラーコード | 説明 | |-|-| | ID400E001 | 入力値が不正 | | ID400E001 | パスワードが弱い | 
    * Values: ID400_E001,ID400_E002
    */
    enum class Code(val value: kotlin.String) {

        @JsonProperty("ID400E001") ID400_E001("ID400E001"),
        @JsonProperty("ID400E002") ID400_E002("ID400E002")
    }

}

