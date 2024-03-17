package QD.sy1.no2;

import java.util.Scanner;

import static java.lang.System.in;

public class Client {
    public static void main(String[] args) {
        Strategy strategy;
        SalesMan salesMan;
        System.out.println("***************不同的节日对应不同的促销方案*********************");
        System.out.println("请输入节日名称：春节、中秋节、端午节");
        Scanner sc = new Scanner(in);
        String name = sc.next();
        strategy = SimpleFactory.newStrategy(name);
        salesMan = new SalesMan(strategy);
        salesMan.salesManShow();
    }
}
