import javafx.beans.binding.Bindings;

public class MethodHomeWork {





 //1.hours and minutes convert in to seconds
  public int convert
  (int a, int b) {
   return a;}





//2.Minutes convert in to seconds
public int convert
(int a){
 return a;}



//3. perimeter of a rectangle
public int findperimeter
(int a, int b)
{return a+ b;}


//4. Area of the triangle
    public int triarea1()
    {int a=3;
     int b=2;
     int c= (a*b/2);
     return c;}
     public int triarea2()
     {int a=7;
     int  b=4;
     int  c=(a*b)/2;
     return c ;}
     public int triarea3()
     {int a=10;
      int b=10;
      int c=(a*b/2);
      return c;}


 //5.finding remainder
 public int remainder
 (int a, int b)
 {return a%b;}


 //6.finding maximum range of triangle's third edge
    public int maximumrange
    (int a ,int b)
    {return (a+ b)-1;}


  //7.printing last name in first and first name in last format
  public String format
  (String a,String b)
  {return b+a;}


  //8.printing number as argument and increment the number by +1
    public int argument()
    {int a = 0;
     int  b = +1;
     int c = a+b;
     return  c;}
     public int argument1()
     {int a = 9;
     int  b = +1;
     int  c = a+b;
     return c;}
     public int argument2()
     {int a = -3;
     int  b =  +1;
     int  c =  a+b;
     return c ;}







    //10. Returns a greeting
    public String helloName()
    {String a= "gerald!\"";
     String b= "\"Hello";
     String c=  b+a;
     return c; }
     public String helloName1(){
        String a= " Tiffany!\"";
        String b= "\"Hello";
        String c= b+a;
       return c; }
       public String helloName2(){
        String a=" Ed!\"";
        String b="\"Hello";
        String c=b+a;
        return c;}


       //11, Create asc11 value of
       public char asc (char a){
        return a;}

       //12.Boolean
       public boolean reversea
       (int a, int b){
        return a>b;}

    public static void main(String[] args) {

        MethodHomeWork obj = new MethodHomeWork();


        System.out.println("1.1 ="+obj.convert(1*(3600),3*(60) ));
        System.out.println("1.2 ="+obj.convert(2*(3600),0*(60) ));
        System.out.println("1.3 ="+obj.convert(0*(3600),0*(60) ));
        
        System.out.println("2.1 ="+obj.convert(5*(60))  );
        System.out.println("2.2 ="+obj.convert(3*(60))  );
        System.out.println("2.3 ="+obj.convert(2*(60))  );

        System.out.println("3.1 ="+obj.findperimeter(6*(2),7*(2)  ));
        System.out.println("3.2 ="+obj.findperimeter(20*(2),10*(2)));
        System.out.println("3.3 ="+obj.findperimeter(2*(2),9*(2)  ));

        System.out.println("4.1 ="+obj.triarea1());
        System.out.println("4.2 ="+obj.triarea2());
        System.out.println("4.3 ="+obj.triarea3());

        System.out.println("5.1 ="+obj.remainder(1,3) );
        System.out.println("5.2 ="+obj.remainder(3,4) );
        System.out.println("5.3 ="+obj.remainder(-9,45));
        System.out.println("5.4 ="+obj.remainder(5,5)  );

        System.out.println("6.1 ="+obj.maximumrange(8,10));
        System.out.println("6.2 ="+obj.maximumrange(5,7));
        System.out.println("6.3 ="+obj.maximumrange(9,2));

        System.out.println("7.1 ="+obj.format("First\"","\"Last,"));
        System.out.println("7.2 ="+obj.format("John\"","\"Doe,"  ));
        System.out.println("7.3 ="+obj.format("Mary\"","\"jane"  ));

        System.out.println("8.1 ="+obj.argument());
        System.out.println("8.2 ="+obj.argument1());
        System.out.println("8.3 ="+obj.argument2());

        //9.String length
        String s1 ="Apple";
        String s2 ="make";
        String s3 ="a";
        String s4 ="";


        System.out.println("9.1 Length of Apple ="+s1.length());
        System.out.println("9.2 Length of make  ="+s2.length());
        System.out.println("9.3 Length of A ="+s3.length());
        System.out.println("9.4 Length of \"\" ="+s4.length());

        System.out.println("10.1 ="+obj.helloName());
        System.out.println("10.2 ="+obj.helloName1());
        System.out.println("10.3 ="+obj.helloName2());

        System.out.println(obj.asc('A'));

        System.out.println("12.1 ="+obj.reversea(40,60));
        System.out.println("12.2 ="+obj.reversea(60,40));



    }

















}



