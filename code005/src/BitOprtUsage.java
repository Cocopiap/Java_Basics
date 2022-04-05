/**
 * mask:掩码
 * */
public class BitOprtUsage {
    public static void main(String[] args) {
        int base = 1; // base: 0000 0000 0000 0000 0000 0000 0000 0001
        int is_student_mask = base;
        int is_programmer_mask = base << 1; //0000 0000 0000 0000 0000 0000 0000 0010
        int is_driver_mask = base << 2; //0000 0000 0000 0000 0000 0000 0000 0100
        int is_painter_mask = base << 3; //0000 0000 0000 0000 0000 0000 0000 1000

        int data = 5; //data: 0000 0000 0000 0000 0000 0000 0000 0101

        boolean isStudent = (data & is_student_mask) != 0;
        System.out.println(isStudent);

        boolean isProgrammer = (data & is_programmer_mask) != 0;
        System.out.println(isProgrammer);

        boolean isDriver = (data & is_driver_mask) != 0;
        System.out.println(isDriver);

        boolean isPainter = (data & is_painter_mask) != 0;
        System.out.println(isPainter);
    }
}
