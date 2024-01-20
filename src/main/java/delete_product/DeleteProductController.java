package delete_product;

import db_operation.DataBaseOperation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;

public class DeleteProductController {
	
	@FXML
	private TextField ProductName ;
	
	@FXML 
	private Button Delete ;
	
	@FXML
	private Button Close ;
	
	public void Delete() {
		String Query = "delete from products where Product_Name='"+ ProductName.getText() +"'";
		 DataBaseOperation.ExecuteQuery(Query);
	
	}
	public void Close() {
		ProductManagementScreen.showProductManagementScreen();
	}
	
}
