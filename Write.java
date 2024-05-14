import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;


public class Write {
    public static void main(String[] args) throws IOException {
    String nomeArquivo = "arquivo.txt";
    Path arquivo = Paths.get(nomeArquivo);
    String conteudo ="OLa";
    FileWriter escritor = new FileWriter(nomeArquivo);
    escritor.write(conteudo);
    escritor.close();
    }

}
