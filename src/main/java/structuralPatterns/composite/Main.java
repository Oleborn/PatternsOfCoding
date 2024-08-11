package composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var words = List.of(
                new Word('H','e','l','l','o'),
                new Word('w','o','r','d')
        );
        Sentence sentence = new Sentence(words);
        sentence.print();
    }
}
