package in.iniad.finance.nexus.cardpayments.config;

import in.iniad.finance.nexus.cardpayments.util.OnlinePaymentsUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
@Slf4j
public class PaymentWSConfig {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, OnlinePaymentsUtil.SOAPSERVICE_URL_MAPPING);
    }
    @Bean(name = OnlinePaymentsUtil.WSDL_BEAN_NAME)
    public DefaultWsdl11Definition nexusPaymentWSDL(XsdSchema paymentSchema) {
        log.info("\n\nWSDL3.CONFIG");
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName(OnlinePaymentsUtil.PORT_TYPE);
        wsdl11Definition.setLocationUri(OnlinePaymentsUtil.LOCATION_URI);
        wsdl11Definition.setTargetNamespace(OnlinePaymentsUtil.TARGET_NAMESPACE);
        wsdl11Definition.setSchema(paymentSchema);

        log.info("WSDL Definition : " + wsdl11Definition);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema nexusSchema() {

        return new SimpleXsdSchema(new ClassPathResource(OnlinePaymentsUtil.FILE_ONLINE_PAYMENT_XSD));
    }
}