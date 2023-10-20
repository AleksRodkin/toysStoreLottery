package toysStore;

import toysStore.models.ToysGenerator;

import toysStore.views.MainMenu;
import toysStore.Text;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            MainMenu.showMenu(Text.mainMenu);
            try {
                int userInput = MainMenu.selectMenu(Text.mainMenu);
                    switch (userInput){
                        case 1:
                            System.out.println("Выбор 1");
                            break;
                        case 2:
                            System.out.println("Выбор 2");
                            break;
                        case 3:
                            System.out.println("Выбор 3");
                            break;
                        case 4:
                            System.out.println("Выбор 4");
                            flag = false;
                            break;
                    }
            } catch (Exception e){
                System.out.println(Text.mainMenuInputTypeError);
            }
        }
//        ToysGenerator.printToysList(ToysGenerator.generateToysList(5));

    }
}