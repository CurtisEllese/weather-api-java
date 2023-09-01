package weather_api;

import com.google.gson.Gson;
import weather_api.weather.Weather;

public class Formatter {
    // Распарсит данные полученные с удаленного сервера
    public Weather parse(String info) {
        Gson gson = new Gson();
        Weather weather = gson.fromJson(info, Weather.class);
        return weather;
    }
}
