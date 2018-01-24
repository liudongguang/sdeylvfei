<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/tld/c.tld"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE>
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
<link rel="stylesheet" href="assets/css/amazeui.min.css">
<link rel="stylesheet" href="assets/css/app.css">
<link rel="stylesheet" href="assets/css/style.css">
<link rel="stylesheet" href="assets/css/validation.css">
</head>
<body>
	<input type="hidden" id="basePath"
		value="${pageContext.request.contextPath }/" />

	<span class="span_lit_tit">基本信息</span>
	<div class="am-form-group am-u-sm-12">
		<label for="doc-ipt-txt-1">姓名:</label> ${info.username } <label
			for="doc-select-1">性别:</label>
		<c:if test="${info.sex==1}">男</c:if>
		<c:if test="${info.sex==2}">女</c:if>
		<label for="doc-ipt-txt-2" style="color: green;">年龄:</label>
		${info.age}
	</div>

	<div class="am-form-group am-u-sm-12">
		<label>出生日期:</label>
		<fmt:formatDate value="${info.birthday}" pattern=" yyyy-MM-dd" />
	</div>

	<div class="am-form-group am-u-sm-12">
		<label for="doc-ipt-txt-3">身份证号码:</label> ${info.idcardnum}
	</div>

	<div class="am-form-group am-u-sm-12">
		<label for="homeaddressDisplayID">家庭住址:</label>
		${info.homeaddressXiangxi}
	</div>


	<div class="am-form-group am-u-sm-12">
		<label for="doc-ipt-txt-6">电话:</label> ${info.phone }
	</div>

	<span class="span_lit_tit">一、吸烟史</span>

	<div class="am-form-group am-u-sm-12">
		<label>1.吸烟</label><br /> <label class="am-checkbox-inline">
			<c:if test="${info.xiyanstate==1}">是</c:if> <c:if
				test="${info.xiyanstate==2}">否</c:if> <label class="label_margin">每天吸烟支数:${info.xiyandaycount }，吸烟年数:${info.xiyanyearcount }，吸烟史-包/年（每天吸烟支数/20*吸烟年数）:${info.xiyanshi }</label><br />
		</label><br/> <label>2.是否已戒烟</label><br /> <label class="am-checkbox-inline">
			<c:if test="${info.jieyanstate==1}">是</c:if> <c:if
				test="${info.jieyanstate==2}">否</c:if> <label class="label_margin">已戒烟:${info.jieyanyears }
				年 </label><br />
		</label><br /> <label>3.接触二手烟</label><br /> <label
			class="am-checkbox-inline"> <c:if test="${info.ershouyan==1}">是</c:if>
			<c:if test="${info.ershouyan==2}">否</c:if> <label
			class="label_margin">接触:${info.jiechuesyear}年，接触环境: <c:if
					test="${info.jiechuhuanjing==1}">家</c:if> <c:if
					test="${info.jiechuhuanjing==2}">公司</c:if> <c:if
					test="${info.jiechuhuanjing==3}">公共场所</c:if>
		</label><br />
		</label>
	</div>

	<span class="span_lit_tit">二、职业、生活史</span>

	<div class="am-form-group am-u-sm-12">
		<label>1.曾长期从事接触粉尘、石棉、化工等职业</label><br /> <label
			class="am-checkbox-inline"> <c:if
				test="${info.zhiyestate==1}">是</c:if> <c:if
				test="${info.zhiyestate==2}">否</c:if> <label class="label_margin2">曾经职业:${info.zhiyems}，任职:${info.zhiyeyears }年
		</label><br />
		</label> <label>2.近10年居住环境周围500米是否有污染源（冶炼、化工、焦化等）</label><br /> <label
			class="am-checkbox-inline"> <c:if test="${info.wrystate==1}">是</c:if>
			<c:if test="${info.wrystate==2}">否</c:if> <label class="label_margin">周围污染源为:
				<c:if test="${info.wryxiangxi==1}">冶炼</c:if> <c:if
					test="${info.wryxiangxi==2}">化工</c:if> <c:if
					test="${info.wryxiangxi==3}">焦化</c:if> <c:if
					test="${info.wryxiangxi==4}">其他</c:if> <br />居住:${info.wryjuzhuyears }年
		</label><br />
		</label><br /> <label>3.长期在厨房做饭</label><br /> <label
			class="am-checkbox-inline"> <c:if
				test="${info.chufangsate==1}">是</c:if> <c:if
				test="${info.chufangsate==2}">否</c:if><label class="label_margin"><br />厨房油烟情况:
				<c:if test="${info.cfyyqk==1}">很多</c:if> <c:if
					test="${info.cfyyqk==2}">多</c:if> <c:if test="${info.cfyyqk==3}">一般</c:if>
				<c:if test="${info.cfyyqk==4}">无</c:if> </label><br />
		</label>
	</div>

	<span class="span_lit_tit">三、既往病史</span>

	<div class="am-form-group am-u-sm-12">
		<label>1.慢性肺部疾病病史</label><br /> <label class="am-checkbox-inline">
			<c:if test="${info.bingshistate==1}">是</c:if> <c:if
				test="${info.bingshistate==2}">否</c:if> <label class="label_margin">具体疾病:
				<c:if test="${info.bingshijb==1}">哮喘</c:if> <c:if
					test="${info.bingshijb==2}">慢性支气管炎</c:if> <c:if
					test="${info.bingshijb==3}">肺气肿</c:if> <c:if
					test="${info.bingshijb==4}">矽肺</c:if> <c:if
					test="${info.bingshijb==5}">肺结核</c:if> <c:if
					test="${info.bingshijb==6}">肺纤维化</c:if> <c:if
					test="${info.bingshijb==7}">支气管扩张</c:if> ，其他：${info.bingshijbqt }
		</label><br />
		</label><br /> <label>2.曾被诊断过癌症</label><br /> <label
			class="am-checkbox-inline"> <c:if test="${info.aizheng==1}">是</c:if>
			<c:if test="${info.aizheng==2}">否</c:if> 具体情况 :${info.azjuti }<br />
		</label>
	</div>

	<span class="span_lit_tit">四、家族史</span>

	<div class="am-form-group am-u-sm-12">
		<label>1.直系亲属（父母、子女、兄弟姐妹）是否有癌症病史</label><br /> <label
			class="am-checkbox-inline"> <c:if test="${info.jiazushi==1}">是</c:if>
			<c:if test="${info.jiazushi==2}">否</c:if> 具体情况 :${info.jzsjuti}<br />
		</label>
	</div>
</body>
</html>