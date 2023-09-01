package weather_api;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {
    // Он сделает запрос на удаленный сервер, а сервер вернет данные
    // Получаем API с https://weatherstack.com
    private static final String apiKey = "f428c388577885ce85a65ceaa190f705";

    public String getJson(String city) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();

        // для того, чтобы подключится к какому-то интернет ресурсу, используем тип URL
        // для того, чтобы программа работала, нужно сделать правильный запрос. Правила запроса регламентируются в документациях
        // конкретного приложения
        URL url = new URL("http://api.weatherstack.com/current?access_key=" + apiKey + "&query=" + city);
        // открываем соединение
        URLConnection connection = url.openConnection();
        // с помощью сканнера считываем все, что нам отправляет сервер
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }

//        System.out.println("От сервера пришел ответ: " + stringBuilder);
        return stringBuilder.toString();
    }
}
