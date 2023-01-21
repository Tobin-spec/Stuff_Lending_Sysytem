package model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class SimpleTest {

  @Test
  public void testMessageLengthGreaterThanZero() {
    MemberRegistry sut = new MemberRegistry();

    assertTrue(sut.listAllMembers().length() > 0, "Message length should be greater that zero");
  }
  
}
