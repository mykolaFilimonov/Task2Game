package uamykola;

import junit.framework.TestCase;
import org.junit.Test;

public class ControllerTest extends TestCase {

  @Test
  public void testCheckOfTurn() {
    var controller = new Controller();
    controller.gameLauncher();
    controller.checkOfTurn(10);
  }
}