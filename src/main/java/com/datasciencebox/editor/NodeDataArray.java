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
"key",
"text",
"fill",
"stroke"
})
public class NodeDataArray {

@JsonProperty("key")
private String key;
@JsonProperty("text")
private String text;
@JsonProperty("fill")
private String fill;
@JsonProperty("stroke")
private String stroke;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
*
* @return
* The key
*/
@JsonProperty("key")
public String getKey() {
return key;
}

/**
*
* @param key
* The key
*/
@JsonProperty("key")
public void setKey(String key) {
this.key = key;
}

/**
*
* @return
* The text
*/
@JsonProperty("text")
public String getText() {
return text;
}

/**
*
* @param text
* The text
*/
@JsonProperty("text")
public void setText(String text) {
this.text = text;
}

/**
*
* @return
* The fill
*/
@JsonProperty("fill")
public String getFill() {
return fill;
}

/**
*
* @param fill
* The fill
*/
@JsonProperty("fill")
public void setFill(String fill) {
this.fill = fill;
}

/**
*
* @return
* The stroke
*/
@JsonProperty("stroke")
public String getStroke() {
return stroke;
}

/**
*
* @param stroke
* The stroke
*/
@JsonProperty("stroke")
public void setStroke(String stroke) {
this.stroke = stroke;
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
