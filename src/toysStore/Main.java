package toysStore;

import toysStore.models.Toy;
import toysStore.models.ToysGenerator;

import toysStore.views.MainMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        List<Toy> toysLotteryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(Text.welcum);
        while (flag){
            MainMenu.showMenu(Text.mainMenu);
            try {
                int userInput = MainMenu.selectMenu(Text.mainMenu);
                switch (userInput){
                    case 1:
                        System.out.println(Text.toysGenerateCount);
                        int count = Integer.parseInt(scanner.nextLine());
                        toysLotteryList = ToysGenerator.generateToysList(count);
                        System.out.println(Text.toysGenerateSuccess(count));
                        break;
                    case 2:
                        ToysGenerator.printToysList(toysLotteryList);
                        break;
                    case 3:
                        System.out.println(Text.chooseToyToChangeDrop);
                        int toyNumber = Integer.parseInt(scanner.nextLine());
                        System.out.println(Text.inputNewDropChance);
                        double newInputDropChance = Double.parseDouble(scanner.nextLine());
                        System.out.println(Text.youChoseToy + toysLotteryList.get(toyNumber-1).getToyName() + Text.chosenToyWithChance + toysLotteryList.get(toyNumber-1).getDropProbability());
                        Toy.changeDropProbability(toysLotteryList, toyNumber, newInputDropChance);
                        System.out.println(Text.inputNewDropChanceSuccess(newInputDropChance));
                        break;
                    case 4:
                        toysLotteryList = new ArrayList<>(){};
                        System.out.println(Text.toysDeleted);
                        break;
                    case 5:
                        if (toysLotteryList.isEmpty()){
                            System.out.println(Text.toysListIsEmpty);
                        } else {
                            int winIndex = Toy.playLottery(toysLotteryList);
                            Toy prize = toysLotteryList.get(winIndex);
                            System.out.println(Text.youReceived + prize.getToyName() + "!\n");
                            prize.reduceByOne(prize);
                            if (prize.getQuantity() == 0){
                                prize.deleteToyFromList(toysLotteryList, winIndex);
                            }
                        }
                        break;
                    case 6:
                        System.out.println(Text.goodBye);
                        flag = false;
                        break;
                }
            } catch (Exception e){
                System.out.println(Text.mainMenuInputTypeError);
            }
        }

    }
}