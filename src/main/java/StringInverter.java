import org.testng.annotations.Test;
import java.lang.StringBuilder;

import static org.testng.AssertJUnit.assertEquals;

public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
       StringBuilder str = new StringBuilder(drink.getText());
        str.reverse();
        drink.setText(str.toString());
    }
}
