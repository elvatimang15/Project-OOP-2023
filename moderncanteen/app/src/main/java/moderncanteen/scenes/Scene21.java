package moderncanteen.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.layout.StackPane;

public class Scene21 {
    private Stage stage;
    private int timeline;

    public Scene21(Stage stage, int timeline) {
        this.stage = stage;
        this.timeline = timeline;
    }

    public void showScene2Part1(String namaa2, int nope2, int waktu) {
        System.out.println();
        Image image = new Image("/mulai.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(620);
        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        Button mulai = new Button("MULAI");
        mulai.setFont(Font.font("Algerian", 26));
        mulai.setStyle("-fx-background-color: red; -fx-text-fill: white;");

        VBox vbox = new VBox(mulai);
        root.getChildren().add(vbox);
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(0, 0, 175, 0));

        mulai.setOnAction(e -> {
            Scene4 scene4 = new Scene4();
            scene4.showScene4(stage, namaa2, nope2, timeline);
        });
        Scene scene21 = new Scene(root, 500, 620);
        stage.setScene(scene21);
        stage.show();
    }
}
