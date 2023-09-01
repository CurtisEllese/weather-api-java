package weather_api.weather;

public class Current {
    private int temperature;
    private int pressure;
    private int humidity;
    private int uv;


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getUv() {
        return uv;
    }
}
