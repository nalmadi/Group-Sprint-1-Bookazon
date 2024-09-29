public interface ItemValidation {

    String getTitle();
    String getAuthor();
    double getPrice();
    int getYearPublished();

    default boolean isPriceValid() {
        return getPrice() > 0;
    }

    default boolean isTitleValid() {
        String title = getTitle();
        return title != null && !title.isEmpty();
    }

    default boolean isAuthorValid() {
        String author = getAuthor();
        return author != null && !author.isEmpty();
    }

    default boolean isYearPublishedValid() {
        return getYearPublished() > 0;
    }
}
