public class TipeDataNumber {
    public static void main(String[] args) {
        /**
         * Tipe data number di bagi menjadi 4 Yaitu
         * byte , short, int dan long
         */
        byte tipeByte = 100;
        short tipeShort = 1000;
        int tipeInt = 100000;
        long tipeLong = 1000000L;

        /**
         * Ada juga tipe data decimal number yaitu
         * float dan double
         * oh iya kalau mau bikin coma disini pake nya titik ya
         */

        float tipeFloat = 12.3f;
        System.out.println(tipeFloat);
        double tipeDouble = 33.2;
        System.out.println(tipeDouble);

        /**
         * Dan ada lagi tipe data yang berhubungan dengan Integer namun bukan integer
         */

        //Tipe data integer
        int hasil = 1000;
        System.out.println(hasil);
        // Tipe data Hexadecimal
        // biasanya digunakan untuk mencari suatu warna tertentu di java Color di awali dengan 0x
        int tipeHexadecimal = 0xffff;
        System.out.println(tipeHexadecimal);
        // Tipe data binnary
        //binnary itu sekumpulan angka 1 dan 0 pada suatu perhitungan komputer
        int tipeBinnary = 0b0001010;
        System.out.println(tipeBinnary);
    }
}
