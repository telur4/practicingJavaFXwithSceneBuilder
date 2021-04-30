package application;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

// JavaFXはMVCに近いモデルを利用する
// このファイルはMVCの内、Controller相当
public class Test1Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField1;
    
    @FXML
    private VBox enterText1;

    @FXML
    private Button button1;

    @FXML
    void onButton1Action(ActionEvent event) {
    	// 確認ダイアログオブジェクトを生成
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	// 確認ダイアログに表示するテキストをセット
    	alert.setTitle("Title!");
    	alert.setHeaderText("Hander!");
    	alert.setContentText("You entered: " + textField1.getText());
    	// 確認ダイアログを表示し、ユーザーのレスポンスを待つ
    	Optional<ButtonType> result = alert.showAndWait();
    	// 確認ダイアログにて、ユーザーがOKボタンを押した場合、デバッグコンソールに「You clicked OK」と表示する
    	if (result.isPresent() && result.get() == ButtonType.OK) {
    		System.out.println("You clicked OK");
    	}
    }

    @FXML
    void initialize() {
        assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'Test1.fxml'.";
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'Test1.fxml'.";

    }
}
