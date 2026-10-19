public class twoarray{
    public static void main(String[] args){
        int[][] arr;

        arr = new int[2][3];

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                arr[i][j] = 100;
                System.out.println("Element at position (" + i + ", " + j + "): " + arr[i][j]);
            }
        }
    }
}