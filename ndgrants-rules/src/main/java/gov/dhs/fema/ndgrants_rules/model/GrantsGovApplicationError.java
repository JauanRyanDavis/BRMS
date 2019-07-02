package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class GrantsGovApplicationError implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long grantsGovApplicationId;
   private java.lang.String attributeAlias;
   private java.lang.String attributeValue;

   public GrantsGovApplicationError()
   {
   }

   public java.lang.Long getGrantsGovApplicationId()
   {
      return this.grantsGovApplicationId;
   }

   public void setGrantsGovApplicationId(java.lang.Long grantsGovApplicationId)
   {
      this.grantsGovApplicationId = grantsGovApplicationId;
   }

   public java.lang.String getAttributeAlias()
   {
      return this.attributeAlias;
   }

   public void setAttributeAlias(java.lang.String attributeAlias)
   {
      this.attributeAlias = attributeAlias;
   }

   public java.lang.String getAttributeValue()
   {
      return this.attributeValue;
   }

   public void setAttributeValue(java.lang.String attributeValue)
   {
      this.attributeValue = attributeValue;
   }

   public GrantsGovApplicationError(java.lang.Long grantsGovApplicationId,
         java.lang.String attributeAlias, java.lang.String attributeValue)
   {
      this.grantsGovApplicationId = grantsGovApplicationId;
      this.attributeAlias = attributeAlias;
      this.attributeValue = attributeValue;
   }

}