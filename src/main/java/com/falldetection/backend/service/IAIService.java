package com.falldetection.backend.service;

import com.falldetection.backend.dto.Result;

public interface IAIService {
    Result processQuestion(String question);
}
