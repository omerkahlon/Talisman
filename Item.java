package com.example.mytal;

public class Item extends AdventureCard
{
    public String Name;
    public Item(String Name)
    {
        this.Name = Name;
    }
    public String GetName()
    {
        return this.Name;
    }
}
