package singleton;

public class Logger {
    private static Logger logger;

    private Logger(){

    }
   
    public static Logger getLogger(){
        if(logger==null){
            logger=new Logger();
        }
        else{
            System.out.println("You are trying to create new object but object is already created.You can use it.");
        }
        return logger;
    }
}
