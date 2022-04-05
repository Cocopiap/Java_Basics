/**
 * 布尔值运算 或运算，与运算
 * */

public class BooleanOprt {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a & b);
        System.out.println(a || b);
        System.out.println(a | b);

        System.out.println(a || (10/0 > 1));/**||或运算知道a的值是真，不会再计算后面算式的值，自动优化了算法*/
        System.out.println(a | (10/0 > 1));/**|运算不会优化，依然会计算后面的算式，所以会报出0不可为分母的错误*/
    }
}
