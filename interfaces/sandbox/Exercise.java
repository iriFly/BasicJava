package interfaces.sandbox;

public class Exercise {

    public static void main(String[] args) {

        //111 = 2^0 + 2^1 + 2^2
        //int dec_value = 1*(2^2) + 1*(2^1) + 1*(2^0) = 7
        System.out.println(7>>1);

        // 0111 - 7
        // 0011 - 2 pow 0 plus 2 pow 1 1 plus 2 's gel'jk aan 3
        // 0111 >> 0011 >> 0001

        // 0111 << 1110 <<
        // = 1*(2^3) + 1*(2^2) + 1*(2^1) + 0*(2^0) = 14
        // = 8 + 4 + 2 + 0 = 14

        // 0000 0111 << 0000 1110 << 0001 1100
        // (0 maal 2 pow 0) + (0 maal 2 pow 1) + (1 maal 2 pow 2) + (1 maal 2 pow 3) + (1 maal 2 pow 4)
        // 0 + 0 + 2 + 4 + 8 + 16

        System.out.println(7>>2);
        System.out.println(7<<1);
        System.out.println(7<<2);

        System.out.println(7>>>1);
        System.out.println(7>>>4);
        System.out.println(7>>>16);
        System.out.println(7<<32);
    }

}
