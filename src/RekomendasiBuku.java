public class RekomendasiBuku {
    public static void main(String[] args) {

        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Database dengan Delphi7 Menggunakan ADO";
        buku1.pengarang = "Abdul Kadir";
        buku1.penerbit = "Andi";
        buku1.tahun = 2004;
        buku1.harga = 70000;
        buku1.cetakInfo();

        Buku buku2 = new Buku();
        buku2.judul = "Animasi Pendidikan Menggunakan Flash";
        buku2.pengarang = "Priyanto Hidayatullah";
        buku2.penerbit = "Informatika";
        buku2.tahun = 2011;
        buku2.harga = 50000;
        buku2.cetakInfo();

        Buku buku3 = new Buku();
        buku3.judul = "Menguasai Efek Khusus dengan Photoshop";
        buku3.pengarang = "Jubilee Enterprise";
        buku3.penerbit = "Elex Media Komputindo";
        buku3.tahun = 2015;
        buku3.harga = 30000;
        buku3.cetakInfo();
    }
}
