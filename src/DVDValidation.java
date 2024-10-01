public interface DVDValidation extends MediaValidation {
    String getDirector();
    int getRuntime();

    default boolean isDirectorValid() {
        String director = getDirector();
        return director != null && !director.isEmpty();
    }

    default boolean isRuntimeValid() {
        return getRuntime() > 0;
    }
}