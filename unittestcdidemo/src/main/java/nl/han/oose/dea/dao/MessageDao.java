package nl.han.oose.dea.dao;

import javax.enterprise.inject.Default;

@Default
public class MessageDao implements Message {
    public String getMessage() {
        return "Hello";
    }
}
