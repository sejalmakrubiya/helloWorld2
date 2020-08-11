import java.util.Scanner;

public class OperaterPractise {




    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the value for 'a' :  ");
        int a=scanner.nextInt();
        System.out.print("Enter the value for 'b':   ");
        int b=scanner.nextInt();
        System.out.print("Answer ="+(a+b));
        System.out.print("Answer ="+(a-b));
        System.out.print("Answer ="+(a*b));
        System.out.print("Answer ="+(a/b));
        System.out.print("Answer ="+((a+b)+(a-b)));
        System.out.print("Answer ="+(a>b));
        System.out.print("Answer ="+(a<b));



        //arithmetic operator
        a = 20;
        b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        //calculation using arithmetic operator
        System.out.println(a * b / a + b - a * b / a);

        //logical operator
        boolean u= true;
        boolean v= false;
        System.out.println(u||v);
        System.out.println(u&&v);
        System.out.println(!u);
        System.out.println(!(u||v));

        //relational operator
         int c=10;
         int d=10;
         int e='c';
         int f='e';
        System.out.println(c>=d);
        System.out.println(f<e);
        System.out.println(f>e);




        //assignment operator
        e = 20;
        f = 30;
        e+=4;
        System.out.println(e);
        f-=4;
        System.out.println(f);
        e/=f;
        e*=f;

        // ternary operator and conditional operators

        int g=10;
        int h=30;
        int i=0;

        System.out.println(g>h?true : false);



        String gh ="ghi";
        String ij= "ghi";
        System.out.println(g<h?g : h);
        System.out.println(gh.equalsIgnoreCase(ij)? g : h);
        int k= 46;
            i= 0;
        System.out.println(k>35? "pass" : "fail");

        System.out.println(k>35?"pass" :i>35?"pass": "fail");
        System.out.println(k<35?"fail" :i<35? "fail" :"pass");


        //bit wise operator &
        int o=20;
        int p=5;
        int q=10;
        System.out.println(o<p&o++<q);
        System.out.println(o);
        //bit wise operator |
        int r=20;
        int s=5;
        int t=10;
        System.out.println(r>s|r++<t);
        System.out.println(r);



        //increment & decrement operator
        int bc=1;
        int cd=3;
        int il;
        int j;
        k=++cd;
        j=cd++;

        System.out.println(bc);
        System.out.println(cd);
        System.out.println(k);
        System.out.println(j);
        System.out.println(cd/=bc);




    }



}


















































































































































































