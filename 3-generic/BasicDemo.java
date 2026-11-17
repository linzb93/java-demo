class BasicDemo {
    static class Box<T> {
        private T value;
        public T get() {
            return this.value;
        };
        public void set(T data) {
            this.value = data;
        };
    }
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.set("123");
        System.out.println(b.get());
    }
}