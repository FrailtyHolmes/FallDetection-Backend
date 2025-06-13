package com.falldetection.backend.controller;

import com.falldetection.backend.dto.AIRequestDTO;
import com.falldetection.backend.dto.Result;
import com.falldetection.backend.service.IAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin
public class AIController {
    @Autowired
    private IAIService aiService;

    /**
     * 将问题发送给大模型
     */
    @PostMapping("/ai-question")
    public Result processAIQuestion(@RequestBody AIRequestDTO request) {
        return aiService.processQuestion(request.getQuestion());
    }

}
