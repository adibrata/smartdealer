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
	<s:form action="dealer.action" theme="simple">
		<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
		<center>
			<table>
				<tr>
					<td>
						Name
					</td>
					<td>
						<input type="text" name="name"/>
					</td>
				</tr>
				<tr>
					<td>
						Address
					</td>
					<td>
						<input type="text" name="address"/>
					</td>
				</tr>
				<tr>
					<td>
						RT
					</td>
					<td>
						<input type="text" name="rt"/>
					</td>
				</tr>
				<tr>
					<td>
						RW
					</td>
					<td>
						<input type="text" name="rw"/>
					</td>
				</tr>
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
						<input type="text" name="zipcode"/>
					</td>
				</tr>
				<tr>
					<td>
						Type
					</td>
					<td>
						<input type="text" name="type"/>
					</td>
				</tr>
				<tr>
					<td>
						Phone1 Area
					</td>
					<td>
						<input type="text" name="areaPhone1"/>
					</td>
				</tr>
				<tr>
					<td>
						Phone1 No.
					</td>
					<td>
						<input type="text" name="phoneNo1"/>
					</td>
				</tr>
				<tr>
					<td>
						Phone2 Area
					</td>
					<td>
						<input type="text" name="areaPhone2"/>
					</td>
				</tr>
				<tr>
					<td>
						Phone2 No.
					</td>
					<td>
						<input type="text" name="phoneNo2"/>
					</td>
				</tr>
				<tr>
					<td>
						Fax Area
					</td>
					<td>
						<input type="text" name="type"/>
					</td>
				</tr>
				<tr>
					<td>
						Fax No.
					</td>
					<td>
						<input type="text" name="faxNo"/>
					</td>
				</tr>
				<tr>
					<td>
						Handphone
					</td>
					<td>
						<input type="text" name="handphone"/>
					</td>
				</tr>
				<tr>
					<td>
						Full Address
					</td>
					<td>
						<input type="text" name="fullAddress"/>
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