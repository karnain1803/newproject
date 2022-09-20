package application;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Profile {
    @Getter @Setter
    private String name;
    @Getter
    private final List<Message> messages = new ArrayList<>();

    public void addMessage(Message message){
        messages.add(message);
    }
}
