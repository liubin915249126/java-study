import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectinsTest {

    // Integer排序
    public void sort1(){
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        Integer k;
        for(int i=0;i<10;i++){
            do {
                k = random.nextInt(100);
            }while(integerList.contains(k));
            integerList.add(k);
        }
        for(Integer it:integerList){
            System.out.println(it);
        }
        System.out.println("------------------");

        Collections.sort(integerList); // 排序

        for(Integer it:integerList){
            System.out.println(it);
        }
    }
    // String  排序
    public void sort2(){
        List<String> sl = new ArrayList<String>();
        sl.add("222");
        sl.add("111");
        sl.add("333");
        for(String st:sl){
            System.out.println(st);
        }
        System.out.println("------------------");
        Collections.sort(sl);
        for(String st:sl){
            System.out.println(st);
        }
    }
    // 其他类 Student
    public void sort3(){
        List<Student> sl = new ArrayList<Student>();
        sl.add(new Student("1","小明"));
        sl.add(new Student("2","小红"));
        sl.add(new Student("3","小兰"));
        for (Student st:sl){
            System.out.println(st.name);
        }
        Collections.sort(sl);
        System.out.println("------------------");
        for (Student st:sl){
            System.out.println(st.name);
        }
    }
    public static void main(String[] args){
        CollectinsTest ct = new CollectinsTest();
        // ct.sort1();
        // ct.sort2();
        ct.sort3();
    }
}
