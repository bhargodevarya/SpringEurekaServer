package com.bhargo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SOSearchApplication implements CommandLineRunner {

    //@Autowired
    private RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SOSearchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        callSO();
    }

    private void callSO() {
        restTemplate = new RestTemplate();
        StringBuilder sb = new StringBuilder();
        sb.append("https://stackoverflow.com/oauth").
                append("?").
                append("client_id=13534").
                append("&").
                append("scope=write_access").
                append("&").
                append("redirect_uri=https://stackexchange.com/oauth/login_success");
        ResponseEntity<String> response = restTemplate.getForEntity(sb.toString(), String.class);
        response.getHeaders().forEach((k,v) -> System.out.println("key is " + k + " value is " + v));
        //System.out.println("response is >>>> " + response);
    }
}
