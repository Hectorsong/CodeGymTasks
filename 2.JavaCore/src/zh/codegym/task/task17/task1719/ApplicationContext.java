package zh.codegym.task.task17.task1719;
import java.util.HashMap;
import java.util.Map;
/* 
ApplicationContext
*/
public abstract class ApplicationContext<GenericsBean extends Bean> {

    private Map<String, GenericsBean> container = new HashMap<>();
    // Map<Name, 实现 Bean 接口的某个类>

    protected ApplicationContext() {
        parseAllClassesAndInterfaces();
    }

    public synchronized GenericsBean getByName(String name) {
        return container.get(name);
    }

    public synchronized GenericsBean removeByName(String name) {
        return container.remove(name);
    }

    protected abstract void parseAllClassesAndInterfaces();

    public static void main(String[] args) {

    }
}
