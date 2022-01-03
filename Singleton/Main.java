package Singleton;

import Singleton.Package.*;

public class Main {
  public static void main(String[] args){
    Singleton.getInstance(); // birth
    Singleton.getInstance(); // 何も表示されない。コンストラクタが呼び出されていない = インスタンスが一つ。
  }
}
