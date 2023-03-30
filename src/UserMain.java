import java.util.Scanner;

public class UserMain {

    private Scanner scanner;
    private Holding holding;

    public UserMain(Holding holding) {
        this.holding = new Holding();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exit = true;
        while (exit) {
            System.out.println("Yapmak istediginiz islemi seciniz." +
                    "\n -Cikis (0)" +
                    "\n -Mevcut sirketleri yazdirma (1)" +
                    "\n -Yeni sirket ekleme (2)" +
                    "\n -Mevcut sirketi ozel numarasına gore silme (3)");

            int input = Integer.valueOf(scanner.nextLine());
            System.out.println();

            switch (input) {
                case 0:
                    exit = false;
                    System.out.println("Cikis yapildi...");
                    break;
                case 1:
                    holding.listCompany();
                    System.out.println();
                    break;
                case 2:
                    holding.addCompany();
                    System.out.println();
                    break;
                case 3:
                    holding.removeCompany();
                    System.out.println();
                    break;
                default:
                    System.out.println("Yanlis giris, lutfen tekrar tercih yapiniz.!");
            }
        }
    }
}


