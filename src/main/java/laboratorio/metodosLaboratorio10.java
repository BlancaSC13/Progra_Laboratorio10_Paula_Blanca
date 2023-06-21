package laboratorio;

import java.util.List;

public class metodosLaboratorio10 {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int [][] array = new int[arr.size()][arr.size()];
        int sumaDiagonal1=0;
        int sumaDiagonal2=0;
        for (int i = 0; i<array.length; i++){
            for (int j=0;j<array.length;j++){
                array[i][j]=arr.get(i).get(j);
            }
        }

        for (int i = 0; i < array.length; i++){
            sumaDiagonal1+=array[i][i];
        }

        int counter = 0;
        for (int i = array.length-1; i>=0; i--){
            sumaDiagonal2+=array[i][counter];
            counter++;
        }
        return Math.abs(sumaDiagonal1-sumaDiagonal2);
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int count =0;
        int count2 =0;
        int count3 =0;
        int n = arr.size();

        //porcentaje
        for(int i = 0; i<arr.size(); i++){

            if(arr.get(i)>0){
                count++;
            }else if(arr.get(i)<0){
                count2++;

            }else{
                count3++;

            }
        }
        System.out.println( (double)count/n);
        System.out.println( (double)count2/n);
        System.out.println( (double)count3/n);
    }

}
