package toysStore;

public class Text {

    public static String[] mainMenu = {"Добавить игрушки в розыгрыш",
                        "Очистить список игрушек",
                        "Разыграть игрушку",
                        "Выход"};

    public static String mainMenuSelect = "Выберите пункт меню: ";
    public static String mainMenuInputError = String.format("Ошибка ввода!\nВведите число от 1 до %d: ", mainMenu.length);

    public static String mainMenuInputTypeError = String.format("Вы ввели строку или символ!\nВведите число от 1 до %d: ", mainMenu.length);

}
