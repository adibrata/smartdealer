<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="style/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="style/css/bootstrap-theme.min.css" rel="stylesheet"
	type="text/css" />
<link href="style/css/jquery.smartmenus.bootstrap.css" rel="stylesheet"
	type="text/css" />
<!-- Bootstrap core JavaScript
    ================================================== -->
<script type="text/javascript" language="javascript"
	src="style/js/bootstrap.min.js"></script>
<!-- /container -->
<script type="text/javascript" language="javascript"
	src="style/js/jquery.min.js"></script>
<script type="text/javascript" language="javascript"
	src="style/js/bootstrap.min.js"></script>
<script type="text/javascript" language="javascript"
	src="style/js/jquery.min.js"></script>
<script type="text/javascript" language="javascript"
	src="style/js/jquery.smartmenus.min.js"></script>
<script type="text/javascript" language="javascript"
	src="style/js/jquery.smartmenus.bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
</head>
<body>

	<ul class="nav navbar-nav">
		<li><a href="home.jsp">Depan</a></li>
		<li class="dropdown"><a href="" class="dropdown-toggle"
			data-toggle="dropdown" role="button" aria-haspopup="true"
			aria-expanded="false">Pembelian </a>
			<ul class="dropdown-menu">
				<li><a href="">Pembelian</a></li>
				<li><a href="">Titipan </a></li>
				<li><a href="">Retur </a></li>
				<li role="separator" class="divider"></li>
				<li class="dropdown-header">Laporan</li>
				<li><a href="">Laporan Pembelian</a></li>
				<li><a href="">Laporan Konsinyasi</a></li>
				<li><a href="">Laporan Retur Pembelian</a></li>
			</ul></li>
		<li class="dropdown"><a href="" class="dropdown-toggle"
			data-toggle="dropdown" role="button" aria-haspopup="true"
			aria-expanded="false">Penjualan dan Titipan </a>
			<ul class="dropdown-menu">
				<li><a href="">Penjualan</a></li>
				<li><a href="">Titipan </a></li>
				<li><a href="">Retur </a></li>
				<li role="separator" class="divider"></li>
				<li class="dropdown-header">Laporan</li>
				<li><a href="">Laporan Penjualan</a></li>
				<li><a href="">Laporan Konsinyasi</a></li>
				<li><a href="">Laporan Retur Penjualan</a></li>
			</ul></li>
		<li class="dropdown"><a href="" class="dropdown-toggle"
			data-toggle="dropdown" role="button" aria-haspopup="true"
			aria-expanded="false">Perbaikan</a>
			<ul class="dropdown-menu">
				<li><a href="">Perbaikan</a></li>

				<li role="separator" class="divider"></li>
				<li class="dropdown-header">Laporan</li>
				<li><a href="">Laporan Perbaikan</a></li>
			</ul></li>
		<li class="dropdown"><a href="" class="dropdown-toggle"
			data-toggle="dropdown" role="button" aria-haspopup="true"
			aria-expanded="false">Stock</a>
			<ul class="dropdown-menu">
				<li><a href="">Stock</a></li>

				<li role="separator" class="divider"></li>
				<li class="dropdown-header">Laporan</li>
				<li><a href="">Laporan Stock</a></li>
			</ul></li>
		<li class="dropdown"><a href="" class="dropdown-toggle"
			data-toggle="dropdown" role="button" aria-haspopup="true"
			aria-expanded="false">Karyawan</a>
			<ul class="dropdown-menu">
				<li><a href="">Pengeluaran Karyawan</a></li>

				<li role="separator" class="divider"></li>
				<li class="dropdown-header">Laporan</li>
				<li><a href="">Laporan Pengeluaran Karyawan</a></li>
			</ul></li>
		<li class="dropdown"><a href="" class="dropdown-toggle"
			data-toggle="dropdown" role="button" aria-haspopup="true"
			aria-expanded="false">Keuangan</a>
			<ul class="dropdown-menu">
				<li><a href="">Pembayaran Hutang</a></li>
				<li><a href="">Penerimaan Piutang</a></li>
				<li><a href="">Pembayaran Bukan Hutang / Piutang</a></li>
				<li><a href="">Penerimaan Bukan Hutang / Piutang</a></li>

				<li role="separator" class="divider"></li>
				<li class="dropdown-header">Laporan</li>
				<li><a href="">Laporan Hutang</a></li>
				<li><a href="">Laporan Piutang</a></li>
				<li><a href="">Laporan Pembayaran Bukan Hutang / Piutang</a></li>
				<li><a href="">Laporan Penerimaan Bukan Hutang / Piutang</a></li>

			</ul></li>
		<li class="dropdown"><a href="" class="dropdown-toggle"
			data-toggle="dropdown" role="button" aria-haspopup="true"
			aria-expanded="false">Akuntansi</a>
			<ul class="dropdown-menu">
				<li><a href="">Posting To GL</a></li>
				<li><a href="">Pembayaran Piutang</a></li>


				<li role="separator" class="divider"></li>
				<li class="dropdown-header">Laporan</li>
				<li><a href="">Laporan Neraca</a></li>
				<li><a href="">Laporan Rugi Laba</a></li>
				<li><a href="">Laporan Saldo</a></li>
			</ul></li>
		<li class="dropdown"><a href="" class="dropdown-toggle"
			data-toggle="dropdown" role="button" aria-haspopup="true"
			aria-expanded="false">Setting</a>
			<ul class="dropdown-menu">
				<li><a href="">Kantor</a></li>
				<li><a href="">Karyawan</a></li>
				<li><a href="">Jabatan</a></li>
				<li><a href="">Taksasi</a></li>
				<li><a href="">Master</a></li>
				<li><a href="">Rekening Bank</a></li>

				<li><a href="">Dealer</a></li>
				<li><a href="">Bengkel</a></li>
				<li><a href="">User Login</a></li>

			</ul></li>
		<li><a href="home.jsp">Keluar</a></li>
	</ul>

</body>
<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<!-- 	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script> -->
<script src="style/js/jquery.min.js"></script>
<script src="style/js/bootstrap.min.js"></script>
<script src="style/js/jquery.smartmenus.min.js"></script>
<script src="style/js/jquery.smartmenus.bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="js/ie10-viewport-bug-workaround.js"></script>
</html>