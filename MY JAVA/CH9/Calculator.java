public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add( int[] a){
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public double add( double[] a){
        double sum = 0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}
