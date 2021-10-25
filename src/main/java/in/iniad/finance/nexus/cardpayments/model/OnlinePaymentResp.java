package in.iniad.finance.nexus.cardpayments.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "OnlinePaymentReq")
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class OnlinePaymentResp {

    @XmlElement(name = "SUCCESS", required = true)
    private String success;

    @XmlElement(name = "ERROR_MESSAGE", required = true)
    private String errorMessage;

    @XmlElement(name = "MESSAGE", required = true)
    private String message;

    @XmlElement(name = "TIMESTAMP", required = true)
    private String timestamp;

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
