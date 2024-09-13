package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGroceryCalculation {

  GroceryCalculations counter;

  @BeforeEach
  void setUp() {
    counter = new GroceryCalculations();
  }
  
  @Test
  void chechktensmethodnooverflow() {
    assertEquals(counter.tens(3), 3);
  }
  @Test
  void chechktensmethodoverflow() {
    assertEquals(counter.tens(10), 0);
  }
  @Test
  void chechkonesmethodoverflow() {
    assertEquals(counter.ones(10), 1);
  }
  @Test
  void chechkonesmethodoverflow2() {
    assertEquals(counter.ones(20), 0);
  }
  @Test
  void chechkonesmethodnooverflow() {
    assertEquals(counter.ones(5), 5);
  }
  @Test
  void chechktenthsmethodoverflow() {
    assertEquals(counter.tenths(11), 2);
  }
  @Test
  void chechktenthsmethodoverflow2() {
    assertEquals(counter.tenths(19), 0);
  }
  @Test
  void chechktenthsmethodnooverflow() {
    assertEquals(counter.tenths(9), 9);
  }
  @Test
  void chechkhundredsmethodoverflow() {
    assertEquals(counter.hundeths(11), 2);
  }
  @Test
  void chechkhundredsmethodoverflow2() {
    assertEquals(counter.hundeths(19), 0);
  }
  @Test
  void chechkhundredsmethodnooverflow() {
    assertEquals(counter.hundeths(9), 9);
  }
 





}