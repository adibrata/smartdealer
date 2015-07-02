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
	function add(){
		document.getElementById("mode").value="add";
	}
	function del(){
		document.getElementById("mode").value="del";
	}
	function save(){
		document.getElementById("mode").value="save";
	}
	function back(){
		document.getElementById("mode").value="back";
	}
</script>
<body>
	<s:form action="entrust_receive.action" theme="simple">
		<center>
			<h1>Entrust Entry</h1>
			<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
			<table>
				<tr>
					<td>
						Supplier Name
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Supplier Address
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Supplier City
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Supplier Type
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<br>
						<table>
							<tr>
								<td>
									Asset Code
								</td>
								<td>
									<select>
										<option value=""></option>
									</select>
								</td>
								<td>
									Chasis No.
								</td>
								<td>
									<input name=""/>
								</td>
							</tr>
							<tr>
								<td>
									Type
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									Engine No.
								</td>
								<td>
									<input name=""/>
								</td>
							</tr>
							<tr>
								<td>
									Brand
								</td>
								<td>
									<s:property value=""/>
								</td>
							</tr>
							<tr>
								<td>
									Model
								</td>
								<td>
									<s:property value=""/>
								</td>
							</tr>
							<tr>
								<td>
									Colour
								</td>
								<td>
									<input name=""/>
								</td>
							</tr><tr>
								<td>
									Manufacturing Month
								</td>
								<td>
									<input name=""/>
								</td>
							</tr>
							<tr>
								<td>
									Manufacturing Year
								</td>
								<td>
									<input name=""/>
								</td>
								<td>
									Total Purchase
								</td>
								<td>
									<s:property value=""/>
								</td>
							</tr>
							<tr>
								<td colspan="4" align="right">
									<button type="submit" onclick="add()">Add</button>
								</td>
							</tr>
							<tr>
								<td colspan="4">
									<br>
									<table border="1">
										<tr>
											<th>Asset Code</th>
											<th>Asset<br>Description</th>
											<th>Colour</th>
											<th>Chasis No.</th>
											<th>Engine No.</th>
											<th>Manufacturing<br>Month</th>
											<th>Manufacturing<br>Year</th>
											<th>Aging<br>(month)</th>
											<th>Purchase<br>Price</th>
											<th>Tax</th>
											<th>Total<br>Purchase</th>
											<th><button type="submit" onclick="del()">del</button></th>
										</tr>
									<s:iterator>
										<tr>
											<td>
												<s:property value=""/>
											</td>
											<td>
												<s:property value=""/>
											</td>
											<td>
												<s:property value=""/>
											</td>
											<td>
												<s:property value=""/>
											</td>
											<td>
												<s:property value=""/>
											</td>
											<td>
												<s:property value=""/>
											</td>
											<td>
												<s:property value=""/>
											</td>
											<td>
												<s:property value=""/>
											</td>
											<td>
												<s:property value=""/>
											</td>
											<td>
												<s:property value=""/>
											</td>
											<td>
												<s:property value=""/>
											</td>
											<td align="center">
												<input type="radio" checked/>
											</td>
										</tr>
									</s:iterator>
									</table>
									<br>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td>
						Total Unit
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Total Purchase
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Total Tax
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Grand Total
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td colspan="4" align="right">
						<button type="submit" onclick="save()">Save</button>
						<button type="submit" onclick="back()">Back</button>
					</td>
				</tr>
			</table>
		</center>
	</s:form>
</body>
</html>