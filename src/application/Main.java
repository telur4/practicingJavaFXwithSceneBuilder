package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//JavaFXはMVCに近いモデルを利用する
//このファイルはMVCの内、Model相当
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// FXMLのインポート
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Test1.fxml"));
			// 下記のようにLabelを使用してModelから直接文字を表示することは可能だが、非推奨
			// Label label = new Label("This is JavaFX!");
			// root.setTop(label);
			
			// widthとheightを整形し、FXMLを適用
			Scene scene = new Scene(root,400,400);
			// CSSのインポート
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// CSSの適用
			primaryStage.setScene(scene);
			// ウィンドウを表示
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Application.launch(args);
		// launch(args)　でも良い
	}
}
