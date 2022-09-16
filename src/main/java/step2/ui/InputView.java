package step2.ui;

import java.util.Scanner;

public class InputView {

    public static final String MESSAGE_GAME_PARTICIPANT_NAMES = "참여할 사람 이름을 입력하세요";
    public static final String MESSAGE_MAX_LADDER_COUNT = "최대 사다리 높이는 몇 개 인가요?";

    public static String[] names() {
        System.out.println(MESSAGE_GAME_PARTICIPANT_NAMES);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().split(",");
    }

    public static int maxLadderHeight() {
        System.out.println(MESSAGE_MAX_LADDER_COUNT);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
