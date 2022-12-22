package officeHour.AssigmentPreparation;

public class Tree {
    public static void main(String[] args) {
        Tree t1 = new Tree();
        Tree t2 = t1;
        Tree t3;
        t3 = new Tree();
        Tree t4 = t3;
        System.out.println(t3 == t4);
        t4 = new Tree();
        System.out.println(t1 == t2);
        System.out.println(t3 == t4);
    }
}

