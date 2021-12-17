import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public List courseToSelect;

    public ListTest(){
        this.courseToSelect = new ArrayList(); //List是接口 ArrayList 实现类
    }
    public void add(){
        Course cr1 = new Course("1","数据结构");
        this.courseToSelect.add(cr1);
        Course temp = (Course) courseToSelect.get(0); //对象存入集合都会变成Object类型，取出时需要类型转换
        
        Course [] course = {new Course("2","数据结构2"),new Course("3","数据结构3")};
        this.courseToSelect.addAll(0,Arrays.asList(course));
        Course temp3 = (Course)this.courseToSelect.get(2);
        
//        System.out.println(temp.id);
//        System.out.println(temp3.id);
    }
    // for 循环
    public void get(){
        int size = this.courseToSelect.size();
        for (int i=0; i<size;i++){
           Course cr = (Course)courseToSelect.get(i);
           System.out.println(cr.id);
        }
    }
    // iterator 迭代器
    public void iterator(){
        Iterator it = courseToSelect.iterator();
        while(it.hasNext()){
            Course cr = (Course)it.next();
            System.out.println(cr.id);
        }
    }
    // foreach 遍历
    public void foreach(){
       for(Object obj:courseToSelect){
          Course cr = (Course) obj;
          System.out.println(cr.id);
       }
    }
    // set
    public void modify(){
        courseToSelect.set(2,new Course("7", "毛概"));
    }
    // remove
    public void remove(){
        // Course cr = (Course)courseToSelect.get(2);
        courseToSelect.remove(2);
        foreach();
    }
    public static void main(String[] args){
        ListTest lt = new ListTest();
        lt.add();
        // lt.get();
        // lt.iterator();
        // lt.foreach();
        // lt.modify();
        // lt.foreach();
        lt.remove(); 
    }
}
