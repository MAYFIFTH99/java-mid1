package immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMydate date1 = new ImmutableMydate(2024, 1, 1);
        ImmutableMydate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println();
        System.out.println("2025 -> " + date1);
        System.out.println();
        date1 = date1.setYear(2025);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

    }
}
