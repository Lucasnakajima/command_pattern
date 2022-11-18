import java.util.List;

public class StringRecipe implements StringTransformer{
    private List<StringTransformer> transformers;
    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public List<StringTransformer> getTransformers() {
        return transformers;
    }

    @Override
    public void execute(StringDrink drink) {

    }

    public void mix(StringDrink drink) {
    }
}
