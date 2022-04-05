/**variable-变量*
 * int表示整数的范围是-2^31~2^31-1
 * 一对{}就是一个代码块
 */

public class variable {
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        int c = 7;

        int x = 9;
        int y = a*x + b*x*x + c*x*x*x;
        System.out.println(y);
    }
}
