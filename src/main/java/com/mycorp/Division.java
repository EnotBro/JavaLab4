package com.mycorp;

import java.util.HashMap;

/**
 * class division
 */
public class Division {
    private int id;
    private String name;

     private static int currentFreeId = 1;

    /**
     * IDs of divisions. It contains pairs "name of division - id of division"
     */
    private static final HashMap<String, Integer> idsOfDivisions = new HashMap<>();


    /**
     * Creates new division with the name.
     * ID is id from "id of divisions" that matches to the name of division.
     * If the name doesn't exist in dictionary than we put a new pair of the name and current free id into it.
     * @param name name of division
     */
    public Division(String name)
     {
         this.name=name;
         if (idsOfDivisions.containsKey(name))
         {
             this.id = idsOfDivisions.get(name);
         }
         else
         {
             idsOfDivisions.put(name,currentFreeId);
             currentFreeId++;
         }
     }

    @Override
    public String toString() {
        return "Division{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * Sets new name for the division
     * @param name new name of the division
     */
    public void setName(String name) {
        if (!idsOfDivisions.containsKey(name))
        {
            idsOfDivisions.put(name,currentFreeId);
            currentFreeId++;
        }
        this.name = name;
        this.id = idsOfDivisions.get(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
