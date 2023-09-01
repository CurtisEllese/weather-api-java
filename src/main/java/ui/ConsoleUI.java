package ui;

import presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {
    private Presenter presenter; // Это мы создаем для того, чтобы при взаимодействии клиента с интерфейсом, мы отправили
    // данные в презентер
    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this); // В презентер передаем самого себя
    }

    // Метод для обработки ввода от пользователя нужного города
    public String scan() {
        System.out.println("Введите город");
        return scanner.nextLine();
    }

    // В этом методе мы получаем введенный город и отправляем в презентер
    @Override
    public void start() {
        while (true) {
            String city = scan();
            presenter.getInfo(city);
        }
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
