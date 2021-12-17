class A{
    public void print(){
        System.out.println("A");
    }
}

class B extends A{
    public void print(){
        System.out.println("B");
    }
}


public class Muilt {
   public static void main(String args[]){
//       B b = new B(); //实例化子对象
//       b.print(); //调用被复写的方法
       A a = new B(); //向上转型
       a.print();
   }
}
