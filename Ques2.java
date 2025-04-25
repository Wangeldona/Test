import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        for (int i = 0; i <5; i++) {
            a=a*i + a;
            System.out.print(a);
        }
        
    }
}
