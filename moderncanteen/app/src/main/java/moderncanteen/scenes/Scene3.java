package moderncanteen.scenes;

import java.util.List;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import moderncanteen.datasources.MenuDataSource;
import moderncanteen.models.Drink;
import moderncanteen.models.Food;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;

public class Scene3 {
    private Stage stage;
    private int waktu;
    private List<Food> foods;
    private List<Drink> drinks;

    public Scene3(Stage stage) {
        this.stage = stage;
        foods = MenuDataSource.getAllFood();
        drinks = MenuDataSource.getAllDrink();
    }

    public void showScene3(String namaa2, int nope2) {
        Image image = new Image("/menu.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(620);
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        Label pilihMenu = new Label("PILIH MENU");
        pilihMenu.setFont(Font.font("Algerian", 18));
        pilihMenu.setTextFill(Color.WHITE);

        Label menumakanan = new Label("> MAKANAN");

        VBox makan = new VBox(menumakanan);
        menumakanan.setFont(Font.font("Algerian", 15));
        makan.setSpacing(15);

        for (int i = 0; i < foods.size(); i++) {
            final int index = i;
            Label makan1 = new Label(
                    String.format("%d. %s (%dK)", (i + 1), foods.get(i).getName(), foods.get(i).price));
            makan1.setPrefWidth(400);
            Button kurang1 = new Button("-");
            Button tambah1 = new Button("+");
            menumakanan.setTextFill(Color.WHITE);
            makan1.setTextFill(Color.WHITE);
            TextField input1 = new TextField("0");
            kurang1.setOnAction(e -> {
                foods.get(index).reduceItem();
                input1.setText(String.valueOf(foods.get(index).getItemCount()));
            });
            tambah1.setOnAction(e -> {
                foods.get(index).addItem();
                input1.setText(String.valueOf(foods.get(index).getItemCount()));
            });
            HBox tombol1 = new HBox(kurang1, input1, tambah1);
            input1.setPrefWidth(28);
            HBox pilih1 = new HBox(makan1, tombol1);
            makan1.setFont(Font.font("Algerian", 12));
            makan.getChildren().add(pilih1);
        }

        Label menuminuman = new Label("> MINUMAN");
        VBox minum = new VBox(menuminuman);
        menuminuman.setFont(Font.font("Algerian", 15));
        minum.setSpacing(15);

        for (int i = 0; i < drinks.size(); i++) {
            final int index = i;
            Label minum1 = new Label(
                    String.format("%d. %s (%dK)", (i + 1), drinks.get(i).getName(), drinks.get(i).price));
            minum1.setFont(Font.font("Algerian", 12));
            minum1.setPrefWidth(400);
            Button kurang1 = new Button("-");
            Button tambah1 = new Button("+");
            menuminuman.setTextFill(Color.WHITE);
            minum1.setTextFill(Color.WHITE);
            TextField input1 = new TextField("0");
            kurang1.setOnAction(e -> {
                drinks.get(index).reduceItem();
                input1.setText(String.valueOf(drinks.get(index).getItemCount()));
            });
            tambah1.setOnAction(e -> {
                drinks.get(index).addItem();
                input1.setText(String.valueOf(drinks.get(index).getItemCount()));
            });
            HBox tombol1 = new HBox(kurang1, input1, tambah1);
            input1.setPrefWidth(28);
            HBox pilih1 = new HBox(minum1, tombol1);
            minum1.setFont(Font.font("Algerian", 12));
            minum.getChildren().add(pilih1);
        }

        Label jumpesan = new Label();
        jumpesan.setFont(Font.font("Algerian", 13));
        jumpesan.setTextFill(Color.WHITE);

        Label harga = new Label();
        harga.setFont(Font.font("Algerian", 13));
        harga.setTextFill(Color.WHITE);
        harga.setAlignment(Pos.CENTER);
        harga.setPrefWidth(425);

        Button next = new Button("NEXT");
        next.setFont(Font.font("Algerian", 13));
        next.setVisible(false);

        Button pesan = new Button("Pesan");
        pesan.setFont(Font.font("Algerian", 13));
        pesan.setPrefWidth(200);
        pesan.setOnAction(e -> {
            int totalpesanan = 0;
            int totalHarga = 0;
            int hitungMundur = 0;
            for (Food food : foods) {
                totalpesanan += food.getItemCount();
                totalHarga += food.getPrice();
                hitungMundur += food.getMakerTime();
            }

            for (Drink drink : drinks) {
                totalpesanan += drink.getItemCount();
                totalHarga += drink.getPrice();
                hitungMundur += drink.getMakerTime();
            }
            waktu = hitungMundur;
            jumpesan.setText("Jumlah Pesanan Anda : " + totalpesanan);
            harga.setText("Total Harga : " + totalHarga + "K");
            next.setVisible(true);
        });
        next.setOnAction(e -> {
            Scene4 scene4 = new Scene4();
            scene4.showScene4(stage, namaa2, nope2, waktu);
        });

        VBox vbox = new VBox(pilihMenu, makan, minum, pesan, jumpesan, harga, next);
        root.getChildren().add(vbox);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setSpacing(12);
        Scene scene3 = new Scene(root, 500, 620);
        stage.setScene(scene3);
    }
}
