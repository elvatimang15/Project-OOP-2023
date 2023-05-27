package moderncanteen;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.layout.StackPane;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        showScene1();
        stage.show();
        primaryStage.setTitle("Modern Canteen");
    }

    public void showScene1() {
        Image image = new Image("/kantin.png");
        ImageView imageView = new ImageView(image);
        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        Label nama = new Label("MODERN CANTEEN");
        nama.setFont(Font.font("Algerian", 18));

        Button mulai = new Button("MULAI");
        mulai.setFont(Font.font("Algerian", 15));

        VBox vbox = new VBox(root, nama, mulai);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);

        mulai.setOnAction(e -> showScene2());
        Scene scene1 = new Scene(vbox, 500, 620);
        stage.setScene(scene1);
    }

    public void showScene2() {
        Label pilihMenu = new Label("PILIH MENU");
        pilihMenu.setFont(Font.font("Algerian", 18));

        Label menumakanan = new Label("> MAKANAN");
        Label makan1 = new Label("1. Nasi Campur Telur Sejahtera (13K)");
        makan1.setPrefWidth(400);
        Button kurang1 = new Button("-");
        Button tambah1 = new Button("+");

        TextField input1 = new TextField("0");
        kurang1.setOnAction(e -> {
            int jumlah1 = Integer.parseInt(input1.getText());
            jumlah1 -= 1;
            input1.setText(Integer.toString(jumlah1));
        });
        tambah1.setOnAction(e -> {
            int jumlah1 = Integer.parseInt(input1.getText());
            jumlah1 += 1;
            input1.setText(Integer.toString(jumlah1));
        });
        HBox tombol1 = new HBox(kurang1, input1, tambah1);
        input1.setPrefWidth(28);
        HBox pilih1 = new HBox(makan1, tombol1);

        Label makan2 = new Label("2. Nasi Campur Ayam Tirex (15K)");
        makan2.setPrefWidth(400);
        Button kurang2 = new Button("-");
        Button tambah2 = new Button("+");
        TextField input2 = new TextField("0");
        kurang2.setOnAction(e -> {
            int jumlah2 = Integer.parseInt(input2.getText());
            jumlah2 -= 1;
            input2.setText(Integer.toString(jumlah2));
        });
        tambah2.setOnAction(e -> {
            int jumlah2 = Integer.parseInt(input2.getText());
            jumlah2 += 1;
            input2.setText(Integer.toString(jumlah2));
        });
        HBox tombol2 = new HBox(kurang2, input2, tambah2);
        input2.setPrefWidth(28);
        HBox pilih2 = new HBox(makan2, tombol2);

        Label makan3 = new Label("3. Nasi Goreng Bahagia (15K)");
        makan3.setPrefWidth(400);
        Button kurang3 = new Button("-");
        Button tambah3 = new Button("+");
        TextField input3 = new TextField("0");
        kurang3.setOnAction(e -> {
            int jumlah3 = Integer.parseInt(input3.getText());
            jumlah3 -= 1;
            input3.setText(Integer.toString(jumlah3));
        });
        tambah3.setOnAction(e -> {
            int jumlah3 = Integer.parseInt(input3.getText());
            jumlah3 += 1;
            input3.setText(Integer.toString(jumlah3));
        });
        HBox tombol3 = new HBox(kurang3, input3, tambah3);
        input3.setPrefWidth(28);
        HBox pilih3 = new HBox(makan3, tombol3);

        Label makan4 = new Label("4. Mie Bakso Goyang Lidah (15K)");
        makan4.setPrefWidth(400);
        Button kurang4 = new Button("-");
        Button tambah4 = new Button("+");
        TextField input4 = new TextField("0");
        kurang4.setOnAction(e -> {
            int jumlah4 = Integer.parseInt(input4.getText());
            jumlah4 -= 1;
            input4.setText(Integer.toString(jumlah4));
        });
        tambah4.setOnAction(e -> {
            int jumlah4 = Integer.parseInt(input4.getText());
            jumlah4 += 1;
            input4.setText(Integer.toString(jumlah4));
        });
        HBox tombol4 = new HBox(kurang4, input4, tambah4);
        input4.setPrefWidth(28);
        HBox pilih4 = new HBox(makan4, tombol4);

        Label makan5 = new Label("5. Mie Ayam Spesial Bett (18K)");
        makan5.setPrefWidth(400);
        Button kurang5 = new Button("-");
        Button tambah5 = new Button("+");
        TextField input5 = new TextField("0");
        kurang5.setOnAction(e -> {
            int jumlah5 = Integer.parseInt(input5.getText());
            jumlah5 -= 1;
            input5.setText(Integer.toString(jumlah5));
        });
        tambah5.setOnAction(e -> {
            int jumlah5 = Integer.parseInt(input5.getText());
            jumlah5 += 1;
            input5.setText(Integer.toString(jumlah5));
        });
        HBox tombol5 = new HBox(kurang5, input5, tambah5);
        input5.setPrefWidth(28);
        HBox pilih5 = new HBox(makan5, tombol5);

        VBox makan = new VBox(menumakanan, pilih1, pilih2, pilih3, pilih4, pilih5);
        menumakanan.setFont(Font.font("Algerian", 15));
        makan1.setFont(Font.font("Algerian", 12));
        makan2.setFont(Font.font("Algerian", 12));
        makan3.setFont(Font.font("Algerian", 12));
        makan4.setFont(Font.font("Algerian", 12));
        makan5.setFont(Font.font("Algerian", 12));
        makan.setSpacing(15);

        Label menuminuman = new Label("> MINUMAN");
        Label minum1 = new Label("1. Air Putih Mineral (5K)");
        minum1.setPrefWidth(400);
        Button kurang6 = new Button("-");
        Button tambah6 = new Button("+");
        TextField input6 = new TextField("0");
        kurang6.setOnAction(e -> {
            int jumlah6 = Integer.parseInt(input6.getText());
            jumlah6 -= 1;
            input6.setText(Integer.toString(jumlah6));
        });
        tambah6.setOnAction(e -> {
            int jumlah6 = Integer.parseInt(input6.getText());
            jumlah6 += 1;
            input6.setText(Integer.toString(jumlah6));
        });
        HBox tombol6 = new HBox(kurang6, input6, tambah6);
        input6.setPrefWidth(28);
        HBox pilih6 = new HBox(minum1, tombol6);

        Label minum2 = new Label("2. Es Teh Susu Kopi (7K)");
        minum2.setPrefWidth(400);
        Button kurang7 = new Button("-");
        Button tambah7 = new Button("+");
        TextField input7 = new TextField("0");
        kurang7.setOnAction(e -> {
            int jumlah7 = Integer.parseInt(input7.getText());
            jumlah7 -= 1;
            input7.setText(Integer.toString(jumlah7));
        });
        tambah7.setOnAction(e -> {
            int jumlah7 = Integer.parseInt(input7.getText());
            jumlah7 += 1;
            input7.setText(Integer.toString(jumlah7));
        });
        HBox tombol7 = new HBox(kurang7, input7, tambah7);
        input7.setPrefWidth(28);
        HBox pilih7 = new HBox(minum2, tombol7);

        Label minum3 = new Label("3. Jus Alpukat Hehe (12K)");
        minum3.setPrefWidth(400);
        Button kurang8 = new Button("-");
        Button tambah8 = new Button("+");
        TextField input8 = new TextField("0");
        kurang8.setOnAction(e -> {
            int jumlah8 = Integer.parseInt(input8.getText());
            jumlah8 -= 1;
            input8.setText(Integer.toString(jumlah8));
        });
        tambah8.setOnAction(e -> {
            int jumlah8 = Integer.parseInt(input8.getText());
            jumlah8 += 1;
            input8.setText(Integer.toString(jumlah8));
        });
        HBox tombol8 = new HBox(kurang8, input8, tambah8);
        input8.setPrefWidth(28);
        HBox pilih8 = new HBox(minum3, tombol8);

        Label minum4 = new Label("4. Es Jelly Buah (12K)");
        minum4.setPrefWidth(400);
        Button kurang9 = new Button("-");
        Button tambah9 = new Button("+");
        TextField input9 = new TextField("0");
        kurang9.setOnAction(e -> {
            int jumlah9 = Integer.parseInt(input9.getText());
            jumlah9 -= 1;
            input9.setText(Integer.toString(jumlah9));
        });
        tambah9.setOnAction(e -> {
            int jumlah9 = Integer.parseInt(input9.getText());
            jumlah9 += 1;
            input9.setText(Integer.toString(jumlah9));
        });
        HBox tombol9 = new HBox(kurang9, input9, tambah9);
        input9.setPrefWidth(28);
        HBox pilih9 = new HBox(minum4, tombol9);

        Label minum5 = new Label("5. Es Dogererererr (18K)");
        minum5.setPrefWidth(400);
        Button kurang10 = new Button("-");
        Button tambah10 = new Button("+");
        TextField input10 = new TextField("0");
        kurang10.setOnAction(e -> {
            int jumlah10 = Integer.parseInt(input10.getText());
            jumlah10 -= 1;
            input10.setText(Integer.toString(jumlah10));
        });
        tambah10.setOnAction(e -> {
            int jumlah10 = Integer.parseInt(input10.getText());
            jumlah10 += 1;
            input10.setText(Integer.toString(jumlah10));
        });
        HBox tombol10 = new HBox(kurang10, input10, tambah10);
        input10.setPrefWidth(28);
        HBox pilih10 = new HBox(minum5, tombol10);

        VBox minum = new VBox(menuminuman, pilih6, pilih7, pilih8, pilih9, pilih10);
        menuminuman.setFont(Font.font("Algerian", 15));
        minum1.setFont(Font.font("Algerian", 12));
        minum2.setFont(Font.font("Algerian", 12));
        minum3.setFont(Font.font("Algerian", 12));
        minum4.setFont(Font.font("Algerian", 12));
        minum5.setFont(Font.font("Algerian", 12));
        minum.setSpacing(15);

        Label jumpesan = new Label();
        jumpesan.setFont(Font.font("Algerian", 13));

        Button pesan = new Button("Pesan");
        pesan.setFont(Font.font("Algerian", 13));
        pesan.setPrefWidth(200);
        pesan.setOnAction(e -> {
            int jumlah1 = Integer.parseInt(input1.getText());
            int jumlah2 = Integer.parseInt(input2.getText());
            int jumlah3 = Integer.parseInt(input3.getText());
            int jumlah4 = Integer.parseInt(input4.getText());
            int jumlah5 = Integer.parseInt(input5.getText());
            int jumlah6 = Integer.parseInt(input6.getText());
            int jumlah7 = Integer.parseInt(input7.getText());
            int jumlah8 = Integer.parseInt(input8.getText());
            int jumlah9 = Integer.parseInt(input9.getText());
            int jumlah10 = Integer.parseInt(input10.getText());
            int total = jumlah1 + jumlah2 + jumlah3 + jumlah4 + jumlah5 + jumlah6 + jumlah7 + jumlah8 + jumlah9
                    + jumlah10;
            jumpesan.setText("Jumlah Pesanan Anda : " + total);
        });

        Label harga = new Label("Total Harga: ");
        harga.setFont(Font.font("Algerian", 13));
        harga.setPrefWidth(425);
        Button next = new Button("NEXT");
        next.setFont(Font.font("Algerian", 13));
        next.setOnAction(e -> showScene3());

        HBox hbox = new HBox(harga, next);
        VBox vbox1 = new VBox(hbox);
        VBox vbox = new VBox(pilihMenu, makan, minum, pesan, jumpesan, vbox1);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setSpacing(15);
        Scene scene2 = new Scene(vbox, 500, 620);
        stage.setScene(scene2);
    }

    public void showScene3() {

        Label tunggu = new Label("Silahkan Tunggu");
        tunggu.setFont(Font.font("Algerian", 15));
        Label timer = new Label();
        Button backtohome = new Button("Kembali Ke Halaman Utama");
        backtohome.setFont(Font.font("Algerian", 15));
        backtohome.setOnAction(e -> showScene1());

        VBox vbox = new VBox(tunggu, timer, backtohome);
        vbox.setSpacing(15);
        vbox.setAlignment(Pos.CENTER);
        Scene scene3 = new Scene(vbox, 500, 620);
        stage.setScene(scene3);

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
