public class Text {
   private String header;
    private String body;

    public Text(Word word, Phrase phrase) {
        this.header = word.getValue();
        this.body = phrase.getValue();
    }
    public Text(Word word1, Word word2) {
        this.header = word1.getValue();
        this.body = word2.getValue();
    }

    public Text(Word word) {
        this.header = word.getValue();
    }
    public void addText(Phrase phrase){
        body = body+" "+phrase;
    }
    public void addText(Word word){
        body = body+" "+word;
    }
    public void viewText(){
        System.out.println(this);
    }
    public void viewHeader(){
        System.out.println(this.header);
    }

    @Override
    public String toString() {
        return header + "\n" +
                 body ;
    }
}
