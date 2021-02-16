package zh.codegym.task.task13.task1328;

public abstract class AbstractRobot implements CanDefend , CanAttack{
    private String name;

    private static int hitCount;

    public abstract String getName();
/*
    public BodyPart defend(){
        return BodyPart.CHEST;
    }

    public BodyPart attack(){
        return BodyPart.CHEST;*/

    public BodyPart attack() {
        return BodyPart.CHEST;
        }

    public BodyPart defend() {
        return BodyPart.CHEST;
        }

}
