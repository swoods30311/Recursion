public class RecursionTutorial {
    public static void main(String[] args) {
        sayHi();
    }

    private static void sayHi(){
        System.out.println("Say Whatz Happenin'");

        sayHi();
    }
}
