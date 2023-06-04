package moderncanteen.scenes;

import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.layout.StackPane;

public class Scene2 {
    private Stage stage;


    public Scene2(Stage stage) {
        this.stage = stage;
    }

    public void showScene2(String namaa2,int nope2) {
        Image image = new Image("/moderncanteen.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(620);
        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        Button mulai = new Button("MULAI");
        mulai.setFont(Font.font("Algerian", 20));

        VBox vbox = new VBox(mulai);
        root.getChildren().add(vbox);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);

        mulai.setOnAction(e -> {
            Scene3 scene3 = new Scene3(stage);
            scene3.showScene3(namaa2, nope2);
        });

        Scene scene2 = new Scene(root, 500, 620);
        stage.setScene(scene2);
    }
}
