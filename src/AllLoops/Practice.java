package AllLoops;
class Practice {
    public static Practice practice = null;

    private Practice() {
    }

    public static Practice getInstance() {
        if (practice == null) {
            return new Practice();
        } else {
            return practice;
        }
    }

    public void display() {
        System.out.println("Hello this is singleton class");
    }
}
class single{
    public static void main(String[] args) {
       // Practice p = new Practice();
       Practice p =  Practice.getInstance();
        p.display();
    }
}