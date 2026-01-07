package org.example.Head03_OOP.Example20;

import org.example.Head03_OOP.Example19.Level;

public class PlanetEnumTest {
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.println("Planet: " + p.toString() + " SurfaceGravity: " + p.surfaceGravity());
        }
    }
}
