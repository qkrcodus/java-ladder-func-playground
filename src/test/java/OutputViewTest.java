import model.ladder.Connection;
import model.ladder.Floor;
import model.ladder.Ladder;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class OutputViewTest {

    @Test
    void 고정된_시드로_예측가능한_사다리_출력() {
        int width = 4;
        int height = 3;
        Random random = new Random(42); // seed 고정

        Ladder ladder = new Ladder(height, width, random);

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
