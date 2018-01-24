<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/tld/c.tld"%>
<ul class="am-list">
	<div class="fast_find_list">
		<a ajaxthispage href="/sdey/getSheng"><img style="width: 30px"
			src="assets/image/back.png" alt="" />返回</a>
	</div>
	<c:forEach items="${requestScope.citys}" var="obj">
		<li class="am-g am-list-item-dated sy_ul_li_border border_bottom_show">
			<a ajaxthispage
			href="/sdey/getAreasByCityID?cityID=${obj.cityid}&provinceID=${param.provinceID}&provinceName=${param.provinceName}&cityName=${obj.city}"
			class="am-list-item-hd sy_wo_li_a">${obj.city }</a> <span
			class="heart_span"><img class="size_heart"
				src="assets/image/go.png" alt="" /></span>
		</li>
	</c:forEach>
</ul>
<script type="text/javascript" src="js/address.js"></script>

