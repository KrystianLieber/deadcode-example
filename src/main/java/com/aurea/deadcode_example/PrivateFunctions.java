package com.aurea.deadcode_example;

public class PrivateFunctions {


  private PrivateFunctions() {

  }

  public PrivateFunctions(int a) {
    this();
  }

  private PrivateFunctions(int a, int b) {
    this();
  }

  private void privateMethodNotUsed() {

  }

  private void privateMethodUsed() {

  }

  void thisMethodUsesOtherMethod() {
    privateMethodUsed();
  }
}
