
package com.yahoo.finance.pubmatic.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "execution-start-time",
    "execution-stop-time",
    "execution-time",
    "method",
    "type",
    "content"
})
public class Cache {

    @JsonProperty("execution-start-time")
    private String executionStartTime;
    @JsonProperty("execution-stop-time")
    private String executionStopTime;
    @JsonProperty("execution-time")
    private String executionTime;
    @JsonProperty("method")
    private String method;
    @JsonProperty("type")
    private String type;
    @JsonProperty("content")
    private String content;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("execution-start-time")
    public String getExecutionStartTime() {
        return executionStartTime;
    }

    @JsonProperty("execution-start-time")
    public void setExecutionStartTime(String executionStartTime) {
        this.executionStartTime = executionStartTime;
    }

    @JsonProperty("execution-stop-time")
    public String getExecutionStopTime() {
        return executionStopTime;
    }

    @JsonProperty("execution-stop-time")
    public void setExecutionStopTime(String executionStopTime) {
        this.executionStopTime = executionStopTime;
    }

    @JsonProperty("execution-time")
    public String getExecutionTime() {
        return executionTime;
    }

    @JsonProperty("execution-time")
    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
