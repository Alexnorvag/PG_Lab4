import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;

/**
 * Created by norvag on 31.05.2016.
 * Построить модель программной системы.
 * Система Периодические издания.
 * Читатель может сделать Заявку,
 * предварительно выбрав периодические Издания из списка.
 * Система подсчитывает сумму для оплаты.
 * Читатель оплачивает заявку.
 * Администратор добавляет Заявку в «черный список»,
 * если Клиент не оплачивает её в определённый срок.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ваше имя: ");
        String name = reader.readLine();
        System.out.print("Ваша фамилия: ");
        String surname = reader.readLine();

        User user = new User(name, surname);
        System.out.println("\n\n" + user.getName() + " " + user.getSurname() + ", добро пожаловать в систему периодических изданий.");

        System.out.println("\nВыберите периодические издания из списка: ");
        Periodicals myPeriodicals = new Periodicals();

        for (int i = 0; i < myPeriodicals.getListOfEdition().size(); i++) {
            System.out.println((i+1) + ") " + myPeriodicals.getListOfEdition().get(i) + ": " + myPeriodicals.getListOfPrice().get(i) + "$");
        }

        int variant = Integer.parseInt(reader.readLine());
        double sum = 0.0;
        sum += myPeriodicals.getListOfPrice().get(variant-1);

        System.out.println("Сумма для оплаты: " + sum);
        System.out.println("Готовы оплатить?(Y/N)");
        String check = reader.readLine();
        if (check.equals("Y")) {
            System.out.println("Успешно оплачено!");
            sum = 0.0;
        }
        else if (check.equals("N")) {
            System.out.println("Ваш заказ добавлен в чёрный список из-за неуплаты.");
        }

    }
}
