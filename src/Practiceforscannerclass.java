import javax.naming.Name;
import java.util.Scanner;//import the scanner class

public class Practiceforscannerclass {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String userName;

        //System.out.println("username is: " + userName);

       // int a;

       // Scanner scanner=new Scanner(System.in);
       // System.out.println("input the value for'a': ");
        scanner.next();
        int b;
        System.out.println("input the value for'b' : ");
        b=scanner.nextInt();


       System.out.println(("Enter my name"));
        String name = scanner.nextLine();
        System.out.println("My name is:"+ name);
        String str ="";
         int i=0;
        Scanner Scanner=new Scanner(System.in);
        str =scanner.nextLine();
        System.out.println("Hello"+ str);
        i=scanner.nextInt();
        System.out.println("I is "+i);





    }
}
