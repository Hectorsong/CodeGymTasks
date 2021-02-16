package zh.codegym.task.task14.task1413;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor){
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public Keyboard getKeyboard(){
        return keyboard;
    }
    public Mouse getMouse(){
        return mouse;
    }
    public Monitor getMonitor(){
        return monitor;
    }
}
