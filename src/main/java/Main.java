public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean isRegistered = true;

    long bonus = service.calcBonus(amount, isRegistered);
    System.out.println(bonus);
  }
}

