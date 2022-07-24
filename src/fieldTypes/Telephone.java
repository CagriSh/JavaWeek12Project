package fieldTypes;

public class Telephone {
/*
    Write the definition of a class Telephone.
The class has no constructors, one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92.
Create getNumber() and setNumber() methods that will manipulate with number instance variable.
     */

    public String number;

    public static int quantity;

    public static double total;

    static{
        quantity=250;
        total= 1568.92;
    }

    public void setNumber(String number){
        this.number=number;

    }

    public String getNumber(){
        return number;
    }

    public static void main(String[] args) {
        Telephone telephone=new Telephone();

        System.out.println(telephone.total);
        
        telephone.setNumber("555-4536768");

        System.out.println("telephone.getNumber() = " + telephone.getNumber());

        System.out.println("telephone.total = " + telephone.total);

    }
    
}

