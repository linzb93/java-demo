class LambdaDemo {
    interface Greeting {
        void sayHello(String name);
    }
    Greeting lambda = name -> System.out.println("Hello, " + name);
    public static void main(String[] args) {
        LambdaDemo outer = new LambdaDemo();
        outer.lambda.sayHello("Mike");
    }
}