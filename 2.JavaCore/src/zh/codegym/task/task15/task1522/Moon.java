package zh.codegym.task.task15.task1522;

public class Moon implements Planet{
    private static Moon instance;

    public static Moon getInstance(){
        if (instance == null){
            return instance = new Moon();
        }
        return instance;
    }

    private Moon(){

    }
}
