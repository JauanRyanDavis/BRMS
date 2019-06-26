package gov.dhs.fema.ndgrants_rules.model;

import gov.dhs.fema.ndgrants_rules.model.EGPTypeDef;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProjectType extends EGPTypeDef implements java.io.Serializable
{

   static final long serialVersionUID = 1L;
   
   public static final ProjectType CONSTRUCTION = new ProjectType(1);
   public static final ProjectType NONCONSTRUCTION = new ProjectType(2);
   public static final ProjectType BOTH = new ProjectType(3);

   public ProjectType()
   {
   }
   
   ProjectType(long id){
       super(id);
   }

}