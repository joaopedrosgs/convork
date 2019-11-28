package t3;

import gen.convorkBaseVisitor;
import gen.convorkParser;

public class GeradorBootstrap extends convorkBaseVisitor<Void> {
    private PilhaDeTabelas pilhaDeTabelas;

    private SaidaParser sp;
    private StringBuilder script;
    private Integer carouselCount = 0;

    public GeradorBootstrap(SaidaParser sp) {
        this.sp = sp;
        script = new StringBuilder();
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
        sp.printCode(" <nav>\n" +
                "    <div class=\"nav-wrapper\">\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</div>\n" +
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

        sp.printCode("  <button type=\"button\" class=\"btn btn-primary\">\n\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        sp.printCode("</button>\n");

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
        sp.printCode("<a class=\"navbar-brand\" href=\"#\">Navbar</a>\n" +
                "\n" +
                "      <!-- Collapse button -->\n" +
                "      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#basicExampleNav\" aria-controls=\"basicExampleNav\"\n" +
                "        aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "        <span class=\"navbar-toggler-icon\"></span>\n" +
                "      </button>\n" +
                "\n" +
                "      <!-- Collapsible content -->\n" +
                "      <div class=\"collapse navbar-collapse\" id=\"basicExampleNav\">\n" +
                "\n" +
                "        <!-- Links -->\n" +
                "        <ul class=\"navbar-nav mr-auto\">\n" +
                "          <li class=\"nav-item active\">\n" +
                "            <a class=\"nav-link\" href=\"#\">Home\n" +
                "              <span class=\"sr-only\">(current)</span>\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\"nav-item\">\n" +
                "            <a class=\"nav-link\" href=\"#\">Features</a>\n" +
                "          </li>\n" +
                "          <!-- Dropdown -->\n" +
                "          <li class=\"nav-item dropdown\">\n" +
                "            <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink1\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n" +
                "              aria-expanded=\"false\">Dropdown 1</a>\n" +
                "            <div class=\"dropdown-menu dropdown-primary\" aria-labelledby=\"navbarDropdownMenuLink1\">\n" +
                "              <a class=\"dropdown-item\" href=\"#\">Action</a>\n" +
                "              <a class=\"dropdown-item\" href=\"#\">Another action</a>\n" +
                "              <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n" +
                "            </div>\n" +
                "          </li>\n" +
                "\n" +
                "        </ul>\n");
        for (convorkParser.ElementContext element : ctx.element()) {
            visitElement(element);
        }
        //sp.printCode("</a>");

        return null;
    }

    @Override
    public Void visitSearch_element(convorkParser.Search_elementContext ctx) {
        sp.printCode("<form class=\"form-inline\">\n" +
                "          <div class=\"md-form my-0\">\n" +
                "            <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\n" +
                "          </div>\n" +
                "        </form>");
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
            "    <img class=\"d-block w-100\" src=\""+ "https://cdn4.buysellads.net/uu/1/41312/1545083324-1539370929-mailchimp-Yellow-260x200.png" +"\" alt=\"First slide\">\n" +
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
    public Void visitImage_element(convorkParser.Image_elementContext ctx) {
        return super.visitImage_element(ctx);
    }
}
