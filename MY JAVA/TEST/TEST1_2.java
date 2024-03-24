public class TEST1_2 {
    public static void main(String[] args){
        for(int i=1;i<=13;i++){
            for(int j=1;j<=13;j++){
                if( i==1 | i==13 | j==1 | j==13 | i==j | i+j==14 ){
                System.out.print("＊");
                }else{
                    System.out.print("　");
                }
            }
            System.out.println();
        }
    }
}

