package nested.test;

public class Library {
    private Book[] books;
    private int count;
    public Library(int size) {
        books = new Book[size];
        count = 0;
    }
    public void showBooks() {
        System.out.println("--- 책 출력 ---");
        for (Book book : books) {
            System.out.println(book.getBookName() + book.getAuthor());
        }
    }
    public void addBook(String bookName, String author) {
        if (count < books.length) {
            books[count++] = new Book(bookName, author);
        } else {
            System.out.println("저장 공간 부족");
        }

    }

    public class Book {
        private String bookName;
        private String author;
        Book(String bookName, String author) {
            this.bookName = bookName;
            this.author = author;
        }

        public String getBookName() {
            return bookName;
        }

        public String getAuthor() {
            return author;
        }

    }
    }


