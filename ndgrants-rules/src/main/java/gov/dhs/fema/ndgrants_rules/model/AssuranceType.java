package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AssuranceType implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long assuranceTypeId;
   private java.lang.String label;
   private java.lang.String title;
   private java.lang.String content;
   private java.lang.String burdenStatement;
   private java.util.Date expirationDate;
   private java.lang.String ombControlNumber;

   public AssuranceType()
   {
   }

   public java.lang.Long getAssuranceTypeId()
   {
      return this.assuranceTypeId;
   }

   public void setAssuranceTypeId(java.lang.Long assuranceTypeId)
   {
      this.assuranceTypeId = assuranceTypeId;
   }

   public java.lang.String getLabel()
   {
      return this.label;
   }

   public void setLabel(java.lang.String label)
   {
      this.label = label;
   }

   public java.lang.String getTitle()
   {
      return this.title;
   }

   public void setTitle(java.lang.String title)
   {
      this.title = title;
   }

   public java.lang.String getContent()
   {
      return this.content;
   }

   public void setContent(java.lang.String content)
   {
      this.content = content;
   }

   public java.lang.String getBurdenStatement()
   {
      return this.burdenStatement;
   }

   public void setBurdenStatement(java.lang.String burdenStatement)
   {
      this.burdenStatement = burdenStatement;
   }

   public java.util.Date getExpirationDate()
   {
      return this.expirationDate;
   }

   public void setExpirationDate(java.util.Date expirationDate)
   {
      this.expirationDate = expirationDate;
   }

   public java.lang.String getOmbControlNumber()
   {
      return this.ombControlNumber;
   }

   public void setOmbControlNumber(java.lang.String ombControlNumber)
   {
      this.ombControlNumber = ombControlNumber;
   }

   public AssuranceType(java.lang.Long assuranceTypeId,
         java.lang.String label, java.lang.String title,
         java.lang.String content, java.lang.String burdenStatement,
         java.util.Date expirationDate, java.lang.String ombControlNumber)
   {
      this.assuranceTypeId = assuranceTypeId;
      this.label = label;
      this.title = title;
      this.content = content;
      this.burdenStatement = burdenStatement;
      this.expirationDate = expirationDate;
      this.ombControlNumber = ombControlNumber;
   }

}