package Interface;

import Creator.Creator;

import java.util.Scanner;

public abstract class Page {
    public abstract void show();
    Scanner scan = new Scanner(System.in);
    InterfaceFacade facade=new InterfaceFacade();
    Creator creator=new Creator();
}
