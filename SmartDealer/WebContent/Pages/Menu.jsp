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
<link href="style/css/jquery.smartmenus.bootstrap.css"
	rel="stylesheet" type="text/css" />
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
<s:form theme="simple">
	<ul class="nav navbar-nav">
		<li><a href="home.jsp">Depan</a></li>
		<li class="dropdown"><a href="" class="dropdown-toggle"
			data-toggle="dropdown" role="button" aria-haspopup="true"
			aria-expanded="false">Pembelian </a>
			<ul class="dropdown-menu">
				<li><a href="purchaseorder.action">Pembelian</a></li>
				<li><a href="purchaseretur.action">Retur </a></li>
				<li><a href="purchaseinvoice.action">Tagihan </a></li>
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
				<li><a href="salesorder.action">Penjualan</a></li>
				<li><a href="titip/masuk.action">Titipan </a></li>
				<li><a href="salesretur.action">Retur </a></li>
				<li><a href="salesinvoice.action">Tagihan</a></li>
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
				<li><a href="repair.action">Perbaikan</a></li>

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
				<li><a href="pettycash.action">Pengeluaran Karyawan</a></li>

				<li role="separator" class="divider"></li>
				<li class="dropdown-header">Laporan</li>
				<li><a href="">Laporan Pengeluaran Karyawan</a></li>
			</ul></li>
		<li class="dropdown"><a href="" class="dropdown-toggle"
			data-toggle="dropdown" role="button" aria-haspopup="true"
			aria-expanded="false">Keuangan</a>
			<ul class="dropdown-menu">
				<li><a href="accpay.action">Pembayaran Hutang</a></li>
				<li><a href="">Penerimaan Piutang</a></li>
				<li><a href="otherdisburse.action">Pembayaran Bukan Hutang
						/ Piutang</a></li>
				<li><a href="otherreceive.action">Penerimaan Bukan Hutang /
						Piutang</a></li>

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
				<li><a href="setting/office.action">Kantor</a></li>
				<li><a href="setting/employee.action">Karyawan</a></li>
				<li><a href="setting.role.action">Jabatan</a></li>
				<li><a href="setting/taksasi.action">Taksasi</a></li>
				<li><a href="setting/master.action">Master</a></li>
				<li><a href="setting/bankaccount.action">Rekening Bank</a></li>

				<li><a href="setting/dealer.action">Dealer</a></li>
				<li><a href="setting/workshop.action">Bengkel</a></li>
				<li><a href="setting/userregister.action">User Login</a></li>

			</ul></li>
		<li><a href="home.">Keluar</a></li>
	</ul>
</s:form>

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