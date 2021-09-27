package FactoryMethod.Package.IdCard;

import FactoryMethod.Package.Framework.*;
import java.util.*;

public class IdCardFactory extends Factory {
  private List<String> owners = new ArrayList<String>();

  protected Product createProduct(String owner){
    return new IdCard(owner);
  }

  protected void registerProduct(Product product){
    owners.add(((IdCard)product).getOwner());
  }

  public List<String> getOwners() {
    return owners;
  }
}
