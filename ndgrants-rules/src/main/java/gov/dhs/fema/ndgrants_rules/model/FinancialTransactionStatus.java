package gov.dhs.fema.ndgrants_rules.model;

import gov.dhs.fema.ndgrants_rules.model.EGPTypeDef;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FinancialTransactionStatus extends EGPTypeDef implements java.io.Serializable
{

   static final long serialVersionUID = 1L;
   
   public static final FinancialTransactionStatus PENDING = new FinancialTransactionStatus(1);
   public static final FinancialTransactionStatus APPROVED = new FinancialTransactionStatus(2);
   public static final FinancialTransactionStatus DENIED = new FinancialTransactionStatus(3);
   public static final FinancialTransactionStatus GFS_DENIED = new FinancialTransactionStatus(4);
   public static final FinancialTransactionStatus CANCELED = new FinancialTransactionStatus(5);

   public FinancialTransactionStatus()
   {
       super();
   }
   
   FinancialTransactionStatus(long id)
   {
       super(id);
   }
   

}