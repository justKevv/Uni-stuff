package week10.assignment.models;

import week10.assignment.interfaces.Destroyable;

public class Plant {
    public void doDestroy(Destroyable d) {
        d.destroyed();
    }
}
