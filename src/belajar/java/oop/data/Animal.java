package belajar.java.oop.data;

import belajar.java.oop.annotation.Fancy;

@Fancy(name ="AnimalApp", tags = {"application", "java"})
public abstract class Animal {
    public String name;
//    memaksa turunan nge override fungsi run
    public abstract void run();
}
