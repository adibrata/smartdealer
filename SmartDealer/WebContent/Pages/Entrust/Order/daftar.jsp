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
	function cari(){
		document.getElementById("mode").value="cari";
	}
	function entry(){
		document.getElementById("mode").value="entry";
	}
</script>
<body>
	<s:form action="entrust_order.action" theme="simple">
		<center>
			<h1>Supplier Destination</h1>
			<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
			<table>
				<tr>
					<td>
						<select>
							<option value="">Search By</option>
						</select>
					</td>
					<td>
						<input name=""/>
						<button type="submit" onclick="cari()">Search</button>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<br>
						<table border="1">
							<tr>
								<th>Supplier Name</th>
								<th>Supplier Address</th>
								<th>Supplier City</th>
								<th>Supplier Type</th>
								<th><button type="submit" onclick="entry()">Entrust</button></th>
							</tr>
						<s:iterator>
							<tr>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td align="center">
									<input type="radio" checked/>
								</td>
							</tr>
						</s:iterator>
						</table>
					</td>
				</tr>
			</table>
		</center>
	</s:form>
</body>
</html>