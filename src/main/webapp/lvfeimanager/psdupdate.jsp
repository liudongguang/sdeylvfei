<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/tld/c.tld"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="page" uri="/WEB-INF/tld/pagerForBootStrap.tld"%>
<div class="containtH800" style="margin-top: 50px">
	<form id="subForm" class="form-inline" role="form"
		action="lvfeimanager/updatepsd">
		<div class="form-group">
			<label class="control-label" for="oldPSD">原密码：</label> <input
				required type="password" name="oldPSD" class="form-control"
				id="oldPSD" value="${param.oldPSD }" placeholder="原密码">
		</div>
		<div class="form-group">
			<label class="control-label" for="newPSD">新密码：</label> <input
				required type="password" value="${param.newPSD}" name="newPSD"
				class="form-control" id="newPSD" placeholder="新密码">
		</div>
		<button id="submitBTID" type="button" class="btn btn-default">修改</button>
	</form>
	<span style="color: red;"> ${msg.errorMsg } </span>
	<script type="text/javascript"
		src="assets/js/houtaimanager/tableset.js"></script>
	<script type="text/javascript" src="assets/js/ajaxForm.js"></script>
	<script type="text/javascript" src="js/lvfeimanager/psdupdate.js"></script>
</div>