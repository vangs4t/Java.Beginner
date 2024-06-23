public class SwitchStatement {
    public static void main(String[] args) {
        /**
         * Secara garis besar switch statement memiliki fungsi yang sama dengan
         * if else namun lebih mudah untuk di jabarkan dan lebih simple
         */
        String nilai_audit = "Baik";
        // Jangan lupa tambahkan break setiap suatu kondisi terpenuhi
        // karena jika tidak di tambahkan break maka Program akan terus melanjutkan pada case selanjutnya
        switch (nilai_audit){
            case "Amat sangat baik" :
                System.out.println("Anda lulus training");
                break;
            case "Baik" :
                System.out.println("Anda lulus training perbaiki yang masih salah");
                break;
            case "Cukup" :
                System.out.println("Anda lulus training masih banyak yang harus di perbaiki");
                break;
            default:
                System.out.println("Silahkan coba lagi tahun depan");
        }

        /**
         * Di java 14 switch case menambah fitur lambda yang tentu dalam penulisan kode
         * nya akan lebih sedikit
         */

        switch (nilai_audit){
            case "Amat sangat baik" -> System.out.println("Anda lulus training");
            case "Baik" -> System.out.println("Anda lulus training perbaiki yang masih salah");
            case "Cukup" -> System.out.println("Anda lulus training masih banyak yang harus di perbaiki");
            default ->  System.out.println("Silahkan coba lagi tahun depan");
        }
    }
}
