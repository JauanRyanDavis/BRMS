package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ModuleRuleSet implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private gov.dhs.fema.ndgrants_rules.model.Module module;
   private java.lang.String validateRulesetPath;
   private java.lang.String initialRulesetPath;

   public ModuleRuleSet()
   {
   }

   public gov.dhs.fema.ndgrants_rules.model.Module getModule()
   {
      return this.module;
   }

   public void setModule(gov.dhs.fema.ndgrants_rules.model.Module module)
   {
      this.module = module;
   }

   public java.lang.String getValidateRulesetPath()
   {
      return this.validateRulesetPath;
   }

   public void setValidateRulesetPath(java.lang.String validateRulesetPath)
   {
      this.validateRulesetPath = validateRulesetPath;
   }

   public java.lang.String getInitialRulesetPath()
   {
      return this.initialRulesetPath;
   }

   public void setInitialRulesetPath(java.lang.String initialRulesetPath)
   {
      this.initialRulesetPath = initialRulesetPath;
   }

   public ModuleRuleSet(gov.dhs.fema.ndgrants_rules.model.Module module,
         java.lang.String validateRulesetPath,
         java.lang.String initialRulesetPath)
   {
      this.module = module;
      this.validateRulesetPath = validateRulesetPath;
      this.initialRulesetPath = initialRulesetPath;
   }

}