import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest{
   public List<Course> courseToSelect;

   private Scanner console;

   public SetTest(){
       this.courseToSelect = new ArrayList<Course>();
       this.console = new Scanner(System.in);
   }
    public void add(){
        Course cr1 = new Course("1","数据结构");
        this.courseToSelect.add(cr1);
        Course temp = (Course) courseToSelect.get(0); //对象存入集合都会变成Object类型，取出时需要类型转换

        Course [] course = {new Course("2","数据结构2"),new Course("3","数据结构3")};
        this.courseToSelect.addAll(0, Arrays.asList(course));

//        System.out.println(temp.id);
//        System.out.println(temp3.id);
    }
    // foreach 遍历
    public void foreach(){
        for(Object obj:courseToSelect){
            Course cr = (Course) obj;
            System.out.println(cr.id);
        }
    }
    // contains 包含
    public void contains(){
        Course course = courseToSelect.get(0);
        System.out.println(courseToSelect.contains(course));
    }
    public static void main(String[] args){
       SetTest st = new SetTest();
       st.add();
       st.foreach();
       // 创建学生对象
       Student student = new Student("1","小明");
       // 创建Scanner对象
       Scanner console = new Scanner(System.in);
       for(int i=0;i<3;i++){
           System.out.println("请输入课程ID");
           String courseId = console.next();
           for(Course cr:st.courseToSelect){
               if(cr.id.equals(courseId)){
                   student.courses.add(cr);
               }
           }
       }
       // 打印输出所选课程
       for(Course cr:student.courses){
           System.out.println(cr.id);
       }

    }
}