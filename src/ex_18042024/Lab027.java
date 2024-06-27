package ex_18042024;

public class Lab027 {
    public static void main(String[] args) {
        String name = "The Testing Academy";
        String name1 = "The Testing Academy";
        String name2= new String("The Testing Academy");

        System.out.println(name == name1); //check the references
        System.out.println(name.equals(name1)); //check the values
    }
}
