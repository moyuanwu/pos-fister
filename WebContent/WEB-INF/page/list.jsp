<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-1.9.1.min.js"></script>
<!-- 页面加载事件   到页面就加载   要先在web.xml中配置过滤器  在spring_mvc.xml 中配置头文件    处理静态资源 -->
<script type="text/javascript">
	$(function(){
		//点击事件 
		$(".delectEmp").click(function(){
			//获取href 的属性值
			var hrefValue = $(this).attr("href");
			alert(hrefValue);
			//将hrefValue值赋值给form表单中的action属性
			$("form").attr("action",hrefValue);
			//手动提交表单
			$("form").submit();
			//取消默认的提交行为
			return false;
			
		})
	})


</script>
</head>
<body>
	<c:if test="${not empty requestScope.list}">
		<table border="1">
			<tr>
				<td>员工编号</td>
				<td>员工姓名 </td>
				<td>邮箱</td>
				<td>工资</td>
				<td>员工所在 部门</td>
				<td colspan="2">操作</td>
			</tr>
			<c:forEach items="${requestScope.list}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.last_name}</td>
				<td>${emp.email}</td>
				<td>${emp.salary}</td>
				<td>${emp.department.name}</td>
				<td>
					<a href="${pageContext.request.contextPath}/update/${emp.id}">编辑</a>
				</td>
				<td>
					<a class="deleteEmp" href="${pageContext.request.contextPath}/delete/${emp.id}">删除</a>
				</td>
			</tr>
			</c:forEach>
		</table>
	</c:if>
		<form action="" method="post">
			<input type="hidden" name="_method" value="DELETE">
		</form>
	 <a href="${pageContext.request.contextPath}/emp">添加员工 </a> 

</body>
</html>