package weather_api.weather;

public class Weather {
    private Current current;
    private Location location;

    // Библиотека gson рекомндует сделать геттеры и сеттеры для корректной работы
    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Город - " + location.getName() + "\n" +
                "Температура - " + current.getTemperature() + "\n" +
                "Давление - " + current.getPressure() + "\n" +
                "Влажность - " + current.getHumidity() + "\n" +
                "УФ-индекс - " + current.getUv() + "\n";
    }
}
