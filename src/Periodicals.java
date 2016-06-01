import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Created by norvag on 01.06.2016.
 * Построить модель программной системы.
 * Система Периодические издания.
 * Читатель может сделать Заявку,
 * предварительно выбрав периодические Издания из списка.
 * Система подсчитывает сумму для оплаты.
 * Читатель оплачивает заявку.
 * Администратор добавляет Заявку в «черный список»,
 * если Клиент не оплачивает её в определённый срок.
 */
public class Periodicals {
    private ArrayList<String> listOfEdition;
    private ArrayList<Double> listOfPrice;

    public Periodicals() {
        listOfEdition = new ArrayList<>();
        listOfPrice = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listOfEdition.add("Edition_" + (i+1));
            listOfPrice.add(price());
        }
    }

    public double price() {
        double price = (Math.random() * 5 + 1);
        return price;
    }

    public List<String> getListOfEdition() {
        return listOfEdition;
    }

    public List<Double> getListOfPrice() {
        return listOfPrice;
    }
}
