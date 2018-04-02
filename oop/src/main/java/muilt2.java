abstract class Action{

    public static final int EAT = 1 ;
    public static final int SLEEP = 3 ;
    public static final int WORK = 5 ;

    public abstract void eat();
    public abstract void sleep();
    public abstract void work();

    public void commond(int flags){
        switch(flags){
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
            case EAT + SLEEP:
                this.eat();
                this.sleep();
                break;
            case SLEEP + WORK:
                this.sleep();
                this.work();
                break;
            default:
                break;
        }
    }
}

class Robot extends Action{

    @Override
    public void eat() {
        System.out.println("机器人充电");

    }

    @Override
    public void sleep() {

    }

    @Override
    public void work() {
        System.out.println("机器人工作");

    }

}
class Human extends Action{

    @Override
    public void eat() {
        System.out.println("人吃饭");

    }

    @Override
    public void sleep() {
        System.out.println("人睡觉");

    }

    @Override
    public void work() {
        System.out.println("人工作");

    }

}
class Pig extends Action{

    @Override
    public void eat() {
        System.out.println("猪进食");

    }

    @Override
    public void sleep() {
        System.out.println("猪睡觉");

    }

    @Override
    public void work() {


    }

}
class AbstractDemo {

    public static void main(String[] args) {

        fun(new Robot());

        fun(new Human());

        fun(new Pig());

    }

    public static void fun(Action act){
        act.commond(Action.EAT);
        act.commond(Action.SLEEP);
        act.commond(Action.WORK);
    }

}