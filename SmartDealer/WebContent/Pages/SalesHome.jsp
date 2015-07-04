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

		<table class="table table-striped table-bordered table-hover">
			<tr>
				<td width="25%" height="" align="center"><a href=""><img
						border="0" alt="W3Schools"
						src="../images/smartdealer/PenjualanMenu.jpg" width="120px"
						height="100px" align="middle">
						<p>Penjualan</p></a></td>

				<td width="25%" height="" align="center"><a href=""><img
						border="0" alt="W3Schools"
						src="../images/smartdealer/TitipanPenjualan.jpg" width="120px"
						height="100px" align="middle">
						<p>Titipan</p></a></td>

				<td width="25%" height="" align="center"><a href=""><img
						border="0" alt="W3Schools"
						src="../images/smartdealer/ReturnPenjualan.jpg" width="120px"
						height="100px" align="middle">
						<p>Retur</p></a></td>

			</tr>
			<tr>
				<td width="25%" height="" align="center"><a href=""><img
						border="0" alt="W3Schools"
						src="../images/smartdealer/Employee.jpg" 	width="120px" height="100px"
						align="middle">
						<p>Laporan Pembelian</p></a></td>

				<td width="25%" height="" align="center"><a href=""><img
						border="0" alt="W3Schools" src="../images/smartdealer/Finance.jpg"
							width="120px" height="100px" align="middle">
						<p>Laporan Titipan</p></a></td>

				<td width="25%" height="" align="center"><a href=""><img
						border="0" alt="W3Schools"
						src="../images/smartdealer/Accounting.jpg" 	width="120px" height="100px" align="top">
						<p>Laporan Retur</p></a></td>
			</tr>
			<tr>
				<td></td>

				<td width="25%" height="" align="center"><a href="Home.jsp"><img
						border="0" alt="W3Schools"
						src="../images/smartdealer/logout-icon.png" width="120px" height="100px"  align="top">
						<p>Keluar</p></a></td>
				<td></td>
			</tr>
		</table>


		<!-- 	</div> -->

	</div>
	<!-- /container -->



	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>