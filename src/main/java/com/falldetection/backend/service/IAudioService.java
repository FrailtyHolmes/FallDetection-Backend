package com.falldetection.backend.service;

import com.falldetection.backend.dto.Result;

public interface IAudioService {
    Result processAudio(String audioData, String audioFormat);
}
