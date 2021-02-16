package zh.codegym.task.task13.task1328;

public final class BodyPart {

    final static BodyPart LEG = new BodyPart("腿");
    final static BodyPart HEAD = new BodyPart("头");
    final static BodyPart ARM = new BodyPart("手");
    final static BodyPart CHEST = new BodyPart("胸");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }



}
