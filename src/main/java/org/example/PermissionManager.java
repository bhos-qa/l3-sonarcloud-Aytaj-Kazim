package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public PermissionLevel getmCurrentLevel() {
        return mCurrentLevel;
    }

    public void setmCurrentLevel(PermissionLevel mCurrentLevel) {
        this.mCurrentLevel = mCurrentLevel;
    }
}