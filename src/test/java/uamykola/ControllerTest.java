package uamykola;

import junit.framework.TestCase;
import org.junit.Test;

public class ControllerTest extends TestCase {

  @Test
  public void testCheckOfTurn() {
    var controller = new Controller();
    Model model = controller.getModel();
    model.setSoughtValue(Model.START_MAX, Model.START_MIN);
    System.out.println(model.getSoughtValue());
    controller.checkOfTurn(model.getSoughtValue());
  }
}