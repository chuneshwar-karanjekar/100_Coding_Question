package patternPuzzule;

public class AllPatternPuzzule {
    public static void main(String[] args) {
        SquarefillPattern();
        System.out.println();
        RightHalfPyramidPattern();
        System.out.println();
        ReverseRightHalfPyramidPattern();
        System.out.println();
//        LeftHalfPyramidPattern();
        System.out.println();
        PyramidStarPattern(7);
        System.out.println();
        ReversePyramidStarPattern();
        System.out.println();
    }


    public static void SquarefillPattern() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

        public static void RightHalfPyramidPattern() {
            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }


        public static void ReverseRightHalfPyramidPattern () {
            for (int row = 5; row >= 1; row--) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        public static void LeftHalfPyramidPattern(){
            for (int row = 1; row <= 5; row++) {
                System.out.println(" ");
            }
        }
        public static  void PyramidStarPattern(int n){
            for (int row = 0; row < n; row++) {
                //space
                for (int col = 0; col < n-row-1; col++) {
                    System.out.print(" ");
                }
                //star
                for (int col = 0; col < 2*row+1; col++) {
                    System.out.print("*");
                }
                //star
                for (int col = 0; col < n-row-1; col++) {
                    System.out.print(" ");
                }
                System.out.println(" ");

            }
    }
    public static void ReversePyramidStarPattern() {
        for (int i = 7; i >= 1; i--) {
            for (int j = i; j < 7; j++)
                System.out.print(" ");

            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println("");
        }

    }
}
