package toysStore.views;

import toysStore.Text;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    public static void showMenu(String[] menu) {

        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }
    }

    public static int selectMenu(String[] menu) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(Text.mainMenuSelect);
            try {
                int selectOption = Integer.parseInt(scanner.nextLine());
                if ((0 < selectOption) & (selectOption <= menu.length)) {
                    return selectOption;
                }
                System.out.println(Text.mainMenuInputError);
            } catch (InputMismatchException e) {
                System.out.println(Text.mainMenuInputError);
            }

        }
    }

}


