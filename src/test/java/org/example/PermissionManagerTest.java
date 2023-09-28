package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class PermissionManagerTest {

    @Test
    public void getmCurrentLevel() {
        PermissionManager manager = new PermissionManager();
        assertEquals(manager.getmCurrentLevel(), PermissionLevel.USER);
    }

    @Test
    public void setmCurrentLevel() {
        PermissionManager manager = new PermissionManager();
        manager.setmCurrentLevel(PermissionLevel.DEVELOPER);
        assertEquals(manager.getmCurrentLevel(), PermissionLevel.DEVELOPER);
    }
}