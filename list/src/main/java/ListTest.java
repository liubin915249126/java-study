import java.util.ArrayList;
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
        System.out.println(temp.id);
    }
    public static void main(String[] args){
        ListTest lt = new ListTest();
        lt.add();
    }
}
