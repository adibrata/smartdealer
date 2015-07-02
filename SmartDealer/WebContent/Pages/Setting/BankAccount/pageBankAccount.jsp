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
</script>
<body>
	<s:form action="bankAccount.action" theme="simple">
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
							<option value="officeId">Office ID</option>
							<option value="bankAccountCode">Bank Account Code</option>
							<option value="bankAccountName">Bank Account Name</option>
							<option value="endingBalance">Ending Balance</option>
							<option value="coacode">COA Code</option>
							<option value="seqNo">Seq No.</option>
							<option value="resetFlag">Reset Flag</option>
							<option value="formatSeqNo">Format Seq No.</option>
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
								<th>Office ID</th>
								<th>Bank Account<br>Code</th>
								<th>Bank Account<br>Name</th>
								<th>Ending<br>Balance</th>
								<th>COA<br>Code</th>
								<th>Seq No.</th>
								<th>Reset Flag</th>
								<th>Format<br>Seq No.</th>
								<th><button type="submit" onclick="edit()">Edit</button></th>
								<th><button type="submit" onclick="del()">del</button></th>
							</tr>
						<s:iterator value="">
							<tr id="row_<s:property value="id"/>">
								<td>
									<s:property value="officeId"/>
								</td>
								<td>
									<s:property value="bankAccountCode"/>
								</td>
								<td>
									<s:property value="bankAccountName"/>
								</td>
								<td>
									<s:property value="endingBalance"/>
								</td>
								<td>
									<s:property value="coacode"/>
								</td>
								<td>
									<s:property value="seqNo"/>
								</td>
								<td>
									<s:property value="resetFlag"/>
								</td>
								<td>
									<s:property value="formatSeqNo"/>
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