public class colMajorTest {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 4, 77, 3, 5, 6, 7, 7},
            {5, 6, 7, 33},
            {8, 2, 3, 4, 2, 1},
            {4, 5}
        };

        // Determine the maximum number of columns
        int maxColumns = 0;
        for (int i = 0; i < arr.length; i++) {
            maxColumns = Math.max(maxColumns, arr[i].length);
        }

        // Traverse the array column by column
        for (int col = 0; col < maxColumns; col++) {
            for (int row = 0; row < arr.length; row++) {
                // Check if the current row has enough columns
                if (col < arr[row].length) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}
