package com.github.shuaidd.aspi.api.client;

import com.github.shuaidd.aspi.api.support.*;
import com.github.shuaidd.aspi.model.notification.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationsApi extends AbstractAmazonApi<NotificationsApi> {

    /**
     * Build call for createDestination
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDestinationCall(CreateDestinationRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // create path and map variables
        String localVarPath = "/notifications/v1/destinations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createDestinationValidateBeforeCall(CreateDestinationRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createDestination(Async)");
        }


        com.squareup.okhttp.Call call = createDestinationCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     *
     * Creates a destination resource to receive notifications. The createDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param body  (required)
     * @return CreateDestinationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateDestinationResponse createDestination(CreateDestinationRequest body) throws ApiException {
        ApiResponse<CreateDestinationResponse> resp = createDestinationWithHttpInfo(body);
        return resp.getData();
    }

    /**
     *
     * Creates a destination resource to receive notifications. The createDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param body  (required)
     * @return ApiResponse&lt;CreateDestinationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateDestinationResponse> createDestinationWithHttpInfo(CreateDestinationRequest body) throws ApiException {
        com.squareup.okhttp.Call call = createDestinationValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CreateDestinationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a destination resource to receive notifications. The createDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDestinationAsync(CreateDestinationRequest body, final ApiCallback<CreateDestinationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = createDestinationValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateDestinationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createSubscription
     * @param body  (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createSubscriptionCall(CreateSubscriptionRequest body, String notificationType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/notifications/v1/subscriptions/{notificationType}"
            .replaceAll("\\{" + "notificationType" + "\\}", apiClient.escapeString(notificationType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept == null) {
        } else {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createSubscriptionValidateBeforeCall(CreateSubscriptionRequest body, String notificationType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createSubscription(Async)");
        }

        // verify the required parameter 'notificationType' is set
        if (notificationType == null) {
            throw new ApiException("Missing the required parameter 'notificationType' when calling createSubscription(Async)");
        }

        return createSubscriptionCall(body, notificationType, progressListener, progressRequestListener);

    }

    /**
     *
     * Creates a subscription for the specified notification type to be delivered to the specified destination. Before you can subscribe, you must first create the destination by calling the createDestination operation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param body  (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @return CreateSubscriptionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest body, String notificationType) throws ApiException {
        ApiResponse<CreateSubscriptionResponse> resp = createSubscriptionWithHttpInfo(body, notificationType);
        return resp.getData();
    }

    /**
     *
     * Creates a subscription for the specified notification type to be delivered to the specified destination. Before you can subscribe, you must first create the destination by calling the createDestination operation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param body  (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @return ApiResponse&lt;CreateSubscriptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateSubscriptionResponse> createSubscriptionWithHttpInfo(CreateSubscriptionRequest body, String notificationType) throws ApiException {
        com.squareup.okhttp.Call call = createSubscriptionValidateBeforeCall(body, notificationType, null, null);
        Type localVarReturnType = new TypeToken<CreateSubscriptionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a subscription for the specified notification type to be delivered to the specified destination. Before you can subscribe, you must first create the destination by calling the createDestination operation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param body  (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createSubscriptionAsync(CreateSubscriptionRequest body, String notificationType, final ApiCallback<CreateSubscriptionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;

            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = createSubscriptionValidateBeforeCall(body, notificationType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateSubscriptionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDestination
     * @param destinationId The identifier for the destination that you want to delete. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDestinationCall(String destinationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/notifications/v1/destinations/{destinationId}"
            .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDestinationValidateBeforeCall(String destinationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'destinationId' is set
        if (destinationId == null) {
            throw new ApiException("Missing the required parameter 'destinationId' when calling deleteDestination(Async)");
        }

        return deleteDestinationCall(destinationId, progressListener, progressRequestListener);
    }

    /**
     *
     * Deletes the destination that you specify. The deleteDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param destinationId The identifier for the destination that you want to delete. (required)
     * @return DeleteDestinationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteDestinationResponse deleteDestination(String destinationId) throws ApiException {
        ApiResponse<DeleteDestinationResponse> resp = deleteDestinationWithHttpInfo(destinationId);
        return resp.getData();
    }

    /**
     *
     * Deletes the destination that you specify. The deleteDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param destinationId The identifier for the destination that you want to delete. (required)
     * @return ApiResponse&lt;DeleteDestinationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteDestinationResponse> deleteDestinationWithHttpInfo(String destinationId) throws ApiException {
        com.squareup.okhttp.Call call = deleteDestinationValidateBeforeCall(destinationId, null, null);
        Type localVarReturnType = new TypeToken<DeleteDestinationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Deletes the destination that you specify. The deleteDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param destinationId The identifier for the destination that you want to delete. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDestinationAsync(String destinationId, final ApiCallback<DeleteDestinationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = deleteDestinationValidateBeforeCall(destinationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteDestinationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteSubscriptionById
     * @param subscriptionId The identifier for the subscription that you want to delete. (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSubscriptionByIdCall(String subscriptionId, String notificationType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/notifications/v1/subscriptions/{notificationType}/{subscriptionId}"
            .replaceAll("\\{" + "subscriptionId" + "\\}", apiClient.escapeString(subscriptionId.toString()))
            .replaceAll("\\{" + "notificationType" + "\\}", apiClient.escapeString(notificationType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteSubscriptionByIdValidateBeforeCall(String subscriptionId, String notificationType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling deleteSubscriptionById(Async)");
        }

        // verify the required parameter 'notificationType' is set
        if (notificationType == null) {
            throw new ApiException("Missing the required parameter 'notificationType' when calling deleteSubscriptionById(Async)");
        }


        com.squareup.okhttp.Call call = deleteSubscriptionByIdCall(subscriptionId, notificationType, progressListener, progressRequestListener);
        return call;

    }

    /**
     *
     * Deletes the subscription indicated by the subscription identifier and notification type that you specify. The subscription identifier can be for any subscription associated with your application. After you successfully call this operation, notifications will stop being sent for the associated subscription. The deleteSubscriptionById API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param subscriptionId The identifier for the subscription that you want to delete. (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @return DeleteSubscriptionByIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteSubscriptionByIdResponse deleteSubscriptionById(String subscriptionId, String notificationType) throws ApiException {
        ApiResponse<DeleteSubscriptionByIdResponse> resp = deleteSubscriptionByIdWithHttpInfo(subscriptionId, notificationType);
        return resp.getData();
    }

    /**
     *
     * Deletes the subscription indicated by the subscription identifier and notification type that you specify. The subscription identifier can be for any subscription associated with your application. After you successfully call this operation, notifications will stop being sent for the associated subscription. The deleteSubscriptionById API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param subscriptionId The identifier for the subscription that you want to delete. (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @return ApiResponse&lt;DeleteSubscriptionByIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteSubscriptionByIdResponse> deleteSubscriptionByIdWithHttpInfo(String subscriptionId, String notificationType) throws ApiException {
        com.squareup.okhttp.Call call = deleteSubscriptionByIdValidateBeforeCall(subscriptionId, notificationType, null, null);
        Type localVarReturnType = new TypeToken<DeleteSubscriptionByIdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Deletes the subscription indicated by the subscription identifier and notification type that you specify. The subscription identifier can be for any subscription associated with your application. After you successfully call this operation, notifications will stop being sent for the associated subscription. The deleteSubscriptionById API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param subscriptionId The identifier for the subscription that you want to delete. (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSubscriptionByIdAsync(String subscriptionId, String notificationType, final ApiCallback<DeleteSubscriptionByIdResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;

            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = deleteSubscriptionByIdValidateBeforeCall(subscriptionId, notificationType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteSubscriptionByIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDestination
     * @param destinationId The identifier generated when you created the destination. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDestinationCall(String destinationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/notifications/v1/destinations/{destinationId}"
            .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call getDestinationValidateBeforeCall(String destinationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'destinationId' is set
        if (destinationId == null) {
            throw new ApiException("Missing the required parameter 'destinationId' when calling getDestination(Async)");
        }

        return getDestinationCall(destinationId, progressListener, progressRequestListener);
    }

    /**
     *
     * Returns information about the destination that you specify. The getDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param destinationId The identifier generated when you created the destination. (required)
     * @return GetDestinationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetDestinationResponse getDestination(String destinationId) throws ApiException {
        ApiResponse<GetDestinationResponse> resp = getDestinationWithHttpInfo(destinationId);
        return resp.getData();
    }

    /**
     *
     * Returns information about the destination that you specify. The getDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param destinationId The identifier generated when you created the destination. (required)
     * @return ApiResponse&lt;GetDestinationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetDestinationResponse> getDestinationWithHttpInfo(String destinationId) throws ApiException {
        com.squareup.okhttp.Call call = getDestinationValidateBeforeCall(destinationId, null, null);
        Type localVarReturnType = new TypeToken<GetDestinationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns information about the destination that you specify. The getDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param destinationId The identifier generated when you created the destination. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDestinationAsync(String destinationId, final ApiCallback<GetDestinationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;

            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = getDestinationValidateBeforeCall(destinationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetDestinationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDestinations
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDestinationsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/notifications/v1/destinations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDestinationsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        return getDestinationsCall(progressListener, progressRequestListener);
    }

    /**
     *
     * Returns information about all destinations. The getDestinations API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @return GetDestinationsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetDestinationsResponse getDestinations() throws ApiException {
        ApiResponse<GetDestinationsResponse> resp = getDestinationsWithHttpInfo();
        return resp.getData();
    }

    /**
     *
     * Returns information about all destinations. The getDestinations API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @return ApiResponse&lt;GetDestinationsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetDestinationsResponse> getDestinationsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getDestinationsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<GetDestinationsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns information about all destinations. The getDestinations API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDestinationsAsync(final ApiCallback<GetDestinationsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = getDestinationsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetDestinationsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSubscription
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSubscriptionCall(String notificationType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/notifications/v1/subscriptions/{notificationType}"
            .replaceAll("\\{" + "notificationType" + "\\}", apiClient.escapeString(notificationType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call getSubscriptionValidateBeforeCall(String notificationType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'notificationType' is set
        if (notificationType == null) {
            throw new ApiException("Missing the required parameter 'notificationType' when calling getSubscription(Async)");
        }

        return getSubscriptionCall(notificationType, progressListener, progressRequestListener);
    }

    /**
     *
     * Returns information about subscriptions of the specified notification type. You can use this API to get subscription information when you do not have a subscription identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @return GetSubscriptionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetSubscriptionResponse getSubscription(String notificationType) throws ApiException {
        ApiResponse<GetSubscriptionResponse> resp = getSubscriptionWithHttpInfo(notificationType);
        return resp.getData();
    }

    /**
     *
     * Returns information about subscriptions of the specified notification type. You can use this API to get subscription information when you do not have a subscription identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @return ApiResponse&lt;GetSubscriptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetSubscriptionResponse> getSubscriptionWithHttpInfo(String notificationType) throws ApiException {
        com.squareup.okhttp.Call call = getSubscriptionValidateBeforeCall(notificationType, null, null);
        Type localVarReturnType = new TypeToken<GetSubscriptionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns information about subscriptions of the specified notification type. You can use this API to get subscription information when you do not have a subscription identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSubscriptionAsync(String notificationType, final ApiCallback<GetSubscriptionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;
            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = getSubscriptionValidateBeforeCall(notificationType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetSubscriptionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSubscriptionById
     * @param subscriptionId The identifier for the subscription that you want to get. (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSubscriptionByIdCall(String subscriptionId, String notificationType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/notifications/v1/subscriptions/{notificationType}/{subscriptionId}"
            .replaceAll("\\{" + "subscriptionId" + "\\}", apiClient.escapeString(subscriptionId.toString()))
            .replaceAll("\\{" + "notificationType" + "\\}", apiClient.escapeString(notificationType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call getSubscriptionByIdValidateBeforeCall(String subscriptionId, String notificationType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling getSubscriptionById(Async)");
        }

        // verify the required parameter 'notificationType' is set
        if (notificationType == null) {
            throw new ApiException("Missing the required parameter 'notificationType' when calling getSubscriptionById(Async)");
        }


        com.squareup.okhttp.Call call = getSubscriptionByIdCall(subscriptionId, notificationType, progressListener, progressRequestListener);
        return call;

    }

    /**
     *
     * Returns information about a subscription for the specified notification type. The getSubscriptionById API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param subscriptionId The identifier for the subscription that you want to get. (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @return GetSubscriptionByIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetSubscriptionByIdResponse getSubscriptionById(String subscriptionId, String notificationType) throws ApiException {
        ApiResponse<GetSubscriptionByIdResponse> resp = getSubscriptionByIdWithHttpInfo(subscriptionId, notificationType);
        return resp.getData();
    }

    /**
     *
     * Returns information about a subscription for the specified notification type. The getSubscriptionById API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param subscriptionId The identifier for the subscription that you want to get. (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @return ApiResponse&lt;GetSubscriptionByIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetSubscriptionByIdResponse> getSubscriptionByIdWithHttpInfo(String subscriptionId, String notificationType) throws ApiException {
        com.squareup.okhttp.Call call = getSubscriptionByIdValidateBeforeCall(subscriptionId, notificationType, null, null);
        Type localVarReturnType = new TypeToken<GetSubscriptionByIdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns information about a subscription for the specified notification type. The getSubscriptionById API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param subscriptionId The identifier for the subscription that you want to get. (required)
     * @param notificationType The type of notification.   For more information about notification types, see [the Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSubscriptionByIdAsync(String subscriptionId, String notificationType, final ApiCallback<GetSubscriptionByIdResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = callback::onDownloadProgress;

            progressRequestListener = callback::onUploadProgress;
        }

        com.squareup.okhttp.Call call = getSubscriptionByIdValidateBeforeCall(subscriptionId, notificationType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetSubscriptionByIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
