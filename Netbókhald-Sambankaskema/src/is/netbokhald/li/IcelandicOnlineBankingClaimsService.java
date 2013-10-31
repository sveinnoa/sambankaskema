package is.netbokhald.li;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.2
 * 2013-04-08T14:08:14.222Z
 * Generated source version: 2.7.2
 * 
 */
@WebServiceClient(name = "IcelandicOnlineBankingClaimsService", 
                  wsdlLocation = "https://b2bws.fbl.is/xsd/IcelandicOnlineBanking.wsdl",
                  targetNamespace = "http://IcelandicOnlineBanking/2005/12/01/Claims") 
public class IcelandicOnlineBankingClaimsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://IcelandicOnlineBanking/2005/12/01/Claims", "IcelandicOnlineBankingClaimsService");
    public final static QName IcelandicOnlineBankingClaimsSoap = new QName("http://IcelandicOnlineBanking/2005/12/01/Claims", "IcelandicOnlineBankingClaimsSoap");
    static {
        URL url = null;
        try {
            url = new URL("https://b2bws.fbl.is/xsd/IcelandicOnlineBanking.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IcelandicOnlineBankingClaimsService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://b2bws.fbl.is/xsd/IcelandicOnlineBanking.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IcelandicOnlineBankingClaimsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IcelandicOnlineBankingClaimsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IcelandicOnlineBankingClaimsService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IcelandicOnlineBankingClaimsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IcelandicOnlineBankingClaimsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IcelandicOnlineBankingClaimsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IcelandicOnlineBankingClaimsSoap
     */
    @WebEndpoint(name = "IcelandicOnlineBankingClaimsSoap")
    public IcelandicOnlineBankingClaimsSoap getIcelandicOnlineBankingClaimsSoap() {
        return super.getPort(IcelandicOnlineBankingClaimsSoap, IcelandicOnlineBankingClaimsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IcelandicOnlineBankingClaimsSoap
     */
    @WebEndpoint(name = "IcelandicOnlineBankingClaimsSoap")
    public IcelandicOnlineBankingClaimsSoap getIcelandicOnlineBankingClaimsSoap(WebServiceFeature... features) {
        return super.getPort(IcelandicOnlineBankingClaimsSoap, IcelandicOnlineBankingClaimsSoap.class, features);
    }

}
