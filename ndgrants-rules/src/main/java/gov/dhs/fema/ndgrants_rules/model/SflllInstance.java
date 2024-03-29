package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SflllInstance implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long sflllInstanceId;
   private java.lang.Long applicationId;
   private java.lang.String reportingEntityName;
   private gov.dhs.fema.ndgrants_rules.model.Address reportingEntityAddress;
   private java.lang.String congressionalDistrict;
   private java.lang.String federalDepartment;
   private java.lang.String federalProgram;
   private java.lang.String cfdaNumber;
   private java.lang.String federalActionNumber;
   private java.math.BigDecimal awardAmount;
   private java.lang.String registrantPrefix;
   private java.lang.String registrantSuffix;
   private java.lang.String registrantFirstName;
   private java.lang.String registrantMiddleName;
   private java.lang.String registrantLastName;
   private gov.dhs.fema.ndgrants_rules.model.Address registrantAddress;
   private java.lang.String servicesPrefix;
   private java.lang.String servicesSuffix;
   private java.lang.String servicesFirstName;
   private java.lang.String servicesMiddleName;
   private java.lang.String servicesLastName;
   private gov.dhs.fema.ndgrants_rules.model.Address servicesAddress;
   private boolean sameAsRegistrant;

   public SflllInstance()
   {
   }

   public java.lang.Long getSflllInstanceId()
   {
      return this.sflllInstanceId;
   }

   public void setSflllInstanceId(java.lang.Long sflllInstanceId)
   {
      this.sflllInstanceId = sflllInstanceId;
   }

   public java.lang.Long getApplicationId()
   {
      return this.applicationId;
   }

   public void setApplicationId(java.lang.Long applicationId)
   {
      this.applicationId = applicationId;
   }

   public java.lang.String getReportingEntityName()
   {
      return this.reportingEntityName;
   }

   public void setReportingEntityName(java.lang.String reportingEntityName)
   {
      this.reportingEntityName = reportingEntityName;
   }

   public gov.dhs.fema.ndgrants_rules.model.Address getReportingEntityAddress()
   {
      return this.reportingEntityAddress;
   }

   public void setReportingEntityAddress(
         gov.dhs.fema.ndgrants_rules.model.Address reportingEntityAddress)
   {
      this.reportingEntityAddress = reportingEntityAddress;
   }

   public java.lang.String getCongressionalDistrict()
   {
      return this.congressionalDistrict;
   }

   public void setCongressionalDistrict(java.lang.String congressionalDistrict)
   {
      this.congressionalDistrict = congressionalDistrict;
   }

   public java.lang.String getFederalDepartment()
   {
      return this.federalDepartment;
   }

   public void setFederalDepartment(java.lang.String federalDepartment)
   {
      this.federalDepartment = federalDepartment;
   }

   public java.lang.String getFederalProgram()
   {
      return this.federalProgram;
   }

   public void setFederalProgram(java.lang.String federalProgram)
   {
      this.federalProgram = federalProgram;
   }

   public java.lang.String getCfdaNumber()
   {
      return this.cfdaNumber;
   }

   public void setCfdaNumber(java.lang.String cfdaNumber)
   {
      this.cfdaNumber = cfdaNumber;
   }

   public java.lang.String getFederalActionNumber()
   {
      return this.federalActionNumber;
   }

   public void setFederalActionNumber(java.lang.String federalActionNumber)
   {
      this.federalActionNumber = federalActionNumber;
   }

   public java.math.BigDecimal getAwardAmount()
   {
      return this.awardAmount;
   }

   public void setAwardAmount(java.math.BigDecimal awardAmount)
   {
      this.awardAmount = awardAmount;
   }

   public java.lang.String getRegistrantPrefix()
   {
      return this.registrantPrefix;
   }

   public void setRegistrantPrefix(java.lang.String registrantPrefix)
   {
      this.registrantPrefix = registrantPrefix;
   }

   public java.lang.String getRegistrantSuffix()
   {
      return this.registrantSuffix;
   }

   public void setRegistrantSuffix(java.lang.String registrantSuffix)
   {
      this.registrantSuffix = registrantSuffix;
   }

   public java.lang.String getRegistrantFirstName()
   {
      return this.registrantFirstName;
   }

   public void setRegistrantFirstName(java.lang.String registrantFirstName)
   {
      this.registrantFirstName = registrantFirstName;
   }

   public java.lang.String getRegistrantMiddleName()
   {
      return this.registrantMiddleName;
   }

   public void setRegistrantMiddleName(java.lang.String registrantMiddleName)
   {
      this.registrantMiddleName = registrantMiddleName;
   }

   public java.lang.String getRegistrantLastName()
   {
      return this.registrantLastName;
   }

   public void setRegistrantLastName(java.lang.String registrantLastName)
   {
      this.registrantLastName = registrantLastName;
   }

   public gov.dhs.fema.ndgrants_rules.model.Address getRegistrantAddress()
   {
      return this.registrantAddress;
   }

   public void setRegistrantAddress(
         gov.dhs.fema.ndgrants_rules.model.Address registrantAddress)
   {
      this.registrantAddress = registrantAddress;
   }

   public java.lang.String getServicesPrefix()
   {
      return this.servicesPrefix;
   }

   public void setServicesPrefix(java.lang.String servicesPrefix)
   {
      this.servicesPrefix = servicesPrefix;
   }

   public java.lang.String getServicesSuffix()
   {
      return this.servicesSuffix;
   }

   public void setServicesSuffix(java.lang.String servicesSuffix)
   {
      this.servicesSuffix = servicesSuffix;
   }

   public java.lang.String getServicesFirstName()
   {
      return this.servicesFirstName;
   }

   public void setServicesFirstName(java.lang.String servicesFirstName)
   {
      this.servicesFirstName = servicesFirstName;
   }

   public java.lang.String getServicesMiddleName()
   {
      return this.servicesMiddleName;
   }

   public void setServicesMiddleName(java.lang.String servicesMiddleName)
   {
      this.servicesMiddleName = servicesMiddleName;
   }

   public java.lang.String getServicesLastName()
   {
      return this.servicesLastName;
   }

   public void setServicesLastName(java.lang.String servicesLastName)
   {
      this.servicesLastName = servicesLastName;
   }

   public gov.dhs.fema.ndgrants_rules.model.Address getServicesAddress()
   {
      return this.servicesAddress;
   }

   public void setServicesAddress(
         gov.dhs.fema.ndgrants_rules.model.Address servicesAddress)
   {
      this.servicesAddress = servicesAddress;
   }

   public boolean isSameAsRegistrant()
   {
      return this.sameAsRegistrant;
   }

   public void setSameAsRegistrant(boolean sameAsRegistrant)
   {
      this.sameAsRegistrant = sameAsRegistrant;
   }

   public SflllInstance(java.lang.Long sflllInstanceId,
         java.lang.Long applicationId, java.lang.String reportingEntityName,
         gov.dhs.fema.ndgrants_rules.model.Address reportingEntityAddress,
         java.lang.String congressionalDistrict,
         java.lang.String federalDepartment,
         java.lang.String federalProgram, java.lang.String cfdaNumber,
         java.lang.String federalActionNumber,
         java.math.BigDecimal awardAmount,
         java.lang.String registrantPrefix,
         java.lang.String registrantSuffix,
         java.lang.String registrantFirstName,
         java.lang.String registrantMiddleName,
         java.lang.String registrantLastName,
         gov.dhs.fema.ndgrants_rules.model.Address registrantAddress,
         java.lang.String servicesPrefix, java.lang.String servicesSuffix,
         java.lang.String servicesFirstName,
         java.lang.String servicesMiddleName,
         java.lang.String servicesLastName,
         gov.dhs.fema.ndgrants_rules.model.Address servicesAddress,
         boolean sameAsRegistrant)
   {
      this.sflllInstanceId = sflllInstanceId;
      this.applicationId = applicationId;
      this.reportingEntityName = reportingEntityName;
      this.reportingEntityAddress = reportingEntityAddress;
      this.congressionalDistrict = congressionalDistrict;
      this.federalDepartment = federalDepartment;
      this.federalProgram = federalProgram;
      this.cfdaNumber = cfdaNumber;
      this.federalActionNumber = federalActionNumber;
      this.awardAmount = awardAmount;
      this.registrantPrefix = registrantPrefix;
      this.registrantSuffix = registrantSuffix;
      this.registrantFirstName = registrantFirstName;
      this.registrantMiddleName = registrantMiddleName;
      this.registrantLastName = registrantLastName;
      this.registrantAddress = registrantAddress;
      this.servicesPrefix = servicesPrefix;
      this.servicesSuffix = servicesSuffix;
      this.servicesFirstName = servicesFirstName;
      this.servicesMiddleName = servicesMiddleName;
      this.servicesLastName = servicesLastName;
      this.servicesAddress = servicesAddress;
      this.sameAsRegistrant = sameAsRegistrant;
   }

}