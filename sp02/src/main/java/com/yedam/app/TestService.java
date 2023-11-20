package com.yedam.app;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

@Service
public class TestService {
	private final RestTemplate restTemplate;
	
	 private static final String REQUEST_URL="https://developers.nonghyup.com/InquireCreditCardAuthorizationHistory.nh";
	 
    public TestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
	 
    public void getPosts() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String jsonBody = "{"
                + "\"Header\": {"
                + "\"ApiNm\": \"InquireCreditCardAuthorizationHistory\","
                + "\"Tsymd\": \"20231120\","
                + "\"Trtm\": \"183900\","
                + "\"Iscd\": \"002177\","
                + "\"FintechApsno\": \"001\","
                + "\"ApiSvcCd\": \"CardInfo\","
                + "\"IsTuno\": \"000004\","
                + "\"AccessToken\": \"da36d221e7e64a34021c1e2f8b276de908de14bdbdba3db6c02a7ae1b6620ef2\""
                + "},"
                + "\"FinCard\": \"00829101234560000112345678919\","
                + "\"IousDsnc\": \"1\","
                + "\"Insymd\": \"20191105\","
                + "\"Ineymd\": \"20191109\","
                + "\"PageNo\": \"1\","
                + "\"Dmcnt\": \"15\""
                + "}";

        HttpEntity<String> requestEntity = new HttpEntity<>(jsonBody, headers);

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(REQUEST_URL, requestEntity, String.class);

        // Handle the response if needed
        String responseBody = responseEntity.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
      
        System.out.println(responseBody);
    }
}
