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
	function save(){
		document.getElementById("mode").value="save";
	}
	function back(){
		document.getElementById("mode").value="back";
	}
</script>
</head>

<body>
<!-- Fixed navbar -->
	<nav class="navbar navbar-default navbar-fixed-top">

	<div class="container">
		<div class="navbar-header">
			<button class="btn btn-sm btn-primary" type="button" class="navbar-toggle collapsed"
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
						<button class="btn btn-sm btn-primary" type="submit" onclick="save()">Save</button>
						<button class="btn btn-sm btn-primary" type="submit" onclick="back()">Back</button>
					</td>
				</tr>
			</table>
		</center>
	</s:form>
	</div>
</body>
</html>