/*
 * Selling Partner API for Authorization
 * The Selling Partner API for Authorization helps developers manage authorizations and check the specific permissions associated with a given authorization.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.shuaidd.aspi.api.client;

import com.github.shuaidd.aspi.api.support.*;
import com.github.shuaidd.aspi.model.authorization.GetAuthorizationCodeResponse;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorizationApi extends AbstractAmazonApi<AuthorizationApi> {

    /**
     * Build call for getAuthorizationCode
     * @param sellingPartnerId The seller ID of the seller for whom you are requesting Selling Partner API authorization. This must be the seller ID of the seller who authorized your application on the Marketplace Appstore. (required)
     * @param developerId Your developer ID. This must be one of the developer ID values that you provided when you registered your application in Developer Central. (required)
     * @param mwsAuthToken The MWS Auth Token that was generated when the seller authorized your application on the Marketplace Appstore. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAuthorizationCodeCall(String sellingPartnerId, String developerId, String mwsAuthToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/authorization/v1/authorizationCode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (sellingPartnerId != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("sellingPartnerId", sellingPartnerId));
        }
        if (developerId != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("developerId", developerId));
        }
        if (mwsAuthToken != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("mwsAuthToken", mwsAuthToken));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAuthorizationCodeValidateBeforeCall(String sellingPartnerId, String developerId, String mwsAuthToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'sellingPartnerId' is set
        if (sellingPartnerId == null) {
            throw new ApiException("Missing the required parameter 'sellingPartnerId' when calling getAuthorizationCode(Async)");
        }

        // verify the required parameter 'developerId' is set
        if (developerId == null) {
            throw new ApiException("Missing the required parameter 'developerId' when calling getAuthorizationCode(Async)");
        }

        // verify the required parameter 'mwsAuthToken' is set
        if (mwsAuthToken == null) {
            throw new ApiException("Missing the required parameter 'mwsAuthToken' when calling getAuthorizationCode(Async)");
        }


        com.squareup.okhttp.Call call = getAuthorizationCodeCall(sellingPartnerId, developerId, mwsAuthToken, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns the Login with Amazon (LWA) authorization code for an existing Amazon MWS authorization.
     * With the getAuthorizationCode operation, you can request a Login With Amazon (LWA) authorization code that will allow you to call a Selling Partner API on behalf of a seller who has already authorized you to call Amazon Marketplace Web Service (Amazon MWS). You specify a developer ID, an MWS auth token, and a seller ID. Taken together, these represent the Amazon MWS authorization that the seller previously granted you. The operation returns an LWA authorization code that can be exchanged for a refresh token and access token representing authorization to call the Selling Partner API on the seller&#39;s behalf. By using this API, sellers who have already authorized you for Amazon MWS do not need to re-authorize you for the Selling Partner API.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param sellingPartnerId The seller ID of the seller for whom you are requesting Selling Partner API authorization. This must be the seller ID of the seller who authorized your application on the Marketplace Appstore. (required)
     * @param developerId Your developer ID. This must be one of the developer ID values that you provided when you registered your application in Developer Central. (required)
     * @param mwsAuthToken The MWS Auth Token that was generated when the seller authorized your application on the Marketplace Appstore. (required)
     * @return GetAuthorizationCodeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetAuthorizationCodeResponse getAuthorizationCode(String sellingPartnerId, String developerId, String mwsAuthToken) throws ApiException {
        ApiResponse<GetAuthorizationCodeResponse> resp = getAuthorizationCodeWithHttpInfo(sellingPartnerId, developerId, mwsAuthToken);
        return resp.getData();
    }

    /**
     * Returns the Login with Amazon (LWA) authorization code for an existing Amazon MWS authorization.
     * With the getAuthorizationCode operation, you can request a Login With Amazon (LWA) authorization code that will allow you to call a Selling Partner API on behalf of a seller who has already authorized you to call Amazon Marketplace Web Service (Amazon MWS). You specify a developer ID, an MWS auth token, and a seller ID. Taken together, these represent the Amazon MWS authorization that the seller previously granted you. The operation returns an LWA authorization code that can be exchanged for a refresh token and access token representing authorization to call the Selling Partner API on the seller&#39;s behalf. By using this API, sellers who have already authorized you for Amazon MWS do not need to re-authorize you for the Selling Partner API.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param sellingPartnerId The seller ID of the seller for whom you are requesting Selling Partner API authorization. This must be the seller ID of the seller who authorized your application on the Marketplace Appstore. (required)
     * @param developerId Your developer ID. This must be one of the developer ID values that you provided when you registered your application in Developer Central. (required)
     * @param mwsAuthToken The MWS Auth Token that was generated when the seller authorized your application on the Marketplace Appstore. (required)
     * @return ApiResponse&lt;GetAuthorizationCodeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetAuthorizationCodeResponse> getAuthorizationCodeWithHttpInfo(String sellingPartnerId, String developerId, String mwsAuthToken) throws ApiException {
        com.squareup.okhttp.Call call = getAuthorizationCodeValidateBeforeCall(sellingPartnerId, developerId, mwsAuthToken, null, null);
        Type localVarReturnType = new TypeToken<GetAuthorizationCodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns the Login with Amazon (LWA) authorization code for an existing Amazon MWS authorization. (asynchronously)
     * With the getAuthorizationCode operation, you can request a Login With Amazon (LWA) authorization code that will allow you to call a Selling Partner API on behalf of a seller who has already authorized you to call Amazon Marketplace Web Service (Amazon MWS). You specify a developer ID, an MWS auth token, and a seller ID. Taken together, these represent the Amazon MWS authorization that the seller previously granted you. The operation returns an LWA authorization code that can be exchanged for a refresh token and access token representing authorization to call the Selling Partner API on the seller&#39;s behalf. By using this API, sellers who have already authorized you for Amazon MWS do not need to re-authorize you for the Selling Partner API.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param sellingPartnerId The seller ID of the seller for whom you are requesting Selling Partner API authorization. This must be the seller ID of the seller who authorized your application on the Marketplace Appstore. (required)
     * @param developerId Your developer ID. This must be one of the developer ID values that you provided when you registered your application in Developer Central. (required)
     * @param mwsAuthToken The MWS Auth Token that was generated when the seller authorized your application on the Marketplace Appstore. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAuthorizationCodeAsync(String sellingPartnerId, String developerId, String mwsAuthToken, final ApiCallback<GetAuthorizationCodeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAuthorizationCodeValidateBeforeCall(sellingPartnerId, developerId, mwsAuthToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetAuthorizationCodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
