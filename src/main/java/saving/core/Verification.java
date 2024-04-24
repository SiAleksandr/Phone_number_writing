package saving.core;

public interface Verification {
    public int explore (String elem, int controlCount);
    public default boolean isDigits(String dataStr) {
        Integer tempNum;
        try {
            tempNum = Integer.parseInt(dataStr);
            if (tempNum < 0) return false;
            else return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
