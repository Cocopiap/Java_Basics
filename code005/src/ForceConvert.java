/**
 * 强制类型转换（高精度到低精度）
 * */

public class ForceConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 99999;
        intVal = (int) longVal;

        float floatVal = 11.32f;
        double doubleVal = 12.3234;
        floatVal = (float) doubleVal;

        int a = 65;
        char b = (char) a;
        System.out.println(b);
    }
}
