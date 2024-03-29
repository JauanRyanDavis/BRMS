package gov.dhs.fema.ndgrants_rules.model;

import gov.dhs.fema.ndgrants_rules.model.EGPTypeDef;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AmendmentStatus extends EGPTypeDef implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   public static final AmendmentStatus PENDING_SUBMISSION = new AmendmentStatus(1);
   public static final AmendmentStatus PENDING_REVIEW = new AmendmentStatus(2);
   public static final AmendmentStatus DECLINED = new AmendmentStatus(3);
   public static final AmendmentStatus APPROVED = new AmendmentStatus(4);
   public static final AmendmentStatus ACCEPTED = new AmendmentStatus(5);
   public static final AmendmentStatus WITHDRAWN = new AmendmentStatus(6);

   public AmendmentStatus()
   {
      super();
   }

   AmendmentStatus(long id)
   {
      super(id);
   }

}