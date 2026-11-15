class InterfaceDemo {
     interface IPerson {
         void say(String content);
    }

     class Person implements IPerson {
        @Override
        public void say(String content) {
            System.out.println("I said: " + content);    
        }
    }
    public static void main(String[] args) {
        InterfaceDemo outer = new InterfaceDemo();
        Person p = outer.new Person();
        p.say("hello");
    }
}