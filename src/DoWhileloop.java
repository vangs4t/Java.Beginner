public class DoWhileloop {
    /**
     * Do while Loop adalah program perulangan yang akan melakukan perulangan setidaknya sekali
     * setelah itu baru membaca kondisi nya
     */
    public static void main(String[] args) {
        int count = 13;
        do {
            System.out.println(count + " perhitungan");
            count++;
        } while (count <= 10);
        // dari outputnya aja kita bisa tau kalau do while loop akan selalu melakukan perulangan setidaknya sekali
        // sebelum membaca kondisi yang di tentukan
    }
}
