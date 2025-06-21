package singleton;

public class Main {
    public static void main(String[] args){
        Logger s=Logger.getLogger();
        System.out.println(s.hashCode()); 
        Logger s2=Logger.getLogger();
        System.out.println(s2.hashCode());
    }
}
