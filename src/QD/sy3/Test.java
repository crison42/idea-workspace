package QD.sy3;

public class Test {
    public static void main(String[] args) {
        ICharacter apiao = new Suit(new Tie(new TShirts(new stuDress())));
        apiao.show();
        System.out.println();
        System.out.println("******旗开得胜，马到功成！******");
    }
}
