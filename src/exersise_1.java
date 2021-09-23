public class exersise_1 {
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
    /*  Banana
        It takes an Int Array called "a" and an int called Kiwi and multiply Kiwi with a together for each "a"
        So it starts with kiwi = 1 when a[0] and then it times the new kiwi value with a[1] and so on

        Grapefruit
        It takes an int array called "a" and checks if it's the same value is the int called "grape" and if it
        returns the number in the array where the values were the same else it returns -1 if none of the values
        in the array matches the value of the int "grape"

        Pineapple
        It takes an int array called "a" and an int called "apple" when it checks how many times apple is equal to the
        int array and ads 1 to an int called "pear" for each time the values are the same at the end it returns now value of
        the int "pear"
         */
}
