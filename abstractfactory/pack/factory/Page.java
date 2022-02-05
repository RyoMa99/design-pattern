package abstractfactory.pack.factory;
import java.io.*;
import java.util.ArrayList;

// ItemのサブクラスにするとTrayの対象になってしまうため不適切。しかし、makeHTMLメソッドを別途定義する必要が出てきたのが少し違和感。
// makeHTMLメソッドを定義するためのインターフェースを作成し、Page、Item両方がそのinterfaceを実装する形にすればよい。
public abstract class Page {
  protected String title;
  protected String author;
  protected ArrayList content = new ArrayList();
  public Page(String title, String author){
    this.title = title;
    this.author = author;
  }
  
  public void add(Item item){
    content.add(item);
  }

  public void output(){
    try {
      String filename = title + ".html";
      Writer writer = new FileWriter(filename);
      writer.write(this.makeHTML());
      writer.close();
      System.out.println(filename + "を作成しました。");
    } catch(IOException e) {
      e.printStackTrace();
    }
  }

  public abstract String makeHTML();
}