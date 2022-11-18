import java.util.List;

public class StringRecipe{
    private List<StringTransformer> transformers;
    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public List<StringTransformer> getTransformers() {
        return transformers;
    }

    public void mix(StringDrink drink) {
        for (int i = 0; i < transformers.size(); i++) {
            if(transformers.get(i).getClass() == StringInverter.class){
                StringInverter si = new StringInverter();
                si.execute(drink);
            } else if (transformers.get(i).getClass() == StringCaseChanger.class) {
                StringCaseChanger cc = new StringCaseChanger();
                cc.execute(drink);
            } else {
                StringReplacer sr = new StringReplacer('A', 'X');
                sr.execute(drink);
            }
        }
    }
}
