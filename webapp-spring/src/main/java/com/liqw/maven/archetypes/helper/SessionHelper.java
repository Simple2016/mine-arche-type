package com.liqw.maven.archetypes.helper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * Created by Administrator on 2017/12/27.
 */
public class SessionHelper {

    public static void printSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Enumeration attributeNames = session.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            System.err.println("session==>" + attributeNames.nextElement());
        }
    }
}
