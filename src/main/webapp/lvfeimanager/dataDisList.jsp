<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="/WEB-INF/tld/c.tld" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="page" uri="/WEB-INF/tld/pagerForBootStrap.tld" %>
<div class="containtH800" style="margin-top: 50px">
    <form id="subForm" class="form-inline" role="form"
          action="lvfeimanager/search">
        <div class="form-group">
            <label class="control-label" for="username">时间：</label> <input
                type="text" name="start" class="form-control" id="startT"
                value="${param.start}" placeholder="开始时间">
            <input
                    type="text" name="end" class="form-control" id="endT"
                    value="${param.end}" placeholder="结束时间">
        </div>
        <div class="form-group">
            <label class="control-label" for="username">姓名：</label> <input
                type="text" name="username" class="form-control" id="username"
                value="${param.username }" placeholder="搜索姓名">
        </div>
        <div class="form-group">
            <label class="control-label" for="phone">手机号：</label> <input
                type="text" value="${param.phone}" name="phone" class="form-control"
                id="phone" placeholder="手机号">
        </div>
        <div class="form-group" style="margin-top: 10px;margin-bottom: 10px;float: right;margin-right: 30px">
            <button id="submitBTID" type="button" class="btn btn-default">搜索</button>
            <button id="exportBTID" type="button" class="btn btn-default">导出</button>
        </div>
    </form>

    <table class="table  table-bordered">
        <thead>
        <tr>
            <th>姓名</th>
            <th>手机号</th>
            <th>居住地</th>
            <th>身份证号</th>
            <th>创建时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${page.list}" var="l">
            <tr>
                <td>${l.username}</td>
                <td>${l.phone}</td>
                <td>${l.homeaddressDisplay}</td>
                <td>${l.idcardnum}</td>
                <td><fmt:formatDate value="${l.createtime}"
                                    pattern=" yyyy-MM-dd HH:mm:ss"/>
                <td><a class="aa" title="查看详情"
                       href="lvfeimanager/getXQByID?id=${l.uid}"><span>详情</span></a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div id="pageDIV" class="text-center">
        <c:if test="${page!=null}">
            <page:createPager pages="${page.pages}" pageSize="${page.pageSize}"
                              url="/lvfeimanager/search" total="${page.total}"
                              pageNum="${page.pageNum}"></page:createPager>
        </c:if>
    </div>
    <!-- 设置显示列表的样式与添加事件 -->
    <script type="text/javascript"
            src="assets/js/houtaimanager/tableset.js"></script>
    <script type="text/javascript" src="assets/js/ajaxForm.js"></script>
    <script type="text/javascript" src="js/lvfeimanager/dataDisList.js"></script>
</div>