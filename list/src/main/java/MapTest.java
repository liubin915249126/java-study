import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest {
    public Map<String,Student> student;
    public MapTest(){
        this.student = new HashMap<String,Student>();
    }
    // 输入学生ID判断是否被占用
    public void put(){
        Scanner console = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("请输入ID");
            String ID = console.next();
            Student st = student.get(ID); //get
            if(st==null){
                // 输入学生姓名
                System.out.println("请输入姓名");
                String name = console.next();
                // 创建新的学生对象
                Student newSt = new Student(ID,name);

                student.put(ID,newSt); //put
                System.out.println(student.get(ID).name);
            }else{
                System.out.println("ID已被占用");
            }
        }
    }
    public void modify(){
        System.out.println("输入要修改的ID");
        Scanner console = new Scanner(System.in);
        while(true){
            String id = console.next();
            Student st = student.get(id); //get
            if(st==null){
                System.out.println("重新输入");
                continue;
            }
            System.out.println("请输入新的学生姓名");
            String name = console.next();
            Student newStudent = new Student(id,name);
            student.put(id,newStudent);
            System.out.println("修改成功");
            break;
        }
        Set<String> keysets = student.keySet();
        for(String keyset:keysets){
            Student st1 = student.get(keyset);
            System.out.println("姓名为:"+st1.name);
        }
    }
    // keySet
    public void keySet(){
        Set<String> keyset = student.keySet();
        System.out.println("总共有："+student.size());
        for(String stuid:keyset){
            Student st = student.get(stuid);
            if(st!=null){
                System.out.println("学生："+st.name);
            }
        }
    }
    public void remove(){
        System.out.println("输入要删除的ID");
        while (true){
            Scanner console = new Scanner(System.in);
            String id = console.next();
            Student st = student.get(id);
            if(st==null){
                System.out.println("不存在对应的值");
                continue;
            }else{
                student.remove(id);
                System.out.println("成功删除学生："+st.name);
            }
        }
    }
    // entrySet
    public void entrySet(){
      Set<Entry<String,Student>> entrySet = student.entrySet();
      for(Entry<String,Student> entry:entrySet){
          System.out.println("键："+entry.getKey());
          System.out.println("值："+entry.getValue().name);
      }
    }
    public void contains(){

    }
    public static void main(String[] args){
        MapTest mt =new MapTest();
        mt.put();
        mt.keySet();
//        mt.remove();
//        mt.entrySet();
        mt.modify();
    }
}
