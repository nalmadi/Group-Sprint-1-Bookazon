public class DVDs extends Media {
    private String director;
    private int runtime; // in minutes

    public DVDs(String title, String author, int yearPublished, double price, String director, int runtime) {
        super(title, author, yearPublished, price);
        this.director = director;
        this.runtime = runtime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public void printProductDetails() {
        super.printProductDetails();
        System.out.println("Director: " + director);
        System.out.println("Runtime: " + runtime + " minutes");
    }
}
