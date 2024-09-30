
import java.util.ArrayList;

public class Bookazon {

    private ArrayList<Media> products;
    private ArrayList<User> users;

    public Bookazon() {
        products = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addProduct(Media product) {
        products.add(product);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewProducts() {
        for (Media product : products) {
            product.printBookDetails();
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - Role: " + user.getSubscription());
        }
    }

    public void removeProduct(Media product) {
        products.remove(product);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void updateProductTitle(Media product, String newTitle){
        product.setTitle(newTitle);
    }


    public void updateProductPrice(Media product, double newPrice){
        product.setPrice(newPrice);
    }

    public void updateProductAuthor(Media product, String newAuthor){
        product.setAuthor(newAuthor);
    }

    public void updateProductYearPublished(Media product, int newYearPublished){
        product.setYearPublished(newYearPublished);
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

    public Media getProduct(int index){
        return products.get(index);
    }

    
    public static void main(String[] args) {
        
        Bookazon bookazon = new Bookazon();
        
        // create books
        bookazon.addProduct(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, true));
        bookazon.addProduct(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99, false));
        bookazon.addProduct(new Book("1984", "George Orwell", 1949, 8.99, true));
        bookazon.addProduct(new DVDs("Inception", "Christopher Nolan", 2010, 19.99, "Christopher Nolan", 148));
        bookazon.addProduct(new Ebook("1984", "George Orwell", 1949, 7.99, "EPUB", 2));

        bookazon.addUser(new User("Alice", new NormalSubscription(), new Cart()));
        bookazon.addUser(new User("Bob", new GoldSubscription(), new Cart()));

        // add books to cart
        bookazon.users.get(0).addToCart(bookazon.products.get(0), 1);
        bookazon.users.get(0).addToCart(bookazon.products.get(1), 2);

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
