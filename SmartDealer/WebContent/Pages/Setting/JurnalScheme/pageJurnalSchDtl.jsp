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
	function saveDetail(){
		document.getElementById("mode").value="saveDetail";
	}
	function back(){
		document.getElementById("mode").value="back";
	}
</script>
<body>
	<s:form action="jurnalScheme.action" theme="simple">
		<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
		<center>
			<table>
				<tr>
					<td>
						COA Scheme Code
					</td>
					<td>
						<s:label name="coaSchmCode" />
					</td>
				</tr>
				<tr>
					<td>
						COA Scheme Description
					</td>
					<td>
						<s:label name="coacodeCode"/>
					</td>
				</tr>
				<tr>
					<td>
						Active
					</td>
					<td>					
						<s:label name="isActive"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<br>
						<table border="1">
							<tr>
								<th>COA Name</th>
								<th>COA Description</th>
								<th>COA Code</th>
								<th>System</th>
								<th>Active</th>
							</tr>
						<s:iterator value="">
							<tr id="row_<s:property value="id"/>">
								<td>
									<s:property value="coaName"/>
								</td>
								<td>
									<s:property value="coaDescription"/>
								</td>
								<td>
									<s:property value="coacode"/>
								</td>
								<td>
									<s:property value="isSystem"/>
								</td>
								<td>
									<s:property value="isActive"/>
								</td>
							</tr>
						</s:iterator>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button type="submit" onclick="saveDetail()">Save</button>
						<button type="submit" onclick="back()">Back</button>
					</td>
				</tr>
			</table>
		</center>
	</s:form>
</body>
</html>