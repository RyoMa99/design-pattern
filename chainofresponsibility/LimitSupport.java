package chainofresponsibility;

public class LimitSupport extends Support {
  private int limit;
  public LimitSupport(String name, int limit){
    super(name);
    this.limit = limit;
  }

  protected boolean resolve(Trouble trouble){
    if (trouble.getNumber() < limit){
      return true; // 本来はここに解決のための処理を書く。
    }else{
      return false;
    }
  }
}
