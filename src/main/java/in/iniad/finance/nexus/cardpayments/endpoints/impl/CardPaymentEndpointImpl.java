package in.iniad.finance.nexus.cardpayments.endpoints.impl;

import in.iniad.finance.nexus.cardpayments.endpoints.CardPaymentEndpoint;
import in.iniad.finance.nexus.cardpayments.model.OnlinePayment;
import in.iniad.finance.nexus.cardpayments.model.OnlinePaymentResp;
import in.iniad.finance.nexus.cardpayments.model.OnlinePaymentResponse;
import in.iniad.finance.nexus.cardpayments.service.OnlinePaymentService;
import in.iniad.finance.nexus.cardpayments.util.OnlinePaymentsUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.annotation.XmlElement;

@Endpoint
@Slf4j
public class CardPaymentEndpointImpl implements CardPaymentEndpoint {

    private final OnlinePaymentService service;

    public CardPaymentEndpointImpl(OnlinePaymentService service) { this.service = service; }

    @PayloadRoot(namespace = OnlinePaymentsUtil.TARGET_NAMESPACE, localPart = OnlinePaymentsUtil.LOCAL_PORT)
    @ResponsePayload
    public OnlinePaymentResponse processOnlinePaymentRequest(@RequestPayload OnlinePayment request) {
        return service.service(request);
    }
}
