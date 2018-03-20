package nl.han.oose.dea.dao;

import javax.enterprise.inject.Alternative;

@Alternative
public class Message2Dao implements Message {
    @Override
    public String getMessage() {
        return "Goodbye";
    }
}
