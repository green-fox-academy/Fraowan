package com.Counter;

public class Counter {
  int counterParam;
  int counter = counterParam;
int defaultCounterValue;

  Counter(int counter) {
    this.counter = counter;
    defaultCounterValue = counter;
  }

  public Counter() {}

  public void add() {
    counter++;
  }

  public void add(int counterParam) {
    counter += counterParam;
  }

  public void reset() {
    counter = defaultCounterValue;
  }

  public int get() {
    return counter;
  }
}
