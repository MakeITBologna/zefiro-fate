package it.makeit.bonifico.tracciato;


import java.io.StringWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import it.makeit.bonifico.data.AziendaBean;
import it.makeit.bonifico.data.BonificoBean;
import it.makeit.bonifico.data.PagamentiBean;
import it.makeit.cbi.ActiveOrHistoricCurrencyAndAmount;
import it.makeit.cbi.CBIAccountIdentification1;
import it.makeit.cbi.CBIAmountType1;
import it.makeit.cbi.CBIBranchAndFinancialInstitutionIdentification2;
import it.makeit.cbi.CBICashAccount1;
import it.makeit.cbi.CBICashAccount2;
import it.makeit.cbi.CBIChargeBearerTypeCode;
import it.makeit.cbi.CBIClearingSystemMemberIdentification1;
import it.makeit.cbi.CBICreditTransferTransactionInformation;
import it.makeit.cbi.CBIFinancialInstitutionIdentification3;
import it.makeit.cbi.CBIGenericIdentification1;
import it.makeit.cbi.CBIGroupHeader;
import it.makeit.cbi.CBIIdType1;
import it.makeit.cbi.CBIIdType2;
import it.makeit.cbi.CBIOrganisationIdentification1;
import it.makeit.cbi.CBIOrganisationIdentification3;
import it.makeit.cbi.CBIPartyIdentification1;
import it.makeit.cbi.CBIPartyIdentification3;
import it.makeit.cbi.CBIPartyIdentification4;
import it.makeit.cbi.CBIPaymentInstructionInformation;
import it.makeit.cbi.CBIPaymentRequest000400;
import it.makeit.cbi.CBIPaymentTypeInformation1;
import it.makeit.cbi.CBIPaymentTypeInformation2;
import it.makeit.cbi.CBIServiceLevel1;
import it.makeit.cbi.CBIServiceLevel1Code;
import it.makeit.cbi.CategoryPurpose1Choice;
import it.makeit.cbi.PaymentIdentification1;
import it.makeit.cbi.PaymentMethod3Code;
import it.makeit.cbi.Priority2Code;
import it.makeit.cbi.RemittanceInformation5;

/** @author amagrini */
public class ErogazioniFileManager {
	
	private enum TipoPagamento {
		STIPENDI("SALA"),
		GENERICI("SUPP"); //incluso Fornitori (Fornitori, Affitto, Consulenti)

		private String label;
		
		TipoPagamento(String label){
			this.label=label;
		}
	}

	private PagamentiBean pagamentiBean = null;

	private static ErogazioniFileManager mErogazioniFileManager;
	
	private String formattedDate;
	
	private CBIGroupHeader lGrpHdr = new CBIGroupHeader();

	public ErogazioniFileManager() {

	}

	public static ErogazioniFileManager getInstance() {
		if (mErogazioniFileManager == null) {
			mErogazioniFileManager = new ErogazioniFileManager();
		}

		return mErogazioniFileManager;
	}

	public void init(PagamentiBean pPagamentiBean) {
		this.pagamentiBean = pPagamentiBean;
	}

	
	/*
	private XMLGregorianCalendar dateToXMLGregorianCalendar(Date date, TimeZone zone) {
	    XMLGregorianCalendar xmlGregorianCalendar = null;
	    GregorianCalendar gregorianCalendar = new GregorianCalendar();
	    gregorianCalendar.setTime(date);
	    gregorianCalendar.setTimeZone(zone);
	    try {
	      DatatypeFactory dataTypeFactory = DatatypeFactory.newInstance();
	      xmlGregorianCalendar = dataTypeFactory.newXMLGregorianCalendar(gregorianCalendar);
	    }
	    catch (Exception e) {
	      System.out.println("Exception in conversion of Date to XMLGregorianCalendar" + e);
	    }
	    
	    return xmlGregorianCalendar;
	  }
	*/
	
	private Long getConstantForDay(Date date) {    
        Calendar cal = Calendar.getInstance();  
        cal.setTime(date);  
        cal.set(Calendar.HOUR_OF_DAY, 0);  
        cal.set(Calendar.MINUTE, 0);  
        cal.set(Calendar.SECOND, 0);  
        cal.set(Calendar.MILLISECOND, 0);  
        return cal.getTime().getTime(); 
    }
	
	private int getMsgId()
	{
		Long nowTimeLong = - new Date().getTime();
		
		Long diffTime = nowTimeLong + getConstantForDay(new Date());
		
		Integer msgId = -diffTime.intValue();
		
		return msgId;
	}
	

	private CBIGroupHeader createGrpHdr(Date CreDtTm, int pNbOfTxs, double pCtrlSum , String pCodCuc, String pIssr , String pOrderingName)
	{
		
		CBIPartyIdentification1 lCBIPartyIdentification1 = new CBIPartyIdentification1();
		
		CBIIdType1 lCBIIdType1 = new CBIIdType1();
		
		CBIOrganisationIdentification1 lCBIOrganisationIdentification1 = new CBIOrganisationIdentification1();
		
		List<CBIGenericIdentification1> othr = new ArrayList<CBIGenericIdentification1>();
		
		CBIGenericIdentification1 lCBIGenericIdentification1 = new CBIGenericIdentification1();
		
		//lGrpHdr.incrementMsgId();
		lGrpHdr.setMsgId(getMsgId());
		
		
		XMLGregorianCalendar date;
		
		GregorianCalendar c = new GregorianCalendar();
		
		c.setTime(CreDtTm);
		
		

		try {
			
			date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

			lGrpHdr.setCreDtTm(date);
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		BigDecimal lBigDecimal = new BigDecimal(pCtrlSum).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		lGrpHdr.setCtrlSum(lBigDecimal);
		
		lGrpHdr.setNbOfTxs(Integer.toString(pNbOfTxs));

		lCBIGenericIdentification1.setId(pCodCuc);
		
		lCBIGenericIdentification1.setIssr(pIssr);
		
		othr.add(lCBIGenericIdentification1);
		
		lCBIOrganisationIdentification1.setOthr(othr);
		
		lCBIIdType1.setOrgId(lCBIOrganisationIdentification1);
		
		lCBIPartyIdentification1.setId(lCBIIdType1);
		
		lCBIPartyIdentification1.setNm(pOrderingName);
		
		
		lGrpHdr.setInitgPty(lCBIPartyIdentification1);
		
		return lGrpHdr;
	}
	
	private CBIPaymentInstructionInformation createCBIPaymentInstructionInformation(String pTipoPagamento, Date pReqdExctnDt, String pNameOfDbtr, String pFiscalCode, String pIssr, String pIbanDebtr, String pAbiCode)
	{
		CBIPaymentInstructionInformation lCBIPaymentInstructionInformation = new CBIPaymentInstructionInformation();
		
		CBIPaymentTypeInformation1 lCBIPaymentTypeInformation1 = new CBIPaymentTypeInformation1();
		
		CBIServiceLevel1 lCBIServiceLevel1 = new CBIServiceLevel1();
		
		CBIPartyIdentification4 lCBIPartyIdentification4 = new CBIPartyIdentification4();
		
		CBIIdType2 lCBIIdType2 = new CBIIdType2();
		
		CBIOrganisationIdentification3 lCBIOrganisationIdentification3 = new CBIOrganisationIdentification3();
		
		CBIGenericIdentification1 lCBIGenericIdentification1 = new CBIGenericIdentification1();
		
		CBICashAccount2 lCBICashAccount2 = new CBICashAccount2();
		
		CBIAccountIdentification1 lCBIAccountIdentification1 = new CBIAccountIdentification1();
		
		CBIBranchAndFinancialInstitutionIdentification2 lCBIBranchAndFinancialInstitutionIdentification2 = new CBIBranchAndFinancialInstitutionIdentification2();
		
		CBIFinancialInstitutionIdentification3 lCBIFinancialInstitutionIdentification3 = new CBIFinancialInstitutionIdentification3();
		
		CBIClearingSystemMemberIdentification1 lCBIClearingSystemMemberIdentification1 = new CBIClearingSystemMemberIdentification1();
		
		
		formattedDate = new SimpleDateFormat("ddMMyyyy-HH.mm").format(new Date());
		
		lCBIPaymentInstructionInformation.setPmtInfId("DistintaXml-" + formattedDate);
		
		lCBIPaymentInstructionInformation.setPmtMtd(PaymentMethod3Code.TRF);
		
		lCBIPaymentTypeInformation1.setInstrPrty(Priority2Code.NORM);
		
		lCBIServiceLevel1.setCd(CBIServiceLevel1Code.SEPA);
		
		lCBIPaymentTypeInformation1.setSvcLvl(lCBIServiceLevel1);
		
		lCBIPaymentInstructionInformation.setPmtTpInf(lCBIPaymentTypeInformation1);
		
		//XMLGregorianCalendar date;
		
		GregorianCalendar c = new GregorianCalendar();
		
		c.setTime(pReqdExctnDt);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		lCBIPaymentInstructionInformation.setReqdExctnDt(sdf.format(new Date()));

		

		
		lCBIPartyIdentification4.setNm(pNameOfDbtr);
		
		lCBIGenericIdentification1.setId(pFiscalCode);
		
		lCBIGenericIdentification1.setIssr(pIssr);
		
		lCBIOrganisationIdentification3.setOthr(lCBIGenericIdentification1);
		
		lCBIIdType2.setOrgId(lCBIOrganisationIdentification3);
		
		lCBIPartyIdentification4.setId(lCBIIdType2);
		
		lCBIPaymentInstructionInformation.setDbtr(lCBIPartyIdentification4);
		
		
		lCBIAccountIdentification1.setIBAN(pIbanDebtr);
		
		lCBICashAccount2.setId(lCBIAccountIdentification1);
		
		lCBIPaymentInstructionInformation.setDbtrAcct(lCBICashAccount2);
		
		
		lCBIClearingSystemMemberIdentification1.setMmbId(pAbiCode);
		
		lCBIFinancialInstitutionIdentification3.setClrSysMmbId(lCBIClearingSystemMemberIdentification1);
		
		lCBIBranchAndFinancialInstitutionIdentification2.setFinInstnId(lCBIFinancialInstitutionIdentification3);
		
		lCBIPaymentInstructionInformation.setDbtrAgt(lCBIBranchAndFinancialInstitutionIdentification2);
		
		
		lCBIPaymentInstructionInformation.setChrgBr(CBIChargeBearerTypeCode.SLEV);
		
		
		List<CBICreditTransferTransactionInformation> lListCBICreditTransferTransactionInformation = createCBICreditTransferTransactionInformation(pTipoPagamento);
		
		lCBIPaymentInstructionInformation.setCdtTrfTxInf(lListCBICreditTransferTransactionInformation);
		
		return lCBIPaymentInstructionInformation;
	}
	
	
	private List<CBICreditTransferTransactionInformation> createCBICreditTransferTransactionInformation(String pTipoPagamento)
	{
		List<CBICreditTransferTransactionInformation> lListcdtTrfTxInf = new ArrayList<CBICreditTransferTransactionInformation>();
		
		List<BonificoBean> lListBonifici = this.pagamentiBean.getBonifici();
		

		
		for (int i = 0; i < lListBonifici.size(); i++) {
		
			CBICreditTransferTransactionInformation lCBICreditTransferTransactionInformation = new CBICreditTransferTransactionInformation();
			
			CBIAmountType1 lCBIAmountType1 = new CBIAmountType1();
			
			ActiveOrHistoricCurrencyAndAmount lActiveOrHistoricCurrencyAndAmount = new ActiveOrHistoricCurrencyAndAmount();
			
			CBICashAccount1 lCBICashAccount1 = new CBICashAccount1();
			
			CBIPartyIdentification3 lCBIPartyIdentification3 = new CBIPartyIdentification3();
			
			CBIAccountIdentification1 lCBIAccountIdentification1 = new CBIAccountIdentification1();
			
			RemittanceInformation5 lRemittanceInformation5 = new RemittanceInformation5();
			
			CBIPaymentTypeInformation2 lCBIPaymentTypeInformation2 = new CBIPaymentTypeInformation2();
			
			PaymentIdentification1 lPaymentIdentification1 = new PaymentIdentification1();
			
			CategoryPurpose1Choice lCategoryPurpose1Choice = new CategoryPurpose1Choice();
			
			
			lPaymentIdentification1.setInstrId(Integer.toString(i+1));
			
			lPaymentIdentification1.setEndToEndId(formattedDate + "-" + (i+1));
			
			lCBICreditTransferTransactionInformation.setPmtId(lPaymentIdentification1);

			lCategoryPurpose1Choice.setCd(pTipoPagamento); // Stipendi 	SALA, generici SUPP
			
			lCBIPaymentTypeInformation2.setCtgyPurp(lCategoryPurpose1Choice);
			
			lCBICreditTransferTransactionInformation.setPmtTpInf(lCBIPaymentTypeInformation2);
			
			
			lActiveOrHistoricCurrencyAndAmount.setCcy("EUR");
			
			lActiveOrHistoricCurrencyAndAmount.setValue(new BigDecimal(lListBonifici.get(i).getImporto()).setScale(2, BigDecimal.ROUND_HALF_EVEN));
			
			lCBIAmountType1.setInstdAmt(lActiveOrHistoricCurrencyAndAmount);
			
			lCBICreditTransferTransactionInformation.setAmt(lCBIAmountType1);
			
			lCBIPartyIdentification3.setNm(lListBonifici.get(i).getControparte().getFullname());
			
			lCBICreditTransferTransactionInformation.setCdtr(lCBIPartyIdentification3);
			
			
			lCBIAccountIdentification1.setIBAN(lListBonifici.get(i).getControparte().getIban());
			
			lCBICashAccount1.setId(lCBIAccountIdentification1);
			
			lCBICreditTransferTransactionInformation.setCdtrAcct(lCBICashAccount1);
			
			
			
			
			lRemittanceInformation5.setUstrd(Arrays.asList(lListBonifici.get(i).getCausale()));
			
			
			lCBICreditTransferTransactionInformation.setRmtInf(lRemittanceInformation5);
			
			
			lListcdtTrfTxInf.add(lCBICreditTransferTransactionInformation);
			
		}
		
		return lListcdtTrfTxInf;
	}
	
	public String generaTracciati(String pTipoPagamento){//per fornitori: SUPP
		
		List<BonificoBean> lListBonifici = this.pagamentiBean.getBonifici();
		
		AziendaBean lAzienda = this.pagamentiBean.getAzienda();
		
		double lSumAmt = 0;
		
		for (int i = 0; i < lListBonifici.size(); i++) {
			lSumAmt = lSumAmt + lListBonifici.get(i).getImporto();
		}
		
		CBIPaymentRequest000400 lCBIPaymentRequest000400 = new CBIPaymentRequest000400();
		
		CBIGroupHeader lCBIGroupHeader = createGrpHdr(new Date(), lListBonifici.size(), lSumAmt, lAzienda.getCodiceCuc(), "CBI", lAzienda.getDenominazione());
		
		CBIPaymentInstructionInformation lCBIPaymentInstructionInformation =  createCBIPaymentInstructionInformation(pTipoPagamento, new Date(), lAzienda.getDenominazione(), lAzienda.getCodiceFiscale(),
				 "ADE", lListBonifici.get(0).getBanca().getIBAN(), BonificiCommonUtil.fillField(5, BonificiCommonUtil.ALFANUMERIC_FILLER, lListBonifici.get(0).getBanca().getIBAN().substring(5, 10)));
		
		lCBIPaymentRequest000400.setGrpHdr(lCBIGroupHeader);
		
		lCBIPaymentRequest000400.setPmtInf(lCBIPaymentInstructionInformation);

		StringWriter lSw = new StringWriter();

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(CBIPaymentRequest000400.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(lCBIPaymentRequest000400, lSw);

		      } catch (JAXBException e) {
			e.printStackTrace();
		      }
		
		return lSw.toString();
	}


}
