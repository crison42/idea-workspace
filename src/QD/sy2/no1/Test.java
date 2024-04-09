package QD.sy2.no1;

public class Test {
    public static void main(String[] args) {
        System.out.println("******第1次调用单例创建实例******");
        PersonSingleton person1 = PersonSingleton.getIns();
        System.out.println("******第2次调用单例创建实例******");
        PersonSingleton person2 = PersonSingleton.getIns();
        System.out.println("******第1次创建对象和第2次创建对象是否相等?******");
        System.out.println(person1.equals(person2));
    }
}
