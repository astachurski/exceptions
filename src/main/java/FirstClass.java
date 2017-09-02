public class FirstClass {

    private SecondClass secondClass;

    public FirstClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }

    public void callme() throws MyVerySeriousException {
        secondClass.callme();
        System.out.println("hello from FirstClass");

    }

    public void callme2() {
        secondClass.callme2();
        System.out.println("hello from FirstClass");
    }

    //unchecked exception!
    public void callme3() {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
