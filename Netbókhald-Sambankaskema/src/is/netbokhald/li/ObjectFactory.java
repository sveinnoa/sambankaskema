
package is.netbokhald.li;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the is.netbokhald.li package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Claim_QNAME = new QName("http://IcelandicOnlineBanking/2005/12/01/ClaimTypes", "Claim");
    private final static QName _ClaimKey_QNAME = new QName("http://IcelandicOnlineBanking/2005/12/01/ClaimTypes", "ClaimKey");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: is.netbokhald.li
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Communication }
     * 
     */
    public Communication createCommunication() {
        return new Communication();
    }

    /**
     * Create an instance of {@link CGiro }
     * 
     */
    public CGiro createCGiro() {
        return new CGiro();
    }

    /**
     * Create an instance of {@link PaymentOut }
     * 
     */
    public PaymentOut createPaymentOut() {
        return new PaymentOut();
    }

    /**
     * Create an instance of {@link Payments }
     * 
     */
    public Payments createPayments() {
        return new Payments();
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link PaymentError }
     * 
     */
    public PaymentError createPaymentError() {
        return new PaymentError();
    }

    /**
     * Create an instance of {@link PaymentSlip }
     * 
     */
    public PaymentSlip createPaymentSlip() {
        return new PaymentSlip();
    }

    /**
     * Create an instance of {@link PaymentIn }
     * 
     */
    public PaymentIn createPaymentIn() {
        return new PaymentIn();
    }

    /**
     * Create an instance of {@link PaymentsResult }
     * 
     */
    public PaymentsResult createPaymentsResult() {
        return new PaymentsResult();
    }

    /**
     * Create an instance of {@link ABGiro }
     * 
     */
    public ABGiro createABGiro() {
        return new ABGiro();
    }

    /**
     * Create an instance of {@link PaymentResultDetails }
     * 
     */
    public PaymentResultDetails createPaymentResultDetails() {
        return new PaymentResultDetails();
    }

    /**
     * Create an instance of {@link PaymentSlipInfo }
     * 
     */
    public PaymentSlipInfo createPaymentSlipInfo() {
        return new PaymentSlipInfo();
    }

    /**
     * Create an instance of {@link GetPaymentResultResponse }
     * 
     */
    public GetPaymentResultResponse createGetPaymentResultResponse() {
        return new GetPaymentResultResponse();
    }

    /**
     * Create an instance of {@link DoPayments }
     * 
     */
    public DoPayments createDoPayments() {
        return new DoPayments();
    }

    /**
     * Create an instance of {@link DoPaymentResponse }
     * 
     */
    public DoPaymentResponse createDoPaymentResponse() {
        return new DoPaymentResponse();
    }

    /**
     * Create an instance of {@link DoPaymentsResponse }
     * 
     */
    public DoPaymentsResponse createDoPaymentsResponse() {
        return new DoPaymentsResponse();
    }

    /**
     * Create an instance of {@link GetPaymentsResult }
     * 
     */
    public GetPaymentsResult createGetPaymentsResult() {
        return new GetPaymentsResult();
    }

    /**
     * Create an instance of {@link GetPaymentResult }
     * 
     */
    public GetPaymentResult createGetPaymentResult() {
        return new GetPaymentResult();
    }

    /**
     * Create an instance of {@link GetPaymentsResultResponse }
     * 
     */
    public GetPaymentsResultResponse createGetPaymentsResultResponse() {
        return new GetPaymentsResultResponse();
    }

    /**
     * Create an instance of {@link DoPayment }
     * 
     */
    public DoPayment createDoPayment() {
        return new DoPayment();
    }

    /**
     * Create an instance of {@link AccountTransactionArray }
     * 
     */
    public AccountTransactionArray createAccountTransactionArray() {
        return new AccountTransactionArray();
    }

    /**
     * Create an instance of {@link AccountStatementResponse }
     * 
     */
    public AccountStatementResponse createAccountStatementResponse() {
        return new AccountStatementResponse();
    }

    /**
     * Create an instance of {@link AccountTransaction }
     * 
     */
    public AccountTransaction createAccountTransaction() {
        return new AccountTransaction();
    }

    /**
     * Create an instance of {@link AccountStatement }
     * 
     */
    public AccountStatement createAccountStatement() {
        return new AccountStatement();
    }

    /**
     * Create an instance of {@link GetClaimOperationResultResponse }
     * 
     */
    public GetClaimOperationResultResponse createGetClaimOperationResultResponse() {
        return new GetClaimOperationResultResponse();
    }

    /**
     * Create an instance of {@link ClaimOperationResult }
     * 
     */
    public ClaimOperationResult createClaimOperationResult() {
        return new ClaimOperationResult();
    }

    /**
     * Create an instance of {@link QueryClaimsResponse }
     * 
     */
    public QueryClaimsResponse createQueryClaimsResponse() {
        return new QueryClaimsResponse();
    }

    /**
     * Create an instance of {@link QueryClaimsResult }
     * 
     */
    public QueryClaimsResult createQueryClaimsResult() {
        return new QueryClaimsResult();
    }

    /**
     * Create an instance of {@link CancelClaimsResponse }
     * 
     */
    public CancelClaimsResponse createCancelClaimsResponse() {
        return new CancelClaimsResponse();
    }

    /**
     * Create an instance of {@link CreateClaim }
     * 
     */
    public CreateClaim createCreateClaim() {
        return new CreateClaim();
    }

    /**
     * Create an instance of {@link Claim }
     * 
     */
    public Claim createClaim() {
        return new Claim();
    }

    /**
     * Create an instance of {@link GetClaimOperationResult }
     * 
     */
    public GetClaimOperationResult createGetClaimOperationResult() {
        return new GetClaimOperationResult();
    }

    /**
     * Create an instance of {@link CancelClaimResponse }
     * 
     */
    public CancelClaimResponse createCancelClaimResponse() {
        return new CancelClaimResponse();
    }

    /**
     * Create an instance of {@link CancelClaim }
     * 
     */
    public CancelClaim createCancelClaim() {
        return new CancelClaim();
    }

    /**
     * Create an instance of {@link ClaimKey }
     * 
     */
    public ClaimKey createClaimKey() {
        return new ClaimKey();
    }

    /**
     * Create an instance of {@link QueryPaymentsResponse }
     * 
     */
    public QueryPaymentsResponse createQueryPaymentsResponse() {
        return new QueryPaymentsResponse();
    }

    /**
     * Create an instance of {@link QueryPaymentsResult }
     * 
     */
    public QueryPaymentsResult createQueryPaymentsResult() {
        return new QueryPaymentsResult();
    }

    /**
     * Create an instance of {@link CreateClaimsResponse }
     * 
     */
    public CreateClaimsResponse createCreateClaimsResponse() {
        return new CreateClaimsResponse();
    }

    /**
     * Create an instance of {@link QueryPayments }
     * 
     */
    public QueryPayments createQueryPayments() {
        return new QueryPayments();
    }

    /**
     * Create an instance of {@link PaymentsQuery }
     * 
     */
    public PaymentsQuery createPaymentsQuery() {
        return new PaymentsQuery();
    }

    /**
     * Create an instance of {@link QueryClaims }
     * 
     */
    public QueryClaims createQueryClaims() {
        return new QueryClaims();
    }

    /**
     * Create an instance of {@link ClaimsQuery }
     * 
     */
    public ClaimsQuery createClaimsQuery() {
        return new ClaimsQuery();
    }

    /**
     * Create an instance of {@link CreateClaimResponse }
     * 
     */
    public CreateClaimResponse createCreateClaimResponse() {
        return new CreateClaimResponse();
    }

    /**
     * Create an instance of {@link CreateClaims }
     * 
     */
    public CreateClaims createCreateClaims() {
        return new CreateClaims();
    }

    /**
     * Create an instance of {@link ClaimCollection }
     * 
     */
    public ClaimCollection createClaimCollection() {
        return new ClaimCollection();
    }

    /**
     * Create an instance of {@link QueryClaim }
     * 
     */
    public QueryClaim createQueryClaim() {
        return new QueryClaim();
    }

    /**
     * Create an instance of {@link AlterClaim }
     * 
     */
    public AlterClaim createAlterClaim() {
        return new AlterClaim();
    }

    /**
     * Create an instance of {@link AlterClaimResponse }
     * 
     */
    public AlterClaimResponse createAlterClaimResponse() {
        return new AlterClaimResponse();
    }

    /**
     * Create an instance of {@link AlterClaimsResponse }
     * 
     */
    public AlterClaimsResponse createAlterClaimsResponse() {
        return new AlterClaimsResponse();
    }

    /**
     * Create an instance of {@link QueryClaimResponse }
     * 
     */
    public QueryClaimResponse createQueryClaimResponse() {
        return new QueryClaimResponse();
    }

    /**
     * Create an instance of {@link ClaimInfo }
     * 
     */
    public ClaimInfo createClaimInfo() {
        return new ClaimInfo();
    }

    /**
     * Create an instance of {@link AlterClaims }
     * 
     */
    public AlterClaims createAlterClaims() {
        return new AlterClaims();
    }

    /**
     * Create an instance of {@link CancelClaims }
     * 
     */
    public CancelClaims createCancelClaims() {
        return new CancelClaims();
    }

    /**
     * Create an instance of {@link ClaimKeyCollection }
     * 
     */
    public ClaimKeyCollection createClaimKeyCollection() {
        return new ClaimKeyCollection();
    }

    /**
     * Create an instance of {@link GetAccountStatement }
     * 
     */
    public GetAccountStatement createGetAccountStatement() {
        return new GetAccountStatement();
    }

    /**
     * Create an instance of {@link GetAccountStatementResponse }
     * 
     */
    public GetAccountStatementResponse createGetAccountStatementResponse() {
        return new GetAccountStatementResponse();
    }

    /**
     * Create an instance of {@link CurrencyRateResponse }
     * 
     */
    public CurrencyRateResponse createCurrencyRateResponse() {
        return new CurrencyRateResponse();
    }

    /**
     * Create an instance of {@link CurrencyRate }
     * 
     */
    public CurrencyRate createCurrencyRate() {
        return new CurrencyRate();
    }

    /**
     * Create an instance of {@link CurrencyRateRequest }
     * 
     */
    public CurrencyRateRequest createCurrencyRateRequest() {
        return new CurrencyRateRequest();
    }

    /**
     * Create an instance of {@link PhoneNumber }
     * 
     */
    public PhoneNumber createPhoneNumber() {
        return new PhoneNumber();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link DateRestrictedCharge }
     * 
     */
    public DateRestrictedCharge createDateRestrictedCharge() {
        return new DateRestrictedCharge();
    }

    /**
     * Create an instance of {@link DefaultInterest }
     * 
     */
    public DefaultInterest createDefaultInterest() {
        return new DefaultInterest();
    }

    /**
     * Create an instance of {@link Printing }
     * 
     */
    public Printing createPrinting() {
        return new Printing();
    }

    /**
     * Create an instance of {@link SecondaryCollectionClaimsQuery }
     * 
     */
    public SecondaryCollectionClaimsQuery createSecondaryCollectionClaimsQuery() {
        return new SecondaryCollectionClaimsQuery();
    }

    /**
     * Create an instance of {@link CurrencyExchangeRate }
     * 
     */
    public CurrencyExchangeRate createCurrencyExchangeRate() {
        return new CurrencyExchangeRate();
    }

    /**
     * Create an instance of {@link DiscountOrDefaultChargePercentage }
     * 
     */
    public DiscountOrDefaultChargePercentage createDiscountOrDefaultChargePercentage() {
        return new DiscountOrDefaultChargePercentage();
    }

    /**
     * Create an instance of {@link DiscountCharge }
     * 
     */
    public DiscountCharge createDiscountCharge() {
        return new DiscountCharge();
    }

    /**
     * Create an instance of {@link Payment2 }
     * 
     */
    public Payment2 createPayment2() {
        return new Payment2();
    }

    /**
     * Create an instance of {@link ItemRow }
     * 
     */
    public ItemRow createItemRow() {
        return new ItemRow();
    }

    /**
     * Create an instance of {@link ClaimResult }
     * 
     */
    public ClaimResult createClaimResult() {
        return new ClaimResult();
    }

    /**
     * Create an instance of {@link DiscountOrDefaultChargeAmount }
     * 
     */
    public DiscountOrDefaultChargeAmount createDiscountOrDefaultChargeAmount() {
        return new DiscountOrDefaultChargeAmount();
    }

    /**
     * Create an instance of {@link ClaimError }
     * 
     */
    public ClaimError createClaimError() {
        return new ClaimError();
    }

    /**
     * Create an instance of {@link SecondaryCollectionPaymentsQuery }
     * 
     */
    public SecondaryCollectionPaymentsQuery createSecondaryCollectionPaymentsQuery() {
        return new SecondaryCollectionPaymentsQuery();
    }

    /**
     * Create an instance of {@link BillPresentmentSystem }
     * 
     */
    public BillPresentmentSystem createBillPresentmentSystem() {
        return new BillPresentmentSystem();
    }

    /**
     * Create an instance of {@link NoticeAndPaymentFee }
     * 
     */
    public NoticeAndPaymentFee createNoticeAndPaymentFee() {
        return new NoticeAndPaymentFee();
    }

    /**
     * Create an instance of {@link CurrencyInformation }
     * 
     */
    public CurrencyInformation createCurrencyInformation() {
        return new CurrencyInformation();
    }

    /**
     * Create an instance of {@link SecondaryCollectionReturnClaim }
     * 
     */
    public SecondaryCollectionReturnClaim createSecondaryCollectionReturnClaim() {
        return new SecondaryCollectionReturnClaim();
    }

    /**
     * Create an instance of {@link ClaimsQueryDateSpan }
     * 
     */
    public ClaimsQueryDateSpan createClaimsQueryDateSpan() {
        return new ClaimsQueryDateSpan();
    }

    /**
     * Create an instance of {@link AlterClaims2 }
     * 
     */
    public AlterClaims2 createAlterClaims2() {
        return new AlterClaims2();
    }

    /**
     * Create an instance of {@link Communication.PostalMail }
     * 
     */
    public Communication.PostalMail createCommunicationPostalMail() {
        return new Communication.PostalMail();
    }

    /**
     * Create an instance of {@link Communication.EMail }
     * 
     */
    public Communication.EMail createCommunicationEMail() {
        return new Communication.EMail();
    }

    /**
     * Create an instance of {@link Communication.SMS }
     * 
     */
    public Communication.SMS createCommunicationSMS() {
        return new Communication.SMS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Claim }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://IcelandicOnlineBanking/2005/12/01/ClaimTypes", name = "Claim")
    public JAXBElement<Claim> createClaim(Claim value) {
        return new JAXBElement<Claim>(_Claim_QNAME, Claim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://IcelandicOnlineBanking/2005/12/01/ClaimTypes", name = "ClaimKey")
    public JAXBElement<ClaimKey> createClaimKey(ClaimKey value) {
        return new JAXBElement<ClaimKey>(_ClaimKey_QNAME, ClaimKey.class, null, value);
    }

}
