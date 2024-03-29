package gov.dhs.fema.ndgrants_rules.model;

import gov.dhs.fema.ndgrants_rules.model.EGPTypeDef;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TemplateType extends EGPTypeDef implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

public static final TemplateType AWARD_NOTIFICATION_EMAIL = new TemplateType(1, "EM");
    
   public static final TemplateType APPLICATION_RECEIVED_NOTIFICATION_EMAIL = new TemplateType(4, "EM");
   public static final TemplateType AWARD_LETTER = new TemplateType(5);
   public static final TemplateType AWARD_CA_NOTIFICATION_FACTSHEET = new TemplateType(6);
   public static final TemplateType AWARD_CA_NOTIFICATION_PRESS_RELEASE = new TemplateType(7);
    
   public static final TemplateType OBLIGATING_DOCUMENT = new TemplateType(9);
    
   public static final TemplateType INELIGIBILTIY_NOTIFICATION_EMAIL = new TemplateType(13, "EM");
   public static final TemplateType AGREEMENT_ARTICLES = new TemplateType(14);
   public static final TemplateType GRANTEE_ORGANIZATION_CREATED_NOTIFICATION_EMAIL = new TemplateType(15, "EM");
   public static final TemplateType CREATE_ORGANIZATION_NOTIFICATION_EMAIL = new TemplateType(16, "EM");
   public static final TemplateType APPLICATION_RELEASED_NOTIFICATION_EMAIL = new TemplateType(17, "EM");
    
   public static final TemplateType TASK_ASSIGNMENT_NOTIFICATION_EMAIL = new TemplateType(21, "EM",true);
    
   public static final TemplateType MY_TASK_REASSIGNMENT_NOTIFICATION_EMAIL = new TemplateType(23, "EM");
    
   public static final TemplateType DEOBLIGATION_LETTER = new TemplateType(26);
   public static final TemplateType DEOBLIGATION_INITIATION_EMAIL = new TemplateType(27, "EM");
   public static final TemplateType DEOBLIGATION_APPROVED_EMAIL = new TemplateType(28, "EM");
   public static final TemplateType DEOBLIGATION_CANCELLED_EMAIL = new TemplateType(29, "EM");
   public static final TemplateType DEOBLIGATION_APPROVED_PO_EMAIL = new TemplateType(30, "EM");
   public static final TemplateType OCFO_DEOBLIGATION_EMAIL = new TemplateType(31, "EM");
    
   public static final TemplateType AMENDMENT_NOTICE_DOCUMENT = new TemplateType(33);
   public static final TemplateType AMENDMENT_APPROVED_GRANTEE_EMAIL = new TemplateType(34, "EM");
   public static final TemplateType AMENDMENT_REQUEST_APPROVED_NOTIFICATION_EMAIL = new TemplateType(35, "EM");
   public static final TemplateType AMENDMENT_OCFO_EMAIL = new TemplateType(36, "EM");
    
   public static final TemplateType AMENDMENT_RELEASED_GRANTEE_EMAIL = new TemplateType(39, "EM");
    
   public static final TemplateType PERFORMANCE_REPORT_APPROVED_EMAIL = new TemplateType(41, "EM");
   public static final TemplateType APPLICATION_EXPORT_TEMPLATE = new TemplateType(42);
   public static final TemplateType PERFORMANCE_REPORT_RELEASED_EMAIL = new TemplateType(43, "EM");
    
   public static final TemplateType INTERNAL_AMENDMENT_NOTICE_DOCUMENT = new TemplateType(45);
    
   public static final TemplateType GRANTEE_ORG_ADMINACCESS_REQUEST_DENIED_EMAIL = new TemplateType(49, "EM");
   public static final TemplateType APPLICATION_DENIED_EMAIL = new TemplateType(50, "EM");
   public static final TemplateType AMENDMENT_REQUEST_DENIED_EMAIL = new TemplateType(52, "EM");
    
   public static final TemplateType AMENDMENT_AGREEMENT_ARTICLES = new TemplateType(54);
   public static final TemplateType AMENDMENT_OBLIGATING_DOCUMENT = new TemplateType(55);
   public static final TemplateType DEOBLIGATION_DOCUMENT = new TemplateType(56);
   public static final TemplateType CONFIRM_DECLINE_EMAIL = new TemplateType(57, "EM");
   public static final TemplateType FORM_ERROR_EMAIL = new TemplateType(58, "EM", true);
    
   public static final TemplateType TASK_ASSIGNMENT_FAILURE_NOTIFICATION= new TemplateType(60, "EM",true);
   public static final TemplateType GRANTEE_ORGANIZATION_ACCESS_REQUEST_APPROVED = new TemplateType(61, "EM",true);
   public static final TemplateType GRANTEE_ORGANIZATION_ACCESS_REQUEST_DENIED = new TemplateType(62, "EM",true);
   public static final TemplateType AWARD_DECLINED_NOTIFICATION_EMAIL = new TemplateType(63, "EM");
    
   public static final TemplateType DEOBLIGATION_OBLIGATING_DOCUMENT = new TemplateType(67);
   public static final TemplateType OCFO_DEOBLIGATION_NOTIFICATION_EMAIL = new TemplateType(68, "EM");
    
   public static final TemplateType RESEND_TO_GRANTEE = new TemplateType(73);
    
   public static final TemplateType OBLIGATION_REQUEST_NOTIFICATION_EMAIL = new TemplateType(74, "EM");

   public static final TemplateType AUTHORIZED_OFFICIAL_CHANGE_APPROVED_NOTIFICATION_EMAIL = new TemplateType(75, "EM");
   public static final TemplateType AUTHORIZED_OFFICIAL_CHANGE_DENIED_NOTIFICATION_EMAIL = new TemplateType(76, "EM");

   public static final TemplateType COMMIT_SYNCH_FAILURE_NOTIFICATION = new TemplateType(77, "EM", true);
    
   private java.lang.String code;
   private boolean systemWide;

   public TemplateType()
   {
   }
   
   public TemplateType(long id, java.lang.String code, boolean systemWide){
       this.id=id;
       this.code=code;
       this.systemWide=systemWide;
   }
   
   public TemplateType(long id, java.lang.String code){
       this.id=id;
       this.code=code;
       this.systemWide=false;
   }
   
   public TemplateType(long id){
       this.id=id;
       this.systemWide=false;
   }

   public java.lang.String getCode()
   {
      return this.code;
   }

   public void setCode(java.lang.String code)
   {
      this.code = code;
   }

   public boolean isSystemWide()
   {
      return this.systemWide;
   }

   public void setSystemWide(boolean systemWide)
   {
      this.systemWide = systemWide;
   }

   public TemplateType(java.lang.String code, boolean systemWide)
   {
      this.code = code;
      this.systemWide = systemWide;
   }

}