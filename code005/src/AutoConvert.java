/**
 * 自动数据类型的转换（低精度到高精度）
 * */

public class AutoConvert {
    public static void main(String[] args) {
        char ch = 'A';
        int chNum = ch;
        int chNumCalc = ch + 10;
        System.out.println(chNum);
        System.out.println(chNumCalc);
    }
}
