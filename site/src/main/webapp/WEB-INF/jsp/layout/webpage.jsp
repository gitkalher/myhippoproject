<!doctype html>
<%@ include file="/WEB-INF/jspf/taglibs.jspf"%>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<hst:headContributions categoryIncludes="scripts" xhtml="true" />
	<hst:link var="link" path="/css/style.css" />
	<link rel="stylesheet" href="${link}" type="text/css" />
</head>
<body>
	<hst:include ref="header" />
	<hst:include ref="main" />
	<hst:headContributions categoryIncludes="scripts" xhtml="true" />
</body>
</html>