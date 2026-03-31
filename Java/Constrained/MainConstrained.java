package Constrained;

import java.beans.*;

public class MainConstrained {
    public static void main(String[] args) {

        ConstrainedPerson p = new ConstrainedPerson();

        try {
            p.setAge(15); // error aayega
        } catch (PropertyVetoException e) {
            System.out.println("Invalid age!");
        }
    }
}
