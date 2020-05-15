package com.eCommerce.jewelrystore.email.cron;

import com.eCommerce.jewelrystore.email.util.MailSenderImpl;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderStatus;
import com.eCommerce.jewelrystore.order.service.OrderService;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class AdminDailyMail {

    @Autowired
    private MailSenderImpl mailSender;

    @Autowired
    private OrderService orderService;

    final private ObjectMapper objectMapper = new ObjectMapper();

    @Scheduled(cron = "0 0 20 * * *")
    public void scheduleDailyMailToAdmin() throws JsonProcessingException {
        System.out.println(
                "Fixed delay task - " + System.currentTimeMillis() / 1000);
        List<Order> orders = orderService.findByOrderStatus(OrderStatus.PLACED);
        mailSender.sendEmail("sai.akhil251995@gmail.com","Daily-Orders",objectMapper.writeValueAsString(orders));
    }
}
