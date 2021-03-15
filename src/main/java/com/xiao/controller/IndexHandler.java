package com.xiao.controller;

import com.xiao.entity.Student;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexHandler {

    @GetMapping("/index")
    public String index(Model model){
        System.out.println("index.........");
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"张三",22));
        list.add(new Student(2L,"李四",23));
        list.add(new Student(3L,"王五",24));
        model.addAttribute("listStudent",list);
        return "index";
    }

    @GetMapping("index2")
    public String index2(Map<String,String> map){
        map.put("name","张三");
        return "index2";
    }

    @GetMapping("true")
    public String isTrue(Map<String,Boolean> map){
        map.put("name",true);
        return "index2";
    }

    @GetMapping("object")
    public String object(HttpServletRequest webRequest){
        webRequest.setAttribute("requestAttr","request属性");
        webRequest.getSession().setAttribute("sessionAttr","session属性");
        return "index";
    }
}
