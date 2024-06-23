public class OperasiBoolean {
    public static void main(String[] args) {
        /**
         * Operasi Boolean di gunakan untuk mencari kondisi paling memungkinkan yang akan di jalankan
         */
        // Operasi AND

        int nilai = 80;
        int absen = 75;

        boolean lulus = nilai >= 75 && absen >= 75;
        // outputnya akan false jika kondisi salah satunya ada yang false
        // jadi outputnya  akan selalu false kalau salah satu kondisinya tidak terpenuhi
        System.out.println(lulus);

        // Operasi OR

        String nilai_audit = "Baik";

        boolean hasil = nilai_audit.equals("Baik") || nilai_audit.equals("Cukup");
        // Dalam operasi or jika salah satunya memenuhi kondisi maka hasilnya akan selalu true
        System.out.println(hasil);
        // Jika dua kondisi nya false maka hasil nya juga akan false
        boolean hasil1 = nilai_audit.equals("Buruk") || nilai_audit.equals("Cukup Buruk");
        System.out.println(hasil1);

    }
}
