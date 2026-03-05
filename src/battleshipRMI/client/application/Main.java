package battleshipRMI.client.application;

import battleshipRMI.client.controller.BattleshipController;

public class Main {
    public static void main(String[] args) {
        BattleshipController controller = new BattleshipController();
        if (args.length == 0) {
            controller.startGame();
        } else {
            controller.startGame(parse(args));
        }
        controller.executeCommands();
    }

    public static int[] parse(String[] args) {
        int[] result = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            result[i] = Integer.parseInt(args[i]);
        }
        return result;
    }
}
