package etraveli.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
		// Test if the application context loads successfully
	}

	@Test
	void testApiEndpoint() {
		String url = "/clearing-cost";

		// Send a GET request to the API endpoint
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		// Assert the response status code
		assertEquals(HttpStatus.OK, response.getStatusCode());

		// Assert the response body or perform other assertions as needed
		// For example:
		// assertEquals("Expected response body", response.getBody());
		// assertTrue(response.getBody().contains("Expected value"));
		// ...
	}

	@Test
	void testApiEndpointWithQueryParams() {
		String url = "/clearing-cost/1";

		// Send a GET request to the API endpoint with query parameters
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		// Assert the response status code
		assertEquals(HttpStatus.OK, response.getStatusCode());

		// Assert the response body or perform other assertions as needed
		// For example:
		// assertEquals("Expected response body", response.getBody());
		// assertTrue(response.getBody().contains("Expected value"));
		// ...
	}

	@Test
	void testApiEndpointWithRequestBody() {
		String url = "/clearing-cost";

		// Send a POST request to the API endpoint with a request body
		ResponseEntity<String> response = restTemplate.postForEntity(url, "Request body", String.class);

		// Assert the response status code
		assertEquals(HttpStatus.OK, response.getStatusCode());

		// Assert the response body or perform other assertions as needed
		// For example:
		// assertEquals("Expected response body", response.getBody());
		// assertTrue(response.getBody().contains("Expected value"));
		// ...
	}

}
