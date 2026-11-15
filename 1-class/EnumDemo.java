class EnumDemo {
    public enum Gender {
        MALE, FEMALE;
        public String name;
    }
    public void judge(Gender ge) {
        switch (ge) {
            case MALE -> System.err.println("This is Male");
            case FEMALE -> System.err.println("This is FeMale");
            default -> {
            }
        }
    }
    public static void main(String args[]) {
        EnumDemo outer = new EnumDemo();
        outer.judge(Gender.MALE);
    }
}