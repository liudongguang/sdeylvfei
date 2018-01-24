jQuery(document).ready(function() {
	var jq_idcardnum = $("#idcardnumID");
	jq_idcardnum.keyup(function() {
		var idcardVal = $(this).val();
		if (idcardVal.length == 18) {
			updateDate(idcardVal);
		}
	}).change(function() {
		var idcardVal = $(this).val();
		if (idcardVal.length == 18) {
			updateDate(idcardVal);
		}
	});
	$("#addressCheckID").click(function() {
		layerWindow("/sdey/getSheng", "选择地址", "360", "640");
		return false;
	});
	$("#submitForm").validate({
		rules : {
			idcardnum : {
				IDCardValidate : [ 15, 18 ]
			},
			phone : {
				ValidatePhone : true
			},
			xiyandaycount : {
				number : true
			},
			xiyanyearcount : {
				number : true
			},
			xiyanshi : {
				number : true
			},
			jieyanyears : {
				number : true
			},
			jiechuesyear : {
				number : true
			},
			zhiyeyears : {
				number : true
			},
			wryjuzhuyears : {
				number : true
			}
		},
		messages : {
			username : "请输入您的名字"
		},
		submitHandler : function(form) {
			 var ii = layer.load(0, {
				shade : [ 0.8, '#fff' ]
			// 0.1透明度的白色背景
			});
			form.submit();
		}
	});
});
function updateDate(idcardVal) {
	// 验证身份证
	var validateState = checkCard(idcardVal);
	if (validateState.length == 0) {
		var birthday = idcardVal.substring(6, 14);
		var year = birthday.substring(0, 4);
		var month = birthday.substring(4, 6);
		var day = birthday.substring(6, 8);
		var formatDate = year + "-" + month + "-" + day;
		$("#birthdayID").val(formatDate);
		// //算出年龄
		var nowDate = new Date();
		var age = nowDate.getFullYear() - year;
		$("#ageID").val(age);
		var jq_option = $("<option></option>");
		jq_option.val(year).text(year);
		$("#birthday_year").empty().append(jq_option);
		var jq_option2 = $("<option></option>");
		jq_option2.val(month).text(month);
		$("#birthday_monthID").empty().append(jq_option2);
		jq_option3 = $("<option></option>");
		jq_option3.val(day).text(day);
		$("#birthday_dayID").empty().append(jq_option3);
		$("#ageID-error").remove();
	} else {
		alert(validateState);
	}
}