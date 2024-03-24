public class TEST1_1 {
    public static void main(String[] args){
        for(int i=1;i<=13;i++){
            for(int j=1;j<=13;j++){
                if( i==1 |  i==13 | (i%2==1 && j%4==1) ){
                System.out.print("＊");
                }else{
                    System.out.print("　");
                }
            }
            System.out.println();
        }
    }
}