<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function save(){
		document.getElementById("mode").value="save";
	}
	function back(){
		document.getElementById("mode").value="back";
	}
</script>
<body>
	<s:form action="assetmaster.action" theme="simple">
		<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
		<center>
			<table>
				<tr>
					<td>
						Type
					</td>
					<td>
						<input name="assetType"/>
					</td>
				</tr>
				<tr>
					<td>
						Brand
					</td>
					<td>
						<input name="assetBrand"/>
					</td>
				</tr>
				<tr>
					<td>
						Model
					</td>
					<td>
						<input name="assetModel"/>
					</td>
				</tr>
				<tr>
					<td>
						Code
					</td>
					<td>
						<input name="assetCode"/>
					</td>
				</tr>
				<tr>
					<td>
						Level
					</td>
					<td>
						<input name="assetLevel"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<br>
						<button type="submit" onclick="save()">Save</button>
						<button type="submit" onclick="back()">Back</button>
					</td>
				</tr>
			</table>
		</center>
	</s:form>
</body>
</html>