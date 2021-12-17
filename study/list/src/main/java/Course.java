public class Course {

    public String name;
    public String id;

    public Course(String id,String name){
        this.name = name;
        this.id= id;
    }
    public Course(){

    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Course)){
            return false;
        }
        Course course = (Course) obj;
        if(this.name==null){
            if(course.name==null){
                return true;
            }else{
                return false;
            }
        }else{
            if(this.name.equals(course.name)){
                return true;
            }else{
                return false;
            }
        }
    }
}


