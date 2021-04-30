<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<link rel="stylesheet" type="text/css" href="/css/common/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="/css/grid/ui.jqgrid.css">
 
<script type="text/javascript" src="/js/common/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/js/grid/grid.locale-kr.js"></script>
<script type="text/javascript" src="/js/grid/jquery.jqGrid.min.js"></script>

	// jqGrid 예제
	// jqGrid option, jqGrid colModel option 포함
<script type="text/javascript">
var searchResultColNames =  ['게시글관리번호', '번호', '제목', '작성자', '날짜', '조회수'];
var searchResultColModel =         
                [{name:'bbsMgtNo',       index:'bbsMgtNo',      align:'center', hidden:true},
                {name:'bbsNum',         index:'bbsNum',        align:'left',   width:'12%'},
                {name:'bbsTitle',       index:'bbsTitle',      align:'center', width:'50%'},
                {name:'bbsWriter',      index:'bbsWriter',     align:'center', width:'14%'},
                {name:'bbsDate',        index:'bbsDate',       align:'center', width:'12%'},
                {name:'bbsHit',         index:'bbsHit',        align:'center', width:'12%'}];
 
$(function() {
        $("#testGrid").jqGrid({
            height: 261,
            width: 1019,
            colNames: searchResultColNames,
            colModel: searchResultColModel,
            rowNum : 10,
            pager: "pager" 
        });
});

function searchData(mode) {
    var postData = objConvertJson($("#fieldSurvForm")); //form 데이터 json으로 변경
    $("#testGrid").jqGrid({
        url : "/board/searchData.do",
        datatype : "JSON",
        postData : postData,
        mtype : "POST",
        colNames: searchResultColNames,
        colModel: searchResultColModel,
        rowNum : 10,
        pager: "#pager",
        height: 260,
        width: 1020,    
        caption : "게시글 목록"
    });
}


</script>

<body>
	<div>
		<h2>권한정보</h2>
		<div>
			<ul>
				<c:forEach items="${infoList }" var="info" varStatus="loop">
		        	<li style="list-style: none;">
						<a>
				        	${info.author_code }
				        	${info.author_nm }
				        	${info.author_dc }
				        	${info.author_creat_de }
				        </a>
		            </li>
	            </c:forEach>
			</ul>
		</div>
	</div>
	
  	<div class="table">
        <table id="testGrid"></table>
        <div id="pager"></div>    
    </div>
	
	
</body>