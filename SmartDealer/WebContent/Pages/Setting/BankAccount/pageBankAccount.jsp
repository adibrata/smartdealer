<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>DMS-Dealer Management System</title>

<link href="../../style/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="../../style/css/bootstrap-theme.min.css" rel="stylesheet"  type="text/css" />
<link href="../../style/css/jquery.smartmenus.bootstrap.css" rel="stylesheet" type="text/css" />
<!-- Bootstrap core JavaScript
    ================================================== -->
	<script type="text/javascript" language="javascript" src="../../style/js/bootstrap.min.js"></script>
<!-- /container -->
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/bootstrap.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.smartmenus.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.smartmenus.bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script type="text/javascript">
	function cari(){
		document.getElementById("mode").value="cari";
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
</head>

<body>
	<!-- Fixed navbar -->
	<nav class="navbar navbar-default navbar-fixed-top">

	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!-- <a class="navbar-brand">DMS</a> -->
		</div>

		<div id="navbar" class="navbar-collapse collapse">

			<%@include file="../../Menu.jsp"%>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>

	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="../../Header.jsp"%>
	
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
						<button type="submit" onclick="cari()">Search</button>
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
	</div>
</body>
</html>