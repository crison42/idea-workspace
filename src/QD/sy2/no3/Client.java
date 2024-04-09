package QD.sy2.no3;

public class Client {
    public static void main(String[] args) {
        System.out.println("软工2213班常洪实验2抽象工厂模式答案");
//
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
//
        factory = new SummerSkinFactory();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
//
        bt.display();
        tf.display();
        cb.display();
    }
}
