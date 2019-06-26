package gov.dhs.fema.ndgrants_rules.model;

import gov.dhs.fema.ndgrants_rules.model.EGPTypeDef;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InternalContactType extends EGPTypeDef implements java.io.Serializable
{

   static final long serialVersionUID = 1L;
   
   public static final InternalContactType FINANCE_OBLIGATION = new InternalContactType(2);
   public static final InternalContactType FINANCE_VENDOR = new InternalContactType(3);
   public static final InternalContactType SIGNING_AUTHORITY = new InternalContactType(5);
   public static final InternalContactType ALTERNATE_SIGNING_AUTHORITY = new InternalContactType(1);
   public static final InternalContactType GRANTEE_NOTIFICATION = new InternalContactType(4);
   public static final InternalContactType SYSTEM_BRANCH = new InternalContactType(6);
   public static final InternalContactType GRANTS_GOV_AGENCY_CONTACT = new InternalContactType(7);
   public static final InternalContactType OTHER = new InternalContactType(8);
   public static final InternalContactType GRANTS_MANAGEMENT_BRANCH = new InternalContactType(9);
   public static final InternalContactType GRANTS_COUNSEL = new InternalContactType(10);


   public InternalContactType()
   {
   }
   
   InternalContactType(long id){
       super(id);
   }

}