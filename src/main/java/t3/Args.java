package t3;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(separators = "=")
public class Args {

    @Parameter(names = "-in", description = "Arquivo fonte")
    public String in;

    @Parameter(names = "-out", description = "Arquivo de destino")
    public String out = "out.html";

    @Parameter(names = "-target", description = "Framework escolhida")
    public String target = "material";


}