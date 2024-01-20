package search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.DataBaseOperation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;

public class SearchProductController {
	@FXML
	private TextField Product ;
	
	@FXML
	private TextField ProductName ;
	
	@FXML
	private TextField ProductID ;
	
	@FXML
	private TextField ProductPrice ;
	
	@FXML
	private TextField ProductQuantity ;
	
	@FXML
	private TextField ProductCategory ;
	
	
	@FXML
	private Button Search ;
	
	@FXML 
	private Button Close ;
	
	
	public void Search () {
		String Query = "Select * from products where Product_Name = '"+Product.getText()+"'";
		ResultSet rs = DataBaseOperation.ExecuteQueryGetResult(Query);
	    try {
			while(rs.next()) {
				if(rs.getString("Product_Name").equalsIgnoreCase(Product.getText())) {
					ProductName.setText(rs.getString("Product_Name"));
					ProductID.setText(rs.getString("ProductID"));
					ProductPrice.setText(rs.getString("ProductPrice"));
					ProductQuantity.setText(rs.getString("ProductQuantity"));
					ProductCategory.setText(rs.getString("ProductCategory"));
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void Close () {
		ProductManagementScreen.showProductManagementScreen();
	}
	

}
