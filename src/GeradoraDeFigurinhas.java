import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.awt.Font;
import java.awt.Color;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {

    
    public void cria(InputStream inputStream, String nomeArquivo) throws Exception{
      
    //leitura da imagem
    // InputStream inputStream = new FileInputStream(new File("entrada/filme.jpg"));
    // InputStream inputStream = new URL("https://imersao-java-apis.s3.amazonaws.com/TopMovies_1.jpg").openStream();
    BufferedImage imagemOriginal = ImageIO.read(inputStream);


    //cria nova imagem em memória com transparência e com tamanho novo
     int largura = imagemOriginal.getWidth();
     int altura = imagemOriginal.getHeight();
     int novaAltura = altura + 200;
     BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
    
    //copiar a imagem original para nova imagem (em memória)
    Graphics2D graphics =(Graphics2D) novaImagem.getGraphics();
    graphics.drawImage(imagemOriginal, 0, 0, null);

     // configurar a fonte
     var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
     graphics.setColor(Color.YELLOW);
     graphics.setFont(fonte);


    //escrever uma frase na nova imagem
    graphics.drawString("TOPZERA", 0, novaAltura - 100);

    //escrever a nova imagem em um arquivos
    ImageIO.write(novaImagem, "png", new File(nomeArquivo));

    }

    
}
