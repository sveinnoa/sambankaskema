
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package is.netbokhald.li;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.2
 * 2013-04-08T14:08:14.121Z
 * Generated source version: 2.7.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "IcelandicOnlineBankingStatementsService",
                      portName = "IcelandicOnlineBankingStatementsSoap",
                      targetNamespace = "http://IcelandicOnlineBanking/2005/12/01/Statements",
                      wsdlLocation = "https://b2bws.fbl.is/xsd/IcelandicOnlineBanking.wsdl",
                      endpointInterface = "is.netbokhald.li.IcelandicOnlineBankingStatementsSoap")
                      
public class IcelandicOnlineBankingStatementsSoapImpl implements IcelandicOnlineBankingStatementsSoap {

    private static final Logger LOG = Logger.getLogger(IcelandicOnlineBankingStatementsSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see is.netbokhald.li.IcelandicOnlineBankingStatementsSoap#getCurrencyRates(is.netbokhald.li.CurrencyRateRequest  parameters )*
     */
    public is.netbokhald.li.CurrencyRateResponse getCurrencyRates(CurrencyRateRequest parameters) { 
        LOG.info("Executing operation getCurrencyRates");
        System.out.println(parameters);
        try {
            is.netbokhald.li.CurrencyRateResponse _return = new is.netbokhald.li.CurrencyRateResponse();
            java.util.List<is.netbokhald.li.CurrencyRate> _returnCurrencyRates = new java.util.ArrayList<is.netbokhald.li.CurrencyRate>();
            is.netbokhald.li.CurrencyRate _returnCurrencyRatesVal1 = new is.netbokhald.li.CurrencyRate();
            _returnCurrencyRatesVal1.setCurrencyCode("CurrencyCode-1531398037");
            _returnCurrencyRatesVal1.setSellingRate(new java.math.BigDecimal("4284391477803663536.2866143292308487761"));
            _returnCurrencyRatesVal1.setBuyingRate(new java.math.BigDecimal("676478513035927879.4724646168351439894"));
            _returnCurrencyRatesVal1.setCustomsRate(new java.math.BigDecimal("589567014142048545.3204514015428376418"));
            _returnCurrencyRatesVal1.setTimeStamp(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-04-08T14:08:14.132Z"));
            _returnCurrencyRates.add(_returnCurrencyRatesVal1);
            _return.getCurrencyRates().addAll(_returnCurrencyRates);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see is.netbokhald.li.IcelandicOnlineBankingStatementsSoap#getAccountStatement(is.netbokhald.li.AccountStatement  accountStatement )*
     */
    public is.netbokhald.li.AccountStatementResponse getAccountStatement(is.netbokhald.li.AccountStatement accountStatement) { 
        LOG.info("Executing operation getAccountStatement");
        System.out.println(accountStatement);
        try {
            is.netbokhald.li.AccountStatementResponse _return = new is.netbokhald.li.AccountStatementResponse();
            _return.setAccount("Account-863611758");
            _return.setCurrency("Currency-1390407013");
            _return.setOverdraft(new java.math.BigDecimal("-720914259600627033.5213331729040974051"));
            _return.setBalance(new java.math.BigDecimal("-182220837829733330.7549897839615722734"));
            _return.setAvailableAmount(new java.math.BigDecimal("-8604905613334286320.6377843408732000716"));
            is.netbokhald.li.Status _returnStatus = is.netbokhald.li.Status.OPEN;
            _return.setStatus(_returnStatus);
            _return.setTotalAmountWaiting(new java.math.BigDecimal("-6705888488276744102.1909055598649079638"));
            _return.setIBAN("IBAN-6653850");
            _return.setAccountOwnerID("AccountOwnerID1911369377");
            _return.setCustomAccountName("CustomAccountName-1461086023");
            _return.setAccountInformation("AccountInformation-742443651");
            is.netbokhald.li.AccountTransactionArray _returnTransactions = new is.netbokhald.li.AccountTransactionArray();
            java.util.List<is.netbokhald.li.AccountTransaction> _returnTransactionsTransaction = new java.util.ArrayList<is.netbokhald.li.AccountTransaction>();
            is.netbokhald.li.AccountTransaction _returnTransactionsTransactionVal1 = new is.netbokhald.li.AccountTransaction();
            _returnTransactionsTransactionVal1.setTransactionID("TransactionID1026007366");
            _returnTransactionsTransactionVal1.setTransactionDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-04-08T14:08:14.134Z"));
            _returnTransactionsTransactionVal1.setValueDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-04-08T14:08:14.134Z"));
            _returnTransactionsTransactionVal1.setBatchNumber("BatchNumber-1838749913");
            _returnTransactionsTransactionVal1.setRedeemingBank("RedeemingBank1516885487");
            _returnTransactionsTransactionVal1.setTransaction("Transaction-2052298676");
            _returnTransactionsTransactionVal1.setReference("Reference904876131");
            _returnTransactionsTransactionVal1.setBillNumber("BillNumber-1294456147");
            _returnTransactionsTransactionVal1.setCategoryCode("CategoryCode1688165442");
            _returnTransactionsTransactionVal1.setCategory("Category97292407");
            _returnTransactionsTransactionVal1.setReferenceDetail("ReferenceDetail1420996708");
            _returnTransactionsTransactionVal1.setPayorID("PayorID1953979564");
            _returnTransactionsTransactionVal1.setAmount(new java.math.BigDecimal("4536431749875941336.2060491279863829932"));
            _returnTransactionsTransactionVal1.setBalance(new java.math.BigDecimal("822019270197645112.7162486012612501803"));
            _returnTransactionsTransaction.add(_returnTransactionsTransactionVal1);
            _returnTransactions.getTransaction().addAll(_returnTransactionsTransaction);
            _return.setTransactions(_returnTransactions);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
