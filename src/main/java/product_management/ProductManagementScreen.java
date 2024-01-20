package product_management;

import java.io.IOException;
import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductManagementScreen {
	public static void showProductManagementScreen() {
		try {
			Parent actorgroup =FXMLLoader.load(new URL("file:C:\\Users\\Admin\\eclipse-workspace\\shop-managemnet-jfx-db-maven-1\\src\\main\\java\\product_management\\ProductManagement.fxml"));
			StageFactory.stage.setTitle("ProductManagement");
			Scene scene = new Scene(actorgroup);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
