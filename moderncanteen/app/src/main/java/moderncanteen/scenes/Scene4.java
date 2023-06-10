package moderncanteen.scenes;

import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.layout.StackPane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Scene4 {
    private Label timerLabel;
    private boolean isPlayed = false;

    public void showScene4(Stage stage, String namaa2, int nope2, int waktu) {
        StackPane root = new StackPane();
        Scene scene4 = new Scene(root, 500, 620);
        Image image = new Image("/kantin.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(620);
        root.getChildren().add(imageView);

        Label tunggu = new Label("Silahkan Tunggu");
        tunggu.setFont(Font.font("Algerian", 15));

        timerLabel = new Label();
        timerLabel.setFont(Font.font("Algerian", 15));

        Label nama = new Label();
        nama.setFont(Font.font("Algerian", 15));

        Label nohp = new Label();
        nohp.setFont(Font.font("Algerian", 15));
        Button backtohome = new Button("Kembali Ke Halaman Utama");

        backtohome.setFont(Font.font("Algerian", 15));
        int hitungMundur = waktu * 60;
        final int[] hitungMundurRef = { waktu };
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            hitungMundurRef[0]--;
            if (hitungMundurRef[0] >= 0) {
                int jam = hitungMundurRef[0] / 3600;
                int minutes = (hitungMundurRef[0] % 3600) / 60;
                int seconds = hitungMundurRef[0] % 60;
                timerLabel.setText(String.format("%02d:%02d:%02d", jam, minutes, seconds));
                backtohome.setOnAction(v -> {
                    Scene21 scene21 = new Scene21(stage, hitungMundurRef[0]);
                    scene21.showScene2Part1(namaa2, nope2, hitungMundurRef[0]);
                });
            } else {
                timerLabel.setText("Silahkan ambil pesanan Anda");
                nama.setText("Atas nama : " + namaa2);
                nohp.setText("No HP : " + nope2);
                isPlayed = true;
                backtohome.setOnAction(v -> {
                    HomeScene scene1 = new HomeScene(stage);
                    scene1.showScene1();
                });
            }
        }));
        timeline.setCycleCount(hitungMundur);
        timeline.play();
        VBox vbox = new VBox(tunggu, timerLabel, nama, nohp, backtohome);
        root.getChildren().add(vbox);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(15);
        stage.setScene(scene4);
    }
}
