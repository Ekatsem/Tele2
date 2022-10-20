public class Main {
    public static void main(String[] args) {

        int cash = 30;

        int deposit = 1500;

//      int bonus;
//      if (deposit > 1000) {
//          bonus = deposit / 100;
//      } else {
//          bonus = 0;
//      }

        int bonus = deposit > 1000 ? deposit / 100 : 0;

        int total = bonus + cash;

        System.out.println(bonus);

        System.out.println(total);

    }
}