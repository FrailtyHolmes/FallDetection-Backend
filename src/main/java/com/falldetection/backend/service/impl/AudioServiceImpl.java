package com.falldetection.backend.service.impl;

import com.falldetection.backend.dto.Result;
import com.falldetection.backend.service.IAudioService;
import org.springframework.stereotype.Service;

@Service
public class AudioServiceImpl implements IAudioService {
    @Override
    public Result processAudio(String audioData, String audioFormat) {
        return null;
    }
}
