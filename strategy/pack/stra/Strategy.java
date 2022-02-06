package strategy.pack.stra;

import strategy.pack.Hand;

public interface Strategy {
  // 次に出す手
  public abstract Hand nextHand();
  // 戦略の内部状態を変化
  public abstract void study(boolean win);
}
