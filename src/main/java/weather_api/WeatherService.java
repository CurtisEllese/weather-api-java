package weather_api;

import weather_api.weather.Weather;

public class WeatherService implements Service {
    // Сервис сам ничего не делает, за него все делают мелкие классы

    private Connection connection;
    private Formatter formatter;

    // константы для ошибок
    private static final String EMPTY_ERROR = "Вы не ввели город";
    private static final String CITY_ERROR = "Неверное название города";

    public WeatherService() {
        connection = new Connection();
        formatter = new Formatter();
    }

    @Override
    public String getInfo(String city) {
        if (city.isEmpty()) {
            return EMPTY_ERROR;
        }

        try {
            String info = connection.getJson(city);
            Weather weather = formatter.parse(info);
            String answer = weather.toString();
            return answer;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return CITY_ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
