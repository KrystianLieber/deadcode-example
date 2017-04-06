package com.aurea.deadcode_example;

public class PrivateVariables {
  private String memberVariableUnset;
  private String memberVariableSet = "";
  private String memberVariableUnsetUsed;
  private String memberVariableSetUsed = "";

  public void testMethod() {
    int localVariableSet = 0;
    int localVariableUnset = 0;
    int localVariableSetUsed = 0;
    int localVariableUnsetUsed = 0;
    System.out.println(memberVariableUnsetUsed);
    System.out.println(memberVariableSetUsed);
    System.out.println(localVariableSetUsed);
    System.out.println(localVariableUnsetUsed);
  }
}
