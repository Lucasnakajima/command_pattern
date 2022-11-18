import org.testng.annotations.Test;

import static java.lang.Character.*;
import static org.testng.Assert.assertEquals;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String str = "";
        for(int i=0; i<drink.getText().length(); i++) {
            char ch;
            ch = drink.getText().charAt(i);
            if(isLowerCase(ch))
              ch =  toUpperCase(ch);
            else
                ch = toLowerCase(ch);
            str = str + ch;
        }
        drink.setText(str);
    }
}
