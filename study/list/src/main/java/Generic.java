import java.util.ArrayList;
import java.util.List;

public class Generic{

    public List<Course> courses;

    public Generic(){
        this.courses = new ArrayList<Course>();
    }
    // 测试增加
    public void add(){
        Course cr1 = new Course("1","大学英语");
        courses.add(cr1);
        // courses.add("1111");
        Course cr2 = new Course("2","大学物理");
        courses.add(cr2);
    }
    // 循环遍历
    public void foreach1(){
        for(Course cr:courses){
           System.out.println(cr.name);
        }
    }
    //来自子类型
    public void addChild(){
        ChildCourse cc2 = new ChildCourse();
        cc2.id="3";
        cc2.name="来自子类型";
        courses.add(cc2);
    }
    // 判断范型能不能为基本类型
    public void basicType(){
        List<Integer>list = new ArrayList<Integer>();
        list.add(10); //强制转换类型
        System.out.println(list.get(0));
    }
    public static void main(String[] args){
       Generic ge = new Generic();
       ge.add();
       ge.addChild();
       ge.foreach1();
       ge.basicType();
    }
}