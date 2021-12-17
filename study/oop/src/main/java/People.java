public class People {
    public String name;
    public String id;
    public People(){

    }
    public People(String id, String name){
       this.id = id;
       this.name = name;
    }
    public void say(){
        System.out.println(this.name);
    }
    public static void main(String[] args){
       People pp = new People("","liu");
       pp.say();
    }
}
