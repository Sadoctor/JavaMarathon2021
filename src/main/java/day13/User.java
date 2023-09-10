package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        boolean bool = false;
        if (this.subscriptions.contains(user))
            bool = true;
        return bool;
    }

    public boolean isFriend(User user){
        boolean bool = false;
        if (this.subscriptions.contains(user) & user.subscriptions.contains(this))
            bool = true;
        return bool;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return getUsername();
    }
}
