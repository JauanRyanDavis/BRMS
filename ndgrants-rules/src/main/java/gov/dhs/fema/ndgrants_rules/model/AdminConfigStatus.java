package gov.dhs.fema.ndgrants_rules.model;

import gov.dhs.fema.ndgrants_rules.model.EGPTypeDef;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AdminConfigStatus extends EGPTypeDef implements java.io.Serializable
{

   static final long serialVersionUID = 1L;
   
   public static final AdminConfigStatus PENDING_SUBMISSION = new AdminConfigStatus(1);
   public static final AdminConfigStatus PENDING_REVIEW = new AdminConfigStatus(2);
   public static final AdminConfigStatus APPROVED = new AdminConfigStatus(3);
   public static final AdminConfigStatus ARCHIVED = new AdminConfigStatus(4);
   public static final AdminConfigStatus MERGED = new AdminConfigStatus(5);

   public AdminConfigStatus()
   {
   }
   
   AdminConfigStatus(long id){
       super(id);
   }

}