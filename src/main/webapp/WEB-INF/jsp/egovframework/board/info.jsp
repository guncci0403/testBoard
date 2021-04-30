<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<link rel="stylesheet" type="text/css" href="/css/common/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="/css/grid/ui.jqgrid.css">
 
<script type="text/javascript" src="/js/common/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/js/grid/i18n/grid.locale-kr.js"></script>
<script type="text/javascript" src="/js/grid/jquery.jqGrid.min.js"></script>


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
	
    <table id="info_list"></table>
    <div id="pager"></div>
</body>


    <script type="text/javascript">
        $(document).ready(function(){
            $("#info_list").jqGrid({
                // ajax 요청주소
                url:"/selectpaginginfo",
                // 요청방식
                mtype:"post",
                // 결과물 받을 데이터 타입
                datatype:"json",
                // 그리드 캡션
                caption:"Info List",
                // 그리드 높이
                height:"auto",
                // 그리드(페이지)마다 보여줄 행의 수 -> 매개변수이름은 "rows"로 요청된다
                rowNum:10,
                // rowNum변경 옵션
                rowList:[10,15,20],
                // 컬럼명
                colNames:["AUTHOR_CODE", "AUTHOR_NM", "AUTHOR_DC", "AUTHOR_CREAT_DE"],
                // 컬럼 데이터(추가, 삭제, 수정이 가능하게 하려면 autoincrement컬럼을 제외한 모든 컬럼을 editable:true로 지정)
                // edittyped은 text, password, ... input type명을 사용
                colModel:[
                          {name:"AUTHOR_CODE", index:"AUTHOR_CODE", align:"center", editable:true, edittype:"text"},
                          {name:"AUTHOR_NM", index:"AUTHOR_NM", align:"center", editable:true, edittype:"text"},
                          {name:"AUTHOR_DC", index:"AUTHOR_DC", align:"center", editable:true, edittype:"text"},
                          {name:"AUTHOR_CREAT_DE", index:"AUTHOR_CREAT_DE", align:"center", editable:true, edittype:"text"}
                          ],
                // 네비게이션 도구를 보여줄 div요소
                pager:"#pager",
                autowidth:true,
                // 전체 레코드수, 현재레코드 등을 보여줄지 유무
                viewrecords:true,
                // 추가, 수정, 삭제 url
                editurl: "/UserEditAction"
            });
           
            // 네비게시션 도구 설정
            $("#info_list").jqGrid(
                    "navGrid",
                    "#pager",
                    {search:false, edit:true, add:true, del:true},
                    {closeAfterEdit: true, reloadAfterSubmit: true},
                    {closeAfterAdd: true, reloadAfterSubmit: true},
                    {reloadAfterSubmit: true}
            );
        });
 
    </script>
