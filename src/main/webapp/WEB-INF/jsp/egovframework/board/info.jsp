<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<link rel="stylesheet" href="${cp }/css/common/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/common/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="/css/grid/ui.jqgrid.css">
 
<script type="text/javascript" src="/js/common/jquery.js"></script>
<script type="text/javascript" src="/js/grid/i18n/grid.locale-kr.js"></script>
<script type="text/javascript" src="/js/grid/jquery.jqGrid.min.js"></script>

<script type="text/javascript">
/*         var authorCode = new Array();
        authorCode = ${authorCode};
        alert(authorCode); */
	$(function(){
        	
        var i, max, jsonMap, grid = $("#infoListGrid"); 
        
    		/* alert(${author_code}); */
    		
            grid.jqGrid({
                // ajax 요청주소
                /* url:"/goe/selectpaginginfo", */
                /* data : authorCode, */
                // 요청방식
                /* mtype:"POST", */
                // 결과물 받을 데이터 타입
                datatype:"local",
                /* loadError:function(){alert(${author_code});}, */
                // 그리드 캡션
                /* caption:"InfoList", */
                // 그리드 높이
                height:"auto",
                // 그리드(페이지)마다 보여줄 행의 수 -> 매개변수이름은 "rows"로 요청된다
                /* rowNum:10, */
                // rowNum변경 옵션
                /* rowList:[10,15,20], */
                // 컬럼명
                colNames:['권한 ID', "권한 명", "설명", "권한 생성일자"],
                // 컬럼 데이터(추가, 삭제, 수정이 가능하게 하려면 autoincrement컬럼을 제외한 모든 컬럼을 editable:true로 지정)
                // edittyped은 text, password, ... input type명을 사용
                colModel:[
                          {name:'authorCode', index:'authorCode', align:"center"/* , editable:true, edittype:"text" */}
                          , {name:"authorNm", index:"authorNm", align:"center", editable:true, edittype:"text"},
                          {name:"authorDc", index:"authorDc", align:"center", editable:true, edittype:"text"},
                          {name:"authorCreatDe", index:"authorCreatDe", align:"center", editable:true, edittype:"text"}
                         ],
                // 네비게이션 도구를 보여줄 div요소
                /* pager:"#pager", */
                /* autowidth:true, */
                multiselect: true,
                // 전체 레코드수, 현재레코드 등을 보여줄지 유무
                /* viewrecords:true, */
                // 추가, 수정, 삭제 url
                /* editurl: "/UserEditAction" */
           });
            
            //배열 데이터 생성
            jsonMap = [
            	/* {authorCode:"1"},
            	{authorCode:"2"} */
            	<c:forEach items="${infoList }" var="info" varStatus="loop">
            		{authorCode:"${info.authorCode }", authorNm:"${info.authorNm }", authorDc:"${info.authorDc }", authorCreatDe:"${info.authorCreatDe }"},
            	</c:forEach>
            ];
	       //데이터 추가
	       for(i=0, max = jsonMap.length ; i<=max ; i++){
	       	 grid.jqGrid('addRowData', i+1, jsonMap[i]);
	       }
      });
 
</script>

<body>
	<div>
		<h2>권한 관리</h2>
		<h3>총 <a style="color: orange;">${cnt }</a> 건</h3>
	    <div>
	    	<table id="infoListGrid"></table>
    		<!-- <div id="pager"></div> -->
	    </div>
	    <form>
    		<div style="margin-left: 22%; margin-top: 5px;">
	    		<ul class="pagination">
					<c:forEach begin="1" end="${pagination }" var="i">
						<c:choose>
							<c:when test="${pageVO.page == i}">
								<li class="paginate_button page-item active">
									<span class="page-link">${i }</span>
								</li>
							</c:when>
							<c:otherwise>
								<li class="paginate_button page-item">
								<a href="${cp }/goe/selectPagingInfo?page=${i}&colNo=${i}" aria-controls="dataTable" class="page-link">${i }</a>
								</li>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</ul>
				<div style="margin-left: 200px; margin-top: 5px;">
					<input class="btn btn-primary" type="button" onclick="location.href='${cp }/goe/insertInfo'" value="등록">
					    	
					<input class="btn btn-danger" type="button" onclick="location.href='${cp }/goe/deleteInfo'" value="삭제">
	    		</div>
			</div>
	    </form>
	</div>
    
</body>