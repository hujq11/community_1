package com.hujq.majiang.controller;

import com.hujq.majiang.dto.PaginationDTO;
import com.hujq.majiang.dto.QuestionDTO;
import com.hujq.majiang.mapper.QuestionMapper;
import com.hujq.majiang.mapper.UserMapper;
import com.hujq.majiang.model.Question;
import com.hujq.majiang.model.User;
import com.hujq.majiang.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HelloController {


    @Autowired
    UserMapper userMapper;

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,Model model,
                        @RequestParam(name="page",defaultValue ="1") Integer page,
                        @RequestParam(name="size",defaultValue = "5") Integer size
    ) {

        List<QuestionDTO> questionList = questionService.list();
        PaginationDTO pagination = questionService.list(page,size);
        model.addAttribute("pagination", pagination);
        model.addAttribute("question",questionList);
        return "index";
    }


}
