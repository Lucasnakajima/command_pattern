import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class StringReplacer implements StringTransformer{
    private char from, to;
    public StringReplacer(char a, char x) {
        this.from=a;
        this.to=x;
    }

    public char getFrom() {
        return from;
    }

    public char getTo() {
        return to;
    }

    @Override
    public void execute(StringDrink drink) {
        String str = drink.getText();
        str = str.replace(getFrom(), getTo());
        drink.setText(str);
    }
}
