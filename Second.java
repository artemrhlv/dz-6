import java.util.LinkedHashSet;
import java.util.Set;

public class Second {

    public static void main(String[] args) {

        UniqSymbols("Alexx9800");

    }

    public static void UniqSymbols(String word) {
        char[] chars = word.toCharArray();
        Set<Character> SymbolSet = new LinkedHashSet<>();
        for(Character symbol: chars){
            SymbolSet.add(symbol);
        }

        for(Character symbol: SymbolSet){
            System.out.println(symbol);
        }
    }
}