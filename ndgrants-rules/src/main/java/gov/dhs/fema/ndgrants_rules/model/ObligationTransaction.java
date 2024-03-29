package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ObligationTransaction implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long obligationTransactionId;
   private java.lang.Long obligationCommitmentId;
   private gov.dhs.fema.ndgrants_rules.model.FinancialTransactionType transactionType;
   private gov.dhs.fema.ndgrants_rules.model.FinancialTransactionStatus transactionStatus;
   private java.util.Date transactionDate;
   private java.lang.String financialSystemMessage;
   private java.lang.String financialSystemCode;
   private java.lang.Long financialSystemTransactionNo;
   private java.util.Date dateTimeLastUpdate;

   private gov.dhs.fema.ndgrants_rules.model.ObligationCommitment obligationCommitment;

   public ObligationTransaction()
   {
   }

   public java.lang.Long getObligationTransactionId()
   {
      return this.obligationTransactionId;
   }

   public void setObligationTransactionId(
         java.lang.Long obligationTransactionId)
   {
      this.obligationTransactionId = obligationTransactionId;
   }

   public java.lang.Long getObligationCommitmentId()
   {
      return this.obligationCommitmentId;
   }

   public void setObligationCommitmentId(java.lang.Long obligationCommitmentId)
   {
      this.obligationCommitmentId = obligationCommitmentId;
   }

   public gov.dhs.fema.ndgrants_rules.model.FinancialTransactionType getTransactionType()
   {
      return this.transactionType;
   }

   public void setTransactionType(
         gov.dhs.fema.ndgrants_rules.model.FinancialTransactionType transactionType)
   {
      this.transactionType = transactionType;
   }

   public gov.dhs.fema.ndgrants_rules.model.FinancialTransactionStatus getTransactionStatus()
   {
      return this.transactionStatus;
   }

   public void setTransactionStatus(
         gov.dhs.fema.ndgrants_rules.model.FinancialTransactionStatus transactionStatus)
   {
      this.transactionStatus = transactionStatus;
   }

   public java.util.Date getTransactionDate()
   {
      return this.transactionDate;
   }

   public void setTransactionDate(java.util.Date transactionDate)
   {
      this.transactionDate = transactionDate;
   }

   public java.lang.String getFinancialSystemMessage()
   {
      return this.financialSystemMessage;
   }

   public void setFinancialSystemMessage(
         java.lang.String financialSystemMessage)
   {
      this.financialSystemMessage = financialSystemMessage;
   }

   public java.lang.String getFinancialSystemCode()
   {
      return this.financialSystemCode;
   }

   public void setFinancialSystemCode(java.lang.String financialSystemCode)
   {
      this.financialSystemCode = financialSystemCode;
   }

   public java.lang.Long getFinancialSystemTransactionNo()
   {
      return this.financialSystemTransactionNo;
   }

   public void setFinancialSystemTransactionNo(
         java.lang.Long financialSystemTransactionNo)
   {
      this.financialSystemTransactionNo = financialSystemTransactionNo;
   }

   public java.util.Date getDateTimeLastUpdate()
   {
      return this.dateTimeLastUpdate;
   }

   public void setDateTimeLastUpdate(java.util.Date dateTimeLastUpdate)
   {
      this.dateTimeLastUpdate = dateTimeLastUpdate;
   }

   public gov.dhs.fema.ndgrants_rules.model.ObligationCommitment getObligationCommitment()
   {
      return this.obligationCommitment;
   }

   public void setObligationCommitment(
         gov.dhs.fema.ndgrants_rules.model.ObligationCommitment obligationCommitment)
   {
      this.obligationCommitment = obligationCommitment;
   }

   public ObligationTransaction(
         java.lang.Long obligationTransactionId,
         java.lang.Long obligationCommitmentId,
         gov.dhs.fema.ndgrants_rules.model.FinancialTransactionType transactionType,
         gov.dhs.fema.ndgrants_rules.model.FinancialTransactionStatus transactionStatus,
         java.util.Date transactionDate,
         java.lang.String financialSystemMessage,
         java.lang.String financialSystemCode,
         java.lang.Long financialSystemTransactionNo,
         java.util.Date dateTimeLastUpdate,
         gov.dhs.fema.ndgrants_rules.model.ObligationCommitment obligationCommitment)
   {
      this.obligationTransactionId = obligationTransactionId;
      this.obligationCommitmentId = obligationCommitmentId;
      this.transactionType = transactionType;
      this.transactionStatus = transactionStatus;
      this.transactionDate = transactionDate;
      this.financialSystemMessage = financialSystemMessage;
      this.financialSystemCode = financialSystemCode;
      this.financialSystemTransactionNo = financialSystemTransactionNo;
      this.dateTimeLastUpdate = dateTimeLastUpdate;
      this.obligationCommitment = obligationCommitment;
   }

}