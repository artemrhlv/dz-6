public class Main {
    public static void main(String[] args) {

        int[] numberarray = new int [] {8,2,3,4,5,6,7};
        int sum = 0;

        for (int i : numberarray) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

    }
}