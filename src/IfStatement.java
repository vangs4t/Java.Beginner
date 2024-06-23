public class IfStatement {
    public static void main(String[] args) {
        /**
         * If statement digunakan untuk mencari suatu kondisi yang sesuai
         */
        int nilai_audit = 80;
        int nilai_product = 70;

        if (nilai_audit >= 80 && nilai_product >= 80){
            System.out.println("Amat sangat baik");
        } else if (nilai_audit >= 70 && nilai_product >= 70){
            System.out.println("Baik");
        } else if (nilai_audit >= 60 && nilai_product >= 60){
            System.out.println("Cukup baik");
        } else {
            System.out.println("Cari pekerjaan lain");
        }
        // dalam if statement juga terdapat else statement dan juga else if statement
        // yang di gunakan jika kondisi yang di inginkan tidak terpenuhi
        // maka program akan mencari kondisi yang paling sesuai
    }
}
