package QD.zy4.no1;

public class Client {
    public static void main(String[] args) {
        changhongComposite haust, informationDepartment, machineryDepartment;
        changhongComponent office1, office2;

        haust = new changhongComposite("河南科技大学", 1);
        office1 = new changhongLeaf("校长办公室", 2);
        informationDepartment = new changhongComposite("信息与控制工程学部", 2);
        machineryDepartment = new changhongComposite("机械工程学部", 2);
        office2 = new changhongLeaf("教务部", 2);

        haust.addChild(office1);
        haust.addChild(machineryDepartment);
        haust.addChild(office2);
        haust.addChild(informationDepartment);

        informationDepartment.addChild(new changhongLeaf("软件学院", 3));
        informationDepartment.addChild(new changhongLeaf("信息工程学院", 3));
        machineryDepartment.addChild(new changhongLeaf("机电学院", 3));
        machineryDepartment.addChild(new changhongLeaf("车动学院", 3));
        machineryDepartment.addChild(new changhongLeaf("农业装备学院", 3));
        haust.print();

    }
}
