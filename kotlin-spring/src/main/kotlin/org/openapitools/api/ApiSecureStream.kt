/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package org.openapitools.api

import org.openapitools.model.ChangePassword
import org.openapitools.model.RegisterWebauthnRequest
import org.openapitools.model.RequestChangeLoginId
import org.openapitools.model.RequestChangePassword
import org.openapitools.model.RequestWebauthnRegistration
import org.openapitools.model.SocialLoginUrls
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid

import kotlin.collections.List
import kotlin.collections.Map

@Validated
@RequestMapping("\${api.base-path:}")
interface ApiSecureStream {

    @Operation(
        summary = "変更要求",
        operationId = "changePassword",
        description = """パスワードの変更リクエストを行います。送信されるメール内の認証コードを変更時のリクエストに含めてください。""",
        responses = [
            ApiResponse(responseCode = "204", description = "パスワード変更要求成功")
        ],
        security = [ SecurityRequirement(name = "Bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/api/v1/users/password/requests"],
            consumes = ["application/json"]
    )
    fun changePassword(@Parameter(description = "", required = true) @Valid @RequestBody requestChangePassword: RequestChangePassword): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "変更",
        operationId = "changePassword",
        description = """パスワードの変更を行います。パスワード変更要求時にメールに添付された認証コードを送信してください。""",
        responses = [
            ApiResponse(responseCode = "204", description = "パスワード変更成功")
        ],
        security = [ SecurityRequirement(name = "Bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.PATCH],
            value = ["/api/v1/users/password"],
            consumes = ["application/json"]
    )
    fun changePassword(@Parameter(description = "", required = true) @Valid @RequestBody changePassword: ChangePassword): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "全件削除",
        operationId = "deleteWebauthn",
        description = """登録済みのWebauthnのcredentialを全て削除します。""",
        responses = [
            ApiResponse(responseCode = "204", description = "削除成功")
        ],
        security = [ SecurityRequirement(name = "Bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.DELETE],
            value = ["/api/v1/users/webauthn"]
    )
    fun deleteWebauthn(): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "認可リクエスト一覧取得",
        operationId = "getSocialLoginUrl",
        description = """各種ソーシャルログインの認可リクエストURLを取得します""",
        responses = [
            ApiResponse(responseCode = "200", description = "認可リクエストURL一覧", content = [Content(schema = Schema(implementation = SocialLoginUrls::class))])
        ],
        security = [ SecurityRequirement(name = "Bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/api/v1/users/social_login/urls"],
            produces = ["application/json"]
    )
    fun getSocialLoginUrl(): ResponseEntity<SocialLoginUrls> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "登録",
        operationId = "registerWebauthn",
        description = """Webauthnの登録を行います。""",
        responses = [
            ApiResponse(responseCode = "200", description = "credentials登録結果を返却します")
        ],
        security = [ SecurityRequirement(name = "Bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/api/v1/users/webauthn"],
            consumes = ["application/json"]
    )
    fun registerWebauthn(@Parameter(description = "", required = true) @Valid @RequestBody registerWebauthnRequest: RegisterWebauthnRequest): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "認可コードリクエスト",
        operationId = "requestAuthorizationCode",
        description = """各種ソーシャルログインの認可コードからアクセストークンを取得します（バックエンド用）""",
        responses = [
            ApiResponse(responseCode = "302", description = "連携完了画面へリダイレクトを行う")
        ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/api/v1/users/social_login/code/{provider}"]
    )
    fun requestAuthorizationCode(@Parameter(description = "プロバイダ", required = true) @PathVariable("provider") provider: kotlin.String,@NotNull @Parameter(description = "認可コード", required = true) @Valid @RequestParam(value = "code", required = true) code: kotlin.String): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "変更要求",
        operationId = "requestChangeLoginId",
        description = """ログインIDの変更を行うためのリクエストです。送信されたメールアドレス内の認証コードを変更時のリクエストに含めてください。""",
        responses = [
            ApiResponse(responseCode = "204", description = "ログインID変更要求成功")
        ],
        security = [ SecurityRequirement(name = "Bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/api/v1/users/login_id/requests"],
            consumes = ["application/json"]
    )
    fun requestChangeLoginId(@Parameter(description = "", required = true) @Valid @RequestBody requestChangeLoginId: RequestChangeLoginId): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "変更",
        operationId = "requestChangeLoginId",
        description = """ログインIDの変更を行うためのリクエストです。送信されたメールアドレスに変更用のURLが送信されます。""",
        responses = [
            ApiResponse(responseCode = "204", description = "ログインID変更成功")
        ],
        security = [ SecurityRequirement(name = "Bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.PATCH],
            value = ["/api/v1/users/login_id"],
            consumes = ["application/json"]
    )
    fun requestChangeLoginId(@Parameter(description = "", required = true) @Valid @RequestBody changePassword: ChangePassword): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "登録要求",
        operationId = "requestWebauthnRegistration",
        description = """Webauthn登録のために認証器に送信する情報を取得します。""",
        responses = [
            ApiResponse(responseCode = "200", description = "createCredentials実行に必要なレスポンスを返却します", content = [Content(schema = Schema(implementation = RequestWebauthnRegistration::class))])
        ],
        security = [ SecurityRequirement(name = "Bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/api/v1/users/webauthn/requests"],
            produces = ["application/json"]
    )
    fun requestWebauthnRegistration(): ResponseEntity<RequestWebauthnRegistration> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
