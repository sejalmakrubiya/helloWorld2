import java.util.Scanner;

public class Homework {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);

        int a;
        int b;
        System.out.print("input the value for 'a' :");
        a=scanner.nextInt();
        System.out.print("input the value for 'b' : ");
        b=scanner.nextInt();
        System.out.print("Total of A and is = :"+(a+b));
        System.out.print("Write first name for");
        String name =scanner.next();
        System.out.print("my name is "+name);
    }
}
