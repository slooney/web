package element;

public class ElemView {

    public String toString(){
        return output;
    }

    public static final String output = formatOutput();

    private static String formatOutput () {
        return
                "<!DOCTYPE html>\n" +
                        "<html lang=\"PT-pt\">\n" +
                        "  <head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                        "    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n" +
                        "    <meta name=\"description\" content=\"\">\n" +
                        "    <meta name=\"author\" content=\"\">\n" +
                        "    <link rel=\"icon\" href=\"favicon.ico\">\n" +
                        "\n" +
                        "    <title>Surpresa!</title>\n" +
                        "\n" +
                        "    <!-- Bootstrap core CSS -->\n" +
                        "    <link href=\"./dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                        "\n" +
                        "    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n" +
                        "    <link href=\"./assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n" +
                        "\n" +
                        "    <!-- Custom styles for this template -->\n" +
                        "    <link href=\"cover.css\" rel=\"stylesheet\">\n" +
                        "\n" +
                        "    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n" +
                        "    <!--[if lt IE 9]><script src=\"./assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n" +
                        "    <script src=\"./assets/js/ie-emulation-modes-warning.js\"></script>\n" +
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
                        "            <h1 class=\"cover-heading\">Feliz Natal!</h1>\n" +
                        "            <p class=\"lead\">Ol&aacute; tio(a) [Name]! Neste Natal h&aacute; mais um motivo para sorrir! Aqui est&aacute; a minha primeira fotografia!</p>\n" +
                        "\t\t\t<img src=\"./img/eco.jpg\" class=\"img-thumbnail\" alt=\"A minha primeira fotografia\">\n" +
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
                        "    <script>window.jQuery || document.write('<script src=\"./assets/js/vendor/jquery.min.js\"><\\/script>')</script>\n" +
                        "    <script src=\"./dist/js/bootstrap.min.js\"></script>\n" +
                        "    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n" +
                        "    <script src=\"./assets/js/ie10-viewport-bug-workaround.js\"></script>\n" +
                        "  </body>\n" +
                        "</html>\n";
    }

}
