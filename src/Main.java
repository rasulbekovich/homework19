import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("kaisy kundun sabaktary kerek jazynyz:");
            String kun = scanner.nextLine();
            if (Objects.equals(kun, "Monday")) {
                Week duishombu = Week.DUISHOMBU;
                System.out.println(duishombu);
            } else if (Objects.equals(kun,"Tuesday")) {
                Week sheishembi= Week.SHEISHEMBI;
                System.out.println(sheishembi);
            } else if (Objects.equals(kun,"Wednesday")) {
                Week sharshembi= Week.SHARSHEMBI;
                System.out.println(sharshembi);
            } else if (Objects.equals(kun,"Thursday")) {
                Week beishembi= Week.BEISHEMBI;
                System.out.println(beishembi);
            } else if (Objects.equals(kun,"Friday")) {
                Week juma= Week.JUMA;
                System.out.println(juma);
            } else if (Objects.equals(kun,"Saturday")) {
                Week ishembi= Week.ISHEMBI;
                System.out.println(ishembi);
            } else if (Objects.equals(kun,"Sunday")) {
                Week jekshembi= Week.JEKSHEMBI;
                System.out.println(jekshembi);
            }else {
                System.out.println("andai kun jok!!!");
            }
        }
    }
}