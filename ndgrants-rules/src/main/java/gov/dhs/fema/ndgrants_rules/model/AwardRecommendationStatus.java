package gov.dhs.fema.ndgrants_rules.model;

import gov.dhs.fema.ndgrants_rules.model.EGPTypeDef;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AwardRecommendationStatus extends EGPTypeDef implements java.io.Serializable
{

   static final long serialVersionUID = 1L;
   
   public static final AwardRecommendationStatus PENDING_SUBMISSION = new AwardRecommendationStatus(1);
   public static final AwardRecommendationStatus RECOMMENDED = new AwardRecommendationStatus(2);
   public static final AwardRecommendationStatus DECLINED = new AwardRecommendationStatus(3);
   public static final AwardRecommendationStatus PENDING_REVIEW = new AwardRecommendationStatus(4);
    
   public AwardRecommendationStatus()
   {
       super();
   }
   
   AwardRecommendationStatus(long id) 
   {
       super(id);
   }

}