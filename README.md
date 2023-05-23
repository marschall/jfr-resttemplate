JfrRestTemplate [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.marschall/jfr-resttemplate/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.marschall/jfr-resttemplate) [![Javadocs](https://www.javadoc.io/badge/com.github.marschall/jfr-resttemplate.svg)](https://www.javadoc.io/doc/com.github.marschall/jfr-resttemplate)
===============

An implementation of Spring [RestTemplate](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html) that generates [Flight Recorder](https://openjdk.java.net/jeps/328) events.


![Flight Recording of some HTTP requests](https://github.com/marschall/jfr-resttemplate/raw/master/src/main/javadoc/Screenshot.png)

Versions 2.x are for Spring 6, versions 1.x are for Spring 5.

```xml
<dependency>
  <groupId>com.github.marschall</groupId>
  <artifactId>jfr-resttemplate</artifactId>
  <version>2.0.0</version>
</dependency>
```

This project requires Java 11 based on OpenJDK or later.

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
