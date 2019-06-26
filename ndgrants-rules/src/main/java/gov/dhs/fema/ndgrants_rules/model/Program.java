package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Program implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long programId;
   private gov.dhs.fema.ndgrants_rules.model.GrantorOrganization grantorOrganization;
   private java.lang.String name;
   private java.lang.String financialAbbreviationCode;
   private java.util.Date endDate;
   private java.lang.String divDeptAcronym;
   private java.lang.String cfdaNo;
   private gov.dhs.fema.ndgrants_rules.model.AdminConfigStatus status;
   private java.util.List<gov.dhs.fema.ndgrants_rules.model.InternalAdminContact> programContacts;
   private java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> terms;
   private java.util.List<gov.dhs.fema.ndgrants_rules.model.Template> programTemplates;
   private java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> inheritedTerms;
   private gov.dhs.fema.ndgrants_rules.model.Template inheritedTemplates;
   private gov.dhs.fema.ndgrants_rules.model.StatutoryAuthority statutoryAuthorities;
   private java.util.List<gov.dhs.fema.ndgrants_rules.model.FundingStream> fundingStreams;
   private java.lang.Long originalProgramId;
   private java.util.List<gov.dhs.fema.ndgrants_rules.model.Commitment> commitments;
   private java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> availableTerms;

   public Program()
   {
   }

   public java.lang.Long getProgramId()
   {
      return this.programId;
   }

   public void setProgramId(java.lang.Long programId)
   {
      this.programId = programId;
   }

   public gov.dhs.fema.ndgrants_rules.model.GrantorOrganization getGrantorOrganization()
   {
      return this.grantorOrganization;
   }

   public void setGrantorOrganization(
         gov.dhs.fema.ndgrants_rules.model.GrantorOrganization grantorOrganization)
   {
      this.grantorOrganization = grantorOrganization;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getFinancialAbbreviationCode()
   {
      return this.financialAbbreviationCode;
   }

   public void setFinancialAbbreviationCode(
         java.lang.String financialAbbreviationCode)
   {
      this.financialAbbreviationCode = financialAbbreviationCode;
   }

   public java.util.Date getEndDate()
   {
      return this.endDate;
   }

   public void setEndDate(java.util.Date endDate)
   {
      this.endDate = endDate;
   }

   public java.lang.String getDivDeptAcronym()
   {
      return this.divDeptAcronym;
   }

   public void setDivDeptAcronym(java.lang.String divDeptAcronym)
   {
      this.divDeptAcronym = divDeptAcronym;
   }

   public java.lang.String getCfdaNo()
   {
      return this.cfdaNo;
   }

   public void setCfdaNo(java.lang.String cfdaNo)
   {
      this.cfdaNo = cfdaNo;
   }

   public gov.dhs.fema.ndgrants_rules.model.AdminConfigStatus getStatus()
   {
      return this.status;
   }

   public void setStatus(
         gov.dhs.fema.ndgrants_rules.model.AdminConfigStatus status)
   {
      this.status = status;
   }

   public java.util.List<gov.dhs.fema.ndgrants_rules.model.InternalAdminContact> getProgramContacts()
   {
      return this.programContacts;
   }

   public void setProgramContacts(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.InternalAdminContact> programContacts)
   {
      this.programContacts = programContacts;
   }

   public java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> getTerms()
   {
      return this.terms;
   }

   public void setTerms(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> terms)
   {
      this.terms = terms;
   }

   public java.util.List<gov.dhs.fema.ndgrants_rules.model.Template> getProgramTemplates()
   {
      return this.programTemplates;
   }

   public void setProgramTemplates(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Template> programTemplates)
   {
      this.programTemplates = programTemplates;
   }

   public java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> getInheritedTerms()
   {
      return this.inheritedTerms;
   }

   public void setInheritedTerms(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> inheritedTerms)
   {
      this.inheritedTerms = inheritedTerms;
   }

   public gov.dhs.fema.ndgrants_rules.model.Template getInheritedTemplates()
   {
      return this.inheritedTemplates;
   }

   public void setInheritedTemplates(
         gov.dhs.fema.ndgrants_rules.model.Template inheritedTemplates)
   {
      this.inheritedTemplates = inheritedTemplates;
   }

   public gov.dhs.fema.ndgrants_rules.model.StatutoryAuthority getStatutoryAuthorities()
   {
      return this.statutoryAuthorities;
   }

   public void setStatutoryAuthorities(
         gov.dhs.fema.ndgrants_rules.model.StatutoryAuthority statutoryAuthorities)
   {
      this.statutoryAuthorities = statutoryAuthorities;
   }

   public java.util.List<gov.dhs.fema.ndgrants_rules.model.FundingStream> getFundingStreams()
   {
      return this.fundingStreams;
   }

   public void setFundingStreams(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.FundingStream> fundingStreams)
   {
      this.fundingStreams = fundingStreams;
   }

   public java.lang.Long getOriginalProgramId()
   {
      return this.originalProgramId;
   }

   public void setOriginalProgramId(java.lang.Long originalProgramId)
   {
      this.originalProgramId = originalProgramId;
   }

   public java.util.List<gov.dhs.fema.ndgrants_rules.model.Commitment> getCommitments()
   {
      return this.commitments;
   }

   public void setCommitments(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Commitment> commitments)
   {
      this.commitments = commitments;
   }

   public java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> getAvailableTerms()
   {
      return this.availableTerms;
   }

   public void setAvailableTerms(
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> availableTerms)
   {
      this.availableTerms = availableTerms;
   }

   public Program(
         java.lang.Long programId,
         gov.dhs.fema.ndgrants_rules.model.GrantorOrganization grantorOrganization,
         java.lang.String name,
         java.lang.String financialAbbreviationCode,
         java.util.Date endDate,
         java.lang.String divDeptAcronym,
         java.lang.String cfdaNo,
         gov.dhs.fema.ndgrants_rules.model.AdminConfigStatus status,
         java.util.List<gov.dhs.fema.ndgrants_rules.model.InternalAdminContact> programContacts,
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> terms,
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Template> programTemplates,
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> inheritedTerms,
         gov.dhs.fema.ndgrants_rules.model.Template inheritedTemplates,
         gov.dhs.fema.ndgrants_rules.model.StatutoryAuthority statutoryAuthorities,
         java.util.List<gov.dhs.fema.ndgrants_rules.model.FundingStream> fundingStreams,
         java.lang.Long originalProgramId,
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Commitment> commitments,
         java.util.List<gov.dhs.fema.ndgrants_rules.model.Term> availableTerms)
   {
      this.programId = programId;
      this.grantorOrganization = grantorOrganization;
      this.name = name;
      this.financialAbbreviationCode = financialAbbreviationCode;
      this.endDate = endDate;
      this.divDeptAcronym = divDeptAcronym;
      this.cfdaNo = cfdaNo;
      this.status = status;
      this.programContacts = programContacts;
      this.terms = terms;
      this.programTemplates = programTemplates;
      this.inheritedTerms = inheritedTerms;
      this.inheritedTemplates = inheritedTemplates;
      this.statutoryAuthorities = statutoryAuthorities;
      this.fundingStreams = fundingStreams;
      this.originalProgramId = originalProgramId;
      this.commitments = commitments;
      this.availableTerms = availableTerms;
   }

}