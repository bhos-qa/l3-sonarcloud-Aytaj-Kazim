package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class PermissionManagerTest {

    @Test
    public void testGetRoleName() {
        PermissionManager manager = new PermissionManager();
        assertEquals("Admin", manager.getRoleName(PermissionLevel.ADMIN));
        assertEquals("Developer", manager.getRoleName(PermissionLevel.DEVELOPER));
        assertEquals("User", manager.getRoleName(PermissionLevel.USER));
    }

    @Test
    public void testSetPermissionLevel() {
        PermissionManager manager = new PermissionManager();
        manager.setPermissionLevel(PermissionLevel.ADMIN);
        assertEquals(PermissionLevel.ADMIN, manager.mCurrentLevel);
    }
}