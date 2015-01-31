package org.example.components;

import org.example.beans.NewsDocument;
import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.content.beans.query.HstQuery;
import org.hippoecm.hst.content.beans.query.HstQueryResult;
import org.hippoecm.hst.content.beans.query.exceptions.QueryException;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewsOverview extends BaseHstComponent {

	private static final Logger LOG = LoggerFactory.getLogger(NewsOverview.class);

	@Override
	public void doBeforeRender(HstRequest request, HstResponse response)
			throws HstComponentException {

		LOG.debug("Attempting to retrieve news document.");

		HippoBean scope = getContentBean(request);

		try {
			HstQuery query = getQueryManager(request).createQuery(scope, NewsDocument.class);
			query.addOrderByAscending("myhippoproject:date");
			
			HstQueryResult result = query.execute();
			request.setAttribute("result", result);

		} catch (QueryException e) {
			LOG.error("Error while executing query for news overview.", e);
		}

	}

}
