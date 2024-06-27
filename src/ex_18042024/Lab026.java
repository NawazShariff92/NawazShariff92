package ex_18042024;

public class Lab026 {
    public static void main(String[] args) {
        String s="Nawaz"; //stored in the String pool
        String s1= new String("Shariff"); //will be stored in OA(object area)

        s.toLowerCase(); //This will not be assigned it will be just floating into the String pool
        s=s.toLowerCase(); // As this is been assigned so the o/p will be in lower case.
        System.out.println(s);

    }
}
