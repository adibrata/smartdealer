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
	<s:form action="dealer.action" theme="simple">
		<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
		<center>
			<table>
				<tr>
					<td>
						Name
					</td>
					<td>
						<s:textfield name="name"/>
					</td>
				</tr>
				<tr>
					<td>
						Address
					</td>
					<td>
						<s:textfield name="address"/>
					</td>
				</tr>
				<tr>
					<td>
						RT
					</td>
					<td>
						<s:textfield name="rt"/>
					</td>
				</tr>
				<tr>
					<td>
						RW
					</td>
					<td>
						<s:textfield name="rw"/>
					</td>
				</tr>
				<tr>
					<td>
						Kelurahan
					</td>
					<td>
						<s:textfield name="kelurahan"/>
					</td>
				</tr>
				<tr>
					<td>
						City
					</td>
					<td>
						<s:textfield name="city"/>
					</td>
				</tr>
				<tr>
					<td>
						Zip Code
					</td>
					<td>
						<s:textfield name="zipcode"/>
					</td>
				</tr>
				<tr>
					<td>
						Type
					</td>
					<td>
						<s:textfield name="type"/>
					</td>
				</tr>
				<tr>
					<td>
						Phone1 Area
					</td>
					<td>
						<s:textfield name="areaPhone1"/>
					</td>
				</tr>
				<tr>
					<td>
						Phone1 No.
					</td>
					<td>
						<s:textfield name="phoneNo1"/>
					</td>
				</tr>
				<tr>
					<td>
						Phone2 Area
					</td>
					<td>
						<s:textfield name="areaPhone2"/>
					</td>
				</tr>
				<tr>
					<td>
						Phone2 No.
					</td>
					<td>
						<s:textfield name="phoneNo2"/>
					</td>
				</tr>
				<tr>
					<td>
						Fax Area
					</td>
					<td>
						<s:textfield name="type"/>
					</td>
				</tr>
				<tr>
					<td>
						Fax No.
					</td>
					<td>
						<s:textfield name="faxNo"/>
					</td>
				</tr>
				<tr>
					<td>
						Handphone
					</td>
					<td>
						<s:textfield name="handphone"/>
					</td>
				</tr>
				<tr>
					<td>
						Full Address
					</td>
					<td>
						<s:textfield name="fullAddress"/>
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