import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    @Test
    void stringDrink(){
        StringDrink drink = new StringDrink("ABCD");
        assertEquals("ABCD", drink.getText());
        drink.setText("DCBA");
        assertEquals("DCBA", drink.getText());
    }
    @Test
    public void stringReplacer() {
        StringDrink drink = new StringDrink("ABCDABCD");
        StringReplacer sr = new StringReplacer('A', 'X');
        sr.execute(drink);
        AssertJUnit.assertEquals("XBCDXBCD", drink.getText());
    }
    @Test
    public void stringCaseChanger() {
        StringDrink drink = new StringDrink("aBcD");
        StringCaseChanger cc = new StringCaseChanger();
        cc.execute(drink);
        Assert.assertEquals("AbCd", drink.getText());
    }
    @Test
    public void stringInverter() {
        StringDrink drink = new StringDrink("ABCD");
        StringInverter si = new StringInverter();
        si.execute(drink);
        AssertJUnit.assertEquals("DCBA", drink.getText());
    }

    @Test
    public void stringRecipe() {
        StringDrink drink = new StringDrink( "AbCd-aBcD");
        StringInverter si = new StringInverter();
        StringCaseChanger cc = new StringCaseChanger();
        StringReplacer sr = new StringReplacer('A', 'X');
        List<StringTransformer> transformers = new ArrayList<>();
        transformers.add(si);
        transformers.add(cc);
        transformers.add(sr);
        StringRecipe recipe = new StringRecipe(transformers);
        recipe.mix(drink);
        assertEquals("dCbX-DcBa", drink.getText());
    }
}
