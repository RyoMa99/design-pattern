package memento;

import memento.game.Gamer;
import memento.game.Memento;

public class Main {
  public static void main(String[] args) {
    Gamer gamer = new Gamer(100);
    Memento memento = gamer.creaMemento();
    for(int i = 0; i < 100; i++){
      System.out.println("===" + i);
      System.out.println("現状: " + gamer);

      gamer.bet();

      System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

      if(gamer.getMoney() > memento.getMoney()){
        System.out.println("ダイブ増えたので、現状を保存しておきます。");
        memento = gamer.creaMemento();
      }else if (gamer.getMoney() < memento.getMoney() / 2){
        System.out.println("だいぶ減ったので、以前の状態に復帰します");
        gamer.restoreMemento(memento);
      }

      try {
        Thread.sleep(100);
      }catch (InterruptedException e){
        System.out.println("");
      }
    }
  }
}
