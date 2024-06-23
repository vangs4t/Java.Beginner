import java.util.Arrays;
import java.util.stream.Stream;

public class Methodse {
    /**
     * Method berfungsi untuk menjalankan program yang sudah di tulis di dalam block
     * method juga berguna untuk memudahkan kita memanggil program yang sudah kita tulis
     * komposisi method yaitu
     *
     */
    public static void main(String[] args) { //sebenarnya ini juga termasuk method
//        sayHello();
//        sayHello(); // setiap method di panggil maka program di dalam method akan selalu di jalankan dari awal
//        sayHello("Naufal","Namek"); //kalian bisa menambahkan index parameter setelah method di panggil
//        System.out.println(hasilTest(12)); // method ini akan mengembalikan nilai sesuai dengan operator yang di gunakan untuk mengembalikan nilainya
//        System.out.println(hasilRecursive(5));
        System.out.println(result("Naufal",20,44,25));
    }
    /**
     * Method void atau method yang tidak mengembalikan apapun
     */
    public static void sayHello(){
        System.out.println("hello everynya 1");
        System.out.println("hello everynya 2");
        System.out.println("hello everynya 3");
    }
    /**
     * Method juga bisa di tambahkan parameter dan bisa menambahkan sebanyak apapun parameter
     * yang kalian ingin kan
     * jika kalian ingin menambah parameter yang lebih dari satu kalian harus menambahkan "," sebagai pemisah
     * meskipun nama method nya sama, jika parameternya beda maka tidak apa2
     */
    public static void sayHello(String nama, String alamat){
        System.out.println("Hello " + nama + " " + "Apakah kamu berasal dari planet " + alamat + "?");
    }
    /**
     * Ada juga method yang mengembalikan sebuah nilai
     */
    public static int hasilTest(int testing){
        return testing;
    }
    /**
     * recursive method adalah kemampuan untuk memanggil method itu sendiri
     */
//    public static int result(int i){
//        return i >= 5 ? result(5) * (i++) : null; // ya ini adalah contoh jika membuat method recursive nya tidak hati2 bisa menyebabkan stack overflow
//    }
    public static int hasilRecursive(int integer){
        if (integer == 1) return 1;
        return hasilRecursive(integer - 1) * integer;
    }
    /**
     * terakhir yaitu method variable argument
     */
    public static String result(String nama, int... nilai){
        if (Arrays.stream(nilai).sum() > 70){
            return "Selamat Kamu lulus " + nama;
        } else {
            return "Coba lagi tahun depan " + nama;
        }
    }
}
