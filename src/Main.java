public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println("Бонусные мили = "+ miles);

        System.out.println();
        int price1= 1350;
        int miles1 = service.calculate(price1);
        System.out.println("Бонусные мили = "+ miles1);
    }


}
