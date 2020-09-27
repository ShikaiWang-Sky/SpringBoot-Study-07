package com.wang.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//zookeeper: 服务注册与发现

//使用了dubbo后, 尽量不要使用Service注解(SpringBoot的Service)
//这里的Service注解是dubbo的, 不要导错包!
@Service
//可以被扫描到, 在项目启动就自动注册到注册中心
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "得到一张票!";
    }
}
