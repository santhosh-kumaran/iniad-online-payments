package in.iniad.finance.nexus.cardpayments.endpoints;

import in.iniad.finance.nexus.cardpayments.model.OnlinePayment;
import in.iniad.finance.nexus.cardpayments.model.OnlinePaymentResponse;
import in.iniad.finance.nexus.cardpayments.util.OnlinePaymentsUtil;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public interface CardPaymentEndpoint {

    @PayloadRoot(namespace = OnlinePaymentsUtil.TARGET_NAMESPACE, localPart = OnlinePaymentsUtil.LOCAL_PORT)
    @ResponsePayload
    OnlinePaymentResponse processOnlinePaymentRequest(@RequestPayload OnlinePayment request);


}
