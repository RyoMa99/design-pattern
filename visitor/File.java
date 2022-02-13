package visitor;

public class File extends Entry {
  private String name;
  private int size;
  public File(String name, int size){
    this.name = name;
    this.size = size;
  }

  public String getName(){
    return name;
  }

  public int getSize(){
    return size;
  }

  public void accept(Visitor v){
    // thisはこのFileクラスのインスタンスを指すため、visit(File file)の方が呼び出される
    v.visit(this);
  }
}
