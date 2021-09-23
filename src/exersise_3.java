
public class exersise_3 {

    public static int indexOfMax (int[] a) {
        int currentLargestNum = 0;
        for (int values : a) {
            if (currentLargestNum < values) {
                currentLargestNum = values;
            }
        }
        return currentLargestNum;
    }
    public static void main(String[] args) {

        int[] largest = new int[4];

        largest[0] = 2;
        largest[1] = 2;
        largest[2] = 2;
        largest[3] = 5;

        System.out.println( indexOfMax(largest);
    }
}
