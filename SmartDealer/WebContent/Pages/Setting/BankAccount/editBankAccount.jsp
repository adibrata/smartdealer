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
	<s:form action="bankAccount.action" theme="simple">
		<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
		<center>
			<table>
				<tr>
					<td>
						Office ID
					</td>
					<td>
						<s:textfield name="officeId"/>
					</td>
				</tr>
				<tr>
					<td>
						Bank Account Code
					</td>
					<td>
						<s:textfield name="bankAccountCode"/>
					</td>
				</tr>
				<tr>
					<td>
						Bank Account Name
					</td>
					<td>
						<s:textfield name="bankAccountName"/>
					</td>
				</tr>
				<tr>
					<td>
						Ending Balance
					</td>
					<td>
						<s:textfield name="endingBalance"/>
					</td>
				</tr>
				<tr>
					<td>
						COA Code
					</td>
					<td>
						<s:textfield name="coacode"/>
					</td>
				</tr>
				<tr>
					<td>
						Seq No.
					</td>
					<td>
						<s:textfield name="seqNo"/>
					</td>
				</tr>
				<tr>
					<td>
						Reset Flag
					</td>
					<td>
						<s:textfield name="resetFlag"/>
					</td>
				</tr>
				<tr>
					<td>
						Format Seq No.
					</td>
					<td>
						<s:textfield name="formatSeqNo"/>
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