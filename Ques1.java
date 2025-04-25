import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int num=0;
        for(int b=2;b<a;b++){
            if(a%b==0){
                num=num+1;
            }
        }
        if(num==0){
                System.out.println("Prime");
        }
        else{
                System.out.println("Not prime");
        }
    }
}
