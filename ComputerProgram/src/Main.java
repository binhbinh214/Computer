
import controller.CalculatorController;
import model.CalculatorModel;
import view.Menu;


public class Main {
     public static void main(String[] args) {
        Menu view = new Menu();
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(view, model);

        controller.runCalculator();
    }
}
    

