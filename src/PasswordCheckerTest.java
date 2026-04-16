import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  //Test list 

  //isAlphanumeric() checks if pass word is numbers or digits

    @Test
    void testCheckIfTheAlpahnumericIsValid(){
      //arrange
      PasswordChecker tst = new PasswordChecker(8, 16);
      //act
      boolean actual = tst.isAlphanumeric("helloHosea");
      //assert
      assertEquals(true, actual);
    }

    @Test
    void testCheckIfTheAlpahnumericIsNotValid(){
      //arrange
      PasswordChecker tst = new PasswordChecker(8, 16);
      //act
      boolean actual = tst.isAlphanumeric("hello-/Hosea");
      //assert
      assertEquals(false, actual);
    }
    @Test
    void testCheckIfTheAlpahnumericIsNull(){
      //arrange
      PasswordChecker tst = new PasswordChecker(8, 16);
      //act
      boolean actual = tst.isAlphanumeric("");
      //assert
      assertEquals(false, actual);
    }


  //describePasswordLength()

  //isBannedPassword()

}
