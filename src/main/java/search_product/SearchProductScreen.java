package search_product;

import java.io.IOException;
import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchProductScreen {
	public static void showSearchProdcut() {
		try {
			Parent actorgroup = FXMLLoader.load(new URL("file:C:\\Users\\Admin\\eclipse-workspace\\shop-managemnet-jfx-db-maven-1\\src\\main\\java\\search_product\\Search Product.fxml"));
			StageFactory.stage.setTitle("Search Product");
			Scene scene = new Scene (actorgroup);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
