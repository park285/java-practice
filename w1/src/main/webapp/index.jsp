<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%-- <%= %> 는 jsp 주석--%>
<%--jsp주석은 브라우저에서 확인이 불가능--%>
<%-- html주석은 브라우저에서 확인이 가능--%>
<%--mvc란 무엇인가에 대해 알아두기 --%>
<%--(model view Controller--%>
<%--controller(java파일)=>요청을 처리 --%>
<%--model(java파일)=>db의 데이터취득 조회 추가 수정 삭제--%>
<%--view(jsp파일)=>화면을 출력하는 html파일과 유사 --%>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>