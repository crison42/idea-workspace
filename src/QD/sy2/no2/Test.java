package QD.sy2.no2;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("****构造函数实例化对象****");
        StudentPrototype student1 = new StudentPrototype("付旭", "1081306");
        System.out.println("****克隆出来的实例对象****");
        StudentPrototype student2 = (StudentPrototype) student1.clone();
        System.out.println("****克隆对象和源对象地址是否相等？****");
        System.out.println(student1.equals(student2));
    }
}
