public abstract class Message {
    public String messageText;

    Message() {
        this.messageText = "";
    }
    Message(String value) {
        this.messageText = value;
    }

    public int charNumber() {
        return messageText.toCharArray().length;
    }

    public void setMessage(String value) {
        messageText = value;
    };
    public String getMessage() {
        return messageText;
    };
    public abstract String send();
}
