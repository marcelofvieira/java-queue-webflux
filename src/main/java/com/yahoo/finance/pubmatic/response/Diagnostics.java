
package com.yahoo.finance.pubmatic.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "publiclyCallable",
    "cache",
    "query",
    "javascript",
    "user-time",
    "service-time",
    "build-version"
})
public class Diagnostics {

    @JsonProperty("url")
    private List<Url> url = null;
    @JsonProperty("publiclyCallable")
    private String publiclyCallable;
    @JsonProperty("cache")
    private Cache cache;
    @JsonProperty("query")
    private Query_ query;
    @JsonProperty("javascript")
    private Javascript javascript;
    @JsonProperty("user-time")
    private String userTime;
    @JsonProperty("service-time")
    private String serviceTime;
    @JsonProperty("build-version")
    private String buildVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("url")
    public List<Url> getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(List<Url> url) {
        this.url = url;
    }

    @JsonProperty("publiclyCallable")
    public String getPubliclyCallable() {
        return publiclyCallable;
    }

    @JsonProperty("publiclyCallable")
    public void setPubliclyCallable(String publiclyCallable) {
        this.publiclyCallable = publiclyCallable;
    }

    @JsonProperty("cache")
    public Cache getCache() {
        return cache;
    }

    @JsonProperty("cache")
    public void setCache(Cache cache) {
        this.cache = cache;
    }

    @JsonProperty("query")
    public Query_ getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(Query_ query) {
        this.query = query;
    }

    @JsonProperty("javascript")
    public Javascript getJavascript() {
        return javascript;
    }

    @JsonProperty("javascript")
    public void setJavascript(Javascript javascript) {
        this.javascript = javascript;
    }

    @JsonProperty("user-time")
    public String getUserTime() {
        return userTime;
    }

    @JsonProperty("user-time")
    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }

    @JsonProperty("service-time")
    public String getServiceTime() {
        return serviceTime;
    }

    @JsonProperty("service-time")
    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }

    @JsonProperty("build-version")
    public String getBuildVersion() {
        return buildVersion;
    }

    @JsonProperty("build-version")
    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
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
