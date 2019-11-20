class TwoArrays {

    public static void main ( String[] args ) {
        int[] val = {13, -4, 82, 17};
        int[] twice;

        System.out.print("Original Array: ");
        for (int i : val) {
            System.out.print(i + " ");
        }

        twice = new int[val.length];
        
        for (int i = 0; i < val.length; i++) {
            twice[i] = val[i]*2;
        }

        System.out.print("New Array: ");
        for (int i : twice) {
            System.out.print(i + " ");
        }
    }
}
