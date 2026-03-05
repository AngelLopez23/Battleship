package battleshipRMI.client.controller;

import battleshipRMI.client.model.UserClient;
import battleshipRMI.client.view.BattleshipView;

public class BattleshipController {
    private final UserClient currentUser;
    private BattleshipView view;

    public BattleshipController() {
        this.currentUser = new UserClient();
    }

    public void startGame() {
        this.view = new BattleshipView(10, 10);
    }

    public void startGame(int[] args) {
        int horizontal = args.length > 0 ? args[0] : 10;
        int vertical = args.length > 1 ? args[1] : 10;
        this.view = new BattleshipView(horizontal, vertical);
    }

    public void executeCommands() {
        // TODO: Read commands and send them to the RMI server.
    }

    public int requestForUserInput(String help, int min, int max) {
        // TODO: Implement console input validation.
        return min;
    }

    public void sendCommandToServer(String command, Object[] params) {
        // TODO: Invoke remote methods on GameServer via RMI.
    }
}
