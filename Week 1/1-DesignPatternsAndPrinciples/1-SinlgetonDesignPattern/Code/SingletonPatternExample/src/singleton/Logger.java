package singleton;

public class Logger {
    private static Logger logger;

    private Logger(){

    }
   //this here we created a singleton class using lazy way of initialization
    public static Logger getLogger(){
        if(logger==null){
            logger=new Logger();
        }
        else{
            System.out.println("You are trying to create new object but object is already created.You can use it.");
        }
        return logger;
    }

    //now we ahre going to create same singleton class using eager way of initializaton
    
    private static Logger log=new Logger();
    public static Logger getEagerLogger(){
        return log;
    }


    
    
}
