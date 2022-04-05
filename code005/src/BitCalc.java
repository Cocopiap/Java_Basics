public class BitCalc {
    public static void main(String[] args) {
        int a = 0xF8;//表示二进制的 1111 1000
        int b = 0xF4;//表示二进制的 1111 0100
        int c = 0xFF;//表示二进制的 1111 1111
        System.out.println(a & b);//得到的结果为 1111 0000
        System.out.println(a | b);//得到的结果为 1111 1100
        System.out.println(a ^ c);//得到的结果为 0000 0111

        System.out.println(~c);//将符号位 从正改为负，即0 --> 1
    }
}
