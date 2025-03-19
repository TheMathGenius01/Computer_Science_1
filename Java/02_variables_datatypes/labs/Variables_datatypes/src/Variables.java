public class Variables {
    public static byte aByte = 127;
    public static short aShort = -30121;
    public static int anInt = 90877;
    public static long aLong = 999999999999999L;
    public static float aFloat = 38.567799F;
    public static double aDouble = 923.234;
    public static char aChar = 'A';
    public static boolean aBoolean = true;
    public static void main(String[] args) {
        System.out.printf(
                "////////////////////////////////////////////////////////////////// \n" +
                "* Parth Zanwar                                          01/17/24 * \n" +
                "*                                                                * \n" +
                "* Integer types                                                  * \n" +
                "*                                                                * \n" +
                "* 8 bit - byte = -128 to 127                                     * \n" +
                "* 16 bit - short = -32768 to 32767                               * \n" +
                "* 32 bit - int = -2147483648 to 2147483647                       * \n" +
                "* 64 bit - long = -9223372036854775808 to 9223372036854775807    * \n" +
                "*                                                                * \n" +
                "* Real types                                                     * \n" +
                "*                                                                * \n" +
                "* 32 bit - float = 1.401298e-45 to 3.402823e+38                  * \n" +
                "* 64 bit - double = 4.900000e-324 to 1.797693e+308               * \n" +
                "*                                                                * \n" +
                "* Character type                                                 * \n" +
                "*                                                                * \n" +
                "* 16 bit - char = 0 to 65535                                     * \n" +
                "*                                                                * \n" +
                "* Boolean type                                                   * \n" +
                "*                                                                * \n" +
                "* 8 bit(typically) - boolean = false to true                     * \n" +
                "*                                                                * \n" +
                "* Variables of each type                                         * \n" +
                "* Byte variable: %d                                             * \n" +
                "* Short variable: %d                                         * \n" +
                "* Integer variable: %d                                        * \n" +
                "* Long variable: %d                                 * \n" +
                "* Float variable: %f                                      * \n" +
                "* Double variable: %f                                    * \n" +
                "* Character variable: %c                                          * \n" +
                "* Boolean variable: %b                                         * \n" +
                "*                                                                * \n" +
                "////////////////////////////////////////////////////////////////// ", aByte, aShort, anInt, aLong, aFloat, aDouble, aChar, aBoolean);
    }

}
