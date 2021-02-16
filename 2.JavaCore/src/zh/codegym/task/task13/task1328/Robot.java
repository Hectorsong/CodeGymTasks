package zh.codegym.task.task13.task1328;

public class Robot extends AbstractRobot implements CanAttack, CanDefend {
    private static int hitCount;
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;
        //System.out.println(hitCount);
        if (hitCount == 1) {
            hitCount = 2;
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            hitCount = 3;
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            hitCount = 1;
            attackedBodyPart = BodyPart.LEG;
        } else{
            hitCount = 2;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defend() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            hitCount = 2;
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            hitCount = 1;
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            hitCount = 0;
            defendedBodyPart = BodyPart.ARM;
        } else {
            hitCount = 3;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }
}
