package owner;

import org.aeonbits.owner.Tokenizer;

public class MyTokenizer implements Tokenizer {

    // 需要复杂的的逻辑可以自定义  
    public String[] tokens(String values) {
        return values.split("-", -1);
    }
}  