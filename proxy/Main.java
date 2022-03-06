package proxy;

public class Main {
  public static void main(String[] args) {
    Printable p = new PrinterProxy("Alice");
    System.out.println("名前は現在" + p.getPrinterName());
    p.setPrinterName("Bob");
    System.out.println("名前は現在" + p.getPrinterName());
    p.print("Hello World");
  }
}
