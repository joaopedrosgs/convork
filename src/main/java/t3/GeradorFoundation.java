package t3;

import gen.convorkBaseVisitor;
import gen.convorkParser;

import java.util.HashMap;

public class GeradorFoundation extends convorkBaseVisitor<Void> {
    private PilhaDeTabelas pilhaDeTabelas;

    private SaidaParser sp;
    private StringBuilder script;

    private HashMap<String, String> ButtonColor;
    private HashMap<String, String> ButtonSize;

    public GeradorFoundation(SaidaParser sp) {
        this.sp = sp;
        script = new StringBuilder();
        ButtonSize = new HashMap<String, String>();
        ButtonSize.put("small", "small");
        ButtonSize.put("normal", "");
        ButtonSize.put("medium", "large");
        ButtonSize.put("large", "large");
        ButtonColor = new HashMap<String, String>();
        ButtonColor.put("primary", "primary");
        ButtonColor.put("secondary", "secondary");
        ButtonColor.put("success", "success");
        ButtonColor.put("danger", "alert");
        ButtonColor.put("warning", "warning");
        ButtonColor.put("info", "primary");
        ButtonColor.put("light", "clear");
        ButtonColor.put("dark", " secondary");


    }

    @Override
    public Void visitProgram(convorkParser.ProgramContext ctx) {

        sp.printCode("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<!--Import Google Icon Font-->\n" +
                "<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n" +
                "<!-- Compressed CSS -->\n" +
                "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/foundation-sites@6.5.3/dist/css/foundation.min.css\" crossorigin=\"anonymous\">\n" +
                "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.2.2/motion-ui.min.css\" crossorigin=\"anonymous\">\n" +
                "<meta charset=\"utf-8\"/>"+
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
        sp.printCode(
                "<script src=\"https://code.jquery.com/jquery-2.1.4.min.js\"></script>"+
                "<script src=\"https://cdn.jsdelivr.net/npm/foundation-sites@6.5.3/dist/js/foundation.min.js\"  crossorigin=\"anonymous\"></script>" +
                "<script>" + script.toString() + "</script>" +
                "<script>\n" +
                        "      $(document).foundation();\n" +
                        "    </script>"+
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

        sp.printCode(" " + ctx.Identifier().getText() + "=" + ctx.CADEIA().getText() + " ");

        return null;
    }

    @Override
    public Void visitHeader(convorkParser.HeaderContext ctx) {
        sp.printCode(" <nav class='light-blue' role='navigation'>\n" +
                "    <div class=\"nav-wrapper container\">\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode(" </div>\n" +
                "  </nav>\n");


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
        String color = "";
        String size = "";
        if (ctx.colorParameter(0) != null) {
            color = ButtonColor.get(ctx.colorParameter(0).CADEIA().getText().substring(1, ctx.colorParameter(0).CADEIA().getText().length() - 1));
        }
        if (ctx.sizeParameter(0) != null) {
            size = ButtonSize.get(ctx.sizeParameter(0).CADEIA().getText().substring(1, ctx.sizeParameter(0).CADEIA().getText().length() - 1));
        }

        sp.printCode("  <a class=\"button " + color + " " + size + "\">\n\n");
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
        sp.printCode("</footer>\n");
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
        sp.printCode("</a>\n");
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

        sp.printCode("<div class=\"orbit\" role=\"region\" data-orbit>\n" +
                "  <div class=\"orbit-wrapper\">\n" +
                "    <div class=\"orbit-controls\">\n" +
         "<button class=\"orbit-previous\" aria-label=\"previous\"><span class=\"show-for-sr\">Previous Slide</span>&#9664;</button>\n" +
                        "<button class=\"orbit-next\" aria-label=\"next\"><span class=\"show-for-sr\">Next Slide</span>&#9654;</button>"+
                "    </div>\n" +
                "    <ul class=\"orbit-container\">\n");
        String isActive = "is-active";
        for (convorkParser.ElementContext element : ctx.element()) {
            sp.printCode("  <li class=\""+isActive+" orbit-slide\">\n" +
                    "        <figure class=\"orbit-figure\">\n" +
                    "          <img class=\"orbit-image\" src="+element.image_element().hrefParameter().CADEIA().getText()+" alt=\"Space\">\n" +
                    "        </figure>\n" +
                    "      </li>");
            isActive = "";
        }
        sp.printCode("</ul></div></div>");

        return null;
    }

    @Override
    public Void visitCard_element(convorkParser.Card_elementContext ctx) {

        sp.printCode("<div class=\"card\">\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</div>\n");
        return null;

    }

    @Override
    public Void visitContainer_element(convorkParser.Container_elementContext ctx) {
        sp.printCode("<div class=\"container\">\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</div>\n");
        return null;
    }

    @Override
    public Void visitSection_element(convorkParser.Section_elementContext ctx) {
        sp.printCode("<div class=\"section\">\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</div>\n");
        return null;

    }

    @Override
    public Void visitRow_element(convorkParser.Row_elementContext ctx) {
        String spacing = "";
        if (ctx.spacingParameter() != null) {
            spacing += 's';
            spacing += ctx.spacingParameter().CADEIA().getText().substring(1, ctx.spacingParameter().CADEIA().getText().length() - 1);
        }
        sp.printCode("<div class=\"row " + spacing + "\">\n");
        for (convorkParser.Col_elementContext element : ctx.col_element()) {
            visitCol_element(element);
        }
        sp.printCode("</div>\n");
        return null;
    }

    @Override
    public Void visitCol_element(convorkParser.Col_elementContext ctx) {
        String spacing = "";
        if (ctx.spacingParameter() != null) {
            spacing += "small-";
            spacing += ctx.spacingParameter().CADEIA().getText().substring(1, ctx.spacingParameter().CADEIA().getText().length() - 1);
        }
        sp.printCode("<div class=\"columns " + spacing + "\">\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</div>");
        return null;
    }

    @Override
    public Void visitImage_element(convorkParser.Image_elementContext ctx) {
        sp.printCode("<img src=");
        sp.printCode(ctx.hrefParameter().CADEIA().getText());
        sp.printCode(">");
        return null;

    }
}
