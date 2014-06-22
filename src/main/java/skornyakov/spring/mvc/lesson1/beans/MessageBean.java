package skornyakov.spring.mvc.lesson1.beans;

/**
 * Created by Alexander on 23.06.2014.
 */
public class MessageBean {
    private String message;

    public MessageBean() {
        long random = Math.round(Math.random()*1000);
        message = "Hello world! I'm a " + random;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
