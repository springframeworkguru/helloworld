package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserCommandTestLastName {

    @Test
    public void testGetLastName() {
        UserCommand userCommand = new UserCommand();
        assertEquals ("hi",(userCommand.getLastName()));
    }
}