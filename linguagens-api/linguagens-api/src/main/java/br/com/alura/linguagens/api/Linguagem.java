package br.com.alura.linguagens.api;

public class Linguagem {

    private String id;
    private String title;
    private String image;
    private int ranking;

    public Linguagem(String id, String title, String image, int ranking) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public int getRanking() {
        return ranking;
    }

    
    
}
