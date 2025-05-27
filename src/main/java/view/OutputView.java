package view;

import model.ladder.Connection;
import model.ladder.Floor;
import model.ladder.Ladder;

public class OutputView {
    public void printLadder(Ladder ladder) {
        for (Floor floor : ladder.getFloors()) {
            printFloor(floor);
        }
    }

    private void printFloor(Floor floor) {
        for (Connection connection : floor.getConnections()) {
            if (connection.isConnected()) {
                System.out.print("|-----");
            } else {
                System.out.print("|     ");
            }
        }
        System.out.println("|");
    }
}
