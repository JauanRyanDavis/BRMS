package gov.dhs.fema.ndgrants_rules.model;

import gov.dhs.fema.ndgrants_rules.model.Contact;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InternalAdminContact extends Contact implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.util.List<gov.dhs.fema.ndgrants_rules.model.InternalContactType> contactTypes;

   public InternalAdminContact()
   {
   }

   public java.util.List<gov.dhs.fema.ndgrants_rules.model.InternalContactType> getContactTypes()
   {
      return this.contactTypes;
   }

   public void setContactTypes(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.InternalContactType> contactTypes)
   {
      this.contactTypes = contactTypes;
   }

   public InternalAdminContact(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.InternalContactType> contactTypes)
   {
      this.contactTypes = contactTypes;
   }

}