public class AudioBooks extends Media implements AudioBookValidation{
    private double duration; // in minutes
    private String narrator;

    public AudioBooks(String title, String author, int yearPublished, double price, int stockCount, double duration, String narrator) {
        super(title, author, yearPublished, price, stockCount);
        this.duration = duration;
        this.narrator = narrator;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public void printProductDetails() {
        super.printProductDetails();
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Narrator: " + narrator);
    }
}
