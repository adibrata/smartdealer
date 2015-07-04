<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="">

<title>DMS-Dealer Management System</title>
</head>

<body>
	<%@include file="Menu.jsp"%>
	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="Header.jsp"%>
		<s:form>

			<table class="table table-striped table-bordered table-hover">
				<tr>
					<td width="25%" height="" align="center"><a
						href="PurchaseHome.jsp"><img border="0" alt="W3Schools"
							src="../images/smartdealer/Purchase.jpg" width="75%" height="75%"
							align="middle">
							<p>Pembelian dan Titipan</p></a></td>

					<td width="25%" height="" align="center"><a
						href="SalesHome.jsp"><img border="0" alt="W3Schools"
							src="../images/smartdealer/Penjualan.jpg" width="75%"
							height="100%" align="middle">
							<p>Penjualan dan Titipan</p></a></td>

					<td width="25%" height="" align="center"><a
						href="ServiceHome.jsp"><img border="0" alt="W3Schools"
							src="../images/smartdealer/services.png" width="100%"
							height="100%" align="middle">
							<p>Perbaikan</p></a></td>

					<td width="25%" height="" align="center"><a
						href="StockHome.jsp"><img border="0" alt="W3Schools"
							src="../images/smartdealer/Warehouse.jpg" width="100%"
							height="100%" align="middle">
							<p>Stock</p></a></td>

				</tr>
				<tr>
					<td width="25%" height="" align="center"><a href=""><img
							border="0" alt="W3Schools"
							src="../images/smartdealer/Employee.jpg" width="75%" height="75%"
							align="middle">
							<p>Karyawan</p></a></td>

					<td width="25%" height="" align="center"><a href=""><img
							border="0" alt="W3Schools"
							src="../images/smartdealer/Finance.jpg" width="75%" height="75%"
							align="middle">
							<p>Keuangan</p></a></td>

					<td width="25%" height="" align="center"><a href=""><img
							border="0" alt="W3Schools"
							src="../images/smartdealer/Accounting.jpg" width="75%"
							height="75%" align="middle">
							<p>Akuntansi</p></a></td>

					<td width="25%" height="" align="center"><a href=""><img
							border="0" alt="W3Schools"
							src="../images/smartdealer/PasswordRequest.png" width="75%"
							height="75%" align="middle">
							<p>Minta Password</p></a></td>
				</tr>
			</table>
		</s:form>

		<!-- 	</div> -->

	</div>
	<!-- /container -->

</body>


<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<!-- 	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script> -->
<script src="style/js/jquery.min.js"></script>
<script src="style/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="js/ie10-viewport-bug-workaround.js"></script>
</html>