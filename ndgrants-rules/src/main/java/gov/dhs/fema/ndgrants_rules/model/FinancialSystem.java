package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FinancialSystem implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long financialSystemId;
   private java.lang.String name;
   private boolean enabled;
   private gov.dhs.fema.ndgrants_rules.model.User statusChangedByUser;
   private java.lang.String comments;

   public FinancialSystem()
   {
   }

   public java.lang.Long getFinancialSystemId()
   {
      return this.financialSystemId;
   }

   public void setFinancialSystemId(java.lang.Long financialSystemId)
   {
      this.financialSystemId = financialSystemId;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public boolean isEnabled()
   {
      return this.enabled;
   }

   public void setEnabled(boolean enabled)
   {
      this.enabled = enabled;
   }

   public gov.dhs.fema.ndgrants_rules.model.User getStatusChangedByUser()
   {
      return this.statusChangedByUser;
   }

   public void setStatusChangedByUser(
         gov.dhs.fema.ndgrants_rules.model.User statusChangedByUser)
   {
      this.statusChangedByUser = statusChangedByUser;
   }

   public java.lang.String getComments()
   {
      return this.comments;
   }

   public void setComments(java.lang.String comments)
   {
      this.comments = comments;
   }

   public FinancialSystem(java.lang.Long financialSystemId,
         java.lang.String name, boolean enabled,
         gov.dhs.fema.ndgrants_rules.model.User statusChangedByUser,
         java.lang.String comments)
   {
      this.financialSystemId = financialSystemId;
      this.name = name;
      this.enabled = enabled;
      this.statusChangedByUser = statusChangedByUser;
      this.comments = comments;
   }

}