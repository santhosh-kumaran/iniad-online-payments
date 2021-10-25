package in.iniad.finance.nexus.cardpayments.service;


import in.iniad.finance.nexus.cardpayments.model.*;
import in.iniad.finance.nexus.cardpayments.util.OnlinePaymentsUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class OnlinePaymentService {

    public OnlinePaymentResponse service(OnlinePayment request) {
        Date startTime = new Date();
        try {
            log.info("Card Online Payment Request : {}", request);
            return getOnlinePaymentResponse();
        } catch (Exception e) {
            log.error("Online Payment Service Error : ", e);
            return getOnlinePaymentResponse();
        } finally {
            log.info("Time Taken Card Payment SOAP Service : {} (ms)", (new Date().getTime() - startTime.getTime()));
        }
    }

    private OnlinePaymentResponse getOnlinePaymentResponse() {
        OnlinePaymentResponse response = new OnlinePaymentResponse();
        response.setOnlinePaymentResp(
                new OnlinePaymentResp(
                        OnlinePaymentsUtil.DEFAULT_SUCCESS_VALUE,
                        OnlinePaymentsUtil.DEFAULT_ERROR_MESSAGE_VALUE,
                        OnlinePaymentsUtil.DEFAULT_MESSAGE_VALUE,
                        ""
                )
        );
        log.info("Card Online Payment Default Response : {}", response);
        return response;
    }
}