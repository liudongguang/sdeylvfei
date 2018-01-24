jQuery(document).ready(function() {
	$("a[ajaxthispage]").click(function() {
		var href = $(this).attr("href");
		jumpPage(href, $("#neirong"));
		return false;
	})
});