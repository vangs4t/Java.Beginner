public class Array {
    public static void main(String[] args) {
        /**
         * Setiap larik atau bahasa java nya array
         * index pertama selalu di awali dengan 0, Ya gampangnya
         * kalau mencari index terbesar dari satu array kita tinggal mengurangi panjang array -1
         */
        String[] nama;
        nama = new String[3];
        nama[0] = "Naufal";
        nama[1] = "Abdul";
        nama[2] = "Basth";

        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.println(nama[2]);

        nama[0] = "Mamat";

        System.out.println(nama[0]);
        /**
         * Dan untuk membuat array juga banyak cara nya meskipun hasil nya tetap sama
         * gak ada salahnya di coba dlu
         */

        String[] result = new String[]{
                "Halo", "Nama","Saya"
        };

        // ada juga cara lainnya

        Integer[] angka = {
                1,2,3,4,5
        };

        System.out.println(angka[1]);
        // Maka hasil print out nya 2, karena array no 1 di isi dengan angka 2


    }
}
