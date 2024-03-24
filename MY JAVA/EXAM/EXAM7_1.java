public class EXAM7_1 { //i是直的 j是橫的
    public static void main(String[] args){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if(i>=j){
                System.out.print(j);
                }else{
                    System.out.print("　");
                }
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if(i>=j){
                System.out.print(i);
                }else{
                    System.out.print("　");
                }
            }
            System.out.println();
        }
        
        System.out.println();

        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if(i>=j){
                System.out.print(7-i);
                }else{
                    System.out.print("　");
                }
            }
            System.out.println();
        }
    }
}