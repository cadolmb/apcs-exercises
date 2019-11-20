class ReverseOrder {

    public static void main(String[] args) {
        int[] val = {0, 1, 2, 3};
        int[] reverse = new int[val.length];

        System.out.println("Original Array: ");
        for (int i : val) { System.out.print(i + " "); }

        // set temp to reverse order of val
        int vi = val.length - 1; int ri = 0;
        while (vi >= 0) {
            reverse[ri] = val[vi];
            ri++; vi--;
        }

        System.out.println("\nReversed Array: ");
        for (int i : reverse) { System.out.print(i + " "); }
    }
}
