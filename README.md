# iniad-online-payments

## Build

```bash
mvn clean install
```

start the sprint boot

```bash
mvn spring-boot:run 
```

Port listening

```bash
8090
```

## Testing

### Local WSDL URL: 

http://localhost:8090/nexus/ws/OnlinePayment.wsdl

### curl for WSDL: 

```bash
curl --location --request GET 'http://localhost:8090/nexus/ws/OnlinePayment.wsdl'
```

### curl for Service Testing

```bash
curl --location --request POST 'http://localhost:8090/nexus/ws/OnlinePayment.wsdl' \
--header 'Content-Type: text/xml' \
--data '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:nex="http://www.ivlfin.org/OnlinePayment/">
    <soapenv:Header/>
    <soapenv:Body>
        <onl:OnlinePayment xmlns:onl="http://www.ivlfin.org/OnlinePayment/">
            <OnlinePaymentReq>
                <RRN>1310202100982823</RRN>
                <BANK_CODE>00019</BANK_CODE>
                <CARDNUMBER></CARDNUMBER>
                <LANACCOUNT>IDOFDEL02322027</LANACCOUNT>
                <CUSTID>0045048898</CUSTID>
                <ACTIVITYFLAG>U</ACTIVITYFLAG>
                <STATUSRRN>FINNONE</STATUSRRN>
                <AMOUNT>999</AMOUNT>
                <LASTPAYDATE>13102021</LASTPAYDATE>
                <TRANSNUMBER>2358422210</TRANSNUMBER>
                <REINSTATED>N</REINSTATED>
                <EMIAMOUNT>332</EMIAMOUNT>
            </OnlinePaymentReq>
        </onl:OnlinePayment>
    </soapenv:Body>
</soapenv:Envelope>'
```

# Problem to Fix

```
3:06:32.787 [http-nio-8080-exec-9] 29b2950d-d7bb-4181-bd16-8815194e6250 ERROR o.a.c.c.C.[.[.[.[messageDispatcherServlet] - Servlet.service() for servlet [messageDispatcherServlet] in context with path [/nexus] threw exception [Request processing failed; nested exception is org.springframework.ws.soap.SoapMessageCreationException: Could not create message from InputStream: Unable to internalize message; nested exception is com.sun.xml.messaging.saaj.SOAPExceptionImpl: Unable to internalize message] with root cause
com.sun.xml.messaging.saaj.soap.SOAPVersionMismatchException: Cannot create message: incorrect content-type for SOAP version. Got: application/soap+xml; charset=utf-8 Expected: text/xml
        at com.sun.xml.messaging.saaj.soap.MessageImpl.init(MessageImpl.java:397)
```    
