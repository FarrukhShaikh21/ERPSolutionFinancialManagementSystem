package erpsolfms.erpsolfmsmodel.erpsolfmseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Dec 07 16:12:44 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ArNoteDetailImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SeqNo,
        NoteCode,
        TaxCode,
        RefDocument,
        Amount,
        Balance,
        Createdby,
        Modifiedby,
        CreatedDate,
        ModifiedDate,
        DocTypeId,
        GlCode,
        Costcenter,
        Discountid,
        Itemid,
        ItemRefId,
        ModelNo,
        DiscDescription,
        Glid,
        DisQty,
        OldGlcode,
        FcurrAmount,
        Notedetailseq,
        Notemasterseq,
        txtItemName,
        ArNoteMaster,
        InItems;
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


    public static final int SEQNO = AttributesEnum.SeqNo.index();
    public static final int NOTECODE = AttributesEnum.NoteCode.index();
    public static final int TAXCODE = AttributesEnum.TaxCode.index();
    public static final int REFDOCUMENT = AttributesEnum.RefDocument.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int BALANCE = AttributesEnum.Balance.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int DOCTYPEID = AttributesEnum.DocTypeId.index();
    public static final int GLCODE = AttributesEnum.GlCode.index();
    public static final int COSTCENTER = AttributesEnum.Costcenter.index();
    public static final int DISCOUNTID = AttributesEnum.Discountid.index();
    public static final int ITEMID = AttributesEnum.Itemid.index();
    public static final int ITEMREFID = AttributesEnum.ItemRefId.index();
    public static final int MODELNO = AttributesEnum.ModelNo.index();
    public static final int DISCDESCRIPTION = AttributesEnum.DiscDescription.index();
    public static final int GLID = AttributesEnum.Glid.index();
    public static final int DISQTY = AttributesEnum.DisQty.index();
    public static final int OLDGLCODE = AttributesEnum.OldGlcode.index();
    public static final int FCURRAMOUNT = AttributesEnum.FcurrAmount.index();
    public static final int NOTEDETAILSEQ = AttributesEnum.Notedetailseq.index();
    public static final int NOTEMASTERSEQ = AttributesEnum.Notemasterseq.index();
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int ARNOTEMASTER = AttributesEnum.ArNoteMaster.index();
    public static final int INITEMS = AttributesEnum.InItems.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ArNoteDetailImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolfms.erpsolfmsmodel.erpsolfmseo.ArNoteDetail");
    }


    /**
     * Gets the attribute value for SeqNo, using the alias name SeqNo.
     * @return the value of SeqNo
     */
    public Integer getSeqNo() {
        return (Integer) getAttributeInternal(SEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SeqNo.
     * @param value value to set the SeqNo
     */
    public void setSeqNo(Integer value) {
        setAttributeInternal(SEQNO, value);
    }

    /**
     * Gets the attribute value for NoteCode, using the alias name NoteCode.
     * @return the value of NoteCode
     */
    public String getNoteCode() {
        return (String) getAttributeInternal(NOTECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoteCode.
     * @param value value to set the NoteCode
     */
    public void setNoteCode(String value) {
        setAttributeInternal(NOTECODE, value);
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
     * Gets the attribute value for RefDocument, using the alias name RefDocument.
     * @return the value of RefDocument
     */
    public String getRefDocument() {
        return (String) getAttributeInternal(REFDOCUMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefDocument.
     * @param value value to set the RefDocument
     */
    public void setRefDocument(String value) {
        setAttributeInternal(REFDOCUMENT, value);
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
     * Gets the attribute value for Balance, using the alias name Balance.
     * @return the value of Balance
     */
    public BigDecimal getBalance() {
        return (BigDecimal) getAttributeInternal(BALANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Balance.
     * @param value value to set the Balance
     */
    public void setBalance(BigDecimal value) {
        setAttributeInternal(BALANCE, value);
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
     * Gets the attribute value for GlCode, using the alias name GlCode.
     * @return the value of GlCode
     */
    public String getGlCode() {
        return (String) getAttributeInternal(GLCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlCode.
     * @param value value to set the GlCode
     */
    public void setGlCode(String value) {
        setAttributeInternal(GLCODE, value);
    }

    /**
     * Gets the attribute value for Costcenter, using the alias name Costcenter.
     * @return the value of Costcenter
     */
    public String getCostcenter() {
        return (String) getAttributeInternal(COSTCENTER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Costcenter.
     * @param value value to set the Costcenter
     */
    public void setCostcenter(String value) {
        setAttributeInternal(COSTCENTER, value);
    }

    /**
     * Gets the attribute value for Discountid, using the alias name Discountid.
     * @return the value of Discountid
     */
    public String getDiscountid() {
        return (String) getAttributeInternal(DISCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Discountid.
     * @param value value to set the Discountid
     */
    public void setDiscountid(String value) {
        setAttributeInternal(DISCOUNTID, value);
    }

    /**
     * Gets the attribute value for Itemid, using the alias name Itemid.
     * @return the value of Itemid
     */
    public String getItemid() {
        return (String) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Itemid.
     * @param value value to set the Itemid
     */
    public void setItemid(String value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for ItemRefId, using the alias name ItemRefId.
     * @return the value of ItemRefId
     */
    public String getItemRefId() {
        return (String) getAttributeInternal(ITEMREFID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemRefId.
     * @param value value to set the ItemRefId
     */
    public void setItemRefId(String value) {
        setAttributeInternal(ITEMREFID, value);
    }

    /**
     * Gets the attribute value for ModelNo, using the alias name ModelNo.
     * @return the value of ModelNo
     */
    public String getModelNo() {
        return (String) getAttributeInternal(MODELNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModelNo.
     * @param value value to set the ModelNo
     */
    public void setModelNo(String value) {
        setAttributeInternal(MODELNO, value);
    }

    /**
     * Gets the attribute value for DiscDescription, using the alias name DiscDescription.
     * @return the value of DiscDescription
     */
    public String getDiscDescription() {
        return (String) getAttributeInternal(DISCDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for DiscDescription.
     * @param value value to set the DiscDescription
     */
    public void setDiscDescription(String value) {
        setAttributeInternal(DISCDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for Glid, using the alias name Glid.
     * @return the value of Glid
     */
    public BigDecimal getGlid() {
        return (BigDecimal) getAttributeInternal(GLID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Glid.
     * @param value value to set the Glid
     */
    public void setGlid(BigDecimal value) {
        setAttributeInternal(GLID, value);
    }

    /**
     * Gets the attribute value for DisQty, using the alias name DisQty.
     * @return the value of DisQty
     */
    public BigDecimal getDisQty() {
        return (BigDecimal) getAttributeInternal(DISQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for DisQty.
     * @param value value to set the DisQty
     */
    public void setDisQty(BigDecimal value) {
        setAttributeInternal(DISQTY, value);
    }

    /**
     * Gets the attribute value for OldGlcode, using the alias name OldGlcode.
     * @return the value of OldGlcode
     */
    public String getOldGlcode() {
        return (String) getAttributeInternal(OLDGLCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OldGlcode.
     * @param value value to set the OldGlcode
     */
    public void setOldGlcode(String value) {
        setAttributeInternal(OLDGLCODE, value);
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
     * Gets the attribute value for Notedetailseq, using the alias name Notedetailseq.
     * @return the value of Notedetailseq
     */
    public Integer getNotedetailseq() {
        return (Integer) getAttributeInternal(NOTEDETAILSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Notedetailseq.
     * @param value value to set the Notedetailseq
     */
    public void setNotedetailseq(Integer value) {
        setAttributeInternal(NOTEDETAILSEQ, value);
    }

    /**
     * Gets the attribute value for Notemasterseq, using the alias name Notemasterseq.
     * @return the value of Notemasterseq
     */
    public Integer getNotemasterseq() {
        return (Integer) getAttributeInternal(NOTEMASTERSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Notemasterseq.
     * @param value value to set the Notemasterseq
     */
    public void setNotemasterseq(Integer value) {
        setAttributeInternal(NOTEMASTERSEQ, value);
    }

    /**
     * Gets the attribute value for txtItemName, using the alias name txtItemName.
     * @return the value of txtItemName
     */
    public String gettxtItemName() {
        return (String) getAttributeInternal(TXTITEMNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtItemName.
     * @param value value to set the txtItemName
     */
    public void settxtItemName(String value) {
        setAttributeInternal(TXTITEMNAME, value);
    }

    /**
     * @return the associated entity ArNoteMasterImpl.
     */
    public ArNoteMasterImpl getArNoteMaster() {
        return (ArNoteMasterImpl) getAttributeInternal(ARNOTEMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity ArNoteMasterImpl.
     */
    public void setArNoteMaster(ArNoteMasterImpl value) {
        setAttributeInternal(ARNOTEMASTER, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getInItems() {
        return (EntityImpl) getAttributeInternal(INITEMS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setInItems(EntityImpl value) {
        setAttributeInternal(INITEMS, value);
    }


    /**
     * @param notedetailseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer notedetailseq) {
        return new Key(new Object[] { notedetailseq });
    }

    protected void create(AttributeList attributeList) {
    
            setERPSolPKColumnName("Notedetailseq");
            setERPSolPKSeqName("AR_NOTE_DETAIL_SEQ");
        

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
            populateAttributeAsChanged(SEQNO, getNotedetailseq());
       }
        if (operation!=DML_DELETE) {
            populateAttributeAsChanged(AMOUNT, getFcurrAmount());
       }
        super.doDML(operation, e);
    }
}

