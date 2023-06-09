package moderncanteen.scenes;

import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class HomeScene {
    private Stage stage;
    private String namaa2;
    private int nope2;

    public HomeScene(Stage stage) {
        this.stage = stage;
    }

    public void showScene1() {
        Image image = new Image("/moderncanteen.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(620);
        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        Label nama = new Label("Masukan nama anda: ");
        nama.setFont(Font.font("Algerian", 13));
        TextField namaa = new TextField();

        Label nohp = new Label("Masukan no hp anda: ");
        nohp.setFont(Font.font("Algerian", 13));
        TextField nope = new TextField();

        Button masuk = new Button("Masuk");
        masuk.setFont(Font.font("Algerian", 15));
        masuk.setOnAction(e -> {
            String inputNama = namaa.getText();
            namaa2 = inputNama;

            int inputNope = Integer.parseInt(nope.getText());
            nope2 = inputNope;

            Scene2 scene2 = new Scene2(stage);
            scene2.showScene2(namaa2, nope2);
        });

        HBox hbox = new HBox(nama);
        HBox hbox1 = new HBox(nohp);
        VBox vbox = new VBox(hbox, namaa, hbox1, nope, masuk);
        root.getChildren().add(vbox);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(15);

        Scene scene1 = new Scene(root, 500, 620);
        stage.setScene(scene1);
    }
}
