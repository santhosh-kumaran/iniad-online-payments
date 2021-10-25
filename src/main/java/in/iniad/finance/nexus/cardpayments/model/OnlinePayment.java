package in.iniad.finance.nexus.cardpayments.model;

import in.iniad.finance.nexus.cardpayments.util.OnlinePaymentsUtil;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.*;

@XmlType(name = "")
@XmlRootElement(name = "OnlinePayment",namespace= OnlinePaymentsUtil.TARGET_NAMESPACE)
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class OnlinePayment {

    // , namespace=OnlinePaymentsUtil.TARGET_NAMESPACE
    @XmlElement(name = "OnlinePaymentReq", required = true)
    protected OnlinePaymentReq onlinePaymentReq;

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
