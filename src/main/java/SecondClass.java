public class SecondClass {

    private ThirdClass thirdClass;

    public SecondClass(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }

    public void callme() throws MyVerySeriousException{
        thirdClass.callme();
        System.out.println("hello from SecondClass");
    };

    public void callme2(){
        try {
            thirdClass.callme2();
        } catch (MyVerySeriousException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(1/0);
        System.out.println("hello from SecondClass");
    }


}
