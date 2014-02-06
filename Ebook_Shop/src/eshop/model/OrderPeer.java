package eshop.model;

import java.sql.SQLException;
import java.sql.Statement;
import eshop.beans.Customer;

public class OrderPeer {
	
	public static void insertOrder(Statement stmt, long orderId, Customer customer) 
			throws SQLException{
		
		String sql = "insert into orders (order_id, delivery_name, "
					+" delivery_adress, cc_name, cc_number, cc_expiry) values ('"
					+ orderId + "','" + customer.getContactName() + "','"
					+ customer.getDeliveryAdress() + "' , '"
					+customer.getCcName() + "' , '" + customer.getCcNumber()
					+"' , '" + customer.getCcExpiryDate() + "')";
		
		stmt.executeUpdate(sql);
	}

}
