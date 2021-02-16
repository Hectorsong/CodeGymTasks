package zh.codegym.task.task19.task1907;

public class Test {
    /*
    练习三，方式一。
    */
    public static int getSubCount(String str,String key)
    {
        int count = 0;
        int index = 0;
        while((index=str.indexOf(key))!=-1)
        {
            sop("str="+str);
            str = str.substring(index+key.length()); //截取字符串
            count++;
        }
        return count;
    }

    /*
    练习三，方式二。
    */
    public static int getSubCount_2(String str,String key)
    {
        int count = 0;
        int index = 0;
        while((index= str.indexOf(key,index))!=-1)
        {
            sop("index="+index);
            index = index + key.length(); //变化index
            count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        String str = "kkabkkcdkkefkks";
        ///sop("count====="+str.split("kk").length);不建议使用。
        sop("count="+getSubCount_2(str,"kk"));
    }
    public static void sop(String str)
    {
        System.out.println(str);
    }
}
