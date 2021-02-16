package zh.codegym.task.task15.task1504;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        books.add(new MarkTwainBook("汤姆历险记"));
        books.add(new AgathaChristieBook("大侦探波洛"));
        System.out.println(books);
    }
    abstract static class Book {
        private String author;
        public Book(String author) {
            this.author = author;
        }
        public abstract Book getBook();
        public abstract String getTitle();
        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " 是侦探";
            String markTwainOutput = getBook().getTitle() + " 的作者是：" + author;
            if (author == "Mark Twain") {
                return markTwainOutput;
            } else {
                return agathaChristieOutput;
            }

        }
        public String toString() {
            return getOutputByBookType();
        }
    }


    public static class MarkTwainBook extends Book{
        String title;
        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }
        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static class AgathaChristieBook extends Book{
        private String title;
        public AgathaChristieBook(String title){
            super("Agatha Christie");
            this.title = title;
        }
        @Override
        public AgathaChristieBook getBook() {
            return this;
        }
        @Override
        public String getTitle() {
            return this.title;
        }
    }

}
