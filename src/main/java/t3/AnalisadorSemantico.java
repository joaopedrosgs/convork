package t3;


import gen.convorkBaseVisitor;
import gen.convorkParser;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnalisadorSemantico extends convorkBaseVisitor<String> {
    private SaidaParser sp;
    private HashSet<String> Colors;
    private HashSet<String> Margin;
    private HashSet<String> Padding;
    private HashSet<String> Size;
    private HashSet<String> Icon;



    public AnalisadorSemantico(SaidaParser sp) {
        this.sp = sp;
        Colors = new HashSet<String>();
        Colors.add("primary");
        Colors.add("secondary");
        Colors.add("success");
        Colors.add("danger");
        Colors.add("warning");
        Colors.add("info");
        Colors.add("light");
        Colors.add("dark");

        Margin = new HashSet<String>();
        Margin.add("none");
        Margin.add("normal");
        Margin.add("medium");
        Margin.add("large");
        Margin.add("auto");

        Padding = new HashSet<String>();
        Padding.add("none");
        Padding.add("normal");
        Padding.add("medium");
        Padding.add("large");
        Padding.add("auto");

        Size = new HashSet<String>();
        Size.add("small");
        Size.add("normal");
        Size.add("medium");
        Size.add("large");

        Size = new HashSet<String>();
        Size.add("small");
        Size.add("normal");
        Size.add("medium");
        Size.add("large");

    }

    @Override
    public String visitProgram(convorkParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public String visitSource(convorkParser.SourceContext ctx) {
        return super.visitSource(ctx);
    }

    @Override
    public String visitParameters(convorkParser.ParametersContext ctx) {
        return super.visitParameters(ctx);
    }

    @Override
    public String visitParameter(convorkParser.ParameterContext ctx) {
        return super.visitParameter(ctx);
    }

    @Override
    public String visitHeader(convorkParser.HeaderContext ctx) {
        return super.visitHeader(ctx);
    }

    @Override
    public String visitContent(convorkParser.ContentContext ctx) {
        return super.visitContent(ctx);
    }

    @Override
    public String visitFooter(convorkParser.FooterContext ctx) {
        return super.visitFooter(ctx);
    }

    @Override
    public String visitElement(convorkParser.ElementContext ctx) {
        return super.visitElement(ctx);
    }

    @Override
    public String visitLogo_element(convorkParser.Logo_elementContext ctx) {
        for(convorkParser.ElementContext element : ctx.element())  {
            if(element.image_element()==null && element.text_element()==null) {
                sp.print("Linha "+element.start.getLine()+": Logo não pode possuir filhos que não são text ou imagem");
            }
            visitElement(element);
        }
        return super.visitLogo_element(ctx);
    }

    @Override
    public String visitColorParameter(convorkParser.ColorParameterContext ctx) {
        if(!Colors.contains(ctx.CADEIA().getText().substring(1,ctx.CADEIA().getText().length()-1)))
            sp.println("Linha "+ctx.start.getLine()+": Valor inválido no parametro 'color'!");
        return "";
    }

    @Override
    public String visitPaddingParameter(convorkParser.PaddingParameterContext ctx) {

        if(!Padding.contains(ctx.CADEIA().getText().substring(1,ctx.CADEIA().getText().length()-1)))
            sp.println("Linha "+ctx.start.getLine()+": Valor inválido no parametro 'padding'!");
        return "";

    }

    @Override
    public String visitMarginParameter(convorkParser.MarginParameterContext ctx) {

        if(!Margin.contains(ctx.CADEIA().getText().substring(1,ctx.CADEIA().getText().length()-1)))
            sp.println("Linha "+ctx.start.getLine()+": Valor inválido no parametro 'margin'!");
        return "";
    }

    @Override
    public String visitSizeParameter(convorkParser.SizeParameterContext ctx) {

        if(!Size.contains(ctx.CADEIA().getText().substring(1,ctx.CADEIA().getText().length()-1)))
            sp.println("Linha "+ctx.start.getLine()+": Valor inválido no parametro 'size'!");
        return "";
    }

    @Override
    public String visitIconParameter(convorkParser.IconParameterContext ctx) {
        return super.visitIconParameter(ctx);
    }

    @Override
    public String visitButton_element(convorkParser.Button_elementContext ctx) {

        for(convorkParser.ElementContext element : ctx.element())  {
            if(element.text_element()==null ) {
                sp.print("Linha "+element.start.getLine()+": Botão deve possuir apenas texto");
            }
            visitElement(element);
        }
        return super.visitButton_element(ctx);
    }

    @Override
    public String visitSearch_element(convorkParser.Search_elementContext ctx) {
        return super.visitSearch_element(ctx);
    }

    @Override
    public String visitCarousel_element(convorkParser.Carousel_elementContext ctx) {
        for(convorkParser.ElementContext element : ctx.element())  {
            if(element.image_element()==null) {
                sp.print("Linha "+element.start.getLine()+": Carrossel deve possuir apenas imagens");
            }
            visitElement(element);
        }
        return super.visitCarousel_element(ctx);
    }

    @Override
    public String visitText_element(convorkParser.Text_elementContext ctx) {
        return super.visitText_element(ctx);
    }

    @Override
    public String visitCard_element(convorkParser.Card_elementContext ctx) {
        return super.visitCard_element(ctx);
    }

    @Override
    public String visitContainer_element(convorkParser.Container_elementContext ctx) {
        return super.visitContainer_element(ctx);
    }

    @Override
    public String visitImage_element(convorkParser.Image_elementContext ctx) {
        return super.visitImage_element(ctx);
    }
}