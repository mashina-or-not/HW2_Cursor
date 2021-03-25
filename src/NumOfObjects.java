public class NumOfObjects {

    private static int countObjects;

    public NumOfObjects() {
        countObjects++;
    }

    public static int getCountObjects() {
        return countObjects;
    }
}