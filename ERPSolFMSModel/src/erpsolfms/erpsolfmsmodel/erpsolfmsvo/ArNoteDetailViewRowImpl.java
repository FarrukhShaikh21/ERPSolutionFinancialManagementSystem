package erpsolfms.erpsolfmsmodel.erpsolfmsvo;

import erpsolfms.erpsolfmsmodel.erpsolfmseo.ArNoteDetailImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 08 14:38:30 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ArNoteDetailViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_ARNOTEDETAIL = 0;

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
        txtCOADescription,
        txtCostCenterDescription,
        InItemsView,
        VWChartOfAccountQVO,
        VWChartOfAccountQVO1,
        ArNoteMasterView,
        AccInItemsView,
        AccVWChartOfAccountQVO;
        static AttributesEnum[] vals = null;
        ;
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
    public static final int TXTCOADESCRIPTION = AttributesEnum.txtCOADescription.index();
    public static final int TXTCOSTCENTERDESCRIPTION = AttributesEnum.txtCostCenterDescription.index();
    public static final int INITEMSVIEW = AttributesEnum.InItemsView.index();
    public static final int VWCHARTOFACCOUNTQVO = AttributesEnum.VWChartOfAccountQVO.index();
    public static final int VWCHARTOFACCOUNTQVO1 = AttributesEnum.VWChartOfAccountQVO1.index();
    public static final int ARNOTEMASTERVIEW = AttributesEnum.ArNoteMasterView.index();
    public static final int ACCINITEMSVIEW = AttributesEnum.AccInItemsView.index();
    public static final int ACCVWCHARTOFACCOUNTQVO = AttributesEnum.AccVWChartOfAccountQVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ArNoteDetailViewRowImpl() {
    }

    /**
     * Gets ArNoteDetail entity object.
     * @return the ArNoteDetail
     */
    public ArNoteDetailImpl getArNoteDetail() {
        return (ArNoteDetailImpl) getEntity(ENTITY_ARNOTEDETAIL);
    }

    /**
     * Gets the attribute value for SEQ_NO using the alias name SeqNo.
     * @return the SEQ_NO
     */
    public Integer getSeqNo() {
        return (Integer) getAttributeInternal(SEQNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SEQ_NO using the alias name SeqNo.
     * @param value value to set the SEQ_NO
     */
    public void setSeqNo(Integer value) {
        setAttributeInternal(SEQNO, value);
    }

    /**
     * Gets the attribute value for NOTE_CODE using the alias name NoteCode.
     * @return the NOTE_CODE
     */
    public String getNoteCode() {
        return (String) getAttributeInternal(NOTECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTE_CODE using the alias name NoteCode.
     * @param value value to set the NOTE_CODE
     */
    public void setNoteCode(String value) {
        setAttributeInternal(NOTECODE, value);
    }

    /**
     * Gets the attribute value for TAX_CODE using the alias name TaxCode.
     * @return the TAX_CODE
     */
    public BigDecimal getTaxCode() {
        return (BigDecimal) getAttributeInternal(TAXCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_CODE using the alias name TaxCode.
     * @param value value to set the TAX_CODE
     */
    public void setTaxCode(BigDecimal value) {
        setAttributeInternal(TAXCODE, value);
    }

    /**
     * Gets the attribute value for REF_DOCUMENT using the alias name RefDocument.
     * @return the REF_DOCUMENT
     */
    public String getRefDocument() {
        return (String) getAttributeInternal(REFDOCUMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for REF_DOCUMENT using the alias name RefDocument.
     * @param value value to set the REF_DOCUMENT
     */
    public void setRefDocument(String value) {
        setAttributeInternal(REFDOCUMENT, value);
    }

    /**
     * Gets the attribute value for AMOUNT using the alias name Amount.
     * @return the AMOUNT
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for AMOUNT using the alias name Amount.
     * @param value value to set the AMOUNT
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for BALANCE using the alias name Balance.
     * @return the BALANCE
     */
    public BigDecimal getBalance() {
        return (BigDecimal) getAttributeInternal(BALANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for BALANCE using the alias name Balance.
     * @param value value to set the BALANCE
     */
    public void setBalance(BigDecimal value) {
        setAttributeInternal(BALANCE, value);
    }

    /**
     * Gets the attribute value for CREATEDBY using the alias name Createdby.
     * @return the CREATEDBY
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATEDBY using the alias name Createdby.
     * @param value value to set the CREATEDBY
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for MODIFIEDBY using the alias name Modifiedby.
     * @return the MODIFIEDBY
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIEDBY using the alias name Modifiedby.
     * @param value value to set the MODIFIEDBY
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @return the MODIFIED_DATE
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @param value value to set the MODIFIED_DATE
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for DOC_TYPE_ID using the alias name DocTypeId.
     * @return the DOC_TYPE_ID
     */
    public String getDocTypeId() {
        return (String) getAttributeInternal(DOCTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DOC_TYPE_ID using the alias name DocTypeId.
     * @param value value to set the DOC_TYPE_ID
     */
    public void setDocTypeId(String value) {
        setAttributeInternal(DOCTYPEID, value);
    }

    /**
     * Gets the attribute value for GL_CODE using the alias name GlCode.
     * @return the GL_CODE
     */
    public String getGlCode() {
        return (String) getAttributeInternal(GLCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for GL_CODE using the alias name GlCode.
     * @param value value to set the GL_CODE
     */
    public void setGlCode(String value) {
        setAttributeInternal(GLCODE, value);
    }

    /**
     * Gets the attribute value for COSTCENTER using the alias name Costcenter.
     * @return the COSTCENTER
     */
    public String getCostcenter() {
        return (String) getAttributeInternal(COSTCENTER);
    }

    /**
     * Sets <code>value</code> as attribute value for COSTCENTER using the alias name Costcenter.
     * @param value value to set the COSTCENTER
     */
    public void setCostcenter(String value) {
        setAttributeInternal(COSTCENTER, value);
    }

    /**
     * Gets the attribute value for DISCOUNTID using the alias name Discountid.
     * @return the DISCOUNTID
     */
    public String getDiscountid() {
        return (String) getAttributeInternal(DISCOUNTID);
    }

    /**
     * Sets <code>value</code> as attribute value for DISCOUNTID using the alias name Discountid.
     * @param value value to set the DISCOUNTID
     */
    public void setDiscountid(String value) {
        setAttributeInternal(DISCOUNTID, value);
    }

    /**
     * Gets the attribute value for ITEMID using the alias name Itemid.
     * @return the ITEMID
     */
    public String getItemid() {
        return (String) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEMID using the alias name Itemid.
     * @param value value to set the ITEMID
     */
    public void setItemid(String value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for ITEM_REF_ID using the alias name ItemRefId.
     * @return the ITEM_REF_ID
     */
    public String getItemRefId() {
        return (String) getAttributeInternal(ITEMREFID);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEM_REF_ID using the alias name ItemRefId.
     * @param value value to set the ITEM_REF_ID
     */
    public void setItemRefId(String value) {
        setAttributeInternal(ITEMREFID, value);
    }

    /**
     * Gets the attribute value for MODEL_NO using the alias name ModelNo.
     * @return the MODEL_NO
     */
    public String getModelNo() {
        return (String) getAttributeInternal(MODELNO);
    }

    /**
     * Sets <code>value</code> as attribute value for MODEL_NO using the alias name ModelNo.
     * @param value value to set the MODEL_NO
     */
    public void setModelNo(String value) {
        setAttributeInternal(MODELNO, value);
    }

    /**
     * Gets the attribute value for DISC_DESCRIPTION using the alias name DiscDescription.
     * @return the DISC_DESCRIPTION
     */
    public String getDiscDescription() {
        return (String) getAttributeInternal(DISCDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for DISC_DESCRIPTION using the alias name DiscDescription.
     * @param value value to set the DISC_DESCRIPTION
     */
    public void setDiscDescription(String value) {
        setAttributeInternal(DISCDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for GLID using the alias name Glid.
     * @return the GLID
     */
    public BigDecimal getGlid() {
        return (BigDecimal) getAttributeInternal(GLID);
    }

    /**
     * Sets <code>value</code> as attribute value for GLID using the alias name Glid.
     * @param value value to set the GLID
     */
    public void setGlid(BigDecimal value) {
        setAttributeInternal(GLID, value);
    }

    /**
     * Gets the attribute value for DIS_QTY using the alias name DisQty.
     * @return the DIS_QTY
     */
    public BigDecimal getDisQty() {
        return (BigDecimal) getAttributeInternal(DISQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for DIS_QTY using the alias name DisQty.
     * @param value value to set the DIS_QTY
     */
    public void setDisQty(BigDecimal value) {
        setAttributeInternal(DISQTY, value);
    }

    /**
     * Gets the attribute value for OLD_GLCODE using the alias name OldGlcode.
     * @return the OLD_GLCODE
     */
    public String getOldGlcode() {
        return (String) getAttributeInternal(OLDGLCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for OLD_GLCODE using the alias name OldGlcode.
     * @param value value to set the OLD_GLCODE
     */
    public void setOldGlcode(String value) {
        setAttributeInternal(OLDGLCODE, value);
    }

    /**
     * Gets the attribute value for FCURR_AMOUNT using the alias name FcurrAmount.
     * @return the FCURR_AMOUNT
     */
    public BigDecimal getFcurrAmount() {
        return (BigDecimal) getAttributeInternal(FCURRAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for FCURR_AMOUNT using the alias name FcurrAmount.
     * @param value value to set the FCURR_AMOUNT
     */
    public void setFcurrAmount(BigDecimal value) {
        setAttributeInternal(FCURRAMOUNT, value);
    }

    /**
     * Gets the attribute value for NOTEDETAILSEQ using the alias name Notedetailseq.
     * @return the NOTEDETAILSEQ
     */
    public Integer getNotedetailseq() {
        return (Integer) getAttributeInternal(NOTEDETAILSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTEDETAILSEQ using the alias name Notedetailseq.
     * @param value value to set the NOTEDETAILSEQ
     */
    public void setNotedetailseq(Integer value) {
        setAttributeInternal(NOTEDETAILSEQ, value);
    }

    /**
     * Gets the attribute value for NOTEMASTERSEQ using the alias name Notemasterseq.
     * @return the NOTEMASTERSEQ
     */
    public Integer getNotemasterseq() {
        return (Integer) getAttributeInternal(NOTEMASTERSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTEMASTERSEQ using the alias name Notemasterseq.
     * @param value value to set the NOTEMASTERSEQ
     */
    public void setNotemasterseq(Integer value) {
        setAttributeInternal(NOTEMASTERSEQ, value);
    }

    /**
     * Gets the attribute value for TXT_ITEM_NAME using the alias name txtItemName.
     * @return the TXT_ITEM_NAME
     */
    public String gettxtItemName() {
        return (String) getAttributeInternal(TXTITEMNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_ITEM_NAME using the alias name txtItemName.
     * @param value value to set the TXT_ITEM_NAME
     */
    public void settxtItemName(String value) {
        setAttributeInternal(TXTITEMNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtCOADescription.
     * @return the txtCOADescription
     */
    public String gettxtCOADescription() {
        return (String) getAttributeInternal(TXTCOADESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtCOADescription.
     * @param value value to set the  txtCOADescription
     */
    public void settxtCOADescription(String value) {
        setAttributeInternal(TXTCOADESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtCostCenterDescription.
     * @return the txtCostCenterDescription
     */
    public String gettxtCostCenterDescription() {
        return (String) getAttributeInternal(TXTCOSTCENTERDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtCostCenterDescription.
     * @param value value to set the  txtCostCenterDescription
     */
    public void settxtCostCenterDescription(String value) {
        setAttributeInternal(TXTCOSTCENTERDESCRIPTION, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link InItemsView.
     */
    public Row getInItemsView() {
        return (Row) getAttributeInternal(INITEMSVIEW);
    }

    /**
     * Sets the master-detail link InItemsView between this object and <code>value</code>.
     */
    public void setInItemsView(Row value) {
        setAttributeInternal(INITEMSVIEW, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link VWChartOfAccountQVO.
     */
    public Row getVWChartOfAccountQVO() {
        return (Row) getAttributeInternal(VWCHARTOFACCOUNTQVO);
    }

    /**
     * Sets the master-detail link VWChartOfAccountQVO between this object and <code>value</code>.
     */
    public void setVWChartOfAccountQVO(Row value) {
        setAttributeInternal(VWCHARTOFACCOUNTQVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link VWChartOfAccountQVO1.
     */
    public Row getVWChartOfAccountQVO1() {
        return (Row) getAttributeInternal(VWCHARTOFACCOUNTQVO1);
    }

    /**
     * Sets the master-detail link VWChartOfAccountQVO1 between this object and <code>value</code>.
     */
    public void setVWChartOfAccountQVO1(Row value) {
        setAttributeInternal(VWCHARTOFACCOUNTQVO1, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link ArNoteMasterView.
     */
    public Row getArNoteMasterView() {
        return (Row) getAttributeInternal(ARNOTEMASTERVIEW);
    }

    /**
     * Sets the master-detail link ArNoteMasterView between this object and <code>value</code>.
     */
    public void setArNoteMasterView(Row value) {
        setAttributeInternal(ARNOTEMASTERVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInItemsView.
     */
    public RowSet getAccInItemsView() {
        return (RowSet) getAttributeInternal(ACCINITEMSVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVWChartOfAccountQVO.
     */
    public RowSet getAccVWChartOfAccountQVO() {
        return (RowSet) getAttributeInternal(ACCVWCHARTOFACCOUNTQVO);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getArNoteMasterView().getAttribute("Submit").equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

