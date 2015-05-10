package com.datasciencebox.editor;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/*
nodesString = {
		  "class": "go.GraphLinksModel",
		  "nodeDataArray":[
		{"key":"1","text":"Ancestor","fill":"#f68c06","stroke":"#4d90fe"},
		{"key":"2","text":"Descendent 1","fill":"#f68c06","stroke":"#4d90fe"},
		{"key":"3","text":"Descendent 2","fill":"#ccc","stroke":"#4d90fe"},
		{"key":"4","text":"Descendent 3","fill":"#f8f8f8","stroke":"#4d90fe"},
		{"key":"5","text":"Descendent 4","fill":"#ccc","stroke":"#4d90fe"}
		  ],
		  "linkDataArray":[
		{"from":"1","to":"2","linktext":"qualification"},
		{"from":"2","to":"3","linktext":"related"},
		{"from":"3","to":"4","linktext":"related"},
		{"from":"2","to":"5","linktext":"related"}
		  ]
		}
*/

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"class",
"nodeDataArray",
"linkDataArray"
})
public class Example {

@JsonProperty("class")
private String _class;
@JsonProperty("nodeDataArray")
private List<NodeDataArray> nodeDataArray = new ArrayList<NodeDataArray>();
@JsonProperty("linkDataArray")
private List<LinkDataArray> linkDataArray = new ArrayList<LinkDataArray>();
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
*
* @return
* The _class
*/
@JsonProperty("class")
public String getClass_() {
return _class;
}

/**
*
* @param _class
* The class
*/
@JsonProperty("class")
public void setClass_(String _class) {
this._class = _class;
}

/**
*
* @return
* The nodeDataArray
*/
@JsonProperty("nodeDataArray")
public List<NodeDataArray> getNodeDataArray() {
return nodeDataArray;
}

/**
*
* @param nodeDataArray
* The nodeDataArray
*/
@JsonProperty("nodeDataArray")
public void setNodeDataArray(List<NodeDataArray> nodeDataArray) {
this.nodeDataArray = nodeDataArray;
}

/**
*
* @return
* The linkDataArray
*/
@JsonProperty("linkDataArray")
public List<LinkDataArray> getLinkDataArray() {
return linkDataArray;
}

/**
*
* @param linkDataArray
* The linkDataArray
*/
@JsonProperty("linkDataArray")
public void setLinkDataArray(List<LinkDataArray> linkDataArray) {
this.linkDataArray = linkDataArray;
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

