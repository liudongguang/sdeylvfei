<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/tld/c.tld"%>
<!doctype html>
<html class="no-js">
<head>
<base href="${pageContext.request.contextPath }/" />
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet" href="assets/css/app_style.css">
</head>
<body style="background-color: #f2f2f2">
	<!--用户部分开始-->
	<div id="neirong"
		style="background-color: #f2f2f2; position: absolute; width: 100%; height: 100%">
		<ul class="am-list">
			<c:forEach items="${requestScope.provinces}" var="obj">
				<li
					class="am-g am-list-item-dated sy_ul_li_border border_bottom_show">
					<a ajaxthispage
					href="/sdey/getCityByProvinceID?provinceID=${obj.provinceid}&provinceName=${obj.province }"
					class="am-list-item-hd sy_wo_li_a">${obj.province }</a> <span
					class="heart_span"><img class="size_heart"
						src="assets/image/go.png" alt="" /></span>
				</li>
			</c:forEach>
		</ul>
		<script type="text/javascript" src="js/address.js"></script>
	</div>
	<!--用户部分结束-->
</body>
</html>
