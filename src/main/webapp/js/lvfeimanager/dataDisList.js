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
        
        $("#selectAllCK").click(function () {
            if($(this).is(':checked')){
                $("input[type=checkbox]").prop("checked",true)
            }else{
                $("input[type=checkbox]").prop("checked",false)
            }
        })
        $("#deleteBTID").click(function () {
            var delIDS="";
            $("input[type=checkbox][value]:checked").each(function () {
                delIDS+=$(this).val()+",";
            })
            if(delIDS.length==0){
                layer.alert("没有选中任何记录！",{ offset: '25%'});
                layer.close(index);
                return false;
            }
            delIDS=delIDS.substr(0,delIDS.length-1);

            layer.confirm('确定要删除吗？',{
                offset: '25%',
                yes:function (index) {
                    ajaxRun({
                        paramurl:"lvfeimanager/deleteRowsByIds",
                        paramdata:{delIDS:delIDS,formp:$("#subForm").serialize()},
                        callbackFun:function (data) {
                            $("#neirong").empty().html(data);
                           layer.close(index);
                        }
                    });

                }
            })

        })
    });
