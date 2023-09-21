package com.needimplementation;

import com.Main;

import java.util.Scanner;

// TODO Implement this class, do not modify the existing code but only add from it
public class Order implements Runnable {

  private String Orderer;
  private int OrderNum;
  private String[] dish;

  public Order(){}
  public Order(String orderer){
    this.Orderer = orderer;
  }
  public Order(String Orderer, int OrderNum, String dish[]) {
    this.Orderer = Orderer;
    this.OrderNum = OrderNum;
    this.dish = dish;
  }

  public String getOrderer(){
    return this.Orderer;
  }
  public int getOrderNum(){
    return this.OrderNum;
  }
  public String[] getDish(){
    return this.dish;
  }
  public String toString(){
    return this.Orderer;
  }

  public static Order[] loadOrder(Scanner scanner) {
    String str = scanner.nextLine(); //총 주문자
    int size = Integer.parseInt(str);
    Order[] orderList = new Order[size]; //주문 리스트
    for(int i=0; i<size; i++){
      String Orderer = scanner.nextLine(); //주문자 이름
      String Num = scanner.nextLine(); //주문 갯수
      int OrderNum = Integer.parseInt(Num);
      String[] dish = new String[OrderNum]; //음식 리스트
      for(int j=0; j<OrderNum; j++){
        dish[j] = scanner.nextLine();
      }
      orderList[i] = new Order(Orderer, OrderNum, dish);
    }
    return orderList;
  }

  @Override
  public void run() {
    try {
      for(int i=0; i<this.OrderNum; i++){
        cook(this.dish[i]);
      }
      Main.println(">>Order from [" + this + "] finished");
    } catch (InterruptedException ignored) {
      // Should never ever happen if program is implemented as requested
    }
  }

  private void cook(String dish) throws InterruptedException {
    switch (dish) {
      case "egg":
        Thread.sleep(50);
        break;
      case "ramen":
        Thread.sleep(100);
        break;
      case "friedrice":
        Thread.sleep(150);
        break;
      case "ovenroast":
        Thread.sleep(200);
        break;
      case "bibimmyon":
        Thread.sleep(250);
        break;
      default:
        break;
    }
  }
}
