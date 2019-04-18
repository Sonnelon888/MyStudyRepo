

public final class HelloWorld {
    private static String greetings;

    public static String getGreetings(){
        return HelloWorld.greetings;
    }

    public static void setGreetings(String greetings){
        HelloWorld.greetings = greetings;
    }

    public static void printHelloWorld(){
        System.out.println(getGreetings());
    }
}
