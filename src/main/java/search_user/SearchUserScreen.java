package search_user;

import java.io.IOException;
import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchUserScreen {
	public static void showSearchUserScreen() {
		try {
			Parent actorgroup = FXMLLoader.load(new URL("file:C:\\Users\\Admin\\eclipse-workspace\\shop-managemnet-jfx-db-maven-1\\src\\main\\java\\search_user\\SearchUser.fxml"));
			StageFactory.stage.setTitle("SearchUser");
			Scene scene  = new Scene(actorgroup);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
