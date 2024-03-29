package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FundingOpportunityAlternateOperation implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long fundingOpportunityId;
   private gov.dhs.fema.ndgrants_rules.model.Operation operation;
   private gov.dhs.fema.ndgrants_rules.model.Operation alternateOperation;

   public FundingOpportunityAlternateOperation()
   {
   }

   public java.lang.Long getFundingOpportunityId()
   {
      return this.fundingOpportunityId;
   }

   public void setFundingOpportunityId(java.lang.Long fundingOpportunityId)
   {
      this.fundingOpportunityId = fundingOpportunityId;
   }

   public gov.dhs.fema.ndgrants_rules.model.Operation getOperation()
   {
      return this.operation;
   }

   public void setOperation(
         gov.dhs.fema.ndgrants_rules.model.Operation operation)
   {
      this.operation = operation;
   }

   public gov.dhs.fema.ndgrants_rules.model.Operation getAlternateOperation()
   {
      return this.alternateOperation;
   }

   public void setAlternateOperation(
         gov.dhs.fema.ndgrants_rules.model.Operation alternateOperation)
   {
      this.alternateOperation = alternateOperation;
   }

   public FundingOpportunityAlternateOperation(
         java.lang.Long fundingOpportunityId,
         gov.dhs.fema.ndgrants_rules.model.Operation operation,
         gov.dhs.fema.ndgrants_rules.model.Operation alternateOperation)
   {
      this.fundingOpportunityId = fundingOpportunityId;
      this.operation = operation;
      this.alternateOperation = alternateOperation;
   }

}