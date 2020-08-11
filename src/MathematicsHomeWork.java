import sun.java2d.pipe.SpanShapeRenderer;

import java.util.Scanner;

public class MathematicsHomeWork {
    //return type with parameter
    public int addition(int a, int b) {
        return a + b;
    }

    //no return type with no parameter
    public static void subtract() {
        short a = 50;
        short b = 20;

        System.out.println("Subtract\t=\t" + (a - b));
    }
     //return type with No parameter
     public double multiply (){
        double b = 66.3;
        double a = 6.8;
        double c = b*a;
        return  c; }

      //No Return type with parameter
    public void divide (float a , float b){
        System.out.println("Divide ="+(a/b));
    }







    public String myName(String FirstName, String LastName) {
        return FirstName + LastName;
    }

    public String myName() {
        String FirstName = "Sejal";
        String LastName = " Makrubiya";
        String FullName = FirstName + LastName;
        return FullName;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);System.out.print("Enter the value for 'a':  ");
        double a= scanner.nextInt();
        System.out.print("Enter the value for 'b':   ");
        double b=scanner.nextInt();
        System.out.print("Answer ="+(a+b));
        System.out.print("Answer ="+(a-b));
        System.out.print("Anawer ="+(a*b));
        System.out.print("Answer ="+(a/b));
        System.out.print("Answer ="+((a+b)+(a-b)));

        MathematicsHomeWork sejal = new MathematicsHomeWork();
        System.out.println("calculation\t\t =" + "\t\t" + sejal.addition(50, 50));
        System.out.println(sejal.myName("My Name is\t" + "Sejal", " Makrubiya"));
        subtract();
        System.out.println("Multiply\t=\t"+sejal.multiply());
        sejal.divide(78,8);

    }


}


























