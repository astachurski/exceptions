public class ThirdClass {

    public void callme() throws MyVerySeriousException{
        System.out.println("hello from ThirdClass");
        throw new MyVerySeriousException("exception in ThirdClass!!!");
    };

    public void callme2() throws MyVerySeriousException{
        System.out.println("hello from ThirdClass");
        throw new MyVerySeriousException("exception in ThirdClass!!!");
    }

}
