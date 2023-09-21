package com.needimplementation;

import com.Main;

import java.util.ArrayList;

// TODO Implement this class, do not modify the existing code but only add from it
public class Kitchen {

  private Thread thread;
  private Order[] orders;
  private ArrayList<String> orderArrayList = new ArrayList<String>();
  private ArrayList<Thread> threadList = new ArrayList<Thread>();

  public Kitchen(){}

  public void cook(Order o) {
    Runnable order = new Order(o.getOrderer(), o.getOrderNum(), o.getDish());
    this.thread = new Thread(order);
    this.thread.setName(o.getOrderer());
    this.thread.start();
    this.threadList.add(thread);
    orderArrayList.add(o.getOrderer());
  }

  public boolean isAllOrderFinished() {
    for (int i = 0; i < threadList.size(); i++) {
      if(this.threadList.get(i).getState() == Thread.State.TERMINATED){
        continue;
      }
      else
        return false;
    }
    return true;
  }

  public Order[] getAllUnfinishedOrders() {
    for(int i=0; i<this.threadList.size(); i++){
      if(this.threadList.get(i).getState() == Thread.State.TERMINATED)
        orderArrayList.remove(this.threadList.get(i).getName());
    }
    this.orders = new Order[orderArrayList.size()];
    for(int i=0; i<orderArrayList.size(); i++){
      this.orders[i] = new Order(orderArrayList.get(i));
    }
    return orders;
  }
}
