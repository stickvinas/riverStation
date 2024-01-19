package com.example.JavaProject;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class Authorization {
    public static HttpSession get(boolean isNew) {
        ServletRequestAttributes att = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession session = att.getRequest().getSession(isNew);
        return session;
    }
}
