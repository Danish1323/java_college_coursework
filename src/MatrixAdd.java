public class MatrixAdd{
    public static void main(String[] args){
        int[][] a = {
                {1,2,3},
                {4,5,6}
        };

        int[][] b = {
                {7,8,9},
                {10,11,12}
        };

        int rows = a.length;
        int cols = a[0].length;

        int[][] sum = new int[rows][cols];

        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum Matrix: ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                System.out.println(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}