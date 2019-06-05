package com.github.marschall.jfr.resttemplate;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestOperations;

import jdk.jfr.Category;
import jdk.jfr.Description;
import jdk.jfr.Event;
import jdk.jfr.Label;

/**
 * An implementation of {@link RestOperations} that generates JFR events.
 * The events are generated in the "Spring REST" category.
 */
public final class JfrRestOperations implements RestOperations {

  private final RestOperations delegate;

  /**
   * Constructs a new {@link JfrRestOperations}.
   *
   * @param delegate the actual {@link RestOperations} implementation, not {@code null}
   */
  public JfrRestOperations(RestOperations delegate) {
    Objects.requireNonNull(delegate, "delegate");
    this.delegate = delegate;
  }

  public <T> T getForObject(String url, Class<T> responseType, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("GET");
    event.setOperationName("getForObject");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.getForObject(url, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> T getForObject(String url, Class<T> responseType, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("GET");
    event.setOperationName("getForObject");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.getForObject(url, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> T getForObject(URI url, Class<T> responseType) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod("GET");
    event.setOperationName("getForObject");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.getForObject(url, responseType);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("GET");
    event.setOperationName("getForEntity");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.getForEntity(url, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("GET");
    event.setOperationName("getForEntity");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.getForEntity(url, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> getForEntity(URI url, Class<T> responseType) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod("GET");
    event.setOperationName("getForEntity");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.getForEntity(url, responseType);
    } finally {
      event.end();
      event.commit();
    }
  }

  public HttpHeaders headForHeaders(String url, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("HEAD");
    event.setOperationName("headForHeaders");
    event.setResponseType(HttpHeaders.class);
    event.begin();
    try {
      return delegate.headForHeaders(url, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public HttpHeaders headForHeaders(String url, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("HEAD");
    event.setOperationName("headForHeaders");
    event.setResponseType(HttpHeaders.class);
    event.begin();
    try {
      return delegate.headForHeaders(url, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public HttpHeaders headForHeaders(URI url) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod("HEAD");
    event.setOperationName("headForHeaders");
    event.setResponseType(HttpHeaders.class);
    event.begin();
    try {
      return delegate.headForHeaders(url);
    } finally {
      event.end();
      event.commit();
    }
  }

  public URI postForLocation(String url, Object request, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("POST");
    event.setOperationName("postForLocation");
    event.setResponseType(URI.class);
    event.begin();
    try {
      return delegate.postForLocation(url, request, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public URI postForLocation(String url, Object request, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("POST");
    event.setOperationName("postForLocation");
    event.setResponseType(URI.class);
    event.begin();
    try {
      return delegate.postForLocation(url, request, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public URI postForLocation(URI url, Object request) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod("POST");
    event.setOperationName("postForLocation");
    event.setResponseType(URI.class);
    event.begin();
    try {
      return delegate.postForLocation(url, request);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> T postForObject(String url, Object request, Class<T> responseType, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("POST");
    event.setOperationName("postForObject");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.postForObject(url, request, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> T postForObject(String url, Object request, Class<T> responseType, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("POST");
    event.setOperationName("postForObject");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.postForObject(url, request, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> T postForObject(URI url, Object request, Class<T> responseType) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod("POST");
    event.setOperationName("postForObject");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.postForObject(url, request, responseType);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> postForEntity(String url, Object request, Class<T> responseType, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("POST");
    event.setOperationName("postForEntity");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.postForEntity(url, request, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> postForEntity(String url, Object request, Class<T> responseType, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("POST");
    event.setOperationName("postForEntity");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.postForEntity(url, request, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> postForEntity(URI url, Object request, Class<T> responseType) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod("POST");
    event.setOperationName("postForEntity");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.postForEntity(url, request, responseType);
    } finally {
      event.end();
      event.commit();
    }
  }

  public void put(String url, Object request, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("PUT");
    event.setOperationName("put");
    event.setResponseType(Void.class);
    event.begin();
    try {
      delegate.put(url, request, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public void put(String url, Object request, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("PUT");
    event.setOperationName("put");
    event.setResponseType(Void.class);
    event.begin();
    try {
      delegate.put(url, request, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public void put(URI url, Object request) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod("PUT");
    event.setOperationName("put");
    event.setResponseType(Void.class);
    event.begin();
    try {
      delegate.put(url, request);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> T patchForObject(String url, Object request, Class<T> responseType, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("PATCH");
    event.setOperationName("patchForObject");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.patchForObject(url, request, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> T patchForObject(String url, Object request, Class<T> responseType, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("PATCH");
    event.setOperationName("patchForObject");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.patchForObject(url, request, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> T patchForObject(URI url, Object request, Class<T> responseType) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod("PATCH");
    event.setOperationName("patchForObject");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.patchForObject(url, request, responseType);
    } finally {
      event.end();
      event.commit();
    }
  }

  public void delete(String url, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("DELETE");
    event.setOperationName("delete");
    event.setResponseType(Void.class);
    event.begin();
    try {
      delegate.delete(url, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public void delete(String url, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("DELETE");
    event.setOperationName("delete");
    event.setResponseType(Void.class);
    event.begin();
    try {
      delegate.delete(url, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public void delete(URI url) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod("DELETE");
    event.setOperationName("delete");
    event.setResponseType(Void.class);
    event.begin();
    try {
      delegate.delete(url);
    } finally {
      event.end();
      event.commit();
    }
  }

  public Set<HttpMethod> optionsForAllow(String url, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("OPTIONS");
    event.setOperationName("optionsForAllow");
    event.setResponseType(Set.class);
    event.begin();
    try {
      return delegate.optionsForAllow(url, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public Set<HttpMethod> optionsForAllow(String url, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod("OPTIONS");
    event.setOperationName("optionsForAllow");
    event.setResponseType(Set.class);
    event.begin();
    try {
      return delegate.optionsForAllow(url, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public Set<HttpMethod> optionsForAllow(URI url) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod("OPTIONS");
    event.setOperationName("optionsForAllow");
    event.setResponseType(Set.class);
    event.begin();
    try {
      return delegate.optionsForAllow(url);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
      Class<T> responseType, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod(method.name());
    event.setOperationName("exchange");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.exchange(url, method, requestEntity, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
      Class<T> responseType, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod(method.name());
    event.setOperationName("exchange");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.exchange(url, method, requestEntity, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod(method.name());
    event.setOperationName("exchange");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.exchange(url, method, requestEntity, responseType);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
      ParameterizedTypeReference<T> responseType, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod(method.name());
    event.setOperationName("exchange");
    event.setResponseType(extractResponseType(responseType));
    event.begin();
    try {
      return delegate.exchange(url, method, requestEntity, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
      ParameterizedTypeReference<T> responseType, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod(method.name());
    event.setOperationName("exchange");
    event.setResponseType(extractResponseType(responseType));
    event.begin();
    try {
      return delegate.exchange(url, method, requestEntity, responseType, uriVariables);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity,
      ParameterizedTypeReference<T> responseType) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod(method.name());
    event.setOperationName("exchange");
    event.setResponseType(extractResponseType(responseType));
    event.begin();
    try {
      return delegate.exchange(url, method, requestEntity, responseType);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> exchange(RequestEntity<?> requestEntity, Class<T> responseType) {
    RestEvent event = new RestEvent();
    event.setUri(requestEntity.getUrl().toString());
    event.setMethod(requestEntity.getMethod().name());
    event.setOperationName("exchange");
    event.setResponseType(responseType);
    event.begin();
    try {
      return delegate.exchange(requestEntity, responseType);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> ResponseEntity<T> exchange(RequestEntity<?> requestEntity, ParameterizedTypeReference<T> responseType) {
    RestEvent event = new RestEvent();
    event.setUri(requestEntity.getUrl().toString());
    event.setMethod(requestEntity.getMethod().name());
    event.setOperationName("exchange");
    event.setResponseType(extractResponseType(responseType));
    event.begin();
    try {
      return delegate.exchange(requestEntity, responseType);
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> T execute(String url, HttpMethod method, RequestCallback requestCallback,
      ResponseExtractor<T> responseExtractor, Object... uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod(method.name());
    event.setOperationName("exchange");
    event.begin();
    try {
      T response = delegate.execute(url, method, requestCallback, responseExtractor, uriVariables);
      if (response != null) {
        event.setResponseType(response.getClass());
      }
      return response;
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> T execute(String url, HttpMethod method, RequestCallback requestCallback,
      ResponseExtractor<T> responseExtractor, Map<String, ?> uriVariables) {
    RestEvent event = new RestEvent();
    event.setUri(url);
    event.setMethod(method.name());
    event.setOperationName("exchange");
    event.begin();
    try {
      T response = delegate.execute(url, method, requestCallback, responseExtractor, uriVariables);
      if (response != null) {
        event.setResponseType(response.getClass());
      }
      return response;
    } finally {
      event.end();
      event.commit();
    }
  }

  public <T> T execute(URI url, HttpMethod method, RequestCallback requestCallback,
      ResponseExtractor<T> responseExtractor) {
    RestEvent event = new RestEvent();
    event.setUri(url.toString());
    event.setMethod(method.name());
    event.setOperationName("exchange");
    event.begin();
    try {
      T response = delegate.execute(url, method, requestCallback, responseExtractor);
      if (response != null) {
        event.setResponseType(response.getClass());
      }
      return response;
    } finally {
      event.end();
      event.commit();
    }
  }
  
  private static Class<?> extractResponseType(ParameterizedTypeReference<?> responseType) {
    Type type = responseType.getType();
    if (type instanceof Class) {
      return (Class<?>) type;
    }
    if (type instanceof ParameterizedType) {
      ParameterizedType parameterizedType = (ParameterizedType) type;
      Type rawType = parameterizedType.getRawType();
      if (rawType instanceof Class) {
        return (Class<?>) rawType;
      }
    }
    return null;
  }
  

  @Label("Operation")
  @Description("A REST Operation")
  @Category("Spring REST")
  static class RestEvent extends Event {
    
    @Label("Method")
    @Description("The name of the HTTP method")
    private String method;
    
    @Label("URI")
    @Description("The HTTP URI")
    private String uri;

    @Label("Operation Name")
    @Description("The name of the REST operation")
    private String operationName;
    
    @Label("Response Type")
    @Description("The response type")
    private Class<?> responseType;

    String getOperationName() {
      return this.operationName;
    }

    void setOperationName(String operationName) {
      this.operationName = operationName;
    }

    String getMethod() {
      return method;
    }

    void setMethod(String method) {
      this.method = method;
    }

    String getUri() {
      return uri;
    }

    void setUri(String uri) {
      this.uri = uri;
    }

    Class<?> getResponseType() {
      return responseType;
    }

    void setResponseType(Class<?> responseType) {
      this.responseType = responseType;
    }

  }


}
