package home_screen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.LoginScreen;
import product_management.ProductManagementScreen;
import user_management.UserManagementScreen;


public class HomeScreenController {

	@FXML
	private Button UserManagement ;
	
	@FXML
	private Button ProductManagement ;
	
	@FXML
	private Button Exit ;
	
	public void UserManagement (ActionEvent event) {
		UserManagementScreen.showUserManagement();
	}
	public void ProductManagement (ActionEvent event) {
		ProductManagementScreen.showProductManagementScreen();
	}
	public void Exit (ActionEvent event) {
		LoginScreen.showLoginScreen();
	}
	
}
