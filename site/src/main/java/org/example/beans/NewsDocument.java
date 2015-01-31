package org.example.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType = "myhippoproject:news")
public class NewsDocument extends BaseDocument {

	public String getTitle() {
		return getProperty("myhippoproject:title");
	}

	public Calendar getDate() {
		return getProperty("myhippoproject:date");
	}

	public HippoHtml getNews() {
		return getHippoHtml("myhippoproject:news");
	}

}
