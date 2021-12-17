package by.academy.classwork.lesson15;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID =1L;
    private String login;
    private transient String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }
}
