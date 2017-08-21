<%@ taglib prefix="s" uri="/struts-tags" %>
<div align="center">
	<table width="80%" border="1" style="border-collapse: collapse;">
		<tr>
			<th>No</th>
			<th>Store Name</th>
			<th>Address</th>
			<th>Owner</th>
		</tr>
		<s:iterator value="listStore">
			<tr>
				<td><s:property value="storeId" /></td>
				<td><s:property value="storeName" /></td>
				<td><s:property value="createAt" /></td>
				<td><s:property value="user.userName" /></td>
			</tr>
		</s:iterator>
	</table>
</div>
