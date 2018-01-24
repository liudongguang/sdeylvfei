<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<span class="span_tit"><span style="font-size: 20px">山东大学第二医院</span>
		<br /> <span style="font-size: 16px">肺部疾病基本信息调查表</span></span>
	<span class="am-u-sm-12" style="font-size: 14px;"> <br /> 温馨提示：<br />
		1.本次活动参与对象为早期肺癌高危人群。<br /> 2.申请者填写信息应确保真实、准确，否则将无法参与本活动。<br />
		3.筛选通过，需申请者持本人身份证现场核对。<br />
		4.绿色标题部分根据身份证号生成，无需填写！
	</span>
	<p class="am-u-sm-12" style="font-size: 14px; text-indent: 2em;">我们将对您的个人隐私严格保密，最终解释请联系山东大学第二医院胸外科（电话：0531-85875552）</p>
	<form class="am-form" action="sdey/saveLFInfo" method="post"
		id="submitForm">
		<span class="span_lit_tit">基本信息</span>
		<div class="am-form-group am-u-sm-12">
			<label for="doc-ipt-txt-1">姓名:</label> <input type="text"
				maxlength="6" required name="username"
				style="width: 23%; text-align: center;" id="doc-ipt-txt-1"
				placeholder=""> <label for="doc-select-1">性别:</label> <select
				name="sex" id="doc-select-1" style="width: 14%" required>
				<option value=""></option>
				<option value="1">男</option>
				<option value="2">女</option>
			</select> <label for="doc-ipt-txt-2" style="color: green;">年龄:</label> <input
				required type="text" id="ageID" name="age" readonly="readonly"
				style="width: 19%; text-align: center;" class="" id="doc-ipt-txt-2"
				placeholder="">
		</div>

		<div class="am-form-group am-u-sm-12">
			<input type="hidden" readonly="readonly" name="birthday"
				id="birthdayID" value="" /> <label style="color: green;">出生日期:</label>
			<select id="birthday_year" style="width: 23%">
			</select> <label for="doc-select-2">年</label> <select id="birthday_monthID"
				style="width: 14%">
			</select> <label for="doc-select-3">月</label> <select id="birthday_dayID"
				style="width: 14%">
			</select> <label for="doc-select-4">日</label>
		</div>

		<div class="am-form-group am-u-sm-12">
			<label for="doc-ipt-txt-3">身份证号码:</label> <input type="text" required
				name="idcardnum" id="idcardnumID" maxlength="18" class="am-fr"
				style="width: 70%; text-align: center;" id="doc-ipt-txt-3">
		</div>

		<div class="am-form-group am-u-sm-12">
			<label for="homeaddressDisplayID">家庭住址:</label> <a
				id="addressCheckID" href="javascript:;"> <input type="text"
				class="am-fr" required name="homeaddressDisplay"
				id="homeaddressDisplayID" readonly="readonly"
				style="width: 75%; text-align: right;" placeholder="请选择>"></a> <input
				type="hidden" name="homeaddressSheng" id="homeaddressShengID" /> <input
				type="hidden" name="homeaddressShi" id="homeaddressShiID" /> <input
				type="hidden" name="homeaddressQu" id="homeaddressQuID" />
		</div>

		<div class="am-form-group am-u-sm-12">
			<!--<label for="doc-ipt-txt-5">详细地址:</label>-->
			<input type="text" style="width: 100%; text-align: left;"
				name="homeaddressXiangxi" id="doc-ipt-txt-5" placeholder="详细地址">
		</div>

		<div class="am-form-group am-u-sm-12">
			<label for="doc-ipt-txt-6">电话:</label> <input type="text" required
				name="phone" maxlength="11" class="am-fr"
				style="width: 85%; text-align: left;" id="doc-ipt-txt-6"
				placeholder="本人联系方式，方便联系">
		</div>

		<span class="span_lit_tit">一、吸烟史</span>

		<div class="am-form-group am-u-sm-12">
			<label>1.吸烟</label><br /> <label class="am-checkbox-inline">
				<input type="radio" name="xiyanstate" value="1" required> 是
				<label class="label_margin">每天吸烟支数<input type="text"
					name="xiyandaycount" style="width: 15%;">，吸烟年数<input
					type="text" name="xiyanyearcount" style="width: 15%;">，吸烟史-包/年（每天吸烟支数/20*吸烟年数）<input
					name="xiyanshi" type="text" style="width: 15%;"></label><br /> <input
				type="radio" name="xiyanstate" value="2"> 否
			</label> <label>2.是否已戒烟</label><br /> <label class="am-checkbox-inline">
				<input type="radio" value="1" name="jieyanstate" required> 是
				<label class="label_margin">已戒烟<input type="text"
					name="jieyanyears" style="width: 15%;">年
			</label><br /> <input type="radio" value="2" name="jieyanstate"> 否
			</label><br /> <label>3.接触二手烟</label><br /> <label
				class="am-checkbox-inline"> <input type="radio" value="1"
				name="ershouyan" required> 是 <label class="label_margin">接触<input
					type="text" name="jiechuesyear" style="width: 15%;">年，接触环境:
					<select style="width: 30%" name="jiechuhuanjing">
						<option value="">请选择</option>
						<option value="1">家</option>
						<option value="2">公司</option>
						<option value="3">公共场所</option>
				</select>
			</label><br /> <input type="radio" value="2" name="ershouyan"> 否
			</label>
		</div>

		<span class="span_lit_tit">二、职业、生活史</span>

		<div class="am-form-group am-u-sm-12">
			<label>1.曾长期从事接触粉尘、石棉、化工等职业</label><br /> <label
				class="am-checkbox-inline"> <input type="radio" value="1"
				required name="zhiyestate"> 是 <label class="label_margin2">曾经职业<input
					name="zhiyems" type="text" style="width: 15%;">，任职<input
					type="text" name="zhiyeyears" style="width: 15%;">年
			</label><br /> <input type="radio" name="zhiyestate" value="2"> 否
			</label>
			 <label>2.近10年居住环境周围500米是否有污染源（冶炼、化工、焦化等）</label><br /> <label
				class="am-checkbox-inline"> <input type="radio" value="1"
				required name="wrystate"> 有  <br/>
				<label class="label_margin">周围污染源为:
					<select name="wryxiangxi" style="width: 30%;">
						<option value="">请选择</option>
						<option value="1">冶炼</option>
						<option value="2">化工</option>
						<option value="3">焦化</option>
						<option value="4">其他</option>
				</select> 居住<input type="text" name="wryjuzhuyears" style="width: 15%;">年
			</label> <input type="radio" value="2" name="wrystate"> 无
			</label> <label>3.长期在厨房做饭</label><br /> <label class="am-checkbox-inline">
				<input type="radio" value="1" required name="chufangsate">是
				<label class="label_margin" style="display: block;">厨房油烟情况: <select
					name="cfyyqk" style="width: 50%;">
						<option value=""></option>
						<option value="1">很多</option>
						<option value="2">多</option>
						<option value="3">一般</option>
						<option value="4">无</option>
				</select>
			</label> <input type="radio" value="2" name="chufangsate"> 否
			</label>
		</div>

		<span class="span_lit_tit">三、既往病史</span>

		<div class="am-form-group am-u-sm-12">
			<label>1.慢性肺部疾病病史</label><br /> <label class="am-checkbox-inline">
				<input type="radio" required name="bingshistate" value="1">
				有 <label class="label_margin">具体疾病: <select name="bingshijb"
					style="width: 30%;">
						<option value="">请选择</option>
						<option value="1">哮喘</option>
						<option value="2">慢性支气管炎</option>
						<option value="3">肺气肿</option>
						<option value="4">矽肺</option>
						<option value="5">肺结核</option>
						<option value="6">肺纤维化</option>
						<option value="7">支气管扩张</option>
				</select>，其他<input type="text" name="bingshijbqt" style="width: 30%;"></label><br />
				<input type="radio" name="bingshistate" value="2"> 无
			</label><br /> <label>2.曾被诊断过癌症</label><br /> <label
				class="am-checkbox-inline"> <input type="radio" value="1"
				required name="aizheng"> 有 具体情况 <textarea class="txtarea"
					rows="4" placeholder="最多50字" name="azjuti" maxlength="50"></textarea><br />
				<input type="radio" value="2" name="aizheng"> 无
			</label>
		</div>

		<span class="span_lit_tit">四、家族史</span>

		<div class="am-form-group am-u-sm-12">
			<label>1.直系亲属（父母、子女、兄弟姐妹）是否有癌症病史</label><br /> <label
				class="am-checkbox-inline"> <input type="radio" value="1"
				required name="jiazushi"> 有 具体情况 <textarea class="txtarea"
					rows="4" maxlength="50" name="jzsjuti" placeholder="最多50字"></textarea><br />
				<input type="radio" value="2" name="jiazushi"> 无
			</label>
		</div>

		<div class="am-form-group am-u-sm-12 am-margin-top-xl">
			<button type="submit" class="am-u-sm-12 am-btn btn_up">提交</button>
		</div>
	</form>
</body>
<script type="text/javascript"
	src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/additional-methods.js"></script>
<script type="text/javascript" src="js/messages_zh.js"></script>
<script type="text/javascript" src="assets/layer/layer.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/sfzValidate.js"></script>
<script type="text/javascript" src="js/lvfei.js"></script>
</html>