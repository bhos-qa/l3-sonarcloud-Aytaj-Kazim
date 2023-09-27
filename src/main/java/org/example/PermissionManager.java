package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;
    public String getRoleName(PermissionLevel permissionLevel) {
        switch (permissionLevel) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                return "Unknown";
        }
    }

    public void setPermissionLevel(PermissionLevel permissionLevel) {
        this.mCurrentLevel = permissionLevel;
    }
}