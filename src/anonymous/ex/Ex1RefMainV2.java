package anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {
    public static void hello(Process process) {
        System.out.println("프로그램 사용");
        process.run();
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
        Process Dice = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);
            }
        };
        Process Sum = new Process() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);

                }
        }
    };
        hello(Sum);
        hello(Dice);
    }
}