package edit_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.DataBaseOperation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;

public class EditProductController {
	
	@FXML
	private TextField Product ;
	
	@FXML
	private TextField NewProductName ;
	
	@FXML
	private TextField NewProductID ;
	
	@FXML
	private TextField NewProductPrice ;
	
	@FXML
	private TextField NewProductQuantity ;
	
	@FXML
	private TextField NewProductCategory ;
	
	@FXML
	private Button Save ;
	
	@FXML
	private Button Edit ;
	
	@FXML
	private Button Close ;
	
	public void Save() {
		String Query = "update products set Product_Name='"+NewProductName.getText()+"' , ProductID ='"+NewProductID.getText()+"' ,"
				+ " ProductPrice='"+NewProductPrice.getText()+"' ,ProductQuantity='"+NewProductQuantity.getText()+"', ProductCategory='"
				+NewProductCategory.getText()+"' where Product_Name='"+Product.getText()+"' ";
		DataBaseOperation.ExecuteQuery(Query);

	}
	public void Close() {
		ProductManagementScreen.showProductManagementScreen();
	}
	public void Edit() {
		String Query = "Select * from products where Product_Name = '"+Product.getText()+"'";
		ResultSet rs = DataBaseOperation.ExecuteQueryGetResult(Query);
	    try {
			while(rs.next()) {
				if(rs.getString("Product_Name").equalsIgnoreCase(Product.getText())) {
					NewProductName.setText(rs.getString("Product_Name"));
					NewProductID.setText(rs.getString("ProductID"));
					NewProductPrice.setText(rs.getString("ProductPrice"));
					NewProductQuantity.setText(rs.getString("ProductQuantity"));
					NewProductCategory.setText(rs.getString("ProductCategory"));
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

}
