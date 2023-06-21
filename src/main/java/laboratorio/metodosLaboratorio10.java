package laboratorio;

import java.util.List;

public class metodosLaboratorio10 {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int [][] array = new int[3][3];
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
        int resta = sumaDiagonal1-sumaDiagonal2;
        return Math.abs(resta);
    }

}
