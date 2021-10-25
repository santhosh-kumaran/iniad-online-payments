package in.iniad.finance.nexus.cardpayments.model;

import in.iniad.finance.nexus.cardpayments.util.OnlinePaymentsUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.*;

@XmlType(name = "")
@XmlRootElement(name = "OnlinePaymentResponse", namespace= OnlinePaymentsUtil.TARGET_NAMESPACE)
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
public class OnlinePaymentResponse {

    @XmlElement(name = "OnlinePaymentResp", required = true)
    protected OnlinePaymentResp onlinePaymentResp;

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
