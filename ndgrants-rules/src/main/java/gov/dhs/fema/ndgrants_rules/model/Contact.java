package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Contact implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long contactId;
   private java.lang.String firstName;
   private java.lang.String middleName;
   private java.lang.String lastName;
   private java.lang.String email;
   private java.lang.String title;
   private java.lang.String primaryPhoneNo;
   private java.lang.String secondaryPhoneNo;
   private java.lang.String contactPrefix;
   private java.lang.String contactSuffix;
   private java.lang.String loginName;
   private boolean active;

   public Contact()
   {
   }

   public java.lang.Long getContactId()
   {
      return this.contactId;
   }

   public void setContactId(java.lang.Long contactId)
   {
      this.contactId = contactId;
   }

   public java.lang.String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(java.lang.String firstName)
   {
      this.firstName = firstName;
   }

   public java.lang.String getMiddleName()
   {
      return this.middleName;
   }

   public void setMiddleName(java.lang.String middleName)
   {
      this.middleName = middleName;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public java.lang.String getTitle()
   {
      return this.title;
   }

   public void setTitle(java.lang.String title)
   {
      this.title = title;
   }

   public java.lang.String getPrimaryPhoneNo()
   {
      return this.primaryPhoneNo;
   }

   public void setPrimaryPhoneNo(java.lang.String primaryPhoneNo)
   {
      this.primaryPhoneNo = primaryPhoneNo;
   }

   public java.lang.String getSecondaryPhoneNo()
   {
      return this.secondaryPhoneNo;
   }

   public void setSecondaryPhoneNo(java.lang.String secondaryPhoneNo)
   {
      this.secondaryPhoneNo = secondaryPhoneNo;
   }

   public java.lang.String getContactPrefix()
   {
      return this.contactPrefix;
   }

   public void setContactPrefix(java.lang.String contactPrefix)
   {
      this.contactPrefix = contactPrefix;
   }

   public java.lang.String getContactSuffix()
   {
      return this.contactSuffix;
   }

   public void setContactSuffix(java.lang.String contactSuffix)
   {
      this.contactSuffix = contactSuffix;
   }

   public java.lang.String getLoginName()
   {
      return this.loginName;
   }

   public void setLoginName(java.lang.String loginName)
   {
      this.loginName = loginName;
   }

   public boolean isActive()
   {
      return this.active;
   }

   public void setActive(boolean active)
   {
      this.active = active;
   }

   public Contact(java.lang.Long contactId, java.lang.String firstName,
         java.lang.String middleName, java.lang.String lastName,
         java.lang.String email, java.lang.String title,
         java.lang.String primaryPhoneNo, java.lang.String secondaryPhoneNo,
         java.lang.String contactPrefix, java.lang.String contactSuffix,
         java.lang.String loginName, boolean active)
   {
      this.contactId = contactId;
      this.firstName = firstName;
      this.middleName = middleName;
      this.lastName = lastName;
      this.email = email;
      this.title = title;
      this.primaryPhoneNo = primaryPhoneNo;
      this.secondaryPhoneNo = secondaryPhoneNo;
      this.contactPrefix = contactPrefix;
      this.contactSuffix = contactSuffix;
      this.loginName = loginName;
      this.active = active;
   }

}