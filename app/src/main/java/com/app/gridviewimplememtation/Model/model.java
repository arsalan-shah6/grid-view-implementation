package com.app.gridviewimplememtation.Model;

public class model {
     String name[];
     int icon [];

    public model(String[] name, int[] icon) {
        this.name = name;
        this.icon = icon;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getIcon() {
        return icon;
    }

    public void setIcon(int[] icon) {
        this.icon = icon;
    }
}
