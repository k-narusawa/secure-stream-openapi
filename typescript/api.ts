/* tslint:disable */
/* eslint-disable */
/**
 * SecureStream API
 * SecureStream APIの仕様書です
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import type { Configuration } from './configuration';
import type { AxiosPromise, AxiosInstance, RawAxiosRequestConfig } from 'axios';
import globalAxios from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from './common';
import type { RequestArgs } from './base';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, BaseAPI, RequiredError, operationServerMap } from './base';

/**
 * 
 * @export
 * @interface RegisterWebauthnRequest
 */
export interface RegisterWebauthnRequest {
    /**
     * 
     * @type {string}
     * @memberof RegisterWebauthnRequest
     */
    'flowId': string;
    /**
     * 
     * @type {string}
     * @memberof RegisterWebauthnRequest
     */
    'id': string;
    /**
     * 
     * @type {string}
     * @memberof RegisterWebauthnRequest
     */
    'rawId': string;
    /**
     * 
     * @type {string}
     * @memberof RegisterWebauthnRequest
     */
    'type': string;
    /**
     * 
     * @type {RegisterWebauthnRequestResponse}
     * @memberof RegisterWebauthnRequest
     */
    'response': RegisterWebauthnRequestResponse;
}
/**
 * 
 * @export
 * @interface RegisterWebauthnRequestResponse
 */
export interface RegisterWebauthnRequestResponse {
    /**
     * 
     * @type {string}
     * @memberof RegisterWebauthnRequestResponse
     */
    'clientDataJSON'?: string;
    /**
     * 
     * @type {string}
     * @memberof RegisterWebauthnRequestResponse
     */
    'attestationObject'?: string;
}
/**
 * 
 * @export
 * @interface RequestWebauthnRegistration
 */
export interface RequestWebauthnRegistration {
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistration
     */
    'flowId': string;
    /**
     * 
     * @type {RequestWebauthnRegistrationRp}
     * @memberof RequestWebauthnRegistration
     */
    'rp': RequestWebauthnRegistrationRp;
    /**
     * 
     * @type {RequestWebauthnRegistrationUser}
     * @memberof RequestWebauthnRegistration
     */
    'user': RequestWebauthnRegistrationUser;
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistration
     */
    'challenge': string;
    /**
     * 
     * @type {Array<RequestWebauthnRegistrationPubKeyCredParamsInner>}
     * @memberof RequestWebauthnRegistration
     */
    'pubKeyCredParams': Array<RequestWebauthnRegistrationPubKeyCredParamsInner>;
    /**
     * 
     * @type {number}
     * @memberof RequestWebauthnRegistration
     */
    'timeout': number;
    /**
     * 
     * @type {Array<RequestWebauthnRegistrationPubKeyCredParamsInner>}
     * @memberof RequestWebauthnRegistration
     */
    'excludeCredentials': Array<RequestWebauthnRegistrationPubKeyCredParamsInner>;
    /**
     * 
     * @type {RequestWebauthnRegistrationAuthenticatorSelection}
     * @memberof RequestWebauthnRegistration
     */
    'authenticatorSelection': RequestWebauthnRegistrationAuthenticatorSelection;
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistration
     */
    'attestation': string;
    /**
     * 
     * @type {RequestWebauthnRegistrationExtensions}
     * @memberof RequestWebauthnRegistration
     */
    'extensions'?: RequestWebauthnRegistrationExtensions;
}
/**
 * 
 * @export
 * @interface RequestWebauthnRegistrationAuthenticatorSelection
 */
export interface RequestWebauthnRegistrationAuthenticatorSelection {
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistrationAuthenticatorSelection
     */
    'authenticatorAttachment'?: string;
    /**
     * 
     * @type {boolean}
     * @memberof RequestWebauthnRegistrationAuthenticatorSelection
     */
    'requireResidentKey'?: boolean;
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistrationAuthenticatorSelection
     */
    'userVerification'?: string;
}
/**
 * 
 * @export
 * @interface RequestWebauthnRegistrationExtensions
 */
export interface RequestWebauthnRegistrationExtensions {
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistrationExtensions
     */
    'appid'?: string;
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistrationExtensions
     */
    'authnSel'?: string;
    /**
     * 
     * @type {boolean}
     * @memberof RequestWebauthnRegistrationExtensions
     */
    'exts'?: boolean;
}
/**
 * 
 * @export
 * @interface RequestWebauthnRegistrationPubKeyCredParamsInner
 */
export interface RequestWebauthnRegistrationPubKeyCredParamsInner {
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistrationPubKeyCredParamsInner
     */
    'type'?: string;
}
/**
 * 
 * @export
 * @interface RequestWebauthnRegistrationRp
 */
export interface RequestWebauthnRegistrationRp {
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistrationRp
     */
    'id'?: string;
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistrationRp
     */
    'name'?: string;
}
/**
 * 
 * @export
 * @interface RequestWebauthnRegistrationUser
 */
export interface RequestWebauthnRegistrationUser {
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistrationUser
     */
    'id'?: string;
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistrationUser
     */
    'name'?: string;
    /**
     * 
     * @type {string}
     * @memberof RequestWebauthnRegistrationUser
     */
    'displayName'?: string;
}

/**
 * WebauthnApi - axios parameter creator
 * @export
 */
export const WebauthnApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary 登録リクエスト
         * @param {RegisterWebauthnRequest} [registerWebauthnRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        registerWebauthn: async (registerWebauthnRequest?: RegisterWebauthnRequest, options: RawAxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/webauthn`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication Bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(registerWebauthnRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary 登録要求リクエスト
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        requestWebauthnRegistration: async (options: RawAxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/webauthn/request`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication Bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * WebauthnApi - functional programming interface
 * @export
 */
export const WebauthnApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = WebauthnApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary 登録リクエスト
         * @param {RegisterWebauthnRequest} [registerWebauthnRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async registerWebauthn(registerWebauthnRequest?: RegisterWebauthnRequest, options?: RawAxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.registerWebauthn(registerWebauthnRequest, options);
            const index = configuration?.serverIndex ?? 0;
            const operationBasePath = operationServerMap['WebauthnApi.registerWebauthn']?.[index]?.url;
            return (axios, basePath) => createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration)(axios, operationBasePath || basePath);
        },
        /**
         * 
         * @summary 登録要求リクエスト
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async requestWebauthnRegistration(options?: RawAxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<RequestWebauthnRegistration>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.requestWebauthnRegistration(options);
            const index = configuration?.serverIndex ?? 0;
            const operationBasePath = operationServerMap['WebauthnApi.requestWebauthnRegistration']?.[index]?.url;
            return (axios, basePath) => createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration)(axios, operationBasePath || basePath);
        },
    }
};

/**
 * WebauthnApi - factory interface
 * @export
 */
export const WebauthnApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = WebauthnApiFp(configuration)
    return {
        /**
         * 
         * @summary 登録リクエスト
         * @param {RegisterWebauthnRequest} [registerWebauthnRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        registerWebauthn(registerWebauthnRequest?: RegisterWebauthnRequest, options?: any): AxiosPromise<void> {
            return localVarFp.registerWebauthn(registerWebauthnRequest, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary 登録要求リクエスト
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        requestWebauthnRegistration(options?: any): AxiosPromise<RequestWebauthnRegistration> {
            return localVarFp.requestWebauthnRegistration(options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * WebauthnApi - object-oriented interface
 * @export
 * @class WebauthnApi
 * @extends {BaseAPI}
 */
export class WebauthnApi extends BaseAPI {
    /**
     * 
     * @summary 登録リクエスト
     * @param {RegisterWebauthnRequest} [registerWebauthnRequest] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof WebauthnApi
     */
    public registerWebauthn(registerWebauthnRequest?: RegisterWebauthnRequest, options?: RawAxiosRequestConfig) {
        return WebauthnApiFp(this.configuration).registerWebauthn(registerWebauthnRequest, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary 登録要求リクエスト
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof WebauthnApi
     */
    public requestWebauthnRegistration(options?: RawAxiosRequestConfig) {
        return WebauthnApiFp(this.configuration).requestWebauthnRegistration(options).then((request) => request(this.axios, this.basePath));
    }
}


