package com.datasciencebox.editor;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.apache.commons.io.IOUtils;

@ManagedBean(name = "buttonsBean")
@ViewScoped
public class ButtonsBean implements Serializable {

	public String host;
	private String text = "Starting text";// getter + setter
	private String metadata = null;
	private String message = "bean message";
	private String clickValue = "";

	public String getClickValue() {
		return clickValue;
	}

	public void setClickValue(String clickValue) {
		this.clickValue = clickValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getMetadata() {
		return this.metadata;
	}

	public String getClick() {
		Map<String, String> params = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		String param1 = params.get("param1");
		return param1 + ", bean used.";
	}

	public void getJSON() {
		FileInputStream inputStream;

		if (this.metadata == null) {

			try {

				ClassLoader loader = Thread.currentThread()
						.getContextClassLoader();
				inputStream = (FileInputStream) loader
						.getResourceAsStream("/metadata.json");
				this.metadata = IOUtils.toString(inputStream);
				inputStream.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		} else {

			try {

				Example example = new Example();
				ObjectMapper mapper = new ObjectMapper();

				/*
				 * nodesString = { "class": "go.GraphLinksModel",
				 * "nodeDataArray":[
				 * {"key":"1","text":"Ancestor","fill":"#f68c06"
				 * ,"stroke":"#4d90fe"},
				 * {"key":"2","text":"Descendent 1","fill":
				 * "#f68c06","stroke":"#4d90fe"},
				 * {"key":"3","text":"Descendent 2"
				 * ,"fill":"#ccc","stroke":"#4d90fe"},
				 * {"key":"4","text":"Descendent 3"
				 * ,"fill":"#f8f8f8","stroke":"#4d90fe"},
				 * {"key":"5","text":"Descendent 4"
				 * ,"fill":"#ccc","stroke":"#4d90fe"} ], "linkDataArray":[
				 * {"from":"1","to":"2","linktext":"qualification"},
				 * {"from":"2","to":"3","linktext":"related"},
				 * {"from":"3","to":"4","linktext":"related"},
				 * {"from":"2","to":"5","linktext":"related"} ] }
				 */

				example.setClass_("go.GraphLinksModel");

				ArrayList<LinkDataArray> ldaList = new ArrayList<LinkDataArray>();
				ArrayList<NodeDataArray> ndaList = new ArrayList<NodeDataArray>();

				LinkDataArray lda1 = new LinkDataArray();
				lda1.setFrom("1");
				lda1.setTo("2");
				lda1.setLinktext("qualifiedBy");

				ldaList.add(lda1);

				NodeDataArray nda1 = new NodeDataArray();
				nda1.setKey("1");
				nda1.setText("Ancestry");
				nda1.setFill("#ccc");
				nda1.setStroke("#4d90fe");

				NodeDataArray nda2 = new NodeDataArray();
				nda2.setKey("2");
				nda2.setText("Descendency");
				nda2.setFill("#f8f8f8");
				nda2.setStroke("#4d90fe");

				ndaList.add(nda1);
				ndaList.add(nda2);

				example.setLinkDataArray(ldaList);
				example.setNodeDataArray(ndaList);

				// convert user object to json string, and save to a file
				this.metadata = mapper.writeValueAsString(example);

				// display to console
				System.out.println(mapper.writeValueAsString(example));
			} catch (JsonGenerationException e) {

				e.printStackTrace();

			} catch (JsonMappingException e) {

				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String javascriptCall() {
		return "haha";
	}

	public void listener() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		text = "Text was changed via remote command on "
				+ dateFormat.format(cal.getTime());
	}

	public String getHost(String page) {
		try {

			/**
			 * Note: this is the hard way.
			 * 
			 * The easy way is to simply put the page url to navigate to in the
			 * xhtml.
			 */

			HttpServletRequest origRequest = (HttpServletRequest) FacesContext
					.getCurrentInstance().getExternalContext().getRequest();

			String url = origRequest.getScheme() + // eg. http
					"://" + origRequest.getServerName() + // eg. localhost
					":" + origRequest.getServerPort() + // eg. 8080
					origRequest.getContextPath() + // eg. primefaces
					origRequest.getServletPath() + // eg. faces
					"/" + page; // eg. index.xhtml

			ExternalContext ec = FacesContext.getCurrentInstance()
					.getExternalContext();
			// ((HttpServletRequest) ec.getRequest()).logout();
			ec.invalidateSession();
			ec.redirect(url);

			return url;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void setHost(String host) {
		this.host = host;
	}

}
