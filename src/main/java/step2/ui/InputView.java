package step2.ui;

import java.util.Scanner;

public class InputView {

    public static final String MESSAGE_GAME_PARTICIPANT_NAMES = "참여할 사람 이름을 입력하세요";
    public static final String MESSAGE_MAX_LADDER_COUNT = "최대 사다리 높이는 몇 개 인가요?";
    public static final Scanner SCANNER = new Scanner(System.in);

    public static String[] names() {
        System.out.println(MESSAGE_GAME_PARTICIPANT_NAMES);
        return SCANNER.nextLine().split(",");
    }

    public static int maxLadderHeight() {
        System.out.println(MESSAGE_MAX_LADDER_COUNT);
        return SCANNER.nextInt();
    }
}
