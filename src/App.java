import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       

        //fazer uma conexão HTTP e buscar os top 250 filmes

        // String url = "https://api.mocki.io/v2/549a5d8b/Top250Movies";
        // ExtratorDeConteudo extrator = new ExtratorDeConteudoDoIMDB();

        String url = "https://api.mocki.io/v2/549a5d8b/NASA-APOD"; // usando endereço alternativo
        ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();

        var http = new ClienteHttp();
        String json = http.buscaDados(url);
   
        // System.out.println(listaDeFilmes.size());
        // System.out.println(listaDeFilmes.get( 0));

        //exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);
        
        var geradora = new GeradoraDeFigurinhas();
        
        for(int i=0; i<3; i++) {

        Conteudo conteudo = conteudos.get(i); 

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println(conteudo.getTitulo());
            System.out.println();
              
    }
    }
}



