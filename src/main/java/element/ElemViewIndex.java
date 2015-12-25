package element;

public class ElemViewIndex{

    public String toString(){
        return output;
    }

    public static final String output = formatOutput();

    private static String formatOutput (){
        StringBuffer sb = new StringBuffer("<!DOCTYPE html>");
        sb.append("<html lang=\"en\">" +
        "<head>" +
        "<meta charset=\"utf-8\">" +
        "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">" +
        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">" +
        "<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->" +
        "<meta name=\"description\" content=\"\">" +
        "<meta name=\"author\" content=\"\">" +
        "<link rel=\"icon\" href=\"favicon.ico\">" +
        "<title>Surpresa!</title>" +
        "<!-- Bootstrap core CSS -->" +
        "<link href=\"./dist/css/bootstrap.min.css\" rel=\"stylesheet\">" +
        "<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->" +
        "<link href=\"./assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">" +
        "<!-- Custom styles for this template -->" +
        "<link href=\"cover.css\" rel=\"stylesheet\">" +
        "<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->" +
        "        <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->" +
        "<script src=\"./assets/js/ie-emulation-modes-warning.js\"></script>" +
        "<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->" +
        "<!--[if lt IE 9]>" +
        "<script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>" +
        "<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>" +
        "<![endif]-->" +
        "</head>" +
        "<body>" +
        "<div class=\"site-wrapper\">" +
        "<div class=\"site-wrapper-inner\">" +
        "<div class=\"cover-container\">" +
        "<div class=\"inner cover\">" +
        "<h1>Olá! Temos uma surpresa para ti!</h1>" +
        "<p class=\"lead\">Insere o código que recebeste por SMS na caixa abaixo e valida no botão.</p>" +
        "<p class=\"lead\">" +
        "<form class=\"navbar-form\" role=\"search\">" +
        "<div class=\"form-group\">" +
        "<input type=\"text\" class=\"form-control\" name=\"code\" placeholder=\"Código...\">" +
        "</div>" +
        "<button type=\"submit\" class=\"btn btn-info\">Validar</button>" +
        "</form>" +
        "</p>" +
        "<!-- <p><a class=\"btn btn-lg btn-info\" href=\"%s\" type=\"submit\">Validar</a></p> -->" +
        "</div>" +
        "<div class=\"mastfoot\">" +
        "<div class=\"inner\">" +
        "<p>by <a href=\"https://www.facebook.com/sl00ney\">slooney</a>, 2015.</p>" +
        "</div>" +
        "</div>" +
        "</div>" +
        "</div>" +
        "</div>" +
        "<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->" +
        "<script src=\"./assets/js/ie10-viewport-bug-workaround.js\"></script>" +
        "</body>" +
        "</html>");
        return sb.toString();
    }
}
