import javax.xml.crypto.Data;

public class DataType {
//Return type with parameter
    public int returnTypeWithparameter(int a, int b){

        return a+b;
    }
 //No return type with no parameter
   public static void noReturnTypeNoparameter() {
        int b=10;
        int a =20;
       System.out.println("No return type no parameter =\t" +(b+a));
    }

  //Return type with No parameter
  public int returnTypeWithNoparameter(){
        int b =1;
        int a =2;
        int c = b+a;
        return c;
    }
    //No return type with parameter
    public  void noReturnTypewithparameter(int a, int b){
        System.out.println("No Return type with parameter = "+(a+b));
    }
    public  String myName(String a){
        return a;
    }

    public static void main (String[]args){
        DataType prakash = new DataType();
        noReturnTypeNoparameter();
        System.out.println(
                "return type with parameter =" + prakash.returnTypeWithparameter(10,20));

        System.out.println("Return type with no parameter="+prakash.returnTypeWithNoparameter());
        prakash.noReturnTypewithparameter(10,20);
        System.out.println(prakash.myName("my Name method"));
    }





























    }