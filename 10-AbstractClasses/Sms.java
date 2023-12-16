public class Sms extends Message {
    private String phoneNumber;

    Sms(String number, String messageTexString) {
        super(messageTexString);
        this.phoneNumber = number;
    }

    @Override
    public String send() {
        return "---SMS---\n"+
        "TO: " + phoneNumber +
        "\nMESSAGE: " + getMessage();
    }
    
}
