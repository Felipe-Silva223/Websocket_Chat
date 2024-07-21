package com.RealTimeChat.Real.Time.Chat.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.RealTimeChat.Real.Time.Chat.Model.UsersChat;

@Controller
public class ChatController {

    @MessageMapping("/chat.register")
    @SendTo("/topic/public")
    public UsersChat register(@Payload UsersChat chatMessageModel, SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessageModel.getSender());
        return chatMessageModel;
    }

    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public UsersChat sendMessage(@Payload UsersChat chatMessage) {
        return chatMessage;
    }
}

