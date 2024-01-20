package add_product;

import db_operation.DataBaseOperation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;

public class AddProductController {

	@FXML
	private TextField ProductName;

	@FXML
	private TextField ProductID;

	@FXML
	private TextField ProductPrice;

	@FXML
	private TextField ProductQuantity;

	@FXML
	private TextField ProductCategory;

	@FXML
	private Button Save;

	@FXML
	private Button Close;

	public void Save(ActionEvent event) {
		String Query = "insert into users values Product_Name='"+ ProductName.getText() +"' , ProductID='"+ ProductID.getText() +"' ,"
				+ " ProductPrice='"+ ProductPrice.getText() +"' , ProductQuantity='"+ ProductQuantity.getText() +"' , ProductCategory='"+ ProductCategory.getText() +"'";
		DataBaseOperation.ExecuteQuery(Query);
	}

	public void Close(ActionEvent event) {
		ProductManagementScreen.showProductManagementScreen();
	}
}
