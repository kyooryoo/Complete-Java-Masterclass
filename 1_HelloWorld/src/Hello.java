public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        // some basic data types
        int x1 = 2_147_483_647;
        byte x2 = -128;
        short x3 = 32767;
        long x4 = 9_223_372_036_854_775_807L;
        float x5 = 5f; // 4 bytes
        // default, 8 bytes, faster to compute, more commonly used
        double x6 = 3.141_592_7d;
        char y1 = 'A';
        // use unicode-table.com to find special chars
        char y2 = '\u00A9'; // copy right mark
        System.out.println(y2);
        String y3 = "Hello";
        System.out.println(y3 + ", World! Again!");
        boolean y4 = false; // 1 or 0 is not allowed

        // some basic operators
        double input = 10d;
        System.out.println(input + 3);
        System.out.println(input - 3);
        System.out.println(input * 3);
        System.out.println(input / 3);
        System.out.println(input % 3);
        System.out.println(input++); // similar with --
        System.out.println(++input); // similar with --
        System.out.println(input += 3); // similar with -*/%
        System.out.println(input == 10); // similar with >,<,<=,>=,!=
        System.out.println(true && false); // similar with ||
        // check oracle official doc for java operators list
        // check java operator precedence table online

    }
}
