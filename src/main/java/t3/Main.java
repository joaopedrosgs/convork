package t3;


import com.beust.jcommander.JCommander;
import gen.convorkLexer;
import gen.convorkParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Args argsObj = new Args();
        JCommander.newBuilder()
                .addObject(argsObj)
                .build()
                .parse(args);


        convorkParser.ProgramContext arvore = null;
        SaidaParser sp = new SaidaParser();
        try {
            CharStream input = CharStreams.fromFileName(argsObj.in);
            convorkLexer lexer = new convorkLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            convorkParser parser = new convorkParser(tokens);
            parser.addErrorListener(new ErrorListener(sp));

            arvore = parser.program();
        } catch (ParseCancellationException pce) {
            if (pce.getMessage() != null) {
                sp.println(pce.getMessage());
            }
        }
        if (sp.HasError()) {
            sp.WriteToFile(argsObj.out);
            sp.print("Falha na analise Léxica");
            return;
        }
        AnalisadorSemantico as = new AnalisadorSemantico(sp);
        as.visitProgram(arvore);

        if (sp.HasError()) {
            sp.WriteToFile(argsObj.out);
            sp.print("Falha na analise Semantica!");
            return;
        }

        GeradorMaterial gdc = new GeradorMaterial(sp);
        gdc.visitProgram(arvore);


        sp.WriteToFile(argsObj.out);

    }
}
