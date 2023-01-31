public class Main {
    public static void main(String[] args) {
        AuthorBookTester test = new AuthorBookTester();
        test.testAuthorConstructorEmail();
        test.testAuthorConstructorGender();
        test.testAuthorConstructorName();
        test.testAuthorSetEmail();
        test.testAuthorToString();
        test.testBookConstructorAuthor();
        test.testBookConstructorName();
        test.testBookConstructorPrice();
        test.testBookConstructorQuantity();
        test.testBookGetAuthor();
        test.testBookGetName();
        test.testBookGetPrice();
        test.testBookGetQty();
        test.testBookSetPrice();
        test.testBookSetQty();
        test.testBookToString();
    }
}