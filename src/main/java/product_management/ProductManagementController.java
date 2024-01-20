package product_management;


import add_product.AddProductScreen;
import delete_product.DeleteProductScreen;
import edit_product.EditProductScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_product.SearchProductScreen;

public class ProductManagementController {
	@FXML
	private Button AddProduct;

	@FXML
	private Button EditProduct;

	@FXML
	private Button DeleteProduct;

	@FXML
	private Button SearchProduct;

	@FXML
	private Button Exit;

	public void AddProduct(ActionEvent event) {
         AddProductScreen.showAddProductScreen();
	}

	public void EditProduct(ActionEvent event) {
		EditProductScreen.showEditProductScreen();
	}

	public void DeleteProduct(ActionEvent event) {
		DeleteProductScreen.showDeleteProductScreen();
	}

	public void SearchProduct(ActionEvent event) {
		SearchProductScreen.showSearchProdcut();
	}

	public void Exit(ActionEvent event) {
		HomeScreen.ShoeHomeScreen();
	}
	

}
