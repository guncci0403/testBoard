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
</script>

<body>
	<div>
		<h2>권한 등록</h2>
   		 <form>
			<div>
				<div class="form-control" style="height: auto;">
					<div class="form-group">
						<div class="form-row col-3">
							<label>권한 코드</label>
						</div>
						<div class="form-row col-6">
							<input type="text" class="form-control col-4" id="user_id" name="user_id" value="${user.user_id }" readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label>권한 명</label> <input type="text" class="form-control col-4" name="email">
					</div>
					<div class="form-group">
						<label>설명</label> <input type="text" class="form-control col-4" name="email">
					</div>
					<div class="form-group">
						<label>등록일자</label> <input type="text" class="form-control col-4" name="email">
					</div>
				</div>
				
				<div>
				<div class="form-row col-10" id="borderdiv">
					<div class="form-group col-11">
						<div class="form-row col-12" style="border-bottom: 1px solid lightgray;">
							<span class="form-control col-2" style="border: none; text-align: center; padding-top: 8px; color: #999999; font-size: 16px; background: lavender;">회사명</span> <input type="text" class="form-control col-8" style="margin-left: 10px; border: none; text-align: left; font-size: 16px;" value="">
						</div>
						<div class="form-row col-12" style="border-bottom: 1px solid lightgray;">
							<span class="form-control col-2" style="border: none; text-align: center; padding-top: 8px; color: #999999; font-size: 16px; background: lavender;">근무부서</span> <input type="text" class="form-control col-8" style="margin-left: 10px; border: none; text-align: left; font-size: 16px;" value="">
						</div>
						<div class="form-row col-12" style="border-bottom: 1px solid lightgray;">
							<span class="form-control col-2" style="border: none; text-align: center; padding-top: 8px; color: #999999; font-size: 16px; background: lavender;">직위</span> <input type="text" class="form-control col-8" style="margin-left: 10px; border: none; text-align: left; font-size: 16px;" value="">
						</div>
						<div class="form-row col-12" style="border-bottom: 1px solid lightgray;">
							<span class="form-control col-2" style="border: none; text-align: center; padding-top: 8px; color: #999999; font-size: 16px; background: lavender;">근무기간</span> <input type="text" class="form-control col-8" style="margin-left: 10px; border: none; text-align: left; font-size: 16px;" value="">
						</div>
						<div class="form-row col-12" style="border-bottom: 1px solid lightgray;">
							<span class="form-control col-2" style="border: none; text-align: center; padding-top: 8px; color: #999999; font-size: 16px;">설명</span>
							<span class="form-control col-9" style="margin-left: 10px; border: none; text-align: left; font-size: 16px; display: table;">${career.c_cont }</span>
							<%-- <input readonly="readonly" type="text" class="form-control col-9" style="margin-left: 10px; border: none; text-align: left; font-size: 16px;" value="${career.c_cont }"> --%>
						</div>
					</div>
				</div>
				
				<div style="margin-left: 200px; margin-top: 5px;">
					<button class="btn btn-primary" type="button">등록</button>    	
	    		</div>
			</div>
	    </form>
	</div>
    
</body>