import java.util.Scanner;

public class Triangle_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 1, b = 1, c = 1;
        while (a != 1000 || b != 1000 || c != 1000) {
            System.out.println("输入三角形三边:");
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();
            System.out.println(test(a, b, c));
        }
    }

    public static String test(float a, float b, float c) {
        String k = null;
        if (a > 0 && b < 101 && b > 0 && b < 101 && c > 0 && c < 101) {
            if (a + b > c && a + c > b && b + c > a) {
                if (a == b && b == c) {
                    k = "等边三角形";
                } else if (a == b || b == c || a == c) {
                    k = "等腰三角形";
                } else {
                    k = "一般三角形";
                }
            } else {
                k = "不构成三角形";
            }
        }
        return k;
    }
}
