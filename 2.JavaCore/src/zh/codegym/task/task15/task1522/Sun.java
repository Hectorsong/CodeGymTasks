package zh.codegym.task.task15.task1522;

public class Sun implements Planet{
    private static Sun instance;

    public static Sun getInstance(){
        if (instance == null){
            return instance = new Sun();
        }
        return instance;
    }

    private Sun(){

    }
}
