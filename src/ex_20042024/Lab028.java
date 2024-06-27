package ex_20042024;

public class Lab028 {
    public static void main(String[] args) {
        String s1=new String("The Testing Academy"); // stored in OA(Object area)
        String s2=new String("The Testing Academy");

        System.out.println(s1==s2); // compares references
        System.out.println(s1.equals(s2)); // compares values
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
