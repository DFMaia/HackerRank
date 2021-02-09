import java.util.Scanner;

public class J_JavaStaticInitializerBlock {

    static Scanner sc = new Scanner(System.in);

    static int B;
    static int H;
    static boolean flag = true;;

    static {
        B = sc.nextInt();
        H = sc.nextInt();

        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}
