package uamykola;

import java.util.Scanner;
public class Controller {

    private Model model;
    private View view;
    private int userTurn = -1;

    public Controller() {
        model = new Model();
        view = new View();
    }

    public void historyOut() {
        String historyTurns = "Your Turns: ";
        for (Integer turn : model.getTurnHistory()) {
            historyTurns = historyTurns + turn + " ";
        }
        view.printMessage(historyTurns);
    }

    public void rangeOut() {
        String range = "Number in this range: [" + model.getRangeMin() + ", " + model.getRangeMax() + "]";
        view.printMessage(range);
    }

    public void gameLauncher() {
        Scanner scan = new Scanner(System.in);
        model.setSoughtValue(model.makeNumber());
        while (model.getSoughtValue() != userTurn) {
            rangeOut();
            userTurn = userInputValue(scan);
            checkOfTurn(userTurn);
        }
        String historyTurns = "Your Turns: ";
        for (Integer turn : model.getTurnHistory()) {
            historyTurns = historyTurns + turn + " ";
        }
        historyOut();
    }



    public int userInputValue(Scanner sc) {
        view.printMessage(View.GUESS_THE_NUMBER);
        while (!sc.hasNextInt()) {
            view.printMessage(View.NOT_INTEGER);
            view.printMessage(View.GUESS_THE_NUMBER);
            sc.next();
        }
        return sc.nextInt();
    }

    public void checkOfTurn(int userTurn) {
        if (model.getSoughtValue() == userTurn) {
            view.printMessage(View.CONGRATULATION);
            model.addTurn(userTurn);
        } else {
            if (model.getRangeMax() <= userTurn || model.getRangeMin() >= userTurn) {
                view.printMessage(View.OUT_RANGE);
            } else {
                if (model.getSoughtValue() < userTurn) {
                    view.printMessage(View.VALUE_LESS);
                    model.setRangeMax(userTurn);
                    model.addTurn(userTurn);
                    historyOut();
                } else {
                    view.printMessage(View.VALUE_HIGHER);
                    model.setRangeMin(userTurn);
                    model.addTurn(userTurn);
                    historyOut();
                }
            }
        }
    }
}
