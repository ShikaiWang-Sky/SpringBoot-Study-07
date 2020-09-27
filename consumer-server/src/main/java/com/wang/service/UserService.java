package com.wang.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

//放到容器中, 这里要用SpringBoot的
@Service
public class UserService {
    //想拿到provider-server提供的票, 要去注册中心拿到服务
    //引用, Pom坐标, 也可以定义与要使用的接口路径相同的接口名
    @Reference
    TicketService TICKET_SERVICE;

    public void buyTicket() {
        String ticket = TICKET_SERVICE.getTicket();
        System.out.println("在注册中心拿到=>" + ticket);
    }

}
