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
	function simpan(){
		document.getElementById("mode").value="simpan";
	}
	function back(){
		document.getElementById("mode").value="back";
	}
</script>
<body>
	<s:form action="zipCode.action" theme="simple">
		<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
		<center>
			<table>
				<tr>
					<td>
						Kelurahan
					</td>
					<td>
						<input type="text" name="kelurahan"/>
					</td>
				</tr>
				<tr>
					<td>
						Kecamatan
					</td>
					<td>
						<input type="text" name="kecamatan"/>
					</td>
				</tr>
				<tr>
					<td>
						City
					</td>
					<td>
						<input type="text" name="city"/>
					</td>
				</tr>
				<tr>
					<td>
						Zip Code
					</td>
					<td>
						<input type="text" name="zipCode"/>
					</td>
				</tr>
				<tr>
					<td>
						Active
					</td>
					<td>
						<input type="text" name="isActive"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<br>
						<button type="submit" onclick="simpan()">Save</button>
						<button type="submit" onclick="back()">Back</button>
					</td>
				</tr>
			</table>
		</center>
	</s:form>
</body>
</html>