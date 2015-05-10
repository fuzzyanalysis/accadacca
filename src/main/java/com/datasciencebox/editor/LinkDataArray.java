package com.datasciencebox.editor;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"from",
"to",
"linktext"
})
public class LinkDataArray {

@JsonProperty("from")
private String from;
@JsonProperty("to")
private String to;
@JsonProperty("linktext")
private String linktext;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
*
* @return
* The from
*/
@JsonProperty("from")
public String getFrom() {
return from;
}

/**
*
* @param from
* The from
*/
@JsonProperty("from")
public void setFrom(String from) {
this.from = from;
}

/**
*
* @return
* The to
*/
@JsonProperty("to")
public String getTo() {
return to;
}

/**
*
* @param to
* The to
*/
@JsonProperty("to")
public void setTo(String to) {
this.to = to;
}

/**
*
* @return
* The linktext
*/
@JsonProperty("linktext")
public String getLinktext() {
return linktext;
}

/**
*
* @param linktext
* The linktext
*/
@JsonProperty("linktext")
public void setLinktext(String linktext) {
this.linktext = linktext;
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

