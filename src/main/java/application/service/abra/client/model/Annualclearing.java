/**
 * ABRA Gen Web API (spojení testapi)
 * Webové API systému 17.03.03
 *
 * OpenAPI spec version: 17.03.03
 * Contact: abragen@abra.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package application.service.abra.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Annualclearing
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Annualclearing   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Annualclearingrow> rows = new ArrayList<Annualclearingrow>();

  @SerializedName("DocQueue_ID")
  private String docQueueID = null;

  @SerializedName("Period_ID")
  private String periodID = null;

  @SerializedName("OrdNumber")
  private Integer ordNumber = null;

  @SerializedName("DocDate$DATE")
  private DateTime docDateDATE = null;

  @SerializedName("CreatedBy_ID")
  private String createdByID = null;

  @SerializedName("CorrectedBy_ID")
  private String correctedByID = null;

  @SerializedName("NewRelatedType")
  private Integer newRelatedType = null;

  @SerializedName("NewRelatedDocument_ID")
  private String newRelatedDocumentID = null;

  @SerializedName("Employee_ID")
  private String employeeID = null;

  @SerializedName("YearOfClearing")
  private Integer yearOfClearing = null;

  @SerializedName("TotalCountOffs")
  private Double totalCountOffs = null;

  @SerializedName("TotalBases")
  private Double totalBases = null;

  @SerializedName("CalculatedTax")
  private Double calculatedTax = null;

  @SerializedName("PaidTax")
  private Double paidTax = null;

  @SerializedName("TotalTaxBonus")
  private Double totalTaxBonus = null;

  @SerializedName("TotalTaxAdvantage")
  private Double totalTaxAdvantage = null;

  @SerializedName("Transferred_ID")
  private String transferredID = null;

  @SerializedName("TaxBaseRounding")
  private Integer taxBaseRounding = null;

  @SerializedName("TaxRounding")
  private Integer taxRounding = null;

  @SerializedName("Dirty")
  private Boolean dirty = null;

  @SerializedName("DateOfClosing$DATE")
  private DateTime dateOfClosingDATE = null;

  @SerializedName("TotalTaxDiscount")
  private Double totalTaxDiscount = null;

  @SerializedName("IgnoreMinimum")
  private Boolean ignoreMinimum = null;

  @SerializedName("TransferredAsText")
  private String transferredAsText = null;

  @SerializedName("DecreasedTaxBase")
  private Double decreasedTaxBase = null;

  @SerializedName("Overpaid")
  private Double overpaid = null;

  @SerializedName("Arrears")
  private Double arrears = null;

  @SerializedName("TaxBonusOverPaid")
  private Double taxBonusOverPaid = null;

  @SerializedName("CalculatedTaxBonus")
  private Double calculatedTaxBonus = null;

  @SerializedName("AnnualClearing")
  private Double annualClearing = null;

  @SerializedName("YearTaxBonus")
  private Double yearTaxBonus = null;

  @SerializedName("PersonalNumber")
  private String personalNumber = null;

  @SerializedName("NumPersonalNumber")
  private Integer numPersonalNumber = null;

  @SerializedName("TotalIncome")
  private Double totalIncome = null;

  @SerializedName("TotalInsurance")
  private Double totalInsurance = null;

  @SerializedName("EmployeePremium")
  private Double employeePremium = null;

  @SerializedName("EmplPremTableWR")
  private String emplPremTableWR = null;

  @SerializedName("EmplPremTableAgreement")
  private String emplPremTableAgreement = null;

  @SerializedName("EmplPremCalc")
  private Boolean emplPremCalc = null;

  @SerializedName("EmployeePremiumCorrection")
  private Double employeePremiumCorrection = null;

  @SerializedName("HealthInsurance")
  private Double healthInsurance = null;

  @SerializedName("SocialInsurance")
  private Double socialInsurance = null;

  @SerializedName("IsComputed")
  private Boolean isComputed = null;

  @SerializedName("TaxBonusRefund")
  private Double taxBonusRefund = null;

  @SerializedName("OAPensSavingBaseCut")
  private Double oAPensSavingBaseCut = null;

   /**
   * Číslo dok.
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Číslo dok.")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Vlastní ID [persistentní položka]
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "Vlastní ID [persistentní položka]")
  public String getID() {
    return ID;
  }

   /**
   * ID třídy
   * @return classID
  **/
  @ApiModelProperty(example = "null", value = "ID třídy")
  public String getClassID() {
    return classID;
  }

   /**
   * Verze objektu [persistentní položka]
   * @return objVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze objektu [persistentní položka]")
  public Integer getObjVersion() {
    return objVersion;
  }

  public Annualclearing rows(List<Annualclearingrow> rows) {
    this.rows = rows;
    return this;
  }

  public Annualclearing addRowsItem(Annualclearingrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Řádek ročního zúčtování [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Řádek ročního zúčtování [nepersistentní položka]")
  public List<Annualclearingrow> getRows() {
    return rows;
  }

  public void setRows(List<Annualclearingrow> rows) {
    this.rows = rows;
  }

  public Annualclearing docQueueID(String docQueueID) {
    this.docQueueID = docQueueID;
    return this;
  }

   /**
   * Zdrojová řada; ID objektu Řada dokladů [persistentní položka]
   * @return docQueueID
  **/
  @ApiModelProperty(example = "null", value = "Zdrojová řada; ID objektu Řada dokladů [persistentní položka]")
  public String getDocQueueID() {
    return docQueueID;
  }

  public void setDocQueueID(String docQueueID) {
    this.docQueueID = docQueueID;
  }

  public Annualclearing periodID(String periodID) {
    this.periodID = periodID;
    return this;
  }

   /**
   * Období; ID objektu Období [persistentní položka]
   * @return periodID
  **/
  @ApiModelProperty(example = "null", value = "Období; ID objektu Období [persistentní položka]")
  public String getPeriodID() {
    return periodID;
  }

  public void setPeriodID(String periodID) {
    this.periodID = periodID;
  }

  public Annualclearing ordNumber(Integer ordNumber) {
    this.ordNumber = ordNumber;
    return this;
  }

   /**
   * Pořadové číslo [persistentní položka]
   * @return ordNumber
  **/
  @ApiModelProperty(example = "null", value = "Pořadové číslo [persistentní položka]")
  public Integer getOrdNumber() {
    return ordNumber;
  }

  public void setOrdNumber(Integer ordNumber) {
    this.ordNumber = ordNumber;
  }

  public Annualclearing docDateDATE(DateTime docDateDATE) {
    this.docDateDATE = docDateDATE;
    return this;
  }

   /**
   * Datum dok. [persistentní položka]
   * @return docDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum dok. [persistentní položka]")
  public DateTime getDocDateDATE() {
    return docDateDATE;
  }

  public void setDocDateDATE(DateTime docDateDATE) {
    this.docDateDATE = docDateDATE;
  }

  public Annualclearing createdByID(String createdByID) {
    this.createdByID = createdByID;
    return this;
  }

   /**
   * Vytvořil; ID objektu Uživatel [persistentní položka]
   * @return createdByID
  **/
  @ApiModelProperty(example = "null", value = "Vytvořil; ID objektu Uživatel [persistentní položka]")
  public String getCreatedByID() {
    return createdByID;
  }

  public void setCreatedByID(String createdByID) {
    this.createdByID = createdByID;
  }

  public Annualclearing correctedByID(String correctedByID) {
    this.correctedByID = correctedByID;
    return this;
  }

   /**
   * Opravil; ID objektu Uživatel [persistentní položka]
   * @return correctedByID
  **/
  @ApiModelProperty(example = "null", value = "Opravil; ID objektu Uživatel [persistentní položka]")
  public String getCorrectedByID() {
    return correctedByID;
  }

  public void setCorrectedByID(String correctedByID) {
    this.correctedByID = correctedByID;
  }

  public Annualclearing newRelatedType(Integer newRelatedType) {
    this.newRelatedType = newRelatedType;
    return this;
  }

   /**
   * Typ relace
   * @return newRelatedType
  **/
  @ApiModelProperty(example = "null", value = "Typ relace")
  public Integer getNewRelatedType() {
    return newRelatedType;
  }

  public void setNewRelatedType(Integer newRelatedType) {
    this.newRelatedType = newRelatedType;
  }

  public Annualclearing newRelatedDocumentID(String newRelatedDocumentID) {
    this.newRelatedDocumentID = newRelatedDocumentID;
    return this;
  }

   /**
   * ID dokladu pro připojení
   * @return newRelatedDocumentID
  **/
  @ApiModelProperty(example = "null", value = "ID dokladu pro připojení")
  public String getNewRelatedDocumentID() {
    return newRelatedDocumentID;
  }

  public void setNewRelatedDocumentID(String newRelatedDocumentID) {
    this.newRelatedDocumentID = newRelatedDocumentID;
  }

  public Annualclearing employeeID(String employeeID) {
    this.employeeID = employeeID;
    return this;
  }

   /**
   * Zaměstnanec; ID objektu Zaměstnanec [persistentní položka]
   * @return employeeID
  **/
  @ApiModelProperty(example = "null", value = "Zaměstnanec; ID objektu Zaměstnanec [persistentní položka]")
  public String getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(String employeeID) {
    this.employeeID = employeeID;
  }

  public Annualclearing yearOfClearing(Integer yearOfClearing) {
    this.yearOfClearing = yearOfClearing;
    return this;
  }

   /**
   * Rok zúčtování [persistentní položka]
   * @return yearOfClearing
  **/
  @ApiModelProperty(example = "null", value = "Rok zúčtování [persistentní položka]")
  public Integer getYearOfClearing() {
    return yearOfClearing;
  }

  public void setYearOfClearing(Integer yearOfClearing) {
    this.yearOfClearing = yearOfClearing;
  }

  public Annualclearing totalCountOffs(Double totalCountOffs) {
    this.totalCountOffs = totalCountOffs;
    return this;
  }

   /**
   * Celkem odpočty [persistentní položka]
   * @return totalCountOffs
  **/
  @ApiModelProperty(example = "null", value = "Celkem odpočty [persistentní položka]")
  public Double getTotalCountOffs() {
    return totalCountOffs;
  }

  public void setTotalCountOffs(Double totalCountOffs) {
    this.totalCountOffs = totalCountOffs;
  }

  public Annualclearing totalBases(Double totalBases) {
    this.totalBases = totalBases;
    return this;
  }

   /**
   * Celkem základ [persistentní položka]
   * @return totalBases
  **/
  @ApiModelProperty(example = "null", value = "Celkem základ [persistentní položka]")
  public Double getTotalBases() {
    return totalBases;
  }

  public void setTotalBases(Double totalBases) {
    this.totalBases = totalBases;
  }

  public Annualclearing calculatedTax(Double calculatedTax) {
    this.calculatedTax = calculatedTax;
    return this;
  }

   /**
   * Vypočtená daň před slevou [persistentní položka]
   * @return calculatedTax
  **/
  @ApiModelProperty(example = "null", value = "Vypočtená daň před slevou [persistentní položka]")
  public Double getCalculatedTax() {
    return calculatedTax;
  }

  public void setCalculatedTax(Double calculatedTax) {
    this.calculatedTax = calculatedTax;
  }

  public Annualclearing paidTax(Double paidTax) {
    this.paidTax = paidTax;
    return this;
  }

   /**
   * Zaplacené zálohy [persistentní položka]
   * @return paidTax
  **/
  @ApiModelProperty(example = "null", value = "Zaplacené zálohy [persistentní položka]")
  public Double getPaidTax() {
    return paidTax;
  }

  public void setPaidTax(Double paidTax) {
    this.paidTax = paidTax;
  }

  public Annualclearing totalTaxBonus(Double totalTaxBonus) {
    this.totalTaxBonus = totalTaxBonus;
    return this;
  }

   /**
   * Vyplacený daňový bonus [persistentní položka]
   * @return totalTaxBonus
  **/
  @ApiModelProperty(example = "null", value = "Vyplacený daňový bonus [persistentní položka]")
  public Double getTotalTaxBonus() {
    return totalTaxBonus;
  }

  public void setTotalTaxBonus(Double totalTaxBonus) {
    this.totalTaxBonus = totalTaxBonus;
  }

  public Annualclearing totalTaxAdvantage(Double totalTaxAdvantage) {
    this.totalTaxAdvantage = totalTaxAdvantage;
    return this;
  }

   /**
   * Daňové zvýhodnění [persistentní položka]
   * @return totalTaxAdvantage
  **/
  @ApiModelProperty(example = "null", value = "Daňové zvýhodnění [persistentní položka]")
  public Double getTotalTaxAdvantage() {
    return totalTaxAdvantage;
  }

  public void setTotalTaxAdvantage(Double totalTaxAdvantage) {
    this.totalTaxAdvantage = totalTaxAdvantage;
  }

  public Annualclearing transferredID(String transferredID) {
    this.transferredID = transferredID;
    return this;
  }

   /**
   * Přeneseno do ML; ID objektu Mzdový list souhrnný [persistentní položka]
   * @return transferredID
  **/
  @ApiModelProperty(example = "null", value = "Přeneseno do ML; ID objektu Mzdový list souhrnný [persistentní položka]")
  public String getTransferredID() {
    return transferredID;
  }

  public void setTransferredID(String transferredID) {
    this.transferredID = transferredID;
  }

  public Annualclearing taxBaseRounding(Integer taxBaseRounding) {
    this.taxBaseRounding = taxBaseRounding;
    return this;
  }

   /**
   * Zaok.základu [persistentní položka]
   * @return taxBaseRounding
  **/
  @ApiModelProperty(example = "null", value = "Zaok.základu [persistentní položka]")
  public Integer getTaxBaseRounding() {
    return taxBaseRounding;
  }

  public void setTaxBaseRounding(Integer taxBaseRounding) {
    this.taxBaseRounding = taxBaseRounding;
  }

  public Annualclearing taxRounding(Integer taxRounding) {
    this.taxRounding = taxRounding;
    return this;
  }

   /**
   * Zaok.daně [persistentní položka]
   * @return taxRounding
  **/
  @ApiModelProperty(example = "null", value = "Zaok.daně [persistentní položka]")
  public Integer getTaxRounding() {
    return taxRounding;
  }

  public void setTaxRounding(Integer taxRounding) {
    this.taxRounding = taxRounding;
  }

  public Annualclearing dirty(Boolean dirty) {
    this.dirty = dirty;
    return this;
  }

   /**
   * Cizí doklad [persistentní položka]
   * @return dirty
  **/
  @ApiModelProperty(example = "null", value = "Cizí doklad [persistentní položka]")
  public Boolean getDirty() {
    return dirty;
  }

  public void setDirty(Boolean dirty) {
    this.dirty = dirty;
  }

  public Annualclearing dateOfClosingDATE(DateTime dateOfClosingDATE) {
    this.dateOfClosingDATE = dateOfClosingDATE;
    return this;
  }

   /**
   * Datum uzavření [persistentní položka]
   * @return dateOfClosingDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum uzavření [persistentní položka]")
  public DateTime getDateOfClosingDATE() {
    return dateOfClosingDATE;
  }

  public void setDateOfClosingDATE(DateTime dateOfClosingDATE) {
    this.dateOfClosingDATE = dateOfClosingDATE;
  }

  public Annualclearing totalTaxDiscount(Double totalTaxDiscount) {
    this.totalTaxDiscount = totalTaxDiscount;
    return this;
  }

   /**
   * Sleva na dani [persistentní položka]
   * @return totalTaxDiscount
  **/
  @ApiModelProperty(example = "null", value = "Sleva na dani [persistentní položka]")
  public Double getTotalTaxDiscount() {
    return totalTaxDiscount;
  }

  public void setTotalTaxDiscount(Double totalTaxDiscount) {
    this.totalTaxDiscount = totalTaxDiscount;
  }

  public Annualclearing ignoreMinimum(Boolean ignoreMinimum) {
    this.ignoreMinimum = ignoreMinimum;
    return this;
  }

   /**
   * Ignoruj minimum [persistentní položka]
   * @return ignoreMinimum
  **/
  @ApiModelProperty(example = "null", value = "Ignoruj minimum [persistentní položka]")
  public Boolean getIgnoreMinimum() {
    return ignoreMinimum;
  }

  public void setIgnoreMinimum(Boolean ignoreMinimum) {
    this.ignoreMinimum = ignoreMinimum;
  }

  public Annualclearing transferredAsText(String transferredAsText) {
    this.transferredAsText = transferredAsText;
    return this;
  }

   /**
   * Přeneseno do ML
   * @return transferredAsText
  **/
  @ApiModelProperty(example = "null", value = "Přeneseno do ML")
  public String getTransferredAsText() {
    return transferredAsText;
  }

  public void setTransferredAsText(String transferredAsText) {
    this.transferredAsText = transferredAsText;
  }

  public Annualclearing decreasedTaxBase(Double decreasedTaxBase) {
    this.decreasedTaxBase = decreasedTaxBase;
    return this;
  }

   /**
   * Snížený základ
   * @return decreasedTaxBase
  **/
  @ApiModelProperty(example = "null", value = "Snížený základ")
  public Double getDecreasedTaxBase() {
    return decreasedTaxBase;
  }

  public void setDecreasedTaxBase(Double decreasedTaxBase) {
    this.decreasedTaxBase = decreasedTaxBase;
  }

  public Annualclearing overpaid(Double overpaid) {
    this.overpaid = overpaid;
    return this;
  }

   /**
   * Přeplatek
   * @return overpaid
  **/
  @ApiModelProperty(example = "null", value = "Přeplatek")
  public Double getOverpaid() {
    return overpaid;
  }

  public void setOverpaid(Double overpaid) {
    this.overpaid = overpaid;
  }

  public Annualclearing arrears(Double arrears) {
    this.arrears = arrears;
    return this;
  }

   /**
   * Nedoplatek
   * @return arrears
  **/
  @ApiModelProperty(example = "null", value = "Nedoplatek")
  public Double getArrears() {
    return arrears;
  }

  public void setArrears(Double arrears) {
    this.arrears = arrears;
  }

   /**
   * Přeplatek daň. bonusu
   * @return taxBonusOverPaid
  **/
  @ApiModelProperty(example = "null", value = "Přeplatek daň. bonusu")
  public Double getTaxBonusOverPaid() {
    return taxBonusOverPaid;
  }

   /**
   * Spočtený daň. bonus
   * @return calculatedTaxBonus
  **/
  @ApiModelProperty(example = "null", value = "Spočtený daň. bonus")
  public Double getCalculatedTaxBonus() {
    return calculatedTaxBonus;
  }

   /**
   * Přeplatek na dani
   * @return annualClearing
  **/
  @ApiModelProperty(example = "null", value = "Přeplatek na dani")
  public Double getAnnualClearing() {
    return annualClearing;
  }

   /**
   * Rozdíl na daň. bonusu
   * @return yearTaxBonus
  **/
  @ApiModelProperty(example = "null", value = "Rozdíl na daň. bonusu")
  public Double getYearTaxBonus() {
    return yearTaxBonus;
  }

   /**
   * Os. číslo
   * @return personalNumber
  **/
  @ApiModelProperty(example = "null", value = "Os. číslo")
  public String getPersonalNumber() {
    return personalNumber;
  }

   /**
   * Os.číslo numericky
   * @return numPersonalNumber
  **/
  @ApiModelProperty(example = "null", value = "Os.číslo numericky")
  public Integer getNumPersonalNumber() {
    return numPersonalNumber;
  }

   /**
   * Celk.příjem
   * @return totalIncome
  **/
  @ApiModelProperty(example = "null", value = "Celk.příjem")
  public Double getTotalIncome() {
    return totalIncome;
  }

   /**
   * Celk.pojistné
   * @return totalInsurance
  **/
  @ApiModelProperty(example = "null", value = "Celk.pojistné")
  public Double getTotalInsurance() {
    return totalInsurance;
  }

   /**
   * Zaměstnanecká prémie
   * @return employeePremium
  **/
  @ApiModelProperty(example = "null", value = "Zaměstnanecká prémie")
  public Double getEmployeePremium() {
    return employeePremium;
  }

  public Annualclearing emplPremTableWR(String emplPremTableWR) {
    this.emplPremTableWR = emplPremTableWR;
    return this;
  }

   /**
   * Měsíce pr.poměrů [persistentní položka]
   * @return emplPremTableWR
  **/
  @ApiModelProperty(example = "null", value = "Měsíce pr.poměrů [persistentní položka]")
  public String getEmplPremTableWR() {
    return emplPremTableWR;
  }

  public void setEmplPremTableWR(String emplPremTableWR) {
    this.emplPremTableWR = emplPremTableWR;
  }

  public Annualclearing emplPremTableAgreement(String emplPremTableAgreement) {
    this.emplPremTableAgreement = emplPremTableAgreement;
    return this;
  }

   /**
   * Měsíce dohod [persistentní položka]
   * @return emplPremTableAgreement
  **/
  @ApiModelProperty(example = "null", value = "Měsíce dohod [persistentní položka]")
  public String getEmplPremTableAgreement() {
    return emplPremTableAgreement;
  }

  public void setEmplPremTableAgreement(String emplPremTableAgreement) {
    this.emplPremTableAgreement = emplPremTableAgreement;
  }

  public Annualclearing emplPremCalc(Boolean emplPremCalc) {
    this.emplPremCalc = emplPremCalc;
    return this;
  }

   /**
   * Počítat zam.prémii [persistentní položka]
   * @return emplPremCalc
  **/
  @ApiModelProperty(example = "null", value = "Počítat zam.prémii [persistentní položka]")
  public Boolean getEmplPremCalc() {
    return emplPremCalc;
  }

  public void setEmplPremCalc(Boolean emplPremCalc) {
    this.emplPremCalc = emplPremCalc;
  }

  public Annualclearing employeePremiumCorrection(Double employeePremiumCorrection) {
    this.employeePremiumCorrection = employeePremiumCorrection;
    return this;
  }

   /**
   * Zam.prémie - korekce [persistentní položka]
   * @return employeePremiumCorrection
  **/
  @ApiModelProperty(example = "null", value = "Zam.prémie - korekce [persistentní položka]")
  public Double getEmployeePremiumCorrection() {
    return employeePremiumCorrection;
  }

  public void setEmployeePremiumCorrection(Double employeePremiumCorrection) {
    this.employeePremiumCorrection = employeePremiumCorrection;
  }

   /**
   * Zdravotní poj.
   * @return healthInsurance
  **/
  @ApiModelProperty(example = "null", value = "Zdravotní poj.")
  public Double getHealthInsurance() {
    return healthInsurance;
  }

   /**
   * Sociální poj.
   * @return socialInsurance
  **/
  @ApiModelProperty(example = "null", value = "Sociální poj.")
  public Double getSocialInsurance() {
    return socialInsurance;
  }

  public Annualclearing isComputed(Boolean isComputed) {
    this.isComputed = isComputed;
    return this;
  }

   /**
   * Spočteno [persistentní položka]
   * @return isComputed
  **/
  @ApiModelProperty(example = "null", value = "Spočteno [persistentní položka]")
  public Boolean getIsComputed() {
    return isComputed;
  }

  public void setIsComputed(Boolean isComputed) {
    this.isComputed = isComputed;
  }

  public Annualclearing taxBonusRefund(Double taxBonusRefund) {
    this.taxBonusRefund = taxBonusRefund;
    return this;
  }

   /**
   * Vrácení neopr.vypl. bonusu [persistentní položka]
   * @return taxBonusRefund
  **/
  @ApiModelProperty(example = "null", value = "Vrácení neopr.vypl. bonusu [persistentní položka]")
  public Double getTaxBonusRefund() {
    return taxBonusRefund;
  }

  public void setTaxBonusRefund(Double taxBonusRefund) {
    this.taxBonusRefund = taxBonusRefund;
  }

  public Annualclearing oAPensSavingBaseCut(Double oAPensSavingBaseCut) {
    this.oAPensSavingBaseCut = oAPensSavingBaseCut;
    return this;
  }

   /**
   * SDS uplatněné do základu daně [persistentní položka]
   * @return oAPensSavingBaseCut
  **/
  @ApiModelProperty(example = "null", value = "SDS uplatněné do základu daně [persistentní položka]")
  public Double getOAPensSavingBaseCut() {
    return oAPensSavingBaseCut;
  }

  public void setOAPensSavingBaseCut(Double oAPensSavingBaseCut) {
    this.oAPensSavingBaseCut = oAPensSavingBaseCut;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annualclearing annualclearing = (Annualclearing) o;
    return Objects.equals(this.displayName, annualclearing.displayName) &&
        Objects.equals(this.ID, annualclearing.ID) &&
        Objects.equals(this.classID, annualclearing.classID) &&
        Objects.equals(this.objVersion, annualclearing.objVersion) &&
        Objects.equals(this.rows, annualclearing.rows) &&
        Objects.equals(this.docQueueID, annualclearing.docQueueID) &&
        Objects.equals(this.periodID, annualclearing.periodID) &&
        Objects.equals(this.ordNumber, annualclearing.ordNumber) &&
        Objects.equals(this.docDateDATE, annualclearing.docDateDATE) &&
        Objects.equals(this.createdByID, annualclearing.createdByID) &&
        Objects.equals(this.correctedByID, annualclearing.correctedByID) &&
        Objects.equals(this.newRelatedType, annualclearing.newRelatedType) &&
        Objects.equals(this.newRelatedDocumentID, annualclearing.newRelatedDocumentID) &&
        Objects.equals(this.employeeID, annualclearing.employeeID) &&
        Objects.equals(this.yearOfClearing, annualclearing.yearOfClearing) &&
        Objects.equals(this.totalCountOffs, annualclearing.totalCountOffs) &&
        Objects.equals(this.totalBases, annualclearing.totalBases) &&
        Objects.equals(this.calculatedTax, annualclearing.calculatedTax) &&
        Objects.equals(this.paidTax, annualclearing.paidTax) &&
        Objects.equals(this.totalTaxBonus, annualclearing.totalTaxBonus) &&
        Objects.equals(this.totalTaxAdvantage, annualclearing.totalTaxAdvantage) &&
        Objects.equals(this.transferredID, annualclearing.transferredID) &&
        Objects.equals(this.taxBaseRounding, annualclearing.taxBaseRounding) &&
        Objects.equals(this.taxRounding, annualclearing.taxRounding) &&
        Objects.equals(this.dirty, annualclearing.dirty) &&
        Objects.equals(this.dateOfClosingDATE, annualclearing.dateOfClosingDATE) &&
        Objects.equals(this.totalTaxDiscount, annualclearing.totalTaxDiscount) &&
        Objects.equals(this.ignoreMinimum, annualclearing.ignoreMinimum) &&
        Objects.equals(this.transferredAsText, annualclearing.transferredAsText) &&
        Objects.equals(this.decreasedTaxBase, annualclearing.decreasedTaxBase) &&
        Objects.equals(this.overpaid, annualclearing.overpaid) &&
        Objects.equals(this.arrears, annualclearing.arrears) &&
        Objects.equals(this.taxBonusOverPaid, annualclearing.taxBonusOverPaid) &&
        Objects.equals(this.calculatedTaxBonus, annualclearing.calculatedTaxBonus) &&
        Objects.equals(this.annualClearing, annualclearing.annualClearing) &&
        Objects.equals(this.yearTaxBonus, annualclearing.yearTaxBonus) &&
        Objects.equals(this.personalNumber, annualclearing.personalNumber) &&
        Objects.equals(this.numPersonalNumber, annualclearing.numPersonalNumber) &&
        Objects.equals(this.totalIncome, annualclearing.totalIncome) &&
        Objects.equals(this.totalInsurance, annualclearing.totalInsurance) &&
        Objects.equals(this.employeePremium, annualclearing.employeePremium) &&
        Objects.equals(this.emplPremTableWR, annualclearing.emplPremTableWR) &&
        Objects.equals(this.emplPremTableAgreement, annualclearing.emplPremTableAgreement) &&
        Objects.equals(this.emplPremCalc, annualclearing.emplPremCalc) &&
        Objects.equals(this.employeePremiumCorrection, annualclearing.employeePremiumCorrection) &&
        Objects.equals(this.healthInsurance, annualclearing.healthInsurance) &&
        Objects.equals(this.socialInsurance, annualclearing.socialInsurance) &&
        Objects.equals(this.isComputed, annualclearing.isComputed) &&
        Objects.equals(this.taxBonusRefund, annualclearing.taxBonusRefund) &&
        Objects.equals(this.oAPensSavingBaseCut, annualclearing.oAPensSavingBaseCut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, docQueueID, periodID, ordNumber, docDateDATE, createdByID, correctedByID, newRelatedType, newRelatedDocumentID, employeeID, yearOfClearing, totalCountOffs, totalBases, calculatedTax, paidTax, totalTaxBonus, totalTaxAdvantage, transferredID, taxBaseRounding, taxRounding, dirty, dateOfClosingDATE, totalTaxDiscount, ignoreMinimum, transferredAsText, decreasedTaxBase, overpaid, arrears, taxBonusOverPaid, calculatedTaxBonus, annualClearing, yearTaxBonus, personalNumber, numPersonalNumber, totalIncome, totalInsurance, employeePremium, emplPremTableWR, emplPremTableAgreement, emplPremCalc, employeePremiumCorrection, healthInsurance, socialInsurance, isComputed, taxBonusRefund, oAPensSavingBaseCut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annualclearing {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    docQueueID: ").append(toIndentedString(docQueueID)).append("\n");
    sb.append("    periodID: ").append(toIndentedString(periodID)).append("\n");
    sb.append("    ordNumber: ").append(toIndentedString(ordNumber)).append("\n");
    sb.append("    docDateDATE: ").append(toIndentedString(docDateDATE)).append("\n");
    sb.append("    createdByID: ").append(toIndentedString(createdByID)).append("\n");
    sb.append("    correctedByID: ").append(toIndentedString(correctedByID)).append("\n");
    sb.append("    newRelatedType: ").append(toIndentedString(newRelatedType)).append("\n");
    sb.append("    newRelatedDocumentID: ").append(toIndentedString(newRelatedDocumentID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    yearOfClearing: ").append(toIndentedString(yearOfClearing)).append("\n");
    sb.append("    totalCountOffs: ").append(toIndentedString(totalCountOffs)).append("\n");
    sb.append("    totalBases: ").append(toIndentedString(totalBases)).append("\n");
    sb.append("    calculatedTax: ").append(toIndentedString(calculatedTax)).append("\n");
    sb.append("    paidTax: ").append(toIndentedString(paidTax)).append("\n");
    sb.append("    totalTaxBonus: ").append(toIndentedString(totalTaxBonus)).append("\n");
    sb.append("    totalTaxAdvantage: ").append(toIndentedString(totalTaxAdvantage)).append("\n");
    sb.append("    transferredID: ").append(toIndentedString(transferredID)).append("\n");
    sb.append("    taxBaseRounding: ").append(toIndentedString(taxBaseRounding)).append("\n");
    sb.append("    taxRounding: ").append(toIndentedString(taxRounding)).append("\n");
    sb.append("    dirty: ").append(toIndentedString(dirty)).append("\n");
    sb.append("    dateOfClosingDATE: ").append(toIndentedString(dateOfClosingDATE)).append("\n");
    sb.append("    totalTaxDiscount: ").append(toIndentedString(totalTaxDiscount)).append("\n");
    sb.append("    ignoreMinimum: ").append(toIndentedString(ignoreMinimum)).append("\n");
    sb.append("    transferredAsText: ").append(toIndentedString(transferredAsText)).append("\n");
    sb.append("    decreasedTaxBase: ").append(toIndentedString(decreasedTaxBase)).append("\n");
    sb.append("    overpaid: ").append(toIndentedString(overpaid)).append("\n");
    sb.append("    arrears: ").append(toIndentedString(arrears)).append("\n");
    sb.append("    taxBonusOverPaid: ").append(toIndentedString(taxBonusOverPaid)).append("\n");
    sb.append("    calculatedTaxBonus: ").append(toIndentedString(calculatedTaxBonus)).append("\n");
    sb.append("    annualClearing: ").append(toIndentedString(annualClearing)).append("\n");
    sb.append("    yearTaxBonus: ").append(toIndentedString(yearTaxBonus)).append("\n");
    sb.append("    personalNumber: ").append(toIndentedString(personalNumber)).append("\n");
    sb.append("    numPersonalNumber: ").append(toIndentedString(numPersonalNumber)).append("\n");
    sb.append("    totalIncome: ").append(toIndentedString(totalIncome)).append("\n");
    sb.append("    totalInsurance: ").append(toIndentedString(totalInsurance)).append("\n");
    sb.append("    employeePremium: ").append(toIndentedString(employeePremium)).append("\n");
    sb.append("    emplPremTableWR: ").append(toIndentedString(emplPremTableWR)).append("\n");
    sb.append("    emplPremTableAgreement: ").append(toIndentedString(emplPremTableAgreement)).append("\n");
    sb.append("    emplPremCalc: ").append(toIndentedString(emplPremCalc)).append("\n");
    sb.append("    employeePremiumCorrection: ").append(toIndentedString(employeePremiumCorrection)).append("\n");
    sb.append("    healthInsurance: ").append(toIndentedString(healthInsurance)).append("\n");
    sb.append("    socialInsurance: ").append(toIndentedString(socialInsurance)).append("\n");
    sb.append("    isComputed: ").append(toIndentedString(isComputed)).append("\n");
    sb.append("    taxBonusRefund: ").append(toIndentedString(taxBonusRefund)).append("\n");
    sb.append("    oAPensSavingBaseCut: ").append(toIndentedString(oAPensSavingBaseCut)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

