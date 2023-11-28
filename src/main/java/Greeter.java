public class Greeter {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        MyLambda myLambdaFunction = () -> System.out.println("This is myLambdaFunction...");
        MyAdd myAddFunction = (int a, int b) -> a + b;
        Greeting greetingFunction = () -> System.out.println("This is greetingFunction...");
        greetingFunction.perform();

        Greeting innerClass = new Greeting() {
            @Override
            public void perform() {
                System.out.println("This is an inner class method...");
            }
        };
        innerClass.perform();

        greeter.greet(greetingFunction);
        greeter.greet(innerClass);
    }

    public void greet(Greeting greeting){
        greeting.perform();
    }
}

interface MyLambda {
    void foo();
}

interface MyAdd {
    int add(int a, int b);
}