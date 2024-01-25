public class Library {
    public static void main(String[] args) {
        // Создаем двух авторов
        Author author1 = new Author();
        author1.setFirstName("John");
        author1.setLastName("Doe");

        Author author2 = new Author();
        author2.setFirstName("Jane");
        author2.setLastName("Smith");

        // Создаем две книги
        Book book1 = new Book();
        book1.setName("Book One");
        book1.setPublicationYear(2000);
        book1.setAuthor(author1);

        Book book2 = new Book();
        book2.setName("Book Two");
        book2.setPublicationYear(2010);
        book2.setAuthor(author2);

        // Вывод информации о книгах до изменения года публикации
        System.out.println(book1);
        System.out.println(book2);

        // Изменение года публикации одной из книг
        book1.setPublicationYear(2022);

        // Вывод информации о книгах после изменения года публикации
        System.out.println(book1);
        System.out.println(book2);
    }
}
