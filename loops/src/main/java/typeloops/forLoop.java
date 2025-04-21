package typeloops;

public class forLoop {
    public static void main(String[] args) {
        String countdown = "";

        for (int counter = 10; counter >= 0; counter--){
                countdown = counter + "";
                System.out.println(countdown);
        }
        System.out.println("LAUNCH!!!");
    }
}
