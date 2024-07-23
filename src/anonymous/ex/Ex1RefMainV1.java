package anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {
    public static void hello(Process process) {
        System.out.println("시작");
        process.run();
        System.out.println("종료");
    }

    static class Dice implements Process {

        @Override
        public void run() {
            int value;
            value = new Random().nextInt(6)+1;
            System.out.println("주사위 = " + value);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {

        }
    }
    public static void main(String[] args) {
        Dice dice = new Dice();
        Sum sum = new Sum();
        hello(dice);
        hello(sum);
    }
}