package Constrained;

import java.beans.*;

public class ConstrainedPerson {

    private int age;
    private VetoableChangeSupport support = new VetoableChangeSupport(this);

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        support.addVetoableChangeListener(listener);
    }

    public void setAge(int age) throws PropertyVetoException {

        if (age < 18) {
            throw new PropertyVetoException("Age must be 18+", null);
        }

        support.fireVetoableChange("age", this.age, age);
        this.age = age;
    }
}
