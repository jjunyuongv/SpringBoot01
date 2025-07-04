<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Ex14 SimpleBBS</title>
		<!-- table 옵션 안주고 스타일로 줄것 -->
		<style type="text/css">
		table {  
			border-spacing: 0;
		}
		table td, table th{
			padding: 0;
		}
		</style>
	</head>
	<body>
		<form action="write" method="post">
		<table border="1">
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer" size="100" /></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" size="100" /></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" name="content" size="100" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="입력" />
				&nbsp;&nbsp; <a href="list">목록보기</a></td>
			</tr>
		</table>
		</form>
	</body>
</html>