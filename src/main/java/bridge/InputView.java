package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    private final Validator validator;

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        System.out.println("다리의 길이를 입력해주세요.");
        String sizeName = Console.readLine();

        validateSize(sizeName);

        return Integer.parseInt(sizeName);
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String move = Console.readLine();
        move = move.toUpperCase();

        validateMove(move);

        return move;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    public InputView(Validator validator) {
        this.validator = validator;
    }

    private void validateSize(String sizeName) {
        validator.checkSizeByInt(sizeName);
        validator.checkSizeInScope(sizeName);
    }

    private void validateMove(String move) {
        validator.checkMoveWord(move);
    }
}
