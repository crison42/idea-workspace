package QD.zy4.no1;

import java.util.ArrayList;
import java.util.List;

public class changhongComposite extends changhongComponent {
    private final List<changhongComponent> list = new ArrayList<>();

    public changhongComposite(String name, int level) {
        super(name, level);
    }

    public void addChild(changhongComponent changhongComponent) {
        list.add(changhongComponent);
    }

    public void delChild(changhongComponent changhongComponent) {
        list.remove(changhongComponent);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("----");
        }
        System.out.println(name);
        for (changhongComponent changhongComponent : list) {
            changhongComponent.print();
        }
    }
}
