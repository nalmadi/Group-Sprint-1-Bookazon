
import java.util.ArrayList;

public class Bookazon {

    private ArrayList<CartItem> items; 
    private ArrayList<User> users;

    public Bookazon() {
        items = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addCartItem(CartItem item) {
        items.add(item);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewBooks() {
        for (CartItem item : items) {
            item.printCartItemDetails();
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - Role: " + user.getSubscription());
        }
    }

    public void removeCartItem(CartItem item) {
        items.remove(item);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void updateRole(User user, String role) {
        user.setSubscription(role);
    }

    
    public static void main(String[] args) {
        
        Bookazon bookazon = new Bookazon();
        
        // create books
        bookazon.addCartItem(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, true));
        bookazon.addCartItem(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99, false));
        bookazon.addCartItem(new Book("1984", "George Orwell", 1949, 8.99, true));

        // create users
        bookazon.addUser(new User("Alice", "normal"));
        bookazon.addUser(new User("Bob", "gold"));

        // add books to cart
        bookazon.users.get(0).addToCart(bookazon.items.get(0), 1);
        bookazon.users.get(0).addToCart(bookazon.items.get(1), 2);

        // view cart
        bookazon.users.get(0).viewCart();

        // set shipping address and billing address
        // bookazon.users.get(0).setAddress("123 Main St", "", "Springfield", "IL", "62701", "USA");
        // bookazon.users.get(0).setBillingAddress("456 Elm St", "", "Springfield", "IL", "62702", "USA");

        // checkout
        bookazon.users.get(0).checkout();

        // view order details
        bookazon.users.get(0).viewOrders();
        
    }
}
