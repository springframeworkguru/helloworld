package model;


import org.junit.Test;

public class UserCommandTest {

    @Test
    public void testGetFirstName() {
        UserCommand userCommand = new UserCommand();
        assert ("hi".equals(userCommand.getFirstName()));
    }
}