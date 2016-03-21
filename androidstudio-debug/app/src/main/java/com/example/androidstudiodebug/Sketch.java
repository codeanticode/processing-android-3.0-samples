package com.example.androidstudiodebug;

import processing.core.PApplet;

public class Sketch extends PApplet {
    public void settings() {
        size(600, 600, P2D);
    }

    public void setup() {
      fill(250, 50, 90);
    }

    public void draw() {
        if (mousePressed) {
            rect(mouseX - 25, mouseY - 25, 50, 50);
        }
    }
}