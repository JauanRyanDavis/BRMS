package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Commitment implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long commitmentId;
   private java.lang.String commitmentNo;
   private java.lang.String accsLineNr;
   private boolean ifmisValidated;
   private java.lang.Integer fiscalYear;
   private java.lang.String fundCode;
   private java.lang.String orgCode;
   private java.lang.String objectClassCode;
   private java.lang.String financeProgramCode;
   private java.lang.String projectCode;
   private java.util.Date budgetStartDate;
   private java.util.Date budgetEndDate;
   private java.math.BigDecimal programRemainingAmount;
   private java.math.BigDecimal financeRemainingAmount;
   private java.math.BigDecimal financeCommittedAmount;
   private gov.dhs.fema.ndgrants_rules.model.AdminConfigStatus status;
   private boolean selected;
   private java.util.List<gov.dhs.fema.ndgrants_rules.model.FundingStream> fundingStreams;
   private java.lang.Long originalCommitmentId;
   private java.util.List<gov.dhs.fema.ndgrants_rules.model.Document> documents;
   private java.lang.Long financialSystemId;
   private java.lang.String strFinanceCommittedAmount;
   private gov.dhs.fema.ndgrants_rules.model.CommitmentDocumentClass commitmentDocumentClass;
   private gov.dhs.fema.ndgrants_rules.model.CommitmentDocumentType commitmentDocumentType;

   public Commitment()
   {
   }

   public java.lang.Long getCommitmentId()
   {
      return this.commitmentId;
   }

   public void setCommitmentId(java.lang.Long commitmentId)
   {
      this.commitmentId = commitmentId;
   }

   public java.lang.String getCommitmentNo()
   {
      return this.commitmentNo;
   }

   public void setCommitmentNo(java.lang.String commitmentNo)
   {
      this.commitmentNo = commitmentNo;
   }

   public java.lang.String getAccsLineNr()
   {
      return this.accsLineNr;
   }

   public void setAccsLineNr(java.lang.String accsLineNr)
   {
      this.accsLineNr = accsLineNr;
   }

   public boolean isIfmisValidated()
   {
      return this.ifmisValidated;
   }

   public void setIfmisValidated(boolean ifmisValidated)
   {
      this.ifmisValidated = ifmisValidated;
   }

   public java.lang.Integer getFiscalYear()
   {
      return this.fiscalYear;
   }

   public void setFiscalYear(java.lang.Integer fiscalYear)
   {
      this.fiscalYear = fiscalYear;
   }

   public java.lang.String getFundCode()
   {
      return this.fundCode;
   }

   public void setFundCode(java.lang.String fundCode)
   {
      this.fundCode = fundCode;
   }

   public java.lang.String getOrgCode()
   {
      return this.orgCode;
   }

   public void setOrgCode(java.lang.String orgCode)
   {
      this.orgCode = orgCode;
   }

   public java.lang.String getObjectClassCode()
   {
      return this.objectClassCode;
   }

   public void setObjectClassCode(java.lang.String objectClassCode)
   {
      this.objectClassCode = objectClassCode;
   }

   public java.lang.String getFinanceProgramCode()
   {
      return this.financeProgramCode;
   }

   public void setFinanceProgramCode(java.lang.String financeProgramCode)
   {
      this.financeProgramCode = financeProgramCode;
   }

   public java.lang.String getProjectCode()
   {
      return this.projectCode;
   }

   public void setProjectCode(java.lang.String projectCode)
   {
      this.projectCode = projectCode;
   }

   public java.util.Date getBudgetStartDate()
   {
      return this.budgetStartDate;
   }

   public void setBudgetStartDate(java.util.Date budgetStartDate)
   {
      this.budgetStartDate = budgetStartDate;
   }

   public java.util.Date getBudgetEndDate()
   {
      return this.budgetEndDate;
   }

   public void setBudgetEndDate(java.util.Date budgetEndDate)
   {
      this.budgetEndDate = budgetEndDate;
   }

   public java.math.BigDecimal getProgramRemainingAmount()
   {
      return this.programRemainingAmount;
   }

   public void setProgramRemainingAmount(
         java.math.BigDecimal programRemainingAmount)
   {
      this.programRemainingAmount = programRemainingAmount;
   }

   public java.math.BigDecimal getFinanceRemainingAmount()
   {
      return this.financeRemainingAmount;
   }

   public void setFinanceRemainingAmount(
         java.math.BigDecimal financeRemainingAmount)
   {
      this.financeRemainingAmount = financeRemainingAmount;
   }

   public java.math.BigDecimal getFinanceCommittedAmount()
   {
      return this.financeCommittedAmount;
   }

   public void setFinanceCommittedAmount(
         java.math.BigDecimal financeCommittedAmount)
   {
      this.financeCommittedAmount = financeCommittedAmount;
   }

   public gov.dhs.fema.ndgrants_rules.model.AdminConfigStatus getStatus()
   {
      return this.status;
   }

   public void setStatus(
         gov.dhs.fema.ndgrants_rules.model.AdminConfigStatus status)
   {
      this.status = status;
   }

   public boolean isSelected()
   {
      return this.selected;
   }

   public void setSelected(boolean selected)
   {
      this.selected = selected;
   }

   public java.util.List<gov.dhs.fema.ndgrants_rules.model.FundingStream> getFundingStreams()
   {
      return this.fundingStreams;
   }

   public void setFundingStreams(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.FundingStream> fundingStreams)
   {
      this.fundingStreams = fundingStreams;
   }

   public java.lang.Long getOriginalCommitmentId()
   {
      return this.originalCommitmentId;
   }

   public void setOriginalCommitmentId(java.lang.Long originalCommitmentId)
   {
      this.originalCommitmentId = originalCommitmentId;
   }

   public java.util.List<gov.dhs.fema.ndgrants_rules.model.Document> getDocuments()
   {
      return this.documents;
   }

   public void setDocuments(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Document> documents)
   {
      this.documents = documents;
   }

   public java.lang.Long getFinancialSystemId()
   {
      return this.financialSystemId;
   }

   public void setFinancialSystemId(java.lang.Long financialSystemId)
   {
      this.financialSystemId = financialSystemId;
   }

   public java.lang.String getStrFinanceCommittedAmount()
   {
      return this.strFinanceCommittedAmount;
   }

   public void setStrFinanceCommittedAmount(
         java.lang.String strFinanceCommittedAmount)
   {
      this.strFinanceCommittedAmount = strFinanceCommittedAmount;
   }

   public gov.dhs.fema.ndgrants_rules.model.CommitmentDocumentClass getCommitmentDocumentClass()
   {
      return this.commitmentDocumentClass;
   }

   public void setCommitmentDocumentClass(
         gov.dhs.fema.ndgrants_rules.model.CommitmentDocumentClass commitmentDocumentClass)
   {
      this.commitmentDocumentClass = commitmentDocumentClass;
   }

   public gov.dhs.fema.ndgrants_rules.model.CommitmentDocumentType getCommitmentDocumentType()
   {
      return this.commitmentDocumentType;
   }

   public void setCommitmentDocumentType(
         gov.dhs.fema.ndgrants_rules.model.CommitmentDocumentType commitmentDocumentType)
   {
      this.commitmentDocumentType = commitmentDocumentType;
   }

   public Commitment(
         java.lang.Long commitmentId,
         java.lang.String commitmentNo,
         java.lang.String accsLineNr,
         boolean ifmisValidated,
         java.lang.Integer fiscalYear,
         java.lang.String fundCode,
         java.lang.String orgCode,
         java.lang.String objectClassCode,
         java.lang.String financeProgramCode,
         java.lang.String projectCode,
         java.util.Date budgetStartDate,
         java.util.Date budgetEndDate,
         java.math.BigDecimal programRemainingAmount,
         java.math.BigDecimal financeRemainingAmount,
         java.math.BigDecimal financeCommittedAmount,
         gov.dhs.fema.ndgrants_rules.model.AdminConfigStatus status,
         boolean selected,
         java.util.List<gov.dhs.fema.ndgrants_rules.model.FundingStream> fundingStreams,
         java.lang.Long originalCommitmentId,
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Document> documents,
         java.lang.Long financialSystemId,
         java.lang.String strFinanceCommittedAmount,
         gov.dhs.fema.ndgrants_rules.model.CommitmentDocumentClass commitmentDocumentClass,
         gov.dhs.fema.ndgrants_rules.model.CommitmentDocumentType commitmentDocumentType)
   {
      this.commitmentId = commitmentId;
      this.commitmentNo = commitmentNo;
      this.accsLineNr = accsLineNr;
      this.ifmisValidated = ifmisValidated;
      this.fiscalYear = fiscalYear;
      this.fundCode = fundCode;
      this.orgCode = orgCode;
      this.objectClassCode = objectClassCode;
      this.financeProgramCode = financeProgramCode;
      this.projectCode = projectCode;
      this.budgetStartDate = budgetStartDate;
      this.budgetEndDate = budgetEndDate;
      this.programRemainingAmount = programRemainingAmount;
      this.financeRemainingAmount = financeRemainingAmount;
      this.financeCommittedAmount = financeCommittedAmount;
      this.status = status;
      this.selected = selected;
      this.fundingStreams = fundingStreams;
      this.originalCommitmentId = originalCommitmentId;
      this.documents = documents;
      this.financialSystemId = financialSystemId;
      this.strFinanceCommittedAmount = strFinanceCommittedAmount;
      this.commitmentDocumentClass = commitmentDocumentClass;
      this.commitmentDocumentType = commitmentDocumentType;
   }

}