package QD.zy4.no1;

public class changhongLeaf extends changhongComponent {
    public changhongLeaf(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("----");
        }
        System.out.println(name);
    }
}
