import java.util.HashSet;
import java.util.Set;

public class Student {
    public String name;
    public String id;
    public Set<Course> courses; //


    public Student(String id,String name){
        this.name = name;
        this.id= id;
        this.courses = new HashSet<Course>(); //
    }
}
