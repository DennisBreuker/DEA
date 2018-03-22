package nl.han.oose.dea.dao;

public class MessageDao implements Message {
    @Override
    public String getMessage(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("id should not be negative");
        }
        if (id == 0) {
            return "Hello";
        } else {
            return "Goodbye";
        }
    }
}
