<%@ include file="/WEB-INF/jspf/taglibs.jspf"%>
<%--@elvariable id="document" type="org.example.beans.NewsDocument" --%>

<p class="newsTitle">${document.title}</p>

<p class="newsDate">
	<fmt:formatDate value="${document.date.time}" type="both"
		dateStyle="medium" timeStyle="short" />
</p>

<div class="news">
	<hst:html hippohtml="${document.news}" />
</div>