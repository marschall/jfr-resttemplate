JfrRestTemplate
===============

An implementation of Spring [RestTemplate](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html) that generates [Flight Recorder](https://openjdk.java.net/jeps/328) events.

This project requires Java 11 based on OpenJDK or later.

```xml
<dependency>
  <groupId>com.github.marschall</groupId>
  <artifactId>jfr-resttemplate</artifactId>
  <version>0.1.0-SNAPSHOT</version>
</dependency>
```

Overhead
--------

We try to keep overhead to a minimum and the only additional allocations besides the JFR events are `URI#toString()`.


Usage
-----

```java
@Configuration
public class RestConfiguration {

   @Bean
   public RestOperations restOperations() {
     ClientHttpRequestFactory requestFactory = ...;
     RestOperations restOperations = new RestTemplate(requestFactory);
     return new JfrRestOperations(restOperations);
   }

}
```
