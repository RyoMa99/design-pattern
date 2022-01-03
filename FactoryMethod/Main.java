package FactoryMethod;

import FactoryMethod.Package.IdCard.*;

class Main {
  public static void main(String[] args) {
    IdCardFactory factory = new IdCardFactory();
    IdCard p1 = (IdCard)factory.create("taro");
    IdCard p2 = (IdCard)factory.create("jiro");
    IdCard p3 = (IdCard)factory.create("saburo");

    p1.use();
    p2.use();
    p3.use();
  }
}