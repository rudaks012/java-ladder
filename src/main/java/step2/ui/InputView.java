package step2.ui;

import java.util.Scanner;

public class InputView {

    public static final String GAME_PARTICIPANT_NAMES = "참여할 사람 이름을 입력하세요";

    public static String[] names() {
        System.out.println(GAME_PARTICIPANT_NAMES);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().split(",");
    }
}
