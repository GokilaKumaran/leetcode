class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int totalUnits = 0;
        int boxesLoaded = 0;

        for (int[] boxType : boxTypes) {
            int numberOfBoxes = boxType[0];
            int unitsPerBox = boxType[1];

            // Number of boxes we can take of this type
            int boxesToTake = Math.min(numberOfBoxes, truckSize - boxesLoaded);

            totalUnits += boxesToTake * unitsPerBox;
            boxesLoaded += boxesToTake;

            // If truck is full, stop loading
            if (boxesLoaded == truckSize) {
                break;
            }
        }

        return totalUnits;

    }
}