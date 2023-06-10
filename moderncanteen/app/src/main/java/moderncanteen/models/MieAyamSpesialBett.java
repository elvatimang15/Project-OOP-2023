package moderncanteen.models;

public class MieAyamSpesialBett extends Makanan {

    @Override
    public String nama() {
       String nama = "Mie Ayam Spesial Bett";
       return nama;
    }

    @Override
    public String harga() {
        String harga = "(18k)";
        return harga;
    }
    
}
