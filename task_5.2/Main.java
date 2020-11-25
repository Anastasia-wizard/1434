/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.security.KeyStore;
import java.sql.SQLOutput;
import java.util.*;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> adressSurname = new HashMap<>();
        adressSurname.put(3, "Ивановы");
        adressSurname.put(13, "Адамсы");
        adressSurname.put(777, "Фортовые");
        adressSurname.put(6, "Вало");
        adressSurname.put(798, "Серениссима");
        adressSurname.put(376, "Достоевские");



        System.out.println("Введите фамилию");
        Scanner scanner = new Scanner(System.in);



            String surname = scanner.nextLine();
        for (Map.Entry<Integer, String> entry : adressSurname.entrySet()) {
            if (entry.getValue().equals(surname)) {
                System.out.println(entry.getKey());
                }
            else {
                System.out.println("Совпадений не найдено.");
                break;
            }
            }
        }


        }





