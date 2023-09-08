import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("------MEUS SITES FAVORITOS ------");

        Scanner scanner = new Scanner(System.in);
        List<Website> meusWebsites = new ArrayList<>();

        String nome = scanner.nextLine();
        String url = scanner.nextLine();

        Website website = new Website();
        website.setNome(nome);
        website.setUrl(url);

        meusWebsites.add(website);

    }
}