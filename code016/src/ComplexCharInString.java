public class ComplexCharInString {
    public static void main(String[] args) {
        String contents = "a\tb\tcc\tdd\t"; //目录
        String contents1 = "a\tb\"\tcc\tdd\t";
        String contents2 = "a\tb\"\tcc\n\tdd\t";
        String align = "1111222233334444"; //对齐
        System.out.println(contents);
        System.out.println(contents1);
        System.out.println(contents2);
        System.out.println(align);
    }
}
