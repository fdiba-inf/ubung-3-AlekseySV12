package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
        int count=0;
        for(int i=100;i<=1000;i++){
            if(i%30==0){
              if(count<9){
              count++;
              System.out.print(i+" ");
              }
              else if(count==9){
              count++;
              System.out.print(i);
              }
              
              if(count==10){
                    System.out.print("\n");
                    count=0;
                }
            }
        }
    }
}
