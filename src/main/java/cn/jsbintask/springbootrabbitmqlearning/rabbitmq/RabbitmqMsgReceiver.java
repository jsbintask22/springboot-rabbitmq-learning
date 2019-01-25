package cn.jsbintask.springbootrabbitmqlearning.rabbitmq;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

/**
 * @author jsbintask@foxmail.com
 * @date 2019/1/25 11:45
 */
@Component
@Log
public class RabbitmqMsgReceiver {
    public void receivedMsg(String msg) {
        log.info("received rabbitmq msg: " + msg);

    }
}
