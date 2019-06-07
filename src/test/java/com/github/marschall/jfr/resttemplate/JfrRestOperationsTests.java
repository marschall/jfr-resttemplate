package com.github.marschall.jfr.resttemplate;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

class JfrRestOperationsTests {

  @Test
  void randomOrt() {
    RestOperations springTemplate = new RestTemplate();
    RestOperations jfrTemplate = new JfrRestOperations(springTemplate);
    String randomString = jfrTemplate.getForObject("https://www.random.org/integers/?num=1&min=1&max=6&col=1&base=10&format=plain&rnd=new", String.class);
    BigInteger random = new BigInteger(randomString.trim());
    assertNotNull(random);
  }

}
