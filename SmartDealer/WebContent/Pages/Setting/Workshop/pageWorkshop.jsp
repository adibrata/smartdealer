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
	function search(){
		document.getElementById("mode").value="search";
	}
	function edit(){
		document.getElementById("mode").value="edit";
	}
	function del(){
		document.getElementById("mode").value="del";
	}
	function add(){
		document.getElementById("mode").value="add";
	}
	function detail(){
		document.getElementById("mode").value="detail";
	}
</script>
<body>
	<s:form action="workshop.action" theme="simple">
		<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
		<center>
			<table>
				<tr>
					<td>
						Search By
					</td>
					<td>
						<select>
							<option value="">Parameter</option>
							<option value="workshopCode">Code</option>
							<option value="address">Address</option>
							<option value="rt">RT</option>
							<option value="rw">RW</option>
							<option value="kelurahan">Kelurahan</option>
							<option value="kecamatan">Kecamatan</option>
							<option value="city">City</option>
							<option value="zipCode">Zip Code</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						Search Criteria
					</td>
					<td>
						<input name="criteria"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button type="submit" onclick="search()">Search</button>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<br>
						<table border="1">
							<tr>
								<th>Code</th>
								<th>Address</th>
								<th>RT</th>
								<th>RW</th>
								<th>Kelurahan</th>
								<th>Kecamatan</th>
								<th>City</th>
								<th>Zip Code</th>
								<th><button type="submit" onclick="edit()">Edit</button></th>
								<th><button type="submit" onclick="del()">del</button></th>
							</tr>
						<s:iterator value="">
							<tr id="row_<s:property value="id"/>">
								<td>
									<s:property value="workshopCode"/>
								</td>
								<td>
									<s:property value="address"/>
								</td>
								<td>
									<s:property value="rt"/>
								</td>
								<td>
									<s:property value="rw"/>
								</td>
								<td>
									<s:property value="kelurahan"/>
								</td>
								<td>
									<s:property value="kecamatan"/>
								</td>
									<td>
									<s:property value="city"/>
								</td>
								<td>
									<s:property value="zipCode"/>
								</td>
								<td>
									<input type="radio" id="<s:property value="id"/>" checked/>
								</td>
								<td>
									<input type="radio" id="<s:property value="id"/>" checked/>
								</td>
							</tr>
						</s:iterator>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button type="submit" onclick="add()">Add</button>
					</td>
				</tr>
			</table>
		</center>
	</s:form>
</body>
</html>