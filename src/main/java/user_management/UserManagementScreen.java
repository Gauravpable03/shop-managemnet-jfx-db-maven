package user_management;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UserManagementScreen {
	public static void showUserManagement() {

		try {
			Parent actorgroup = FXMLLoader.load(new URL("file:C:\\Users\\Admin\\eclipse-workspace\\shop-managemnet-jfx-db-maven-1\\src\\main\\java\\user_management\\UserManagement.fxml"));
			StageFactory.stage.setTitle("UserManagement");
			Scene scene = new Scene(actorgroup);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
