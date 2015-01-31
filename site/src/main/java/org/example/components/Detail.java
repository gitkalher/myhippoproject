package org.example.components;

import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.request.ResolvedSiteMapItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Detail extends BaseHstComponent {

	private static final Logger LOG = LoggerFactory.getLogger(Detail.class);

	@Override
	public void doBeforeRender(HstRequest request, HstResponse response)
			throws HstComponentException {

		HippoBean doc = getContentBean(request);

		if (doc == null) {
			ResolvedSiteMapItem resolvedSiteMapItem = request
					.getRequestContext().getResolvedSiteMapItem();
			LOG.warn(
					"Did not find a content bean fro relative content path '{}' for pathInfo '{}'",
					resolvedSiteMapItem.getRelativeContentPath(),
					resolvedSiteMapItem.getPathInfo());
			response.setStatus(404);
			return;
		}

		request.setAttribute("document", doc);

	}
}
