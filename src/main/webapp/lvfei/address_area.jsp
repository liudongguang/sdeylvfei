<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/tld/c.tld"%>

<input type="hidden" value="${param.provinceID}" id="csprovinceID"/>
<input type="hidden" value="${param.provinceName}" id="csprovinceName"/>
<input type="hidden" value="${param.cityID}" id="cscityID"/>
<input type="hidden" value=" ${param.cityName}" id="cscityName"/>
<ul class="am-list">
	<div class="fast_find_list">
		<a ajaxthispage
			href="/sdey/getCityByProvinceID?provinceID=${param.provinceID}"><img
			style="width: 30px" src="assets/image/back.png" alt="" />返回</a>
	</div>
	<c:forEach items="${requestScope.areas}" var="obj">
		<li class="am-g am-list-item-dated sy_ul_li_border border_bottom_show">
			<a finishSelect href="javascript:;" areaID=${obj.areaid}
			class="am-list-item-hd sy_wo_li_a">${obj.area}</a> <span
			class="heart_span"><img class="size_heart"
				src="assets/image/go.png" alt="" /></span>
		</li>
	</c:forEach>
</ul>
<script type="text/javascript" src="js/address_area.js"></script>

