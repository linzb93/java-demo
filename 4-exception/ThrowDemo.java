class ThrowDemo {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Throwed");
        } catch(RuntimeException err) {
            System.out.println(err.getMessage());
        }
    }
}