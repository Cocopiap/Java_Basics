/**
 * 强制转换可能会造成精度丢失或数据溢出
 * */

public class ForceConvertValueLoss {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 55555555555L;
        intVal = (int) longVal;
        System.out.println(intVal);
        System.out.println(longVal);

        float floatVal = 11.23f;
        double doubleVal = 134567672.2345345553455566558890;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);
        System.out.println(doubleVal);//精度缺失


        //数据溢出
        int intVal2 = 2000000000;
        System.out.println(intVal2 + intVal2);
    }
}
