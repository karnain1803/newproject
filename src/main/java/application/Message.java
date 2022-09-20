package application;

import lombok.Data;
@Data
public class Message {
    private String title;
    private String body;

    public Message(String title, String body){
        this.title = title;
        this.body = body;
    }
}
