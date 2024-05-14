import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
            // Especifica o caminho do arquivo a ser lido
            String nomeArquivo = "arquivo.txt";
            Path arquivo = Paths.get(nomeArquivo);
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha : linhas) {
                System.out.println(linha);
            }
        }

}