package laboratorio;

import java.util.ArrayList;
import java.util.Collections;
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
        return Math.abs(sumaDiagonal1-sumaDiagonal2); //valor absoluto
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
        System.out.println( String.format ("%.6f", (double)count/n));
        System.out.println( String.format ("%.6f", (double)count2/n));
        System.out.println( String.format ("%.6f", (double)count3/n));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int count =0;
        int mayor= 0;
        int n = candles.size();

        for(int i =0; i < n ; i++){
            int j = candles.get(i);
            if(j>=mayor){
                mayor = j;
            }
        }

        for(int i =0; i < n ; i++){
            int j = candles.get(i);
            if(j == mayor){
                count ++;
            }
        }
        return count;
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here

        List <Integer> resultadoFinal = new ArrayList<>();
        while(!arr.isEmpty()){
            resultadoFinal.add(arr.size());

            int stickMin = Collections.min(arr);

            List <Integer> sticks = new ArrayList<>();
            for(int stick :arr){
                int corte = stick - stickMin;
                if(corte>0){
                    sticks.add(corte);
                }
            }
            arr = sticks;

        }

        return resultadoFinal;
    }
    public static int gameWithCells(int n, int m){
        int packages=0;
        if (m%4 ==0 && n ==2) {
            packages = m / 4;
        } else if (m==n) {
            packages=m/n;
        } else if (n<m) {
            packages=n;
        }else if(m<n){
            packages=m;
        }else if (n%m==0&&m==2){
            packages=n/4;
        } else if (m==n && m%n==0) {
            packages= (m*n)/4;
        }
        return packages;
    }
}
