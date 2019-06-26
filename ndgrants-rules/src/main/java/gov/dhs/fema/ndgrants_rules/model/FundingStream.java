package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FundingStream implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long fundingStreamId;
   private java.lang.String name;
   private java.lang.Long originalFundingStreamId;
   private boolean inUseByFundingOpportunities;
   private java.lang.Long cntFundingOpportunitiesUsed;
   private java.lang.String csvListOfFundingOpportunityIdsUsed;

   public FundingStream()
   {
   }

   public java.lang.Long getFundingStreamId()
   {
      return this.fundingStreamId;
   }

   public void setFundingStreamId(java.lang.Long fundingStreamId)
   {
      this.fundingStreamId = fundingStreamId;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.Long getOriginalFundingStreamId()
   {
      return this.originalFundingStreamId;
   }

   public void setOriginalFundingStreamId(
         java.lang.Long originalFundingStreamId)
   {
      this.originalFundingStreamId = originalFundingStreamId;
   }

   public boolean isInUseByFundingOpportunities()
   {
      return this.inUseByFundingOpportunities;
   }

   public void setInUseByFundingOpportunities(
         boolean inUseByFundingOpportunities)
   {
      this.inUseByFundingOpportunities = inUseByFundingOpportunities;
   }

   public java.lang.Long getCntFundingOpportunitiesUsed()
   {
      return this.cntFundingOpportunitiesUsed;
   }

   public void setCntFundingOpportunitiesUsed(
         java.lang.Long cntFundingOpportunitiesUsed)
   {
      this.cntFundingOpportunitiesUsed = cntFundingOpportunitiesUsed;
   }

   public java.lang.String getCsvListOfFundingOpportunityIdsUsed()
   {
      return this.csvListOfFundingOpportunityIdsUsed;
   }

   public void setCsvListOfFundingOpportunityIdsUsed(
         java.lang.String csvListOfFundingOpportunityIdsUsed)
   {
      this.csvListOfFundingOpportunityIdsUsed = csvListOfFundingOpportunityIdsUsed;
   }

   public FundingStream(java.lang.Long fundingStreamId, java.lang.String name,
         java.lang.Long originalFundingStreamId,
         boolean inUseByFundingOpportunities,
         java.lang.Long cntFundingOpportunitiesUsed,
         java.lang.String csvListOfFundingOpportunityIdsUsed)
   {
      this.fundingStreamId = fundingStreamId;
      this.name = name;
      this.originalFundingStreamId = originalFundingStreamId;
      this.inUseByFundingOpportunities = inUseByFundingOpportunities;
      this.cntFundingOpportunitiesUsed = cntFundingOpportunitiesUsed;
      this.csvListOfFundingOpportunityIdsUsed = csvListOfFundingOpportunityIdsUsed;
   }

}