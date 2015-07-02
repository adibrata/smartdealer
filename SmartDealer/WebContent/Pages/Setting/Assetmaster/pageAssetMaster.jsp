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
	function hapus(){
		document.getElementById("mode").value="hapus";
	}
	function add(){
		document.getElementById("mode").value="add";
	}
</script>
<body>
	<s:form action="assetmaster.action" theme="simple">
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
							<option value="assetType">Type</option>
							<option value="assetBrand">Brand</option>
							<option value="assetModel">Model</option>
							<option value="assetCode">Code</option>
							<option value="bpkbno">BPKB No.</option>
							<option value="bpkbname">Name</option>
							<option value="bpkbaddress">Address</option>
							<option value="vehicleColor">Colour</option>
							<option value="machineNo">Machine No.</option>
							<option value="chasisNo">Chasis No.</option>
							<option value="cylinder">Cylinder</option>
							<option value="licensePlate">License Plate</option>
							<option value="manufacturingMonth">Manufacturing Month</option>
							<option value="manufacturingYear">Manufacturing Year</option>
							<option value="purchasePrice">Purchase Price</option>
							<option value="servicePrice">Service Price</option>
							<option value="taxPrice">Tax Price</option>
							<option value="netSalesPrice">Sales Price</option>
							<option value="receiveDate">Receive Date</option>
							<option value="purchaseDate">Purchase Date</option>
							<option value="serviceDate">Service Date</option>
							<option value="stockStatus">Stock Status</option>
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
								<th>Type</th>
								<th>Brand</th>
								<th>Model</th>
								<th>Code</th>
								<th>Level</th>
								<th>BPKB No.</th>
								<th>Name</th>
								<th>Address</th>
								<th>Colour</th>
								<th>Machine No.</th>
								<th>Chasis No.</th>
								<th>Cylinder</th>
								<th>License Plate</th>
								<th>Manufacturing Month</th>
								<th>Manufacturing Year</th>
								<th>Purchase Price</th>
								<th>Service Price</th>
								<th>Tax Price</th>
								<th>Sales Price</th>
								<th>Receive Date</th>
								<th>Purchase Date</th>
								<th>Service Date</th>
								<th>Stock Status</th>
								<th><button type="submit" onclick="edit()">Edit</button></th>
								<th><button type="submit" onclick="hapus()">Delete</button></th>
							</tr>
						<s:iterator value="">
							<tr id="row_<s:property value="id"/>">
								<td>
									<s:property value="assetType"/>
								</td>
								<td>
									<s:property value="assetBrand"/>
								</td>
								<td>
									<s:property value="assetModel"/>
								</td>
								<td>
									<s:property value="assetCode"/>
								</td>
								<td>
									<s:property value="bpkbno"/>
								</td>
								<td>
									<s:property value="bpkbname"/>
								</td>
								<td>
									<s:property value="bpkbaddress"/>
								</td>
								<td>
									<s:property value="vehicleColor"/>
								</td>
								<td>
									<s:property value="machineNo"/>
								</td>
								<td>
									<s:property value="chasisNo"/>
								</td>
								<td>
									<s:property value="cylinder"/>
								</td>
								<td>
									<s:property value="licensePlate"/>
								</td>
								<td>
									<s:property value="manufacturingMonth"/>
								</td>
								<td>
									<s:property value="manufacturingYear"/>
								</td>
								<td>
									<s:property value="purchasePrice"/>
								</td>
								<td>
									<s:property value="servicePrice"/>
								</td>
								<td>
									<s:property value="taxPrice"/>
								</td>
								<td>
									<s:property value="netSalesPrice"/>
								</td>
								<td>
									<s:property value="receiveDate"/>
								</td>
								<td>
									<s:property value="purchaseDate"/>
								</td>
								<td>
									<s:property value="serviceDate"/>
								</td>
								<td>
									<s:property value="stockStatus"/>
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