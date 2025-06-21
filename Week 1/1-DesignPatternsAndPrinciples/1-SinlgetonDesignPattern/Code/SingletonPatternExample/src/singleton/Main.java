package singleton;

public class Main {
    public static void main(String[] args){
        System.out.println("------Lazy way of initialization------");
        Logger s=Logger.getLogger();
        System.out.println(s.hashCode()); 
        Logger s2=Logger.getLogger();
        System.out.println(s2.hashCode());

        System.out.println("====eager way of initialization========");
        Logger k=Logger.getEagerLogger();
        System.out.println(k.hashCode());
        Logger k2=Logger.getEagerLogger();
        System.out.println(k2.hashCode());

    }
}
