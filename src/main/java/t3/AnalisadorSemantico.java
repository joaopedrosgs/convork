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
    public String visitJs(convorkParser.JsContext ctx) {
        return super.visitJs(ctx);
    }

    @Override
    public String visitStatements(convorkParser.StatementsContext ctx) {
        return super.visitStatements(ctx);
    }

    @Override
    public String visitFunctionDec(convorkParser.FunctionDecContext ctx) {
        return super.visitFunctionDec(ctx);
    }

    @Override
    public String visitFormalParameterList(convorkParser.FormalParameterListContext ctx) {
        return super.visitFormalParameterList(ctx);
    }

    @Override
    public String visitFunctionBody(convorkParser.FunctionBodyContext ctx) {
        return super.visitFunctionBody(ctx);
    }

    @Override
    public String visitVariableValue(convorkParser.VariableValueContext ctx) {
        return super.visitVariableValue(ctx);
    }

    @Override
    public String visitVariables(convorkParser.VariablesContext ctx) {
        return super.visitVariables(ctx);
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
        return super.visitLogo_element(ctx);
    }

    @Override
    public String visitButton_element(convorkParser.Button_elementContext ctx) {
        return super.visitButton_element(ctx);
    }

    @Override
    public String visitSearch_element(convorkParser.Search_elementContext ctx) {
        return super.visitSearch_element(ctx);
    }

    @Override
    public String visitCarousel_element(convorkParser.Carousel_elementContext ctx) {
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