package t3;

import gen.convorkBaseVisitor;
import gen.convorkParser;

import java.util.HashMap;

public class GeradorMaterial extends convorkBaseVisitor<Void> {
    private PilhaDeTabelas pilhaDeTabelas;

    private SaidaParser sp;
    private StringBuilder script;

    private HashMap<String, String> ButtonColor;
    private HashMap<String, String> ButtonSize;

    public GeradorMaterial(SaidaParser sp) {
        this.sp = sp;
        script = new StringBuilder();
        ButtonSize = new HashMap<String,String>();
        ButtonSize.put("small", "btn-small");
        ButtonSize.put("normal", "btn");
        ButtonSize.put("medium", "btn-large");
        ButtonSize.put("large", "btn-large");
        ButtonColor = new HashMap<String,String>();
        ButtonColor.put("primary","blue darken-2");
        ButtonColor.put("secondary","grey darken-1");
        ButtonColor.put("success","green darken-1");
        ButtonColor.put("danger","red darken-1");
        ButtonColor.put("warning","yellow");
        ButtonColor.put("info","blue");
        ButtonColor.put("light","grey lighten-4");
        ButtonColor.put("dark"," grey darken-3");


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
        sp.printCode("<nav class='light-blue' role='navigation'>\n" +
                "    <div class=\"nav-wrapper\">\n");

        if (ctx.element(0).logo_element() != null) {
            visitElement(ctx.element(0));
        }

        sp.printCode("<ul class=\"right hide-on-med-and-down\">");
        for (convorkParser.ElementContext element : ctx.element()) {
            if (element.logo_element() == null) {
                visitElement(element);
            }
        }
        sp.printCode("\n</div>\n" +
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
        String color="";
        String size="btn";

        if(ctx.colorParameter(0)!=null) {
            color = ButtonColor.get(ctx.colorParameter(0).CADEIA().getText().substring(1, ctx.colorParameter(0).CADEIA().getText().length() - 1));
        }
        if(ctx.sizeParameter(0)!=null) {
            size = ButtonSize.get(ctx.sizeParameter(0).CADEIA().getText().substring(1, ctx.sizeParameter(0).CADEIA().getText().length() - 1));
        }

        // Button from navbar
        if (ctx.getParent().getParent().getClass() == convorkParser.HeaderContext.class) {
            sp.printCode("<li><a href=\"#\" class=\"btn "+color+" "+size+"\">");
                for (convorkParser.ElementContext element : ctx.element()) {
                    visitElement(element);
                }
            sp.printCode("</a></li>\n");
        } else {
            sp.printCode("<a class=\"waves-effect waves-light " + color + " " + size + "\">\n\n");
            for (convorkParser.ElementContext element : ctx.element()) {
                visitElement(element);
            }
            sp.printCode("</a>\n");
        }

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
        sp.printCode(
                "      </ul>\n<form style=\"margin-left:200px;\">\n" +
                "        <div class=\"input-field\" style=\"max-width:200px;\">\n" +
                "          <input id=\"search\" type=\"search\"  required>\n" +
                "          <label class=\"label-icon\" for=\"search\"><i class=\"material-icons\">search</i></label>\n" +
                "          <i class=\"material-icons\">close</i>\n" +
                "        </div>\n" +
                "      </form>");
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
        if(ctx.spacingParameter()!=null) {
            spacing += 's';
            spacing += ctx.spacingParameter().CADEIA().getText().substring(1,ctx.spacingParameter().CADEIA().getText().length()-1);
        }
        sp.printCode("<div class=\"row "+spacing+"\">\n");
        for (convorkParser.Col_elementContext element : ctx.col_element()) {
            visitCol_element(element);
        }
        sp.printCode("</div>\n");
        return null;
    }

    @Override
    public Void visitCol_element(convorkParser.Col_elementContext ctx) {
        String spacing = "";
        if(ctx.spacingParameter()!=null) {
            spacing += 's';
            spacing += ctx.spacingParameter().CADEIA().getText().substring(1,ctx.spacingParameter().CADEIA().getText().length()-1);
        }
        sp.printCode("<div class=\"col "+spacing+"\">\n");
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
