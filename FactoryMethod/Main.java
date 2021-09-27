package FactoryMethod;

import FactoryMethod.Package.Framework.*;
import FactoryMethod.Package.IdCard.*;

class Main {
  public static void main(String[] args) {
    Factory factory = new IdCardFactory();
    Product p1 = factory.create("taro");
    Product p2 = factory.create("jiro");
    Product p3 = factory.create("saburo");

    p1.use();
    p2.use();
    p3.use();
  }
}