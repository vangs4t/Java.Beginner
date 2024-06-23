public class ForLoopStatement {
    public static void main(String[] args) {
        /**
         * Di java juga di sediakan fitur untuk perulangan yaitu fitur for loop
         * looping sangat berguna dan akan sering di pakai di semua cabang aplikasi
         * komposisi For loop
         * for (values : kondisi : statement)
         */
        int i = 1;
        //Contoh for loop nonstop
//        for (;;){
//            System.out.println("Invinity");
//        }
        //Sekarang kita tambahkan kondisi
        for (;i <= 10;){
            System.out.println("Invinity" + i);
            // Loopingan akan terhenti karena kondisi nya jika i <= 10
            // maka i tidak akan di tambahkan lagi
            i++;
        }
        // kita juga bisa memindahkan values ke dalam for loopnya dan juga statement nya
        for (int j = 0; j <= 10; j++) {
            System.out.println(j + " perulangan");
        }
    }
}
