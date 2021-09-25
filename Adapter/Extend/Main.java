package Adapter.Extend;

import Adapter.Extend.Package.*;

public class Main {
  public static void main(String[] args) {
    Print p = new PrintBanner("Hello");
    p.printWeak();
    p.printString();
  }
}
