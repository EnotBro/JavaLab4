package com.mycorp;

import java.util.HashMap;

/**
 * class division
 */
public class Division {
    private String name;


    /**
     * Names of divisions. It contains pairs "name of division -division"
     */
    private static final HashMap<String, Division> namesOfDivisions = new HashMap<>();


    /**
     * Creates new division with the name.
     * @param name name of division
     */
    private Division(String name)
     {
         this.name=name;
     }

    /**
     * Gets division that already exists or makes another one and put it to the dictionary of divisions
     * @param name name of division
     * @return Existing division with the name or new division with the name
     */
     public static Division getDivisionByName(String name)
     {
         Division division =namesOfDivisions.get(name);
         if (division == null)
         {
             division = new Division(name);
             namesOfDivisions.put(name,division);
         }
         return division;
     }

    @Override
    public String toString() {
        return "Division{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
