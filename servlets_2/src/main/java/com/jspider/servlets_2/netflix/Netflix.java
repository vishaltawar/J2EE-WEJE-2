package com.jspider.servlets_2.netflix;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Netflix extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<!DOCTYPE html>\r\n" + "<html lang=\"en\">\r\n" + "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <!-- <link rel=\"stylesheet\" href=\"../CSS/style.css\"> -->\r\n"
				+ "    <title>Project 20 Netflix</title>\r\n" + "    <style>\r\n" + "        *{\r\n"
				+ "            padding: 0;\r\n" + "            margin: 0;\r\n"
				+ "            box-sizing: border-box;\r\n"
				+ "            font-family: Netflix Sans,Helvetica Neue,Helvetica,Arial,sans-serif;\r\n"
				+ "        \r\n" + "        }\r\n" + "        .parant{            \r\n"
				+ "            background: linear-gradient(178deg,rgba(0,0,0,0.9),rgba(0, 0, 0, 0.3),rgba(0, 0, 0, 0.9)), url(https://st1.bgr.in/wp-content/uploads/2022/04/Untitled-design-2022-04-20T095244.884.jpg) no-repeat center center /cover;\r\n"
				+ "            width: 100%;\r\n" + "            height: 100vh;\r\n" + "            \r\n"
				+ "        }\r\n" + "        .navbar{\r\n" + "            \r\n" + "            display: flex;\r\n"
				+ "            justify-content: end;\r\n" + "            align-items: center;\r\n"
				+ "            height: 80px;\r\n" + "            padding: 0 3%;\r\n" + "        }\r\n"
				+ "        #logo{\r\n" + "            position: absolute;\r\n" + "            left: 03%;\r\n"
				+ "           \r\n" + "        }\r\n" + "        .nav{\r\n"
				+ "            /*border: 1px solid green;*/\r\n" + "            margin: 10px;\r\n"
				+ "            padding: 5px;\r\n" + "            font-size: 15px;\r\n" + "        }\r\n"
				+ "        .nav select{\r\n" + "            background-color: rgba(0, 0, 0, 0.395);\r\n"
				+ "            color: white;\r\n" + "            padding: 5px 20px;\r\n"
				+ "            font-size: 15px;\r\n" + "        }\r\n" + "        .nav a{\r\n"
				+ "            background-color: #e50914;\r\n" + "            color: white;\r\n"
				+ "            padding: 8px 22px;\r\n" + "            text-decoration: none;\r\n"
				+ "            border-radius: 5px;\r\n" + "            font-weight: 400;\r\n" + "        }\r\n"
				+ "        main{\r\n" + "            padding: 10%;\r\n" + "        }\r\n" + "        .mainChild{\r\n"
				+ "            color: white;\r\n" + "            padding:  0 20%;\r\n"
				+ "            display: flex;\r\n" + "            flex-direction: column;\r\n"
				+ "            align-items: center;\r\n" + "            justify-content: center;\r\n" + "        }\r\n"
				+ "        .show{\r\n" + "            font-size: 50px;\r\n" + "            font-weight: bolder;\r\n"
				+ "            text-align: center;\r\n" + "            padding: 5px;\r\n" + "        }\r\n"
				+ "        .cancelTime{\r\n" + "            font-size: 22px;\r\n" + "        }\r\n"
				+ "        .readyToWatch{\r\n" + "            font-size: 20px;\r\n" + "            margin-top: 5px;\r\n"
				+ "            padding: 15px;\r\n" + "        }\r\n" + "        .search{\r\n" + "           \r\n"
				+ "            width: 100%;\r\n" + "        }\r\n" + "        form{\r\n" + "           \r\n"
				+ "            display: flex;\r\n" + "            align-items: center;                      \r\n"
				+ "            width: 100%;\r\n" + "            border-radius: 8px;\r\n"
				+ "            overflow: hidden;\r\n" + "            \r\n" + "        }\r\n" + "        .inp{\r\n"
				+ "            \r\n" + "            width: 75%;\r\n" + "            height: 48px;\r\n" + "        }\r\n"
				+ "        .inp input{           \r\n" + "            width: 100%;\r\n"
				+ "            height: 100%;\r\n" + "            padding:8px 8px;\r\n" + "            border: none;\r\n"
				+ "            outline: none\r\n" + "        }\r\n" + "        \r\n" + "        .getStarted input{\r\n"
				+ "            background-color: #e50914;\r\n" + "            text-decoration: none;\r\n"
				+ "            width: 100%;\r\n" + "            color: white;\r\n"
				+ "            padding: 10px 10px;\r\n" + "            font-size: 25px;\r\n"
				+ "            border: none;\r\n" + "            outline: none;            \r\n" + "        }\r\n"
				+ "    </style>\r\n" + "    \r\n" + "</head>\r\n" + "<body>\r\n" + "    <div class=\"netflix\">\r\n"
				+ "        <div class=\"parant\">\r\n" + "            <div class=\"navbar\">\r\n"
				+ "                <div class=\"nav\" id=\"logo\"><img src=\"https://upload.wikimedia.org/wikipedia/commons/7/7a/Logonetflix.png\" alt=\"\"  width=\"200px\"> </div>\r\n"
				+ "                <div class=\"nav\"><select name=\"\" id=\"\">\r\n"
				+ "                    <option value=\"\" selected>English</option>\r\n"
				+ "                    <option value=\"\">हिंदि</option>\r\n" + "                </select></div>\r\n"
				+ "                <div class=\"nav\"><a href=\"#\">Sign In</a></div>\r\n" + "            </div>\r\n"
				+ "            <main>\r\n" + "              <div class=\"mainChild\">\r\n"
				+ "                <div class=\"show\">Unlimited movies, TV  shows and more.</div>\r\n"
				+ "                <div class=\"cancelTime\">Watch anywhere.Cancel anytime</div>\r\n"
				+ "                <div class=\"readyToWatch\">Rady to watch? Enter your email to create or restart your membership.</div>\r\n"
				+ "                <div class=\"search\">\r\n" + "                    <form action=\"\">\r\n"
				+ "                    <div class=\"inp\"><input type=\"email\" name=\"\" id=\"\" placeholder=\"Email address\"></div>\r\n"
				+ "                    <div class=\"getStarted\"><input type=\"submit\" name=\"\" id=\"\" value=\"Get Started >\"></div>\r\n"
				+ "                </form>\r\n" + "                </div>\r\n" + "\r\n" + "              </div>  \r\n"
				+ "            </main>\r\n" + "        </div>\r\n" + "    </div>\r\n" + "</body>\r\n" + "</html>");
	}
}
