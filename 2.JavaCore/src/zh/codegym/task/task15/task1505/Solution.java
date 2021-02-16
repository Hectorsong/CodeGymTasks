package zh.codegym.task.task15.task1505;

import org.omg.CORBA.OBJ_ADAPTER;

import java.util.ArrayList;
import java.util.List;

/* 
OOP：解决继承问题
*/

public class Solution {
    public static interface LivingPart {
        Object containsBones();
    }
    public static class BodyPart implements LivingPart {
        private String name;
        public BodyPart(String name) {
            this.name = name;
        }
        public Object containsBones() {
            Object object = new Object();
            object = "是";
            return object;
        }
        public String toString() {
            if (containsBones() == "是"){
                return this.name + " 包含骨骼";
            }else if (containsBones() == "否"){
                return this.name + " 不包含骨骼";
            }
            return null;
        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;
        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }
        public Object containsBones() {
            Object object = new Object();
            object = super.containsBones() == "是" && !isArtificial ? "是":"否";
            return object;
        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnLivingParts();
    }

    private static void printlnLivingParts() {
        System.out.println(new BodyPart("手").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<>(5);
        bodyParts.add(new BodyPart("手"));
        bodyParts.add(new BodyPart("腿"));
        bodyParts.add(new BodyPart("头"));
        bodyParts.add(new BodyPart("身体"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<>(5);
        fingers.add(new Finger("大拇指", true));
        fingers.add(new Finger("食指", true));
        fingers.add(new Finger("中指", true));
        fingers.add(new Finger("无名指", false));
        fingers.add(new Finger("小拇指", true));
        System.out.println(fingers.toString());
    }
}

