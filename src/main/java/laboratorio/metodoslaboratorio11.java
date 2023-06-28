package laboratorio;

//Blanca, Daniela, Paula
public class metodoslaboratorio11 {


    public static long solve(int n, int m) {
        // Write your code here

        long result = (long)n*m-1;

        return result;
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
