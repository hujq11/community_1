package com.hujq.majiang.service;

import com.hujq.majiang.dto.QuestionDTO;
import com.hujq.majiang.mapper.QuestionMapper;
import com.hujq.majiang.mapper.UserMapper;
import com.hujq.majiang.model.Question;
import com.hujq.majiang.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        ArrayList<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
            User user =  userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }
}
