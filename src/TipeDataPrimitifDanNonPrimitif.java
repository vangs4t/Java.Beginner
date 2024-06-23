public class TipeDataPrimitifDanNonPrimitif {
    public static void main(String[] args) {
        /**
         * Tipe data primitif dan non primitif
         * nah pada tipe data primitif yaitu tipe data yang tidak memiliki method lanjutan
         * sedang kan tipe data non primitif yaitu tipe data turunan dari Object
         */
        byte tipeBytePrimitif = 100;
        Byte tipeByteNonPrimitif = 100;
        /**
         * Kita juga bisa melakukan konversi dari berbagai macam tipe data number
         */

        byte tipeByte = 100;
        short tipeShort = tipeByte;
        int tipeInt = tipeShort;
        long tipeLong = tipeInt;
        float tipeFloat = tipeLong;
        double tipeDouble = tipeFloat;

        System.out.println(tipeDouble);
        /**
         * Sebenarnya secara garis besar tipe data primitif dan non primitif sama saja fungsi nya
         * tapi mari kita coba dlu
         */

        Byte bytes = 100;
        Short shorts = bytes.shortValue();
        Integer integer = shorts.intValue();
        Long longs = integer.longValue();
        Float floats = longs.floatValue();
        Double doubles = floats.doubleValue();

        System.out.println(doubles);

    }
}
