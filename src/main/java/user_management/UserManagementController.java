package user_management;

import add_user.AddUserScreen;
import delete_user.DeleteUserScreen;
import edit_user.EditUserScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_user.SearchUserScreen;

public class UserManagementController {
	@FXML
	private Button AddUser;

	@FXML
	private Button EditUser;

	@FXML
	private Button DeleteUser;

	@FXML
	private Button SearchUser;

	@FXML
	private Button Exit;

	public void Exit(ActionEvent event) {
		HomeScreen.ShoeHomeScreen();
	}

	public void AddUser(ActionEvent event) {
		AddUserScreen.showAddUserScreen();
	}

	public void EditUser(ActionEvent event) {
		EditUserScreen.showEditUserScreen();
	}

	public void DeleteUser(ActionEvent event) {
		DeleteUserScreen.showDeleteUserScreen();
	}

	public void SearchUser(ActionEvent evet) {
		SearchUserScreen.showSearchUserScreen();
	}
}
