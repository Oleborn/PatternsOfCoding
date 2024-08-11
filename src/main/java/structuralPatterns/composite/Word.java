package composite;

import java.util.List;

public class Word extends LetterComposite {
    public Word(List<Letter> letters) {
        letters.forEach(this::add);
    }
    public Word(char... letters) {
        for (char c:letters){
            this.add(new Letter(c));
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}
