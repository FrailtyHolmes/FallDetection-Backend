package com.falldetection.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.falldetection.backend.entity.Event;
import com.falldetection.backend.mapper.EventMapper;
import com.falldetection.backend.service.IEventService;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl extends ServiceImpl<EventMapper, Event> implements IEventService {
}
