package Lesson12;

public interface Phone {
    //Обязательные методы(функции) объектов типа телефон

    //1) Метод "Звонить"
    void call();

    //2) Метод "Отправка сообщений"
    void sendMessege(String message);

    //void photo(); метод не для всех телефонов, могут быть телефоны без камеры


}
