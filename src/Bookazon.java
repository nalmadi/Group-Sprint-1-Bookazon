
import java.util.ArrayList;

public class Bookazon {

    private ArrayList<Media> books;
    private ArrayList<User> users;

    public Bookazon() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Media book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewBooks() {
        for (Media book : books) {
            book.printBookDetails();
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - Role: " + user.getSubscription());
        }
    }

    public void removeBook(Media book) {
        books.remove(book);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void updateBookTitle(Media book, String newTitle){
        book.setTitle(newTitle);
    }


    public void updateBookPrice(Media book, double newPrice){
        book.setPrice(newPrice);
    }

    public void updateBookAuthor(Media book, String newAuthor){
        book.setAuthor(newAuthor);
    }

    public void updateBookYearPublished(Media book, int newYearPublished){
        book.setYearPublished(newYearPublished);
    }

    // this only work for the Book class not other subclass of media class
    // needs further changes
    /* 
    public void updateBookIsPaperback(Media book, boolean isPaperback){
        book.setPaperback(isPaperback);
    }
    */

    public void updateRole(User user, Subscription role) {
        user.setSubscription(role);
    }

    public User getUser(int index){
        return users.get(index);
    }

    public Media getBook(int index){
        return books.get(index);
    }

    
    public static void main(String[] args) {
        
        Bookazon bookazon = new Bookazon();
        
        // create books
        bookazon.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, true));
        bookazon.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99, false));
        bookazon.addBook(new Book("1984", "George Orwell", 1949, 8.99, true));
        bookazon.addBook(new DVDs("Inception", "Christopher Nolan", 2010, 19.99, "Christopher Nolan", 148));
        bookazon.addBook(new Ebook("1984", "George Orwell", 1949, 7.99, "EPUB", 2));

        bookazon.addUser(new User("Alice", new NormalSubscription(), new Cart()));
        bookazon.addUser(new User("Bob", new GoldSubscription(), new Cart()));

        // add books to cart
        bookazon.users.get(0).addToCart(bookazon.books.get(0), 1);
        bookazon.users.get(0).addToCart(bookazon.books.get(1), 2);

        // view cart
        bookazon.users.get(0).viewCart();

        // set shipping address and billing address
        bookazon.users.get(0).setShippingAddress(new Address("123 Main St", "", "Springfield", "IL", "62701", "USA"));
        bookazon.users.get(0).setBillingAddress(new Address("456 Elm St", "", "Springfield", "IL", "62702", "USA"));

        // checkout
        bookazon.users.get(0).checkout();

        // view order details
        bookazon.users.get(0).viewOrders();
        
    }
}
