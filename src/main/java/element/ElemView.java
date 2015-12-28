package element;

public class ElemView {

    public static String formatOutput (Element e) {
        return String.format(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"PT-pt\">\n" +
                        "  <head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                        "    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n" +
                        "    <meta name=\"description\" content=\"\">\n" +
                        "    <meta name=\"author\" content=\"\">\n" +
                        "    <link rel=\"icon\" href=\"https://cld.pt/dl/download/0ac054a0-d8d6-423a-a074-b419354a2ca3/favicon.ico\">\n" +
                        "\n" +
                        "    <title>Surpresa!</title>\n" +
                        "\n" +
                        "    <!-- Custom styles for this template -->\n" +
                        "    <link href=\"https://cld.pt/dl/download/7080ba73-0765-468f-a719-4e601b8da943/cover.css\" rel=\"stylesheet\">\n" +
                        "\n" +
                        "    <!-- Bootstrap core CSS -->\n" +
                        "    <link href=\"https://cld.pt/dl/download/660239f5-1f68-4346-828a-dc4096974a83/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                        "\n" +
                        "    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n" +
                        "    <link href=\"https://cld.pt/dl/download/e30a5062-6e68-4a77-a5f4-b6f44972038f/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n" +
                        "\n" +
                        "    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n" +
                        "    <!--[if lt IE 9]><script src=\"https://cld.pt/dl/download/ac4ccb5f-6d6e-48fc-b68c-083293bc517e/ie8-responsive-file-warning.js\"></script><![endif]-->\n" +
                        "    <script src=\"https://cld.pt/dl/download/5c2de067-72f1-44a3-847d-63eaa71b8a5b/ie-emulation-modes-warning.js\"></script>\n" +
                        "\n" +
                        "    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n" +
                        "    <!--[if lt IE 9]>\n" +
                        "      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n" +
                        "      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n" +
                        "    <![endif]-->\n" +
                        "  </head>\n" +
                        "\n" +
                        "  <body>\n" +
                        "\n" +
                        "    <div class=\"site-wrapper\">\n" +
                        "\n" +
                        "      <div class=\"site-wrapper-inner\">\n" +
                        "\n" +
                        "        <div class=\"cover-container\">\n" +
                        "\n" +
                        "          <div class=\"inner cover\">\n" +
                        "            <h1 class=\"cover-heading\">Boas Festas!</h1>\n" +
                        "            <p class=\"lead\">Ol&aacute; ti%s %s! H&aacute; mais um motivo para sorrir! Aqui est&aacute; a minha primeira fotografia!</p>\n" +
                        "\t\t\t<img src=\"https://cld.pt/dl/download/bc11530d-6771-4f74-91be-d3214c6ee90d/eco.jpg\" class=\"img-thumbnail\" alt=\"A minha primeira fotografia\">\n" +
                        "          </div>\n" +
                        "\n" +
                        "          <div class=\"mastfoot\">\n" +
                        "            <div class=\"inner\">\n" +
                        "              <p>by <a href=\"https://www.facebook.com/sl00ney\">slooney</a>, 2015.</p>\n" +
                        "            </div>\n" +
                        "          </div>\n" +
                        "\n" +
                        "        </div>\n" +
                        "\n" +
                        "      </div>\n" +
                        "\n" +
                        "    </div>\n" +
                        "\n" +
                        "    <!-- Bootstrap core JavaScript\n" +
                        "    ================================================== -->\n" +
                        "    <!-- Placed at the end of the document so the pages load faster -->\n" +
                        "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n" +
                        "    <script>window.jQuery || document.write('<script src=\"https://cld.pt/dl/download/a78c69df-8ab1-470c-8700-97859fcc65a8/jquery.min.js\"><\\/script>')</script>\n" +
                        "    <script src=\"https://cld.pt/dl/download/a6c868ae-664b-4e1b-a25a-8a1f648f915a/bootstrap.min.js\"></script>\n" +
                        "    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n" +
                        "    <script src=\"https://cld.pt/dl/download/345f6262-5482-42e6-90af-c358125ddeb6/ie10-viewport-bug-workaround.js\"></script>\n" +
                        "  </body>\n" +
                        "</html>\n", e.getGender() ? "o" : "a", e.getName());
    }

}
