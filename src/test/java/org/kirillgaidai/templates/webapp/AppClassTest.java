package org.kirillgaidai.templates.webapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppClassTest {

    @Test
    public void testGetMessage() throws Exception {
        AppClass appClass = new AppClass();
        assertEquals("Hello, World!", appClass.getMessage());
    }

}
