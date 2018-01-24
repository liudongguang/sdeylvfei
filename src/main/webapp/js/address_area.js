jQuery(document).ready(function() {
	$("a[ajaxthispage]").click(function() {
		var href = $(this).attr("href");
		jumpPage(href, $("#neirong"));
		return false;
	});
	$("a[finishSelect]").click(function() {
		var csprovinceIDVal = $("#csprovinceID").val();
		var csprovinceNameVal = $("#csprovinceName").val();
		var cscityIDVal = $("#cscityID").val();
		var cscityNameVal = $("#cscityName").val();
		var csAreaIDVal=$(this).attr("areaID");
		var csAreaNameVal=$(this).text();
		var hanziAddress=csprovinceNameVal+" "+cscityNameVal+" "+csAreaNameVal;
		$("#doc-ipt-txt-4").val(hanziAddress);
		$("#doc-ipt-txt-5").val(hanziAddress);
		$("#homeaddressDisplayID").val(hanziAddress);
		$("#homeaddressDisplayID-error").remove();
		//
		$("#homeaddressShengID").val(csprovinceIDVal);
		$("#homeaddressShiID").val(cscityIDVal);
		$("#homeaddressQuID").val(csAreaIDVal);
		layer.closeAll('page');
		return false;
	});
});