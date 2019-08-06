<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form>
		用户名:<form:input path="last_name"/></br>
		邮箱:<form:input path="email"/></br>
		工资:<form:input path="salary"/></br>
		部门:<form:select path="dept.id" items="${requestScope.depts }" itemValue="id" itemLabel="name"></form:select>
		<input type="submit">
	</form:form>
</body>
</html>