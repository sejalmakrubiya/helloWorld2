import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;


import java.beans.beancontext.BeanContextServiceAvailableEvent;

import static jdk.nashorn.internal.runtime.PropertyDescriptor.DATA;

public class abc {




    //static or class variable,
    static  String  address1 = "9 park Road";
    static  String  address2 =  "Maruti Nagar";
    static  String  address3 =  "London";
    static  String  address4 =  "UB5 8RS";

    //static or class variable,
    static String phone= "+44 789 9999";


    //instance variables are inside class
    String sex;

    //constant variables
    static final String DOB = "01/05/1980";

    //static or class variables
    static String maritalStatus = "Married";

    //static or class variables
     static  String  qualification1 = "BCA";
     static  String  qualification2 =  "MCA";

    public static void main (String[] args){

        //local variables are inside the method.
        String firstName = "John";
        String lastName =   "Miller";
        System.out.println("Name\t\t\t:\t\t"+firstName+" "+lastName);


        //printing static variable's value.
        System.out.println("Address\t\t\t:\t\t"+address1);
        System.out.println("\t\t\t\t\t\t"+abc.address2);
        System.out.println("\t\t\t\t\t\t"+abc.address3);
        System.out.println("\t\t\t\t\t\t"+abc.address4);

        //local variable are inside method.
        String email = "abc@gmail.com";
        System.out.println("E-mail\t\t\t:\t\t"+email);

        //printing static variable's value

        System.out.println("Phone\t\t\t:\t\t"+phone);


        abc obj = new abc();
        obj.sex= "male";


        //instance variable assigning some value.

        System.out.println("sex\t\t\t\t:\t\t"+obj.sex);

        //Local variable
        String height = "5'1 ";
        System.out.println("Height\t\t\t:\t\t"+height);

        //Local variables
        String sex = "male";
        System.out.println("sex\t\t\t\t:\t\t"+sex);

        // constant variable print.
        System.out.println("DOB\t\t\t\t:\t\t"+DOB);


        //printing static variable's value
        System.out.println("Marital Status\t:\t\t"+maritalStatus);

        //printing static variable's value
        System.out.println("Qualification\t:\t\t"+qualification1);
        System.out.println("\t\t\t\t\t\t"+abc.qualification2);

        //Local variable
        String profession = "Q.A.";
        System.out.println("profession\t\t:\t\t"+profession);
    }
}


