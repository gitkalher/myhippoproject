package org.example.components;

import org.example.beans.NewsDocument;
import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;

public class NewsComponent extends BaseHstComponent {

	@Override
	public void doBeforeRender(HstRequest request, HstResponse response)
			throws HstComponentException {
		NewsDocument document = (NewsDocument) getContentBean(request);
		request.setAttribute("document", document);
	}
	
}
