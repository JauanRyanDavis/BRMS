package gov.dhs.fema.ndgrants_rules.model;

import gov.dhs.fema.ndgrants_rules.model.EGPTypeDef;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AppSubmissionType extends EGPTypeDef implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   public static final AppSubmissionType APPLICATION = new AppSubmissionType(1);
   public static final AppSubmissionType PREAPPLICATION = new AppSubmissionType(2);
   public static final AppSubmissionType CHANGED_CORRECTED_APPLICATION = new AppSubmissionType(3);
   public static final AppSubmissionType APPLICATION_CONSTRUCTION = new AppSubmissionType(4);
   public static final AppSubmissionType APPLICATION_NON_CONSTRUCTION = new AppSubmissionType(5);

   public AppSubmissionType()
   {
   }
   
   AppSubmissionType(long id){
       super(id);
   }

}