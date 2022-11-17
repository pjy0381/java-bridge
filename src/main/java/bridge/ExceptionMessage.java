package bridge;

public enum ExceptionMessage {
    incorrectSize("[ERROR] 숫자를 입력해주세요."),
    sizeOverScope("[ERROR] 3 ~ 20 사이의 수를 입력해주세요."),
    bridgeNotEqualsSize("[ERROR] 다리의 길이가 입력값과 다릅니다."),
    bridgeNotUorD("[ERROR] 다리가 잘못 생성되었습니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
