package com.aurea.deadcode_example;

public class PrivateFunctions {
  private void privateMethodNotUsed() {

  }

  private void privateMethodUsed() {

  }

  void thisMethodUsesOtherMethod() {
    privateMethodUsed();
  }
}
