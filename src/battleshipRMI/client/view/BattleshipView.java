package battleshipRMI.client.view;

import battleshipRMI.client.view.oceanview.OceanView;
import battleshipRMI.shared.model.game.AttackReport;

public class BattleshipView {
    private final OceanView oceanView;

    public BattleshipView(int horizontal, int vertical) {
        this.oceanView = new OceanView(horizontal, vertical);
    }

    public void printOcean(String info) {
        System.out.println(oceanView.printOcean());
        System.out.println(info);
    }

    public String updateOcean(AttackReport report) {
        return oceanView.updateOceanView(report);
    }

    public void printMainMenu() {
        System.out.println("1. New game");
        System.out.println("2. Exit");
    }

    public void printModeMenu(String mode) {
        System.out.println("1. " + mode + " enabled");
        System.out.println("2. " + mode + " disabled");
    }

    public void printHelp() {
        System.out.println("Command format: [T] <x> <y>");
    }
}
