package erpsolfms.erpsolfmsmodel.erpsolfmseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 25 19:32:37 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ReceiptDetailControlImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ReceiptNo,
        Customerid,
        Salespersonid,
        Pid,
        Amount,
        Lineno,
        TaxAmount,
        CancelAmount,
        FcurrAmount,
        FcurrTaxAmount,
        FcurrCancelAmount,
        Receiptdetailseq,
        Receiptseq,
        txtSalesPersonName,
        txtCustomerName,
        ReceiptMasterControl,
        SoSalesPersons;
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
    public static final int CUSTOMERID = AttributesEnum.Customerid.index();
    public static final int SALESPERSONID = AttributesEnum.Salespersonid.index();
    public static final int PID = AttributesEnum.Pid.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int LINENO = AttributesEnum.Lineno.index();
    public static final int TAXAMOUNT = AttributesEnum.TaxAmount.index();
    public static final int CANCELAMOUNT = AttributesEnum.CancelAmount.index();
    public static final int FCURRAMOUNT = AttributesEnum.FcurrAmount.index();
    public static final int FCURRTAXAMOUNT = AttributesEnum.FcurrTaxAmount.index();
    public static final int FCURRCANCELAMOUNT = AttributesEnum.FcurrCancelAmount.index();
    public static final int RECEIPTDETAILSEQ = AttributesEnum.Receiptdetailseq.index();
    public static final int RECEIPTSEQ = AttributesEnum.Receiptseq.index();
    public static final int TXTSALESPERSONNAME = AttributesEnum.txtSalesPersonName.index();
    public static final int TXTCUSTOMERNAME = AttributesEnum.txtCustomerName.index();
    public static final int RECEIPTMASTERCONTROL = AttributesEnum.ReceiptMasterControl.index();
    public static final int SOSALESPERSONS = AttributesEnum.SoSalesPersons.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ReceiptDetailControlImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolfms.erpsolfmsmodel.erpsolfmseo.ReceiptDetailControl");
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
    public Integer getPid() {
        return (Integer) getAttributeInternal(PID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Pid.
     * @param value value to set the Pid
     */
    public void setPid(Integer value) {
        setAttributeInternal(PID, value);
    }

    /**
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the value of Amount
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for Lineno, using the alias name Lineno.
     * @return the value of Lineno
     */
    public BigDecimal getLineno() {
        return (BigDecimal) getAttributeInternal(LINENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Lineno.
     * @param value value to set the Lineno
     */
    public void setLineno(BigDecimal value) {
        setAttributeInternal(LINENO, value);
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
     * Gets the attribute value for CancelAmount, using the alias name CancelAmount.
     * @return the value of CancelAmount
     */
    public BigDecimal getCancelAmount() {
        return (BigDecimal) getAttributeInternal(CANCELAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CancelAmount.
     * @param value value to set the CancelAmount
     */
    public void setCancelAmount(BigDecimal value) {
        setAttributeInternal(CANCELAMOUNT, value);
    }

    /**
     * Gets the attribute value for FcurrAmount, using the alias name FcurrAmount.
     * @return the value of FcurrAmount
     */
    public BigDecimal getFcurrAmount() {
        return (BigDecimal) getAttributeInternal(FCURRAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FcurrAmount.
     * @param value value to set the FcurrAmount
     */
    public void setFcurrAmount(BigDecimal value) {
        setAttributeInternal(FCURRAMOUNT, value);
    }

    /**
     * Gets the attribute value for FcurrTaxAmount, using the alias name FcurrTaxAmount.
     * @return the value of FcurrTaxAmount
     */
    public BigDecimal getFcurrTaxAmount() {
        return (BigDecimal) getAttributeInternal(FCURRTAXAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FcurrTaxAmount.
     * @param value value to set the FcurrTaxAmount
     */
    public void setFcurrTaxAmount(BigDecimal value) {
        setAttributeInternal(FCURRTAXAMOUNT, value);
    }

    /**
     * Gets the attribute value for FcurrCancelAmount, using the alias name FcurrCancelAmount.
     * @return the value of FcurrCancelAmount
     */
    public BigDecimal getFcurrCancelAmount() {
        return (BigDecimal) getAttributeInternal(FCURRCANCELAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FcurrCancelAmount.
     * @param value value to set the FcurrCancelAmount
     */
    public void setFcurrCancelAmount(BigDecimal value) {
        setAttributeInternal(FCURRCANCELAMOUNT, value);
    }

    /**
     * Gets the attribute value for Receiptdetailseq, using the alias name Receiptdetailseq.
     * @return the value of Receiptdetailseq
     */
    public Integer getReceiptdetailseq() {
        return (Integer) getAttributeInternal(RECEIPTDETAILSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Receiptdetailseq.
     * @param value value to set the Receiptdetailseq
     */
    public void setReceiptdetailseq(Integer value) {
        setAttributeInternal(RECEIPTDETAILSEQ, value);
    }

    /**
     * Gets the attribute value for Receiptseq, using the alias name Receiptseq.
     * @return the value of Receiptseq
     */
    public BigDecimal getReceiptseq() {
        return (BigDecimal) getAttributeInternal(RECEIPTSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Receiptseq.
     * @param value value to set the Receiptseq
     */
    public void setReceiptseq(BigDecimal value) {
        setAttributeInternal(RECEIPTSEQ, value);
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
     * @return the associated entity ReceiptMasterControlImpl.
     */
    public ReceiptMasterControlImpl getReceiptMasterControl() {
        return (ReceiptMasterControlImpl) getAttributeInternal(RECEIPTMASTERCONTROL);
    }

    /**
     * Sets <code>value</code> as the associated entity ReceiptMasterControlImpl.
     */
    public void setReceiptMasterControl(ReceiptMasterControlImpl value) {
        setAttributeInternal(RECEIPTMASTERCONTROL, value);
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
     * @param receiptdetailseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer receiptdetailseq) {
        return new Key(new Object[] { receiptdetailseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setERPSolPKColumnName("Receiptdetailseq");
        setERPSolPKSeqName("RECEIPT_DETAIL_CONTROL_SEQ");
           
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
            populateAttributeAsChanged(RECEIPTNO, getReceiptMasterControl().getAttribute("ReceiptNo"));
       }
        if (operation!=DML_DELETE) {
           populateAttributeAsChanged(AMOUNT,getFcurrAmount());
           populateAttributeAsChanged(TAXAMOUNT,getFcurrTaxAmount());
       }
        super.doDML(operation, e);
    }
  
    
}

