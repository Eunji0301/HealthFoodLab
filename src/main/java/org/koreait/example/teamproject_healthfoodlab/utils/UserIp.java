//package org.koreait.example.teamproject_healthfoodlab.utils;
//
//import java.net.InetAddress;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class UserIp {
//    // 사용자 IP 주소 가져오는 메서드
//    public String getUserIp(HttpServletRequest request) throws Exception {
//        String ip = null;
//        ip = request.getHeader("X-Forwarded-For");
//
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("WL-Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("HTTP_CLIENT_IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("X-Real-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("X-RealIP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("REMOTE_ADDR");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getRemoteAddr();
//        }
//
//        if (ip.equals("0:0:0:0:0:0:0:1") || ip.equals("127.0.0.1")) {
//            InetAddress address = InetAddress.getLocalHost();
//            ip = address.getHostAddress();
//        }
//        return ip;
//    }
//
//}