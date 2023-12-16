public class TestMessages {
    public static void main(String[] args) {
        Sms myText = new Sms("123123123", "Hi, please call me!");
        System.out.println(myText.send());

        System.out.println("");
        Sms myText2 = new Sms("333666999", "Hi, can you meet me today?");
        System.out.println(myText2.send());
        System.out.println("");
        Sms myText3 = new Sms("333666999", "");
        System.out.println(myText3.send());
    }
}
