package delete_product;

import java.io.IOException;
import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DeleteProductScreen {
	public static void showDeleteProductScreen() {
		try {
			Parent actorgroup = FXMLLoader.load(new URL("file:C:\\Users\\Admin\\eclipse-workspace\\shop-managemnet-jfx-db-maven-1\\src\\main\\java\\delete_product\\Delete Product.fxml"));
			StageFactory.stage.setTitle("DeleteProduct");
			Scene scene = new Scene (actorgroup);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
