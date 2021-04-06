package com.example.jms;

import com.example.jms.controllers.GreetingsController;
import io.restassured.module.webtestclient.RestAssuredWebTestClient;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
@AutoConfigureMessageVerifier
public abstract class GreetingsBase {

    @Autowired
    private GreetingsController greetingsController;

    @BeforeEach
    public void setup() {
        RestAssuredWebTestClient.standaloneSetup(greetingsController);
    }
}
