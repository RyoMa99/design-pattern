package visitor;

public class Main {
  public static void main(String[] args) {
    try{
      System.out.println("Making root entries...");
      Directory rootdir = new Directory("root");
      Directory bindir = new Directory("bin");
      Directory tmpdir = new Directory("tmp");
      Directory usrdir = new Directory("usr");
      rootdir.add(bindir);
      rootdir.add(tmpdir);
      rootdir.add(usrdir);
      bindir.add(new File("vi", 10000));
      bindir.add(new File("latex", 20000));
      // 探索したい場所のルートにvisitorのインスタンスを渡す
      rootdir.accept(new ListVisitor());
      
      System.out.println("");
      System.out.println("Making user entries...");
      Directory yuki = new Directory("yuki");
      Directory hanako = new Directory("hanako");
      Directory toru = new Directory("toru");
      usrdir.add(yuki);
      usrdir.add(hanako);
      usrdir.add(toru);
      yuki.add(new File("diary.html", 100));
      yuki.add(new File("diary.java", 200));
      hanako.add(new File("memo.txt", 300));
      toru.add(new File("junk.mail", 400));
      toru.add(new File("game.doc", 500));
      rootdir.accept(new ListVisitor());

    } catch (FileTreatmentException e){
      e.printStackTrace();
    }
  }
}
