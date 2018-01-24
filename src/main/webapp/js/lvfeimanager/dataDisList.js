jQuery(document).ready(
    function () {
        initAjaxFormForSearch($("#subForm"), $("#neirong"),
            "lvfeimanager/search", $("#submitBTID"));
        var pages = $("#pageDIV").find("a[href!='javascript:;']");
        var formSerialize = $("#subForm").serialize();
        pages.each(function () {
            $(this)
                .attr("href",
                    $(this).attr("href") + "&" + formSerialize);
        });

        $("#exportBTID").click(function () {
            $("#subForm").attr("action", "lvfeimanager/export");
            $("#subForm").submit();
        })

        var datepickerOpt = {
            format: 'YYYY-MM-DD',
            showTodayButton: true
        }
        $('#startT').datetimepicker(datepickerOpt);
        $('#endT').datetimepicker(datepickerOpt);
    });
