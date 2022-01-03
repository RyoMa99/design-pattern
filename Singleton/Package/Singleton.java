package Singleton.Package;

public class Singleton {
  private static Singleton singleton = new Singleton();
  private Singleton(){
    System.out.println("birth!");
  }

  public static Singleton getInstance(){
    return singleton;
  }
}