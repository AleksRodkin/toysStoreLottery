package toysStore;

public class Text {

    public static String welcum = "\n***\nДобро пожаловать на розыгрыш игрушек!\nДобавьте игрушки в список для розыгрыша и начинайте веселье!\n***\n";

    public static String[] mainMenu = {"Добавить игрушки в розыгрыш",
                        "Показать список игрушек в розыгрыше",
                        "Изменить шанс выпадения игрушки (читы)",
                        "Очистить список игрушек",
                        "Разыграть игрушку",
                        "Выход"};

    public static String mainMenuSelect = "Выберите пункт меню: ";
    public static String mainMenuInputError = String.format("Ошибка ввода!\nВведите число от 1 до %d: ", mainMenu.length);

    public static String mainMenuInputTypeError = String.format("Ошибка ввода или список игрушек пуст!\nВведите число от 1 до %d: ", mainMenu.length);

    public static String toysGenerateCount = "Введите количество игрушек для добавления в список: ";
    public static String toysGenerateSuccess(int count) {
        return String.format("Добавлено %d игрушек(-шки) в список", count);
    }

    public static String toysListIsEmpty = "Список игрушек пуст!";

    public static String toysDeleted = "Список игрушек очищен";

    public static String youReceived = "Вы получили игрушку ";

    public static String chooseToyToChangeDrop = "Выберите номер игрушки, у которой хотите поменять шанс выпадения: ";
    public static String inputNewDropChance = "Введите новый шанс выпадения (дробное число вводится через точку): ";

    public static String inputNewDropChanceSuccess(double newDropRate) {
        return String.format("Шанс выпадения изменен на %.2f\n", newDropRate);
    }

    public static String youChoseToy = "Вы выбрали игрушку ";
    public static String chosenToyWithChance = " c шансом выпадения ";

    public static String goodBye = "До новых встреч!";
}
