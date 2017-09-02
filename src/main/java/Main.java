import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass(new SecondClass(new ThirdClass()));
        try {
            firstClass.callme();
        } catch (MyVerySeriousException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(" ------------- ");

        try {
            firstClass.callme2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        firstClass.callme3();

        System.out.println(" the last line");


    }


}
