package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ConsortiumType implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long consortiumTypeId;
   private java.lang.String name;
   private java.lang.Integer inUseNum;

   public ConsortiumType()
   {
   }

   public java.lang.Long getConsortiumTypeId()
   {
      return this.consortiumTypeId;
   }

   public void setConsortiumTypeId(java.lang.Long consortiumTypeId)
   {
      this.consortiumTypeId = consortiumTypeId;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.Integer getInUseNum()
   {
      return this.inUseNum;
   }

   public void setInUseNum(java.lang.Integer inUseNum)
   {
      this.inUseNum = inUseNum;
   }

   public ConsortiumType(java.lang.Long consortiumTypeId,
         java.lang.String name, java.lang.Integer inUseNum)
   {
      this.consortiumTypeId = consortiumTypeId;
      this.name = name;
      this.inUseNum = inUseNum;
   }

}