public class hollow_rectangle {

    // Function to print a hollow rectangle
    // totRows = total number of rows
    // totCols = total number of columns
    public static void hollow_rectangle(int totRows, int totCols) {

        // ------ OUTER LOOP ------
        // This loop controls the number of ROWS (top to bottom)
        for (int i = 1; i <= totRows; i++) {

            // ------ INNER LOOP ------
            // This loop controls the number of COLUMNS (left to right)
            for (int j = 1; j <= totCols; j++) {

                // We are currently at cell (i , j)

                // ------ BOUNDARY CONDITION ------
                // Print star (*) only for border cells:
                // 1. First row      -> i == 1
                // 2. Last row       -> i == totRows
                // 3. First column   -> j == 1
                // 4. Last column    -> j == totCols
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } 
                // ------ INNER EMPTY SPACE ------
                // If not a boundary cell, print space
                else {
                    System.out.print(" ");
                }
            }

            // Move to the next line after finishing each row
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {


        // Function call
        hollow_rectangle(4, 5);
    }
}
