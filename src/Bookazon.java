
import java.util.ArrayList;

public class Bookazon {

    private ArrayList<Media> mediaList;
    private ArrayList<User> users;

    public Bookazon() {
        mediaList = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Media media) {
        mediaList.add(media);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewMediaList() {
        for (Media media : mediaList) {
            media.printDetails();
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - Role: " + user.getSubscription());
        }
    }

    public void removeMedia(Media media) {
        mediaList.remove(media);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void updateBookDetails(Book book, String newTitle, String newAuthor, int newYearPublished, double newPrice, boolean isPaperback) {
        book.setTitle(newTitle);
        book.setAuthor(newAuthor);
        book.setYearPublished(newYearPublished);
        book.setPrice(newPrice);
        book.setPaperback(isPaperback);
    }

    public void updateRole(User user, String role) {
        user.setSubscription(role);
    }

    
    public static void main(String[] args) {
        
        Bookazon bookazon = new Bookazon();
        
        // create books
        bookazon.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, true));
        bookazon.addBook(new EBook("To Kill a Mockingbird", "Harper Lee", 1960, 7.99));
        bookazon.addBook(new Audiobook("1984", "George Orwell", 1949, 8.99));

        // create users
        bookazon.addUser(new User("Alice", "normal"));
        bookazon.addUser(new User("Bob", "gold"));

        // add books to cart
        bookazon.users.get(0).addToCart(bookazon.mediaList.get(0), 1);
        bookazon.users.get(0).addToCart(bookazon.mediaList.get(1), 2);

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
