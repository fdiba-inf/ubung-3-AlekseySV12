package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
        int count=0;
        for(int i=100;i<=1000;i++){
            if(i%30==0){
                System.out.print(i+" ");
                count++;
                if(count==10){
                    System.out.println();
                    count-=10;
                }
            }
        }
    }
}
