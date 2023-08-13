public class For {
    public static void main(String[] args) {

        for (int i = 100; i > 1; i--) {
            if (getMultiply(i) == 0) {
                System.out.println(i);
            }
        }
    }
    public static int getMultiply(int i) {
        return (int) (i % 4);
    }
}