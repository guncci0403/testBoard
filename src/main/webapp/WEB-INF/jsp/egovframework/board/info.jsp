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

    <script type="text/javascript">
        var authorCode = new Array();
        authorCode = ${authorCode};
        alert(authorCode);
    	$(document).ready(function(){
    		/* alert(${author_code}); */
    		
            $("#info_list").jqGrid({
                // ajax 요청주소
                url:"/goe/selectpaginginfo",
                data : authorCode,
                // 요청방식
                mtype:"get",
                // 결과물 받을 데이터 타입
                datatype:"local",
                /* loadError:function(){alert(${author_code});}, */
                // 그리드 캡션
                caption:"Info List",
                // 그리드 높이
                height:"auto",
                // 그리드(페이지)마다 보여줄 행의 수 -> 매개변수이름은 "rows"로 요청된다
                rowNum:10,
                // rowNum변경 옵션
                rowList:[10,15,20],
                // 컬럼명
                colNames:["author_code"/* , "author_nm", "author_dc", "author_creat_de" */],
                // 컬럼 데이터(추가, 삭제, 수정이 가능하게 하려면 autoincrement컬럼을 제외한 모든 컬럼을 editable:true로 지정)
                // edittyped은 text, password, ... input type명을 사용
                colModel:[
                          {name:"authorCode", index:"authorCode", align:"center", editable:true, edittype:"text"}
                          /*, {name:"author_nm", index:"author_nm", align:"center", editable:true, edittype:"text"},
                          {name:"author_dc", index:"author_dc", align:"center", editable:true, edittype:"text"},
                          {name:"author_creat_de", index:"author_creat_de", align:"center", editable:true, edittype:"text"} */
                          ],
                // 네비게이션 도구를 보여줄 div요소
                pager:"#pager",
                autowidth:true,
                // 전체 레코드수, 현재레코드 등을 보여줄지 유무
                viewrecords:true,
                // 추가, 수정, 삭제 url
                /* editurl: "/UserEditAction" */
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

<body>
	<div>
		<h2>권한정보</h2>
		<form action="${cp }/goe/selectpaginginfo" method="post">
		<button type="submit" id="postBtn">post</button>
			<div>
				<ul>
					<c:forEach items="${infoList }" var="info" varStatus="loop">
			        	<li style="list-style: none;">
							<a>
					        	${info.authorCode }
					        	<input type="hidden" name="code" value="${info.authorCode }"/>
					        </a>
			            </li>
		            </c:forEach>
					<c:forEach items="${infoList }" var="info" varStatus="loop">
			        	<li style="list-style: none;">
							<a>
					        	${info.author_nm }
					        </a>
			            </li>
		            </c:forEach>
					<c:forEach items="${infoList }" var="info" varStatus="loop">
			        	<li style="list-style: none;">
							<a>
					        	${info.author_dc }
					        </a>
			            </li>
		            </c:forEach>
					<c:forEach items="${infoList }" var="info" varStatus="loop">
			        	<li style="list-style: none;">
							<a>
					        	${info.author_creat_de }
					        </a>
			            </li>
		            </c:forEach>
				</ul>
			</div>
		</form>
	    <table id="info_list"></table>
    	<div id="pager"></div>
	</div>
    
    <!-- <div class="row">
      <div>
         <select id="selectId">
            <option value="">전체</option>
            <option value="A">A</option>
            <option value="B">B</option>
            <option value="C">C</option>
            <option value="D">D</option>
         </select>
            <span><a href="#" onclick="javascript:goSearch();">조회</a></span>
       </div>
       <div>
         <table id="jqGrid"></table>
         <div id="jqGridPager"></div>
       </div>
      </div>
 -->
</body>


    
 <script type="text/javascript">
// $(document).ready(function() {
 
//    var cnames = ['권한코드','권한명','권한설명','권한생성일'];
 
//        $("#jqGrid").jqGrid({
       
//            url: "/selectpaginginfo",
//            datatype: "local",
//            colNames: cnames,
//            colModel:[
//          {name:'AUTHOR_CODE',index:'AUTHOR_CODE', width:55, key:true, align:"center"},
//          {name:'AUTHOR_NM',index:'AUTHOR_NM', width:100, align:"center"},
//          {name:'AUTHOR_DC',index:'AUTHOR_DC', width:100},
//          {name:'AUTHOR_CREAT_DE',index:'AUTHOR_CREAT_DE', width:100}
         
//    ],
//            height: 480,
//            rowNum: 10,
//            rowList: [10,20,30],
//            pager: '#jqGridPager',
//            rownumbers  : true,                     
//            ondblClickRow : function(rowId, iRow, iCol, e) {
 
//    if(iCol == 1) {
 
//              alert(rowId+" 째줄 입니다.");
//              }
//            },
       
//            viewrecords : true,
//            caption:"실습용 테이블"
//        });
//    });


   
// 	function goSearch() {
// 	   var jsonObj = {};
	   
// 	   if($("#selectId").val() != "C") {
// 	      jsonObj.serviceImplYn = $("#selectId").val();
// 	   }
// 	   alert(JSON.stringify(jsonObj));
	   
// 	   $("#jqGrid").setGridParam({   //파라미터를 받아 .do로 간다.
// 	        datatype : "json",      //이벤트가 일어나면 컨트롤러단으로 간다. 
// 	        postData : {"param" : JSON.stringify(jsonObj)},   // 키와 밸류를 들고 간다.
// 	        loadComplete: function(data){
// 	              $.each(data, function (i, item) {
// 	                  if(i == "rows") {
// 	                      if(item < 1) {
// 	                          alert("데이터가 없습니다.");
// 	                      }
// 	                  }
// 	              });
	          
// 	        },
// 	        gridComplete : function(){
	           
// 	        }
// 	     }).trigger("reloadGrid");
// 	}
</script>
    
    
