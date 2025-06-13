package com.falldetection.backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.falldetection.backend.dto.Result;
import com.falldetection.backend.entity.Event;

public interface IEventService extends IService<Event> {
    Result getEventList(Integer page, Integer size);
    Result saveEvent(String description, String response, Integer eventType);
}
