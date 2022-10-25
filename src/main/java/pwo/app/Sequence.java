package pwo.app;

/**
 * Klasa rozruchu programu
 */
public class Sequence {
    /**
     * Uruchamia odpowiedni program na podstawie podanych argumentów
     * @param args Argumenty przekazane do programu
     */
    public static void main(String[] args) {
        switch(args.length){
            case 3: (new SeqToOutApp()).run(args); break;
            case 4: (new SeqToFileApp()).run(args); break;
            default: System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to [fileName]");
        }
    }
}
