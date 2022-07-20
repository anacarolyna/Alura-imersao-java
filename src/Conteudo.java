import javax.swing.plaf.BorderUIResource.TitledBorderUIResource;

public class Conteudo {
    
    private final String titulo; 
    private final String urlImagem;

    

    public Conteudo(String titulo, String urlImagem) {
        this.titulo = titulo;  //this é sempre do objeto(titulo deste objeto),quando está fora ele procura no escopo mais próximo(no caso o parametro do construtor)
        this.urlImagem = urlImagem;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getUrlImagem() {
        return urlImagem;
    }

     

}
