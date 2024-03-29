package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FPTFormElement implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long fptFormElementId;
   private java.lang.Long fptElementId;
   private java.lang.Long formId;
   private int sortOrder;
   private java.util.List<gov.dhs.fema.ndgrants_rules.model.FPTFormElementOption> formElementOptions;
   private gov.dhs.fema.ndgrants_rules.model.Form form;

   public FPTFormElement()
   {
   }

   public java.lang.Long getFptFormElementId()
   {
      return this.fptFormElementId;
   }

   public void setFptFormElementId(java.lang.Long fptFormElementId)
   {
      this.fptFormElementId = fptFormElementId;
   }

   public java.lang.Long getFptElementId()
   {
      return this.fptElementId;
   }

   public void setFptElementId(java.lang.Long fptElementId)
   {
      this.fptElementId = fptElementId;
   }

   public java.lang.Long getFormId()
   {
      return this.formId;
   }

   public void setFormId(java.lang.Long formId)
   {
      this.formId = formId;
   }

   public int getSortOrder()
   {
      return this.sortOrder;
   }

   public void setSortOrder(int sortOrder)
   {
      this.sortOrder = sortOrder;
   }

   public java.util.List<gov.dhs.fema.ndgrants_rules.model.FPTFormElementOption> getFormElementOptions()
   {
      return this.formElementOptions;
   }

   public void setFormElementOptions(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.FPTFormElementOption> formElementOptions)
   {
      this.formElementOptions = formElementOptions;
   }

   public gov.dhs.fema.ndgrants_rules.model.Form getForm()
   {
      return this.form;
   }

   public void setForm(gov.dhs.fema.ndgrants_rules.model.Form form)
   {
      this.form = form;
   }

   public FPTFormElement(
         java.lang.Long fptFormElementId,
         java.lang.Long fptElementId,
         java.lang.Long formId,
         int sortOrder,
         java.util.List<gov.dhs.fema.ndgrants_rules.model.FPTFormElementOption> formElementOptions,
         gov.dhs.fema.ndgrants_rules.model.Form form)
   {
      this.fptFormElementId = fptFormElementId;
      this.fptElementId = fptElementId;
      this.formId = formId;
      this.sortOrder = sortOrder;
      this.formElementOptions = formElementOptions;
      this.form = form;
   }

}