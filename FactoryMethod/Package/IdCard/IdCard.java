package FactoryMethod.Package.IdCard;

import FactoryMethod.Package.Framework.Product;

public class IdCard extends Product{
  private String owner;
  IdCard(String owner){
    System.out.println("I make " + owner + "'s IdCard.");
    this.owner = owner;
  }

  public void use(){
    System.out.println("I use " + owner + "'s IdCard.");
  }

  public String getOwner(){
    return owner;
  }
}
