package t3;

import gen.convorkBaseVisitor;
import gen.convorkParser;

public class GeradorMaterial extends convorkBaseVisitor<Void> {
    private PilhaDeTabelas pilhaDeTabelas;

    private SaidaParser sp;
    private StringBuilder script;

    public GeradorMaterial(SaidaParser sp) {
        this.sp = sp;
        script = new StringBuilder();
    }

    @Override
    public Void visitProgram(convorkParser.ProgramContext ctx) {

        sp.printCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<!--Import Google Icon Font-->\n" +
                "<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n" +
                "<!--Import materialize.css-->\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\n" +
                "<!--Let browser know website is optimized for mobile-->\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n" +
                "</head>\n" +
                "<body>");
        if (ctx.header() != null) {
            visitHeader(ctx.header());
        }
        visitContent(ctx.content());

        if (ctx.footer() != null) {
            visitFooter(ctx.footer());
        }
        sp.printCode("<script\n" +
                "  src=\"https://code.jquery.com/jquery-3.4.1.min.js\"\n" +
                "  integrity=\"sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=\"\n" +
                "  crossorigin=\"anonymous\"></script>" +
                " <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\n" +
                "<script>"+script.toString()+"</script>"+
                "</body>\n" +
                "</html>\n");

        return null;
    }


    @Override
    public Void visitSource(convorkParser.SourceContext ctx) {
        super.visitSource(ctx);

        return null;
    }

    @Override
    public Void visitParameters(convorkParser.ParametersContext ctx) {
        super.visitParameters(ctx);

        return null;
    }

    @Override
    public Void visitParameter(convorkParser.ParameterContext ctx) {

        sp.printCode(" "+ctx.Identifier().getText() + "=" + ctx.CADEIA().getText()+" ");

        return null;
    }

    @Override
    public Void visitHeader(convorkParser.HeaderContext ctx) {
        sp.printCode(" <nav class='light-blue' role='navigation'>\n" +
                "    <div class=\"nav-wrapper container\">\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode(" <div>\n" +
                "  </nav>");


        return null;
    }

    @Override
    public Void visitContent(convorkParser.ContentContext ctx) {

        sp.printCode("<div class='content container'>\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</div>\n");


        return null;
    }


    @Override
    public Void visitButton_element(convorkParser.Button_elementContext ctx) {
        String color="";
        if(ctx.colorParameter(0)!=null) {
            color = ctx.colorParameter(0).CADEIA().getText().substring(1, ctx.colorParameter(0).CADEIA().getText().length() - 1);
        }

        sp.printCode("  <a class=\"waves-effect waves-light "+color+" btn-flat\">\n\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</a>\n");

        return null;
    }


    @Override
    public Void visitText_element(convorkParser.Text_elementContext ctx) {
        sp.printCode(ctx.CADEIA().getText().substring(1, ctx.CADEIA().getText().length() - 1));

        return null;
    }

    @Override
    public Void visitFooter(convorkParser.FooterContext ctx) {

        sp.printCode(" <footer class=\"page-footer\">\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</footer>");
        return null;
    }

    @Override
    public Void visitElement(convorkParser.ElementContext ctx) {
        return super.visitElement(ctx);
    }

    @Override
    public Void visitLogo_element(convorkParser.Logo_elementContext ctx) {
        sp.printCode("<a id='logo-container' href=\"#\" class=\"brand-logo\">\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</a>");
        return null;
    }

    @Override
    public Void visitSearch_element(convorkParser.Search_elementContext ctx) {
        sp.printCode("<div class='right nav-wrapper'><form>\n" +
                "        <div class=\"input-field\">\n" +
                "          <input id=\"search\" type=\"search\" required>\n" +
                "          <label class=\"label-icon\" for=\"search\"><i class=\"material-icons\">search</i></label>\n" +
                "          <i class=\"material-icons\">close</i>\n" +
                "        </div>\n" +
                "      </form></div>");
        return null;
    }

    @Override
    public Void visitCarousel_element(convorkParser.Carousel_elementContext ctx) {
        sp.printCode("<div class=\"carousel carousel-slider\">\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            sp.printCode(" <a class=\"carousel-item\" href=\"#one!\"><img src="+element.image_element().hrefParameter().CADEIA().getText()+"></a>");
        }
        sp.printCode("</div>");
        script.append("// CAROUSEL\n" +
                "$(document).ready(function(){\n" +
                "  $('.carousel').carousel(\n" +
                "  {\n" +
                "    dist: 0,\n" +
                "    padding: 0,\n" +
                "    height:300, \n"+
                "    fullWidth: true,\n" +
                "    indicators: true,\n" +
                "    duration: 100,\n" +
                "  }\n" +
                "  );\n" +
                "});\n" +
                "\n" +
                "autoplay()   \n" +
                "function autoplay() {\n" +
                "   \n" +
                "    setTimeout(autoplay, 4500);\n" +
                "}");
        return null;
    }

    @Override
    public Void visitCard_element(convorkParser.Card_elementContext ctx) {
        return super.visitCard_element(ctx);
    }

    @Override
    public Void visitContainer_element(convorkParser.Container_elementContext ctx) {
        sp.printCode("<div class=\"container\">");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</div>");
        return null;
    }

    @Override
    public Void visitSection_element(convorkParser.Section_elementContext ctx) {
        sp.printCode("<div class=\"section\">");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</div>");
        return null;

    }

    @Override
    public Void visitRow_element(convorkParser.Row_elementContext ctx) {
        sp.printCode("<div class=\"row\">");
        for (convorkParser.Col_elementContext element : ctx.col_element()) {
            visitCol_element(element);
        }
        sp.printCode("</div>");
        return null;
    }

    @Override
    public Void visitCol_element(convorkParser.Col_elementContext ctx) {
        sp.printCode("<div class=\"col\">");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</div>");
        return null;
    }

    @Override
    public Void visitImage_element(convorkParser.Image_elementContext ctx) {
        return super.visitImage_element(ctx);
    }
}
