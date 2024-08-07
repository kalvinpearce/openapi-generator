/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import java.util.List;
import java.util.Map;
import org.openapitools.client.model.Order;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.helidon.webclient.api.HttpClientResponse;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * 
 * OpenAPI Petstore Test
 *
 * 
 * API tests for StoreApi
 */
public class StoreApiTest {

    private static ApiClient apiClient;
    private static StoreApi api;
    private static final String baseUrl = "http://localhost:8080";

    @BeforeAll
    public static void setup() {
        apiClient = ApiClient.builder().build();
        api = StoreApiImpl.create(apiClient);
    }

   /**
    * Delete purchase order by ID
    * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
    */
    @Test
    public void deleteOrderTest() {
        // TODO - assign values to the input arguments.
        String orderId = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.deleteOrder(orderId);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Returns pet inventories by status
    * Returns a map of status codes to quantities
    */
    @Test
    public void getInventoryTest() {

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Map<String, Integer>> response = api.getInventory();
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Find purchase order by ID
    * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
    */
    @Test
    public void getOrderByIdTest() {
        // TODO - assign values to the input arguments.
        Long orderId = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Order> response = api.getOrderById(orderId);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Place an order for a pet
    * 
    */
    @Test
    public void placeOrderTest() {
        // TODO - assign values to the input arguments.
        Order order = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Order> response = api.placeOrder(order);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

}
