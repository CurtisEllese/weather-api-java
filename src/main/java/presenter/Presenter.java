package presenter;

import ui.View;
import weather_api.Service;
import weather_api.WeatherService;

public class Presenter {
    private View view;
    private Service service;

    // Паттерн предполагает, что мы создаем view(то есть графический экран), а графический экран создает presenter, а
    // presenter создает сервис
    public Presenter(View view) {
        this.view = view;
        service = new WeatherService();
    }

    // Сервис вообще ничего не знает про графический экран и презентер. Он просто работает в режиме API, отдает то, что
    // запрашивают.

    // Этот метод должен: когда к нему пришла информация, он должен отправить данные в модель (у нас это сервис), передать
    // ему информацию, потом принять информацию с модели и вернуть в интерфейс
    public void getInfo(String city) {
        String answer = service.getInfo(city);
        view.print(answer);
    }

}
