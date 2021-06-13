public enum ClassLevel {
  LEVEL10(10), LEVEL11(11), LEVEL12(12);

  private final int value;

  ClassLevel(final int newValue) {
    value = newValue;
  }

  public int getValue() {
    return value;
  }
}
