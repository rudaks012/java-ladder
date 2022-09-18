package step2.ui;

import java.util.Scanner;

public class InputView {

    public static final String MESSAGE_GAME_PARTICIPANT_NAMES = "참여할 사람 이름을 입력하세요";
    public static final String MESSAGE_MAX_LADDER_COUNT = "최대 사다리 높이는 몇 개 인가요?";
    private static final Scanner SCANNER = new Scanner(System.in);
    public static final String DELIMITER = ",";

    public static String[] enterNames() {
        println(MESSAGE_GAME_PARTICIPANT_NAMES);
        return SCANNER.nextLine().split(DELIMITER);
    }

    public static int enterHeight() {
        println(MESSAGE_MAX_LADDER_COUNT);
        return SCANNER.nextInt();
    }

    private static void println(String message) {
        System.out.println(message);
    }
}
