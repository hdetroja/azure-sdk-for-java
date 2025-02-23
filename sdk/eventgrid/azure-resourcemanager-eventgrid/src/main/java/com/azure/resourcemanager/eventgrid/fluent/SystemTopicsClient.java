// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.fluent.models.SystemTopicInner;
import com.azure.resourcemanager.eventgrid.models.SystemTopicUpdateParameters;

/** An instance of this class provides access to all the operations defined in SystemTopicsClient. */
public interface SystemTopicsClient {
    /**
     * Get properties of a system topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a system topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SystemTopicInner getByResourceGroup(String resourceGroupName, String systemTopicName);

    /**
     * Get properties of a system topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a system topic along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SystemTopicInner> getByResourceGroupWithResponse(
        String resourceGroupName, String systemTopicName, Context context);

    /**
     * Asynchronously creates a new system topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @param systemTopicInfo System Topic information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of eventGrid System Topic.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SystemTopicInner>, SystemTopicInner> beginCreateOrUpdate(
        String resourceGroupName, String systemTopicName, SystemTopicInner systemTopicInfo);

    /**
     * Asynchronously creates a new system topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @param systemTopicInfo System Topic information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of eventGrid System Topic.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SystemTopicInner>, SystemTopicInner> beginCreateOrUpdate(
        String resourceGroupName, String systemTopicName, SystemTopicInner systemTopicInfo, Context context);

    /**
     * Asynchronously creates a new system topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @param systemTopicInfo System Topic information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid System Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SystemTopicInner createOrUpdate(String resourceGroupName, String systemTopicName, SystemTopicInner systemTopicInfo);

    /**
     * Asynchronously creates a new system topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @param systemTopicInfo System Topic information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid System Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SystemTopicInner createOrUpdate(
        String resourceGroupName, String systemTopicName, SystemTopicInner systemTopicInfo, Context context);

    /**
     * Delete existing system topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String systemTopicName);

    /**
     * Delete existing system topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String systemTopicName, Context context);

    /**
     * Delete existing system topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String systemTopicName);

    /**
     * Delete existing system topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String systemTopicName, Context context);

    /**
     * Asynchronously updates a system topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @param systemTopicUpdateParameters SystemTopic update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of eventGrid System Topic.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SystemTopicInner>, SystemTopicInner> beginUpdate(
        String resourceGroupName, String systemTopicName, SystemTopicUpdateParameters systemTopicUpdateParameters);

    /**
     * Asynchronously updates a system topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @param systemTopicUpdateParameters SystemTopic update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of eventGrid System Topic.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SystemTopicInner>, SystemTopicInner> beginUpdate(
        String resourceGroupName,
        String systemTopicName,
        SystemTopicUpdateParameters systemTopicUpdateParameters,
        Context context);

    /**
     * Asynchronously updates a system topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @param systemTopicUpdateParameters SystemTopic update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid System Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SystemTopicInner update(
        String resourceGroupName, String systemTopicName, SystemTopicUpdateParameters systemTopicUpdateParameters);

    /**
     * Asynchronously updates a system topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param systemTopicName Name of the system topic.
     * @param systemTopicUpdateParameters SystemTopic update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid System Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SystemTopicInner update(
        String resourceGroupName,
        String systemTopicName,
        SystemTopicUpdateParameters systemTopicUpdateParameters,
        Context context);

    /**
     * List all the system topics under an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List System topics operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SystemTopicInner> list();

    /**
     * List all the system topics under an Azure subscription.
     *
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List System topics operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SystemTopicInner> list(String filter, Integer top, Context context);

    /**
     * List all the system topics under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List System topics operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SystemTopicInner> listByResourceGroup(String resourceGroupName);

    /**
     * List all the system topics under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List System topics operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SystemTopicInner> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context);
}
