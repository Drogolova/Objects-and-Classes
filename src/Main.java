public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Leo", "Tolstoy");
        Author author2 = new Author("Fyodor", "Dostoevsky");
        Book book1 = new Book("War and peace", author1, 1870);
        Book book2 = new Book("Crime and punishment", author2, 1866);
        book1.setPublicationYear(1869);
    }
}