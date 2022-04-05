/**
 * 一些数据类型的赋值与输出
 * */
public class PrimaryTypes {
    public static void main(String[] args){
        byte byteVar = 99;
        System.out.println(byteVar);

        short shortVar = -30000;
        System.out.println(shortVar);

        int intVar = 300000;
        System.out.println(intVar);

        long longVar = 99;
        long bigLongVar = 9999999999999L;
        System.out.println(bigLongVar);

        float floatVar = 100.1f;
        System.out.println(floatVar);

        double doubleVar = 100.1111;  /**精度更高，输出的小数位更多*/
        System.out.println(doubleVar);

        boolean condition = true;
        boolean fcondition = false;
        System.out.println(condition);

        char ch = 'A';
        System.out.println(ch);
    }
}
