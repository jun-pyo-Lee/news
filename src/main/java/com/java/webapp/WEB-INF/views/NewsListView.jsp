<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뉴스 내용</title>
</head>
<body>

<table>
      <tr>
        <th>No</th>
        <th>Title</th>
        <th>Contents</th>
        <th>File</th>
      </tr>
      <c:forEach items="&{list}" var="dto">
        <tr>
          <td>${dto.newsNo}</td>
          <td>${dto.newsTitle}</td>
          <td>${dto.newsContents}</td>
          <td>${dto.newsFile}</td>
        </tr>
      </c:forEach>
</table>

</body>
</html>