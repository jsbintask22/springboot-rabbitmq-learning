package cn.jsbintask.springbootrabbitmqlearning.rabbitmq;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * @author jsbintask@foxmail.com
 * @date 2019/1/25 11:45
 */
@Component
@Log
public class RabbitmqMsgReceiver {
    @Autowired
    private CountDownLatch countDownLatch;

    public void receivedMsg(String msg) {
        log.info("received rabbitmq msg: " + msg);
        countDownLatch.countDown();
    }
}
