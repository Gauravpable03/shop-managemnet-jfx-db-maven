package home_screen;

import java.io.IOException;
import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class HomeScreen {

	public static void ShoeHomeScreen() {
		try {
			Parent actorgroup = FXMLLoader.load(new URL("file:C:\\Users\\Admin\\eclipse-workspace\\shop-managemnet-jfx-db-maven-1\\src\\main\\java\\home_screen\\HomeScreen.fxml"));
			StageFactory.stage.setTitle("Home Screen");
			Scene scene = new Scene(actorgroup);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
