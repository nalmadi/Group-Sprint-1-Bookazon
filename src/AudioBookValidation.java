public interface AudioBookValidation extends MediaValidation {
    double getDuration();
    String getNarrator();

    default boolean isDurationValid() {
        return getDuration() > 0;
    }

    default boolean isNarratorValid() {
        String narrator = getNarrator();
        return narrator != null && !narrator.isEmpty();
    }
}