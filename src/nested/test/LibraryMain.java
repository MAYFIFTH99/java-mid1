package nested.test;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(4);
        library.addBook("책1", "저자1");
        library.addBook("책2", "저자2");
        library.addBook("책3", "저자3");
        library.addBook("자바", "영한");
        library.addBook("스프링", "잡스");

        library.showBooks();
    }
}
