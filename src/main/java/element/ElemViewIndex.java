package element;

public class ElemViewIndex{

    public String toString(){
        return output;
    }

    public static final String output = formatOutput();

    private static String formatOutput (){
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
                "    <link rel=\"icon\" href=\"./favicon.ico\">\n" +
                "\n" +
                "    <title>Surpresa!</title>\n" +
                "\n" +
                "    <!-- Bootstrap core CSS -->\n" +
                "    <link href=\"./bin/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n" +
                "    <link href=\"./bin/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <!-- Custom styles for this template -->\n" +
                "    <link href=\"./bin/css/cover.css\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n" +
                "    <!--[if lt IE 9]><script src=\"./bin/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n" +
                "    <script src=\"./bin/js/ie-emulation-modes-warning.js\"></script>\n" +
                "\n" +
                "    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n" +
                "    <!--[if lt IE 9]>\n" +
                "      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n" +
                "      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n" +
                "    <![endif]-->\n" +
                "<script type=\"text/javascript\">\n" +
                "     function prepare_link() {\n" +
                "          var url_param = document.getElementById('code');\n" +
                "          var target_link = document.getElementById('button');\n" +
                "\n" +
                "          if ( ! url_param.value ) {\n" +
                "               return false;  \n" +
                "          }\n" +
                "\n" +
                "          target_link.href = target_link.href + escape(url_param.value);\n" +
                "     }\n" +
                "\t</script>" +
                "  </head>\n" +
                "\n" +
                "  <body>\n" +
                "  \n" +
                "      <div class=\"site-wrapper\">\n" +
                "\n" +
                "      <div class=\"site-wrapper-inner\">\n" +
                "\n" +
                "        <div class=\"cover-container\">\n" +
                "\n" +
                "          <div class=\"inner cover\">\n" +
                "            <h1>Ol&aacute;! Temos uma surpresa para ti!</h1>\n" +
                "\t\t\t<p class=\"lead\">Insere o c&oacute;digo que recebeste por SMS na caixa abaixo e valida no bot&atilde;o.</p>\n" +
                "<form class=\"navbar-form\">\n" +
                "\t\t\t\t\t<div class=\"form-group\">\n" +
                "\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"code\" name=\"code\" placeholder=\"C&oacute;digo...\">\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t<a href=\"/\" id=\"button\" class=\"btn btn-info\" role=\"button\" onclick=\"prepare_link();\">Validar</a>\n" +
                "\t\t\t\t</form>" +
                "\t\t\t<!-- <p><a class=\"btn btn-lg btn-info\" type=\"submit\">Validar</a></p> -->\n" +
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
                "    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n" +
                "    <script src=\"./bin/js/ie10-viewport-bug-workaround.js\"></script>\n" +
                "  </body>\n" +
                "</html>\n";
    }
}
