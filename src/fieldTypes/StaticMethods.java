package fieldTypes;

public class StaticMethods {

    public int num=10;

    public static int count =5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);

       // System.out.println("num = " + num);// non-static field I can not call num.
        System.out.println("count = " + count);

        //instanceMethod(); // non - static field we can not call it
    }

    public void instanceMethod(){
        System.out.println("instance method called");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("Hello from instance method");
    }

}
