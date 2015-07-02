<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

<!-- Bootstrap core CSS -->
<!-- <link href="http://getbootstrap.com/dist/css/bootstrap.min.css"
	rel="stylesheet">
 -->
<!-- Custom styles for this template -->
<!-- <link
	href="http://getbootstrap.com/examples/navbar-fixed-top/navbar-fixed-top.css"
	rel="stylesheet"/>
 -->
<link href="assets/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets/css/bootstrap-theme.min.css" rel="stylesheet"
	type="text/css" />

<link href="assets/css/jquery.smartmenus.bootstrap.css" rel="stylesheet"
	type="text/css" />

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
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
			<ul class="nav navbar-nav">
				<!--  Start Render From Java -->
				<li><a href="home.jsp">Depan</a></li>
				<!--  Purchase  -->
				<li class="dropdown"><a
					href="http://getbootstrap.com/examples/navbar-fixed-top/#"
					class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-haspopup="true" aria-expanded="false">Pembelian </a>
					<ul class="dropdown-menu">
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Pembelian</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Titipan
						</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Retur
						</a></li>
						<li role="separator" class="divider"></li>
						<li class="dropdown-header">Laporan</li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Pembelian</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Konsinyasi</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Retur Pembelian</a></li>
					</ul></li>
				<!--  Penjualan -->
				<li class="dropdown"><a
					href="http://getbootstrap.com/examples/navbar-fixed-top/#"
					class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-haspopup="true" aria-expanded="false">Penjualan dan
						Titipan </a>
					<ul class="dropdown-menu">
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Penjualan</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Titipan
						</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Retur
						</a></li>
						<li role="separator" class="divider"></li>
						<li class="dropdown-header">Laporan</li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Penjualan</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Konsinyasi</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Retur Penjualan</a></li>
					</ul></li>
				<li class="dropdown"><a
					href="http://getbootstrap.com/examples/navbar-fixed-top/#"
					class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-haspopup="true" aria-expanded="false">Perbaikan</a>
					<ul class="dropdown-menu">
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Perbaikan</a></li>

						<li role="separator" class="divider"></li>
						<li class="dropdown-header">Laporan</li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Perbaikan</a></li>
					</ul></li>
				<li class="dropdown"><a
					href="http://getbootstrap.com/examples/navbar-fixed-top/#"
					class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-haspopup="true" aria-expanded="false">Stock</a>
					<ul class="dropdown-menu">
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Stock</a></li>

						<li role="separator" class="divider"></li>
						<li class="dropdown-header">Laporan</li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Stock</a></li>
					</ul></li>

				<!--  Karyawan  -->
				<li class="dropdown"><a
					href="http://getbootstrap.com/examples/navbar-fixed-top/#"
					class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-haspopup="true" aria-expanded="false">Karyawan</a>
					<ul class="dropdown-menu">
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Pengeluaran
								Karyawan</a></li>

						<li role="separator" class="divider"></li>
						<li class="dropdown-header">Laporan</li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Pengeluaran Karyawan</a></li>
					</ul></li>
				<!--  Karyawan  -->

				<!--  Keuangan -->
				<li class="dropdown"><a
					href="http://getbootstrap.com/examples/navbar-fixed-top/#"
					class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-haspopup="true" aria-expanded="false">Keuangan</a>
					<ul class="dropdown-menu">
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Pembayaran
								Hutang</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Penerimaan
								Piutang</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Pembayaran
								Bukan Hutang / Piutang</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Penerimaan
								Bukan Hutang / Piutang</a></li>

						<li role="separator" class="divider"></li>
						<li class="dropdown-header">Laporan</li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Hutang</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Piutang</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Pembayaran Bukan Hutang / Piutang</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Penerimaan Bukan Hutang / Piutang</a></li>

					</ul></li>
				<!--  Keuangan -->
				<li class="dropdown"><a
					href="http://getbootstrap.com/examples/navbar-fixed-top/#"
					class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-haspopup="true" aria-expanded="false">Akuntansi</a>
					<ul class="dropdown-menu">
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Posting
								To GL</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Pembayaran
								Piutang</a></li>


						<li role="separator" class="divider"></li>
						<li class="dropdown-header">Laporan</li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Neraca</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Rugi Laba</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Laporan
								Saldo</a></li>
					</ul></li>
				<!--  Keuangan -->
				<!--  Keuangan -->
				<li class="dropdown"><a
					href="http://getbootstrap.com/examples/navbar-fixed-top/#"
					class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-haspopup="true" aria-expanded="false">Setting</a>
					<ul class="dropdown-menu">
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Kantor</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Karyawan</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Jabatan</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Taksasi</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Master</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Rekening
								Bank</a></li>

						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Dealer</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">Bengkel</a></li>
						<li><a
							href="http://getbootstrap.com/examples/navbar-fixed-top/#">User
								Login</a></li>

					</ul></li>
				<!--  Keuangan -->
				<li><a href="home.jsp">Keluar</a></li>
				<!--  ERender From Java -->
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>

	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br>
		<br>
		
		<table>
			<tr>
				<td width="25%"><div>
						<img width="100%" height="100" border="0" alt="W3Schools"
							src="images/smartdealer/LogoDealer.jpg">
					</div></td>
				<td align="center">Sun Motor</td>

				<td width="25%"><div>
						<img width="100%" height="100" border="0" alt="W3Schools"
							src="images/smartdealer/LogoDealer.jpg">
					</div></td>
			</tr>
			<tr>
				<td width="25%"></td>

				<td align="center" valign="top">Alamat Sun Motor</td>
				<td width="25%"></td>
			</tr>
		</table>

		<table class="table table-striped table-bordered table-hover">
			<tr>
				<td width="25%" height="" align="center"><a
					href="PurchaseHome.jsp"><img border="0" alt="W3Schools"
						src="images/smartdealer/Purchase.jpg" width="75%" height="75%"
						align="middle">
						<p>Pembelian dan Titipan</p></a></td>

				<td width="25%" height="" align="center"><a
					href="SalesHome.jsp"><img border="0" alt="W3Schools"
						src="images/smartdealer/Penjualan.jpg" width="75%" height="100%"
						align="middle">
						<p>Penjualan dan Titipan</p></a></td>

				<td width="25%" height="" align="center"><a
					href="ServiceHome.jsp"><img border="0" alt="W3Schools"
						src="images/smartdealer/services.png" width="100%" height="100%"
						align="middle">
						<p>Perbaikan</p></a></td>

				<td width="25%" height="" align="center"><a
					href="StockHome.jsp"><img border="0" alt="W3Schools"
						src="images/smartdealer/Warehouse.jpg" width="100%" height="100%"
						align="middle">
						<p>Stock</p></a></td>

			</tr>
			<tr>
				<td width="25%" height="" align="center"><a href=""><img
						border="0" alt="W3Schools" src="images/smartdealer/Employee.jpg"
						width="75%" height="75%" align="middle">
						<p>Karyawan</p></a></td>

				<td width="25%" height="" align="center"><a href=""><img
						border="0" alt="W3Schools" src="images/smartdealer/Finance.jpg"
						width="75%" height="75%" align="middle">
						<p>Keuangan</p></a></td>

				<td width="25%" height="" align="center"><a href=""><img
						border="0" alt="W3Schools" src="images/smartdealer/Accounting.jpg"
						width="75%" height="75%" align="middle">
						<p>Akuntansi</p></a></td>

				<td width="25%" height="" align="center"><a href=""><img
						border="0" alt="W3Schools"
						src="images/smartdealer/PasswordRequest.png" width="75%"
						height="75%" align="middle">
						<p>Minta Password</p></a></td>
			</tr>
		</table>


		<!-- 	</div> -->

	</div>
	<!-- /container -->



	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<!-- 	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script> -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/jquery.smartmenus.min.js"></script>
	<script src="assets/js/jquery.smartmenus.bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>