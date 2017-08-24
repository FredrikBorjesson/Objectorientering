package com.company.Uppgift5;

public class Main {

  public static void main(String[] args){
      Computer computer = new Computer.ComputorBuilder()
              .processor(100)
              .memory(20)
              .ssd(200)
              .build();

      System.out.println(computer.getProcessor());
      System.out.println(computer.getMemory());
      System.out.println(computer.getSsd());
  }

}
