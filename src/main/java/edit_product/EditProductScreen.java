package edit_product;

import java.io.IOException;
import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditProductScreen {
	public static void showEditProductScreen() {
		try {
			Parent actorgroup = FXMLLoader.load(new URL("file:C:\\Users\\Admin\\eclipse-workspace\\shop-managemnet-jfx-db-maven-1\\src\\main\\java\\edit_product\\Edit Product..fxml"));
			StageFactory.stage.setTitle("Edit Product");
			Scene scene = new Scene (actorgroup);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
