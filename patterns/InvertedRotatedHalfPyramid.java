public class InvertedRotatedHalfPyramid {

    public static void invertedRotatedHalfPyramid(int totRows, int totCols){

        for(int i = 1; i <= totRows; i++){

            // print spaces
            for(int j = 1; j <= totCols - i; j++){
                System.out.print(" ");
            }

            // print stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedRotatedHalfPyramid(4, 4);
    }
}
