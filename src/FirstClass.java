public class FirstClass {

    //static or class variable, this variables are outside method inside class with static key word.
    static int age=30;

    //constant variable outside methods and inside class with static,final word.
    static final String DOB="01/02/2000";

    //instance variables are inside class and out side methods without static word.
    String firstName;

    public static void main(String[] args){
        //Local variable are inside method.
        String lastName = "Makrubiya";
        System.out.println(lastName);

        FirstClass obj = new FirstClass();
        //instance variable null value.
        System.out.println(obj.firstName);

        //instance variable assigning some value.
        obj.firstName="sejal";
        System.out.println(obj.firstName);

        //printing static variable's value.
        System.out.println(age);
        System.out.println(FirstClass.age);
        age = 40;
        System.out.println(age);

        //constant variable print.
        System.out.println(DOB);

    }
}

