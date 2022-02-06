package strategy.pack.stra;

import java.util.Random;
import strategy.pack.Hand;

public class WinningStrategy implements Strategy {
  private Random random;
  private boolean won = false; // 前回の勝負の結果
  private Hand prevHand;
  public WinningStrategy(int seed){
    random = new Random(seed);
  }

  public Hand nextHand(){
    if(!won){
      prevHand = Hand.getHand(random.nextInt(3));
    }
    return prevHand;
  }

  public void study(boolean win) {
    won = win;
  }
}
