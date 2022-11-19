import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("kaisy kundun sabaktary kerek jazynyz:");
            String kun = scanner.nextLine();
            if (Objects.equals(kun, "Monday")) {
                Juma duishombu = Juma.DUISHOMBU;
                System.out.println(duishombu);
            } else if (Objects.equals(kun,"Tuesday")) {
                Juma sheishembi=Juma.SHEISHEMBI;
                System.out.println(sheishembi);
            } else if (Objects.equals(kun,"Wednesday")) {
                Juma sharshembi=Juma.SHARSHEMBI;
                System.out.println(sharshembi);
            } else if (Objects.equals(kun,"Thursday")) {
                Juma beishembi=Juma.BEISHEMBI;
                System.out.println(beishembi);
            } else if (Objects.equals(kun,"Friday")) {
                Juma juma=Juma.JUMA;
                System.out.println(juma);
            } else if (Objects.equals(kun,"Saturday")) {
                Juma ishembi=Juma.ISHEMBI;
                System.out.println(ishembi);
            } else if (Objects.equals(kun,"Sunday")) {
                Juma jekshembi=Juma.JEKSHEMBI;
                System.out.println(jekshembi);
            }else {
                System.out.println("andai kun jok!!!");
            }
        }
    }
}