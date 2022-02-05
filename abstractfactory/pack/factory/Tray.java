package abstractfactory.pack.factory;
import java.util.ArrayList;

public abstract class Tray extends Item {
  // ここはprivateにして、サブクラスからアクセスするためのget系メソッドを別に作った方がよい。
  protected ArrayList tray = new ArrayList();
  public Tray(String caption){
    super(caption);
  }
  public void add(Item item){
    tray.add(item);
  }
}