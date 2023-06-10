package moderncanteen.models;

public class NasiCampurTelurSejahtera extends Makanan {

    @Override
    public String nama() {
        String nama = "Nasi Campur Telur Sejahtera";
        return nama;
    }

    @Override
    public String harga() {
        String harga = "(15k)";
        return harga;
    }
    
}