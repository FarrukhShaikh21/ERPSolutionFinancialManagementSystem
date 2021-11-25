package erpsolfms.erpsolfmsmodel.erpsolfmseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 24 22:11:44 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ReceiptMasterControlImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ReceiptNo,
        DocTypeId,
        Customerid,
        Companyid,
        Locationid,
        ReceiptDate,
        Createdby,
        Modifiedby,
        CreatedDate,
        ModifiedDate,
        ReceiptMode,
        ReceiptType,
        RefVoucherNo,
        TotalAmount,
        ChequeNo,
        ChequeDate,
        Submit,
        PostToIntFace,
        PostToGl,
        Bankid,
        Branchid,
        Deptid,
        SubmitBy,
        GlvoucherNo,
        ArPosted,
        Remarks,
        RecDate,
        Salespersonid,
        Pid,
        RemarksNarr,
        TaxCode,
        TaxAmount,
        Percent,
        TaxGlcode,
        TaxCcenter,
        Load,
        Rmode,
        DocDate,
        ChequeCancel,
        RefCancelControlReceipt,
        RefCancelReceiptAmount,
        ChqReturnDate,
        IsMigrated,
        MigratedDate,
        CustomerAcNo,
        CustomerAcValidate,
        ExchangeRate,
        LocCurrcode,
        OldReceiptNo,
        VoucherNo,
        VoucherType,
        VoucherCheqNo,
        Supplierid,
        PaymentCodeRef,
        Receiptseq,
        txtCustomerName,
        txtSalesPersonName,
        ReceiptDetailControl,
        AllCustomers,
        SoSalesPersons,
        AllBankBranches;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int RECEIPTNO = AttributesEnum.ReceiptNo.index();
    public static final int DOCTYPEID = AttributesEnum.DocTypeId.index();
    public static final int CUSTOMERID = AttributesEnum.Customerid.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int RECEIPTDATE = AttributesEnum.ReceiptDate.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int RECEIPTMODE = AttributesEnum.ReceiptMode.index();
    public static final int RECEIPTTYPE = AttributesEnum.ReceiptType.index();
    public static final int REFVOUCHERNO = AttributesEnum.RefVoucherNo.index();
    public static final int TOTALAMOUNT = AttributesEnum.TotalAmount.index();
    public static final int CHEQUENO = AttributesEnum.ChequeNo.index();
    public static final int CHEQUEDATE = AttributesEnum.ChequeDate.index();
    public static final int SUBMIT = AttributesEnum.Submit.index();
    public static final int POSTTOINTFACE = AttributesEnum.PostToIntFace.index();
    public static final int POSTTOGL = AttributesEnum.PostToGl.index();
    public static final int BANKID = AttributesEnum.Bankid.index();
    public static final int BRANCHID = AttributesEnum.Branchid.index();
    public static final int DEPTID = AttributesEnum.Deptid.index();
    public static final int SUBMITBY = AttributesEnum.SubmitBy.index();
    public static final int GLVOUCHERNO = AttributesEnum.GlvoucherNo.index();
    public static final int ARPOSTED = AttributesEnum.ArPosted.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int RECDATE = AttributesEnum.RecDate.index();
    public static final int SALESPERSONID = AttributesEnum.Salespersonid.index();
    public static final int PID = AttributesEnum.Pid.index();
    public static final int REMARKSNARR = AttributesEnum.RemarksNarr.index();
    public static final int TAXCODE = AttributesEnum.TaxCode.index();
    public static final int TAXAMOUNT = AttributesEnum.TaxAmount.index();
    public static final int PERCENT = AttributesEnum.Percent.index();
    public static final int TAXGLCODE = AttributesEnum.TaxGlcode.index();
    public static final int TAXCCENTER = AttributesEnum.TaxCcenter.index();
    public static final int LOAD = AttributesEnum.Load.index();
    public static final int RMODE = AttributesEnum.Rmode.index();
    public static final int DOCDATE = AttributesEnum.DocDate.index();
    public static final int CHEQUECANCEL = AttributesEnum.ChequeCancel.index();
    public static final int REFCANCELCONTROLRECEIPT = AttributesEnum.RefCancelControlReceipt.index();
    public static final int REFCANCELRECEIPTAMOUNT = AttributesEnum.RefCancelReceiptAmount.index();
    public static final int CHQRETURNDATE = AttributesEnum.ChqReturnDate.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int CUSTOMERACNO = AttributesEnum.CustomerAcNo.index();
    public static final int CUSTOMERACVALIDATE = AttributesEnum.CustomerAcValidate.index();
    public static final int EXCHANGERATE = AttributesEnum.ExchangeRate.index();
    public static final int LOCCURRCODE = AttributesEnum.LocCurrcode.index();
    public static final int OLDRECEIPTNO = AttributesEnum.OldReceiptNo.index();
    public static final int VOUCHERNO = AttributesEnum.VoucherNo.index();
    public static final int VOUCHERTYPE = AttributesEnum.VoucherType.index();
    public static final int VOUCHERCHEQNO = AttributesEnum.VoucherCheqNo.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int PAYMENTCODEREF = AttributesEnum.PaymentCodeRef.index();
    public static final int RECEIPTSEQ = AttributesEnum.Receiptseq.index();
    public static final int TXTCUSTOMERNAME = AttributesEnum.txtCustomerName.index();
    public static final int TXTSALESPERSONNAME = AttributesEnum.txtSalesPersonName.index();
    public static final int RECEIPTDETAILCONTROL = AttributesEnum.ReceiptDetailControl.index();
    public static final int ALLCUSTOMERS = AttributesEnum.AllCustomers.index();
    public static final int SOSALESPERSONS = AttributesEnum.SoSalesPersons.index();
    public static final int ALLBANKBRANCHES = AttributesEnum.AllBankBranches.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ReceiptMasterControlImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolfms.erpsolfmsmodel.erpsolfmseo.ReceiptMasterControl");
    }


    /**
     * Gets the attribute value for ReceiptNo, using the alias name ReceiptNo.
     * @return the value of ReceiptNo
     */
    public String getReceiptNo() {
        return (String) getAttributeInternal(RECEIPTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReceiptNo.
     * @param value value to set the ReceiptNo
     */
    public void setReceiptNo(String value) {
        setAttributeInternal(RECEIPTNO, value);
    }

    /**
     * Gets the attribute value for DocTypeId, using the alias name DocTypeId.
     * @return the value of DocTypeId
     */
    public String getDocTypeId() {
        return (String) getAttributeInternal(DOCTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocTypeId.
     * @param value value to set the DocTypeId
     */
    public void setDocTypeId(String value) {
        setAttributeInternal(DOCTYPEID, value);
    }

    /**
     * Gets the attribute value for Customerid, using the alias name Customerid.
     * @return the value of Customerid
     */
    public String getCustomerid() {
        return (String) getAttributeInternal(CUSTOMERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Customerid.
     * @param value value to set the Customerid
     */
    public void setCustomerid(String value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**
     * Gets the attribute value for Companyid, using the alias name Companyid.
     * @return the value of Companyid
     */
    public String getCompanyid() {
        return (String) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Companyid.
     * @param value value to set the Companyid
     */
    public void setCompanyid(String value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for Locationid, using the alias name Locationid.
     * @return the value of Locationid
     */
    public String getLocationid() {
        return (String) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Locationid.
     * @param value value to set the Locationid
     */
    public void setLocationid(String value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for ReceiptDate, using the alias name ReceiptDate.
     * @return the value of ReceiptDate
     */
    public Date getReceiptDate() {
        return (Date) getAttributeInternal(RECEIPTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReceiptDate.
     * @param value value to set the ReceiptDate
     */
    public void setReceiptDate(Date value) {
        setAttributeInternal(RECEIPTDATE, value);
    }

    /**
     * Gets the attribute value for Createdby, using the alias name Createdby.
     * @return the value of Createdby
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Createdby.
     * @param value value to set the Createdby
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for Modifiedby, using the alias name Modifiedby.
     * @return the value of Modifiedby
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Modifiedby.
     * @param value value to set the Modifiedby
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for ModifiedDate, using the alias name ModifiedDate.
     * @return the value of ModifiedDate
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedDate.
     * @param value value to set the ModifiedDate
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for ReceiptMode, using the alias name ReceiptMode.
     * @return the value of ReceiptMode
     */
    public String getReceiptMode() {
        return (String) getAttributeInternal(RECEIPTMODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReceiptMode.
     * @param value value to set the ReceiptMode
     */
    public void setReceiptMode(String value) {
        setAttributeInternal(RECEIPTMODE, value);
    }

    /**
     * Gets the attribute value for ReceiptType, using the alias name ReceiptType.
     * @return the value of ReceiptType
     */
    public String getReceiptType() {
        return (String) getAttributeInternal(RECEIPTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReceiptType.
     * @param value value to set the ReceiptType
     */
    public void setReceiptType(String value) {
        setAttributeInternal(RECEIPTTYPE, value);
    }

    /**
     * Gets the attribute value for RefVoucherNo, using the alias name RefVoucherNo.
     * @return the value of RefVoucherNo
     */
    public String getRefVoucherNo() {
        return (String) getAttributeInternal(REFVOUCHERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefVoucherNo.
     * @param value value to set the RefVoucherNo
     */
    public void setRefVoucherNo(String value) {
        setAttributeInternal(REFVOUCHERNO, value);
    }

    /**
     * Gets the attribute value for TotalAmount, using the alias name TotalAmount.
     * @return the value of TotalAmount
     */
    public BigDecimal getTotalAmount() {
        return (BigDecimal) getAttributeInternal(TOTALAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalAmount.
     * @param value value to set the TotalAmount
     */
    public void setTotalAmount(BigDecimal value) {
        setAttributeInternal(TOTALAMOUNT, value);
    }

    /**
     * Gets the attribute value for ChequeNo, using the alias name ChequeNo.
     * @return the value of ChequeNo
     */
    public String getChequeNo() {
        return (String) getAttributeInternal(CHEQUENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChequeNo.
     * @param value value to set the ChequeNo
     */
    public void setChequeNo(String value) {
        setAttributeInternal(CHEQUENO, value);
    }

    /**
     * Gets the attribute value for ChequeDate, using the alias name ChequeDate.
     * @return the value of ChequeDate
     */
    public Date getChequeDate() {
        return (Date) getAttributeInternal(CHEQUEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChequeDate.
     * @param value value to set the ChequeDate
     */
    public void setChequeDate(Date value) {
        setAttributeInternal(CHEQUEDATE, value);
    }

    /**
     * Gets the attribute value for Submit, using the alias name Submit.
     * @return the value of Submit
     */
    public String getSubmit() {
        return (String) getAttributeInternal(SUBMIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Submit.
     * @param value value to set the Submit
     */
    public void setSubmit(String value) {
        setAttributeInternal(SUBMIT, value);
    }

    /**
     * Gets the attribute value for PostToIntFace, using the alias name PostToIntFace.
     * @return the value of PostToIntFace
     */
    public String getPostToIntFace() {
        return (String) getAttributeInternal(POSTTOINTFACE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PostToIntFace.
     * @param value value to set the PostToIntFace
     */
    public void setPostToIntFace(String value) {
        setAttributeInternal(POSTTOINTFACE, value);
    }

    /**
     * Gets the attribute value for PostToGl, using the alias name PostToGl.
     * @return the value of PostToGl
     */
    public String getPostToGl() {
        return (String) getAttributeInternal(POSTTOGL);
    }

    /**
     * Sets <code>value</code> as the attribute value for PostToGl.
     * @param value value to set the PostToGl
     */
    public void setPostToGl(String value) {
        setAttributeInternal(POSTTOGL, value);
    }

    /**
     * Gets the attribute value for Bankid, using the alias name Bankid.
     * @return the value of Bankid
     */
    public String getBankid() {
        return (String) getAttributeInternal(BANKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bankid.
     * @param value value to set the Bankid
     */
    public void setBankid(String value) {
        setAttributeInternal(BANKID, value);
    }

    /**
     * Gets the attribute value for Branchid, using the alias name Branchid.
     * @return the value of Branchid
     */
    public String getBranchid() {
        return (String) getAttributeInternal(BRANCHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Branchid.
     * @param value value to set the Branchid
     */
    public void setBranchid(String value) {
        setAttributeInternal(BRANCHID, value);
    }

    /**
     * Gets the attribute value for Deptid, using the alias name Deptid.
     * @return the value of Deptid
     */
    public String getDeptid() {
        return (String) getAttributeInternal(DEPTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Deptid.
     * @param value value to set the Deptid
     */
    public void setDeptid(String value) {
        setAttributeInternal(DEPTID, value);
    }

    /**
     * Gets the attribute value for SubmitBy, using the alias name SubmitBy.
     * @return the value of SubmitBy
     */
    public String getSubmitBy() {
        return (String) getAttributeInternal(SUBMITBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubmitBy.
     * @param value value to set the SubmitBy
     */
    public void setSubmitBy(String value) {
        setAttributeInternal(SUBMITBY, value);
    }

    /**
     * Gets the attribute value for GlvoucherNo, using the alias name GlvoucherNo.
     * @return the value of GlvoucherNo
     */
    public String getGlvoucherNo() {
        return (String) getAttributeInternal(GLVOUCHERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlvoucherNo.
     * @param value value to set the GlvoucherNo
     */
    public void setGlvoucherNo(String value) {
        setAttributeInternal(GLVOUCHERNO, value);
    }

    /**
     * Gets the attribute value for ArPosted, using the alias name ArPosted.
     * @return the value of ArPosted
     */
    public String getArPosted() {
        return (String) getAttributeInternal(ARPOSTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for ArPosted.
     * @param value value to set the ArPosted
     */
    public void setArPosted(String value) {
        setAttributeInternal(ARPOSTED, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for RecDate, using the alias name RecDate.
     * @return the value of RecDate
     */
    public Date getRecDate() {
        return (Date) getAttributeInternal(RECDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RecDate.
     * @param value value to set the RecDate
     */
    public void setRecDate(Date value) {
        setAttributeInternal(RECDATE, value);
    }

    /**
     * Gets the attribute value for Salespersonid, using the alias name Salespersonid.
     * @return the value of Salespersonid
     */
    public String getSalespersonid() {
        return (String) getAttributeInternal(SALESPERSONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Salespersonid.
     * @param value value to set the Salespersonid
     */
    public void setSalespersonid(String value) {
        setAttributeInternal(SALESPERSONID, value);
    }

    /**
     * Gets the attribute value for Pid, using the alias name Pid.
     * @return the value of Pid
     */
    public BigDecimal getPid() {
        return (BigDecimal) getAttributeInternal(PID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Pid.
     * @param value value to set the Pid
     */
    public void setPid(BigDecimal value) {
        setAttributeInternal(PID, value);
    }

    /**
     * Gets the attribute value for RemarksNarr, using the alias name RemarksNarr.
     * @return the value of RemarksNarr
     */
    public String getRemarksNarr() {
        return (String) getAttributeInternal(REMARKSNARR);
    }

    /**
     * Sets <code>value</code> as the attribute value for RemarksNarr.
     * @param value value to set the RemarksNarr
     */
    public void setRemarksNarr(String value) {
        setAttributeInternal(REMARKSNARR, value);
    }

    /**
     * Gets the attribute value for TaxCode, using the alias name TaxCode.
     * @return the value of TaxCode
     */
    public BigDecimal getTaxCode() {
        return (BigDecimal) getAttributeInternal(TAXCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxCode.
     * @param value value to set the TaxCode
     */
    public void setTaxCode(BigDecimal value) {
        setAttributeInternal(TAXCODE, value);
    }

    /**
     * Gets the attribute value for TaxAmount, using the alias name TaxAmount.
     * @return the value of TaxAmount
     */
    public BigDecimal getTaxAmount() {
        return (BigDecimal) getAttributeInternal(TAXAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxAmount.
     * @param value value to set the TaxAmount
     */
    public void setTaxAmount(BigDecimal value) {
        setAttributeInternal(TAXAMOUNT, value);
    }

    /**
     * Gets the attribute value for Percent, using the alias name Percent.
     * @return the value of Percent
     */
    public BigDecimal getPercent() {
        return (BigDecimal) getAttributeInternal(PERCENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Percent.
     * @param value value to set the Percent
     */
    public void setPercent(BigDecimal value) {
        setAttributeInternal(PERCENT, value);
    }

    /**
     * Gets the attribute value for TaxGlcode, using the alias name TaxGlcode.
     * @return the value of TaxGlcode
     */
    public String getTaxGlcode() {
        return (String) getAttributeInternal(TAXGLCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxGlcode.
     * @param value value to set the TaxGlcode
     */
    public void setTaxGlcode(String value) {
        setAttributeInternal(TAXGLCODE, value);
    }

    /**
     * Gets the attribute value for TaxCcenter, using the alias name TaxCcenter.
     * @return the value of TaxCcenter
     */
    public String getTaxCcenter() {
        return (String) getAttributeInternal(TAXCCENTER);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxCcenter.
     * @param value value to set the TaxCcenter
     */
    public void setTaxCcenter(String value) {
        setAttributeInternal(TAXCCENTER, value);
    }

    /**
     * Gets the attribute value for Load, using the alias name Load.
     * @return the value of Load
     */
    public String getLoad() {
        return (String) getAttributeInternal(LOAD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Load.
     * @param value value to set the Load
     */
    public void setLoad(String value) {
        setAttributeInternal(LOAD, value);
    }

    /**
     * Gets the attribute value for Rmode, using the alias name Rmode.
     * @return the value of Rmode
     */
    public String getRmode() {
        return (String) getAttributeInternal(RMODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rmode.
     * @param value value to set the Rmode
     */
    public void setRmode(String value) {
        setAttributeInternal(RMODE, value);
    }

    /**
     * Gets the attribute value for DocDate, using the alias name DocDate.
     * @return the value of DocDate
     */
    public Date getDocDate() {
        return (Date) getAttributeInternal(DOCDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocDate.
     * @param value value to set the DocDate
     */
    public void setDocDate(Date value) {
        setAttributeInternal(DOCDATE, value);
    }

    /**
     * Gets the attribute value for ChequeCancel, using the alias name ChequeCancel.
     * @return the value of ChequeCancel
     */
    public String getChequeCancel() {
        return (String) getAttributeInternal(CHEQUECANCEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChequeCancel.
     * @param value value to set the ChequeCancel
     */
    public void setChequeCancel(String value) {
        setAttributeInternal(CHEQUECANCEL, value);
    }

    /**
     * Gets the attribute value for RefCancelControlReceipt, using the alias name RefCancelControlReceipt.
     * @return the value of RefCancelControlReceipt
     */
    public String getRefCancelControlReceipt() {
        return (String) getAttributeInternal(REFCANCELCONTROLRECEIPT);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefCancelControlReceipt.
     * @param value value to set the RefCancelControlReceipt
     */
    public void setRefCancelControlReceipt(String value) {
        setAttributeInternal(REFCANCELCONTROLRECEIPT, value);
    }

    /**
     * Gets the attribute value for RefCancelReceiptAmount, using the alias name RefCancelReceiptAmount.
     * @return the value of RefCancelReceiptAmount
     */
    public BigDecimal getRefCancelReceiptAmount() {
        return (BigDecimal) getAttributeInternal(REFCANCELRECEIPTAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefCancelReceiptAmount.
     * @param value value to set the RefCancelReceiptAmount
     */
    public void setRefCancelReceiptAmount(BigDecimal value) {
        setAttributeInternal(REFCANCELRECEIPTAMOUNT, value);
    }

    /**
     * Gets the attribute value for ChqReturnDate, using the alias name ChqReturnDate.
     * @return the value of ChqReturnDate
     */
    public Date getChqReturnDate() {
        return (Date) getAttributeInternal(CHQRETURNDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChqReturnDate.
     * @param value value to set the ChqReturnDate
     */
    public void setChqReturnDate(Date value) {
        setAttributeInternal(CHQRETURNDATE, value);
    }

    /**
     * Gets the attribute value for IsMigrated, using the alias name IsMigrated.
     * @return the value of IsMigrated
     */
    public String getIsMigrated() {
        return (String) getAttributeInternal(ISMIGRATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsMigrated.
     * @param value value to set the IsMigrated
     */
    public void setIsMigrated(String value) {
        setAttributeInternal(ISMIGRATED, value);
    }

    /**
     * Gets the attribute value for MigratedDate, using the alias name MigratedDate.
     * @return the value of MigratedDate
     */
    public Date getMigratedDate() {
        return (Date) getAttributeInternal(MIGRATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for MigratedDate.
     * @param value value to set the MigratedDate
     */
    public void setMigratedDate(Date value) {
        setAttributeInternal(MIGRATEDDATE, value);
    }

    /**
     * Gets the attribute value for CustomerAcNo, using the alias name CustomerAcNo.
     * @return the value of CustomerAcNo
     */
    public String getCustomerAcNo() {
        return (String) getAttributeInternal(CUSTOMERACNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomerAcNo.
     * @param value value to set the CustomerAcNo
     */
    public void setCustomerAcNo(String value) {
        setAttributeInternal(CUSTOMERACNO, value);
    }

    /**
     * Gets the attribute value for CustomerAcValidate, using the alias name CustomerAcValidate.
     * @return the value of CustomerAcValidate
     */
    public String getCustomerAcValidate() {
        return (String) getAttributeInternal(CUSTOMERACVALIDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomerAcValidate.
     * @param value value to set the CustomerAcValidate
     */
    public void setCustomerAcValidate(String value) {
        setAttributeInternal(CUSTOMERACVALIDATE, value);
    }

    /**
     * Gets the attribute value for ExchangeRate, using the alias name ExchangeRate.
     * @return the value of ExchangeRate
     */
    public BigDecimal getExchangeRate() {
        return (BigDecimal) getAttributeInternal(EXCHANGERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExchangeRate.
     * @param value value to set the ExchangeRate
     */
    public void setExchangeRate(BigDecimal value) {
        setAttributeInternal(EXCHANGERATE, value);
    }

    /**
     * Gets the attribute value for LocCurrcode, using the alias name LocCurrcode.
     * @return the value of LocCurrcode
     */
    public String getLocCurrcode() {
        return (String) getAttributeInternal(LOCCURRCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocCurrcode.
     * @param value value to set the LocCurrcode
     */
    public void setLocCurrcode(String value) {
        setAttributeInternal(LOCCURRCODE, value);
    }

    /**
     * Gets the attribute value for OldReceiptNo, using the alias name OldReceiptNo.
     * @return the value of OldReceiptNo
     */
    public String getOldReceiptNo() {
        return (String) getAttributeInternal(OLDRECEIPTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for OldReceiptNo.
     * @param value value to set the OldReceiptNo
     */
    public void setOldReceiptNo(String value) {
        setAttributeInternal(OLDRECEIPTNO, value);
    }

    /**
     * Gets the attribute value for VoucherNo, using the alias name VoucherNo.
     * @return the value of VoucherNo
     */
    public String getVoucherNo() {
        return (String) getAttributeInternal(VOUCHERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for VoucherNo.
     * @param value value to set the VoucherNo
     */
    public void setVoucherNo(String value) {
        setAttributeInternal(VOUCHERNO, value);
    }

    /**
     * Gets the attribute value for VoucherType, using the alias name VoucherType.
     * @return the value of VoucherType
     */
    public String getVoucherType() {
        return (String) getAttributeInternal(VOUCHERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for VoucherType.
     * @param value value to set the VoucherType
     */
    public void setVoucherType(String value) {
        setAttributeInternal(VOUCHERTYPE, value);
    }

    /**
     * Gets the attribute value for VoucherCheqNo, using the alias name VoucherCheqNo.
     * @return the value of VoucherCheqNo
     */
    public String getVoucherCheqNo() {
        return (String) getAttributeInternal(VOUCHERCHEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for VoucherCheqNo.
     * @param value value to set the VoucherCheqNo
     */
    public void setVoucherCheqNo(String value) {
        setAttributeInternal(VOUCHERCHEQNO, value);
    }

    /**
     * Gets the attribute value for Supplierid, using the alias name Supplierid.
     * @return the value of Supplierid
     */
    public String getSupplierid() {
        return (String) getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Supplierid.
     * @param value value to set the Supplierid
     */
    public void setSupplierid(String value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for PaymentCodeRef, using the alias name PaymentCodeRef.
     * @return the value of PaymentCodeRef
     */
    public String getPaymentCodeRef() {
        return (String) getAttributeInternal(PAYMENTCODEREF);
    }

    /**
     * Sets <code>value</code> as the attribute value for PaymentCodeRef.
     * @param value value to set the PaymentCodeRef
     */
    public void setPaymentCodeRef(String value) {
        setAttributeInternal(PAYMENTCODEREF, value);
    }

    /**
     * Gets the attribute value for Receiptseq, using the alias name Receiptseq.
     * @return the value of Receiptseq
     */
    public Integer getReceiptseq() {
        return (Integer) getAttributeInternal(RECEIPTSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Receiptseq.
     * @param value value to set the Receiptseq
     */
    public void setReceiptseq(Integer value) {
        setAttributeInternal(RECEIPTSEQ, value);
    }

    /**
     * Gets the attribute value for txtCustomerName, using the alias name txtCustomerName.
     * @return the value of txtCustomerName
     */
    public String gettxtCustomerName() {
        return (String) getAttributeInternal(TXTCUSTOMERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCustomerName.
     * @param value value to set the txtCustomerName
     */
    public void settxtCustomerName(String value) {
        setAttributeInternal(TXTCUSTOMERNAME, value);
    }

    /**
     * Gets the attribute value for txtSalesPersonName, using the alias name txtSalesPersonName.
     * @return the value of txtSalesPersonName
     */
    public String gettxtSalesPersonName() {
        return (String) getAttributeInternal(TXTSALESPERSONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSalesPersonName.
     * @param value value to set the txtSalesPersonName
     */
    public void settxtSalesPersonName(String value) {
        setAttributeInternal(TXTSALESPERSONNAME, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getReceiptDetailControl() {
        return (RowIterator) getAttributeInternal(RECEIPTDETAILCONTROL);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllCustomers() {
        return (EntityImpl) getAttributeInternal(ALLCUSTOMERS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllCustomers(EntityImpl value) {
        setAttributeInternal(ALLCUSTOMERS, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSoSalesPersons() {
        return (EntityImpl) getAttributeInternal(SOSALESPERSONS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSoSalesPersons(EntityImpl value) {
        setAttributeInternal(SOSALESPERSONS, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllBankBranches() {
        return (EntityImpl) getAttributeInternal(ALLBANKBRANCHES);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllBankBranches(EntityImpl value) {
        setAttributeInternal(ALLBANKBRANCHES, value);
    }


    /**
     * @param receiptseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer receiptseq) {
        return new Key(new Object[] { receiptseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
  
            setERPSolPKColumnName("Receiptseq");
            setERPSolPKSeqName("RECEIPT_MASTER_CONTROL_SEQ");
//        //        setERPISGenertePK("NO");
        //        SequenceImpl seq = new SequenceImpl("SO_SALES_ORDER_SEQ", getDBTransaction());
        //        setSalesorderseq(seq.getSequenceNumber());
            super.create(attributeList);
        
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation==DML_INSERT) {
           String pkValue=" SALESORDER_ID('"+ERPSolGlobClassModel.doGetUserCompanyCode()+"','"+ERPSolGlobClassModel.doGetUserLocationCode()+"','B',TO_DATE('"+getReceiptDate()+"','YYYY-MM-DD'))";
           System.out.println(pkValue + "pk value");
           String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
           populateAttributeAsChanged(RECEIPTNO, result);

       }
        super.doDML(operation, e);
    }
    
}

