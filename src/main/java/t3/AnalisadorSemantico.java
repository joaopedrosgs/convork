package t3;


import gen.convorkBaseVisitor;
import gen.convorkParser;

public class AnalisadorSemantico extends convorkBaseVisitor<String> {
    private PilhaDeTabelas pilhaDeTabelas;

    private SaidaParser sp;

    public AnalisadorSemantico(SaidaParser sp) {
        this.sp = sp;
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
        return super.visitColorParameter(ctx);
    }

    @Override
    public String visitPaddingParameter(convorkParser.PaddingParameterContext ctx) {
        return super.visitPaddingParameter(ctx);
    }

    @Override
    public String visitMarginParameter(convorkParser.MarginParameterContext ctx) {
        return super.visitMarginParameter(ctx);
    }

    @Override
    public String visitSizeParameter(convorkParser.SizeParameterContext ctx) {
        return super.visitSizeParameter(ctx);
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