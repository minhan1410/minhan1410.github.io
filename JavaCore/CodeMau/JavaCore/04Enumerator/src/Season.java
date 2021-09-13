public enum Season {
    SPRING ("Xuân"), SUMMER ("Hè"), AUTUMN ("Thu"), WINTER ("Đông");

    private String values;

    Season(String values) {
        this.values = values;
    }

    public String getValues() {
        return values;
    }
}
