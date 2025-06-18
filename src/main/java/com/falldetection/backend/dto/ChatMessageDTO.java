package com.falldetection.backend.dto;

public class ChatMessageDTO {

    private final String type;
    private final String content;

    public ChatMessageDTO(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public String getType() { return type; }
    public String getContent() { return content; }
}
