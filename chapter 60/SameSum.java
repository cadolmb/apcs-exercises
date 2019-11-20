class SameSum {

    public static void main(String[] args) {
        int[] valA   = { 13, -22,  82,  17};
        int[] valB   = {  0,   0,   0,   0};

        for (int i = 0; i < valA.length; i++) {
            valB[i] = 25 - valA[i];
        }

        System.out.println("valA: ");
        for (int i : valA) { System.out.print(i + " "); }

        System.out.println("valB: ");
        for (int i : valB) { System.out.print(i + " "); }

        System.out.println("sum: ");
        for (int i = 0; i < valA.length; i++) { System.out.print(valA[i] + valB[i] + " "); }
    }
}
