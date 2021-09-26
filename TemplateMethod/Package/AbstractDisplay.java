package TemplateMethod.Package;

public abstract class AbstractDisplay {
  protected abstract void open();
  protected abstract void print();
  protected abstract void close();
  // オーバーライドされない為にfinalにする
  public final void display(){
    open();
    for (int i = 0; i < 5; i++) {
      print();
    }
    close();
  }
}
