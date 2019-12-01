package t3;

import gen.convorkBaseVisitor;
import gen.convorkParser;

import java.util.HashMap;

public class GeradorBootstrap extends convorkBaseVisitor<Void> {
    private PilhaDeTabelas pilhaDeTabelas;

    private SaidaParser sp;
    private StringBuilder script;
    private HashMap<String, String> ButtonColor;
    private HashMap<String, String> ButtonSize;
    private Integer carouselCount = 0;

    public GeradorBootstrap(SaidaParser sp) {
        this.sp = sp;
        script = new StringBuilder();
        ButtonSize = new HashMap<String,String>();
        ButtonSize.put("small", "btn-sm");
        ButtonSize.put("normal", "btn");
        ButtonSize.put("medium", "btn");
        ButtonSize.put("large", "btn-lg");
        ButtonColor = new HashMap<String,String>();
        ButtonColor.put("primary", "btn-primary");
        ButtonColor.put("secondary", "btn-secondary");
        ButtonColor.put("success", "btn-success");
        ButtonColor.put("danger", "btn-danger");
        ButtonColor.put("warning", "btn-warning");
        ButtonColor.put("info", "btn-info");
        ButtonColor.put("light", "btn-light");
        ButtonColor.put("dark", "dark");
    }

    @Override
    public Void visitProgram(convorkParser.ProgramContext ctx) {


        sp.printCode("<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <!-- Required meta tags -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "\n" +
                "    <!-- Bootstrap CSS -->\n" +
                "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n" +
                "\n" +
                "    <title>Hello, world!</title>\n" +
                "  </head>\n" +
                "  <body>\n"
                );
        if (ctx.header() != null) {
            visitHeader(ctx.header());
        }
        visitContent(ctx.content());

        if (ctx.footer() != null) {
            visitFooter(ctx.footer());
        }
        sp.printCode("    <!-- Optional JavaScript -->\n" +
                "    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n" +
                "    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n" +
                "  </body>\n" +
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
        sp.printCode("<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n");
        if (ctx.element(0).logo_element() != null) {
            visitElement(ctx.element(0));
        }

        sp.printCode("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                     "    <span class=\"navbar-toggler-icon\"></span>\n" +
                     "  </button>" +
                     "  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
                     "    <ul class=\"navbar-nav mr-auto\">");
        for (convorkParser.ElementContext element : ctx.element()) {
            if (element.logo_element() == null) {
                visitElement(element);
            }
        }
        sp.printCode("    </ul>\n" +
                "  </div>\n" +
                "  </nav>");


        return null;
    }

    @Override
    public Void visitContent(convorkParser.ContentContext ctx) {

        sp.printCode("<div class='container'>\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</div>\n");


        return null;
    }


    @Override
    public Void visitButton_element(convorkParser.Button_elementContext ctx) {
        String color = "btn-primary";
        String size = null;
        if(ctx.colorParameter(0)!=null) {
            color = ButtonColor.get(ctx.colorParameter(0).CADEIA().getText().substring(1, ctx.colorParameter(0).CADEIA().getText().length() - 1));
        }
        if(ctx.sizeParameter(0)!=null) {
            size = ButtonSize.get(ctx.sizeParameter(0).CADEIA().getText().substring(1, ctx.sizeParameter(0).CADEIA().getText().length() - 1));
        }

        if(ctx.getParent().getParent().getClass() == convorkParser.HeaderContext.class) {
            sp.printCode("<li class=\"nav-item\">\n" +
                    "<a class=\"nav-link\" href=\"#\">");
            for (convorkParser.ElementContext element : ctx.element()) {
                visitElement(element);
            }
            sp.printCode("</a>\n" +
                    "      </li>");
        } else {
            sp.printCode("  <button type=\"button\" class=\"btn "+ color);
            if (size != null) {
                sp.printCode(" " + size);
            }
            sp.printCode("\">\n\n");
            for (convorkParser.ElementContext element : ctx.element()) {
                visitElement(element);
            }
            sp.printCode("</button>\n");
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
        return super.visitFooter(ctx);
    }

    @Override
    public Void visitElement(convorkParser.ElementContext ctx) {
        return super.visitElement(ctx);
    }

    @Override
    public Void visitLogo_element(convorkParser.Logo_elementContext ctx) {

        sp.printCode("  <a class=\"navbar-brand\" href=\"#\">");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</a>");
        return null;
    }

    @Override
    public Void visitSearch_element(convorkParser.Search_elementContext ctx) {
        sp.printCode("</ul><form class=\"form-inline\">\n" +
                "    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n" +
                "    <button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">Search</button>\n" +
                "  </form>");
        return null;
    }

    @Override
    public Void visitCarousel_element(convorkParser.Carousel_elementContext ctx) {
        sp.printCode(
            "<div id=\"carousel" + carouselCount + "\" class=\"carousel slide\" data-ride=\"carousel\">\n" +
            "  <div class=\"carousel-inner\">\n");
        Boolean isFirst = true;
        for (convorkParser.ElementContext image: ctx.element()) {
            if (isFirst) {
                sp.printCode(
                        "    <div class=\"carousel-item active");
                isFirst = false;
            } else {
                sp.printCode(
                        "    <div class=\"carousel-item");
            }
            sp.printCode("\">\n" +
            "    <img class=\"d-block w-100\" src="+ image.image_element().hrefParameter().CADEIA().getText() +" alt=\"First slide\">\n" +
            "    </div>\n");
        }
        sp.printCode(
            "  </div>\n" +
            "  <a class=\"carousel-control-prev\" href=\"#carousel" + carouselCount +"\" role=\"button\" data-slide=\"prev\">\n" +
            "    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n" +
            "    <span class=\"sr-only\">Previous</span>\n" +
            "  </a>\n" +
            "  <a class=\"carousel-control-next\" href=\"#carousel" + carouselCount +"\" role=\"button\" data-slide=\"next\">\n" +
            "    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n" +
            "    <span class=\"sr-only\">Next</span>\n" +
            "  </a>\n" +
            "</div>");
        carouselCount++;
        return null;
    }

    @Override
    public Void visitCard_element(convorkParser.Card_elementContext ctx) {
        return super.visitCard_element(ctx);
    }

    @Override
    public Void visitContainer_element(convorkParser.Container_elementContext ctx) {
        return super.visitContainer_element(ctx);
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
    public Void visitImage_element(convorkParser.Image_elementContext ctx) {
        return super.visitImage_element(ctx);
    }
}
