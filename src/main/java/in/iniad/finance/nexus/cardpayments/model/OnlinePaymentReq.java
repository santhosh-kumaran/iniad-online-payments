package in.iniad.finance.nexus.cardpayments.model;


import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.*;

@XmlType(name = "OnlinePaymentReq")
@XmlRootElement(name = "OnlinePaymentReq")
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class OnlinePaymentReq {

    @XmlElement(name = "RRN", required = true)
    protected String rrn;

    @XmlElement(name = "BANK_CODE", required = true)
    protected String bankCode;

    @XmlElement(name = "CARDNUMBER", required = true)
    protected String cardNumber;

    @XmlElement(name = "LANACCOUNT", required = true)
    protected String lanAccount;

    @XmlElement(name = "CUSTID", required = true)
    protected String custId;

    @XmlElement(name = "ACTIVITYFLAG", required = true)
    protected String activityFlag;

    @XmlElement(name = "STATUSRRN", required = true)
    protected String statusRRN;

    @XmlElement(name = "AMOUNT", required = true)
    protected String amount;

    @XmlElement(name = "LASTPAYDATE", required = true)
    protected String lastPayDate;

    @XmlElement(name = "TRANSNUMBER", required = true)
    protected String transNumber;

    @XmlElement(name = "REINSTATED", required = true)
    protected String reinstated;

    @XmlElement(name = "EMIAMOUNT", required = true)
    protected String emiAmount;

    @XmlElement(name = "AGREEMENT_ID", required = true)
    protected String agreementId;

    @XmlElement(name = "SOURCE", required = true)
    protected String source;

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
