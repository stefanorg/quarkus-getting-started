package org.acme.getting.started.unused;

import io.quarkus.arc.Unremovable;

@Unremovable
public class Unused {

    public String aMethod() {
        return "hello";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}