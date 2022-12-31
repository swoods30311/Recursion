public class RecursionTutorial {
    public static void main(String[] args) {
        sayHi(3);
    }

    private static void sayHi(int count){
        System.out.println("Say Whatz Happenin'");
        if (count < 0) {
            return;
        }
        sayHi(count - 1);
    }
}
