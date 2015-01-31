<%@ include file="/WEB-INF/jspf/taglibs.jspf"%>

<ul>
	<c:forEach items="${result.hippoBeans}" var="item">
		<li class="newsHeadings" >
			<a href="${item.name}">
				<fmt:formatDate value="${item.date.time}" type="both" dateStyle="medium" timeStyle="short" /> - ${item.title}
			</a>
		</li>

	</c:forEach>
</ul>

