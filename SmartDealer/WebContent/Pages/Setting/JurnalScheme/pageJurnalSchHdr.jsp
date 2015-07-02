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
	function edit(){
		document.getElementById("mode").value="edit";
	}
	function hapus(){
		document.getElementById("mode").value="hapus";
	}
	function add(){
		document.getElementById("mode").value="add";
	}
	function detail(){
		document.getElementById("mode").value="detail";
	}
</script>
<body>
	<s:form action="jurnalScheme.action" theme="simple">
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
							<option value="coaSchmCode">COA Scheme Code</option>
							<option value="coaSchmDesc">COA Scheme Description</option>
							<option value="isActive">Active</option>
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
						<button type="submit" onclick="cari()">Search</button>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<br>
						<table border="1">
							<tr>
								<th>COA Scheme Code</th>
								<th>COA Scheme<br>Description</th>
								<th>Active</th>
								<th><button type="submit" onclick="detail()">Detail</button></th>
								<th><button type="submit" onclick="edit()">Edit</button></th>
								<th><button type="submit" onclick="hapus()">Delete</button></th>
							</tr>
						<s:iterator value="">
							<tr id="row_<s:property value="id"/>">
								<td>
									<s:property value="coaSchmCode"/>
								</td>
								<td>
									<s:property value="coaSchmDesc"/>
								</td>
								<td>
									<s:property value="isActive"/>
								</td>
								<td>
									<input type="radio" id="<s:property value="id"/>" checked/>
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