
public class Index{
    public static void main(String[] args){
        int score = 55;
        int count = 0;
        while(score<60){
          ++score;
          ++count;
        }
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        System.out.println(score);
        System.out.println(count);        
    }   
}
