public interface EbookValidation extends MediaValidation {
    String getFormat();
    int getFileSize();

    default boolean isFormatValid() {
        String format = getFormat();
        return format != null && (format.equals("PDF") || format.equals("EPUB") || format.equals("MOBI"));
    }

    default boolean isFileSizeValid() {
        return getFileSize() > 0;
    }
}