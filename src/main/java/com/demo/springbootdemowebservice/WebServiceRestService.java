package com.demo.springbootdemowebservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Collections;

@RestController
public class WebServiceRestService {

    @RequestMapping(value = "/**", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Object> responseVal(HttpServletRequest request) throws IOException {
//        WebServiceRestClientService webServiceRestClientService= new WebServiceRestClientService();
//        System.out.println("Value : " + request.getRequestURI());
//
//        String bodyStr= IOUtils.toString(request.getReader());
//        String response = "";
//        if ("GET".equals(request.getMethod())){
//            response = webServiceRestClientService.getJsonService(getFullURL(request));
//        }else if ("POST".equals(request.getMethod())){
//            response = webServiceRestClientService.createJsonService(request.getRequestURL().toString(),bodyStr);
//        }


        return ResponseEntity.status(HttpStatus.OK).body(
                Collections.singletonMap("result", "ok"));
    }
}
