package anonymous.ex;
import nested.local.Printer;

public class AnnoymousOuter {
    private int outInstanceVar = 3;
    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnnoymousOuter main = new AnnoymousOuter();
        main.process(2);

    }
}
