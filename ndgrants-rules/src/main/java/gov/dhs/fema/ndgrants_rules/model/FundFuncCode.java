package gov.dhs.fema.ndgrants_rules.model;

import gov.dhs.fema.ndgrants_rules.model.EGPTypeDef;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FundFuncCode extends EGPTypeDef implements java.io.Serializable
{

   static final long serialVersionUID = 1L;
   
   public static final FundFuncCode D = new FundFuncCode(1);
   public static final FundFuncCode R = new FundFuncCode(2);

   public FundFuncCode()
   {
   }
   
   FundFuncCode(long id){
       super(id);
   }

}