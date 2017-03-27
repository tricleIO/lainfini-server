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
 * Poscashpaid
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Poscashpaid   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Poscashpaidrow> rows = new ArrayList<Poscashpaidrow>();

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

  @SerializedName("AccPresetDef_ID")
  private String accPresetDefID = null;

  @SerializedName("Firm_ID")
  private String firmID = null;

  @SerializedName("FirmOffice_ID")
  private String firmOfficeID = null;

  @SerializedName("Person_ID")
  private String personID = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("AccDate$DATE")
  private DateTime accDateDATE = null;

  @SerializedName("AccDocQueue_ID")
  private String accDocQueueID = null;

  @SerializedName("AccountingType")
  private Integer accountingType = null;

  @SerializedName("IsAccounted")
  private Boolean isAccounted = null;

  @SerializedName("Dirty")
  private Boolean dirty = null;

  @SerializedName("Country_ID")
  private String countryID = null;

  @SerializedName("Currency_ID")
  private String currencyID = null;

  @SerializedName("CurrRate")
  private Double currRate = null;

  @SerializedName("RefCurrRate")
  private Double refCurrRate = null;

  @SerializedName("Coef")
  private Integer coef = null;

  @SerializedName("LocalCoef")
  private Integer localCoef = null;

  @SerializedName("Zone_ID")
  private String zoneID = null;

  @SerializedName("LocalZone_ID")
  private String localZoneID = null;

  @SerializedName("RefCurrency_ID")
  private String refCurrencyID = null;

  @SerializedName("LocalRefCurrency_ID")
  private String localRefCurrencyID = null;

  @SerializedName("CurrRateInfo")
  private String currRateInfo = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("LocalAmount")
  private Double localAmount = null;

  @SerializedName("VirtualPOS_ID")
  private String virtualPOSID = null;

  @SerializedName("POSReceipt_ID")
  private String pOSReceiptID = null;

  @SerializedName("RoundingAmount")
  private Double roundingAmount = null;

  @SerializedName("LocalRoundingAmount")
  private Double localRoundingAmount = null;

  @SerializedName("PaidAmount")
  private Double paidAmount = null;

  @SerializedName("LocalPaidAmount")
  private Double localPaidAmount = null;

  @SerializedName("RemainAmount")
  private Double remainAmount = null;

  @SerializedName("LocalRemainAmount")
  private Double localRemainAmount = null;

  @SerializedName("VarSymbol")
  private String varSymbol = null;

  @SerializedName("IsProfit")
  private Boolean isProfit = null;

  @SerializedName("PaidType")
  private String paidType = null;

  @SerializedName("PaymentType_ID")
  private String paymentTypeID = null;

  @SerializedName("LocalNotPaidAmount")
  private Double localNotPaidAmount = null;

  @SerializedName("LocalVATAmount")
  private Double localVATAmount = null;

  @SerializedName("PAmount")
  private Double pAmount = null;

  @SerializedName("PDocumentType")
  private String pDocumentType = null;

  @SerializedName("PDocument_ID")
  private String pDocumentID = null;

  @SerializedName("PDisKind")
  private Integer pDisKind = null;

  @SerializedName("IsFiscalized")
  private Boolean isFiscalized = null;

  @SerializedName("FiscalizationMode")
  private Integer fiscalizationMode = null;

  @SerializedName("EETTurnover_ID")
  private Poscashpaid eETTurnoverID = null;

  @SerializedName("EET")
  private Boolean EET = null;

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

  public Poscashpaid rows(List<Poscashpaidrow> rows) {
    this.rows = rows;
    return this;
  }

  public Poscashpaid addRowsItem(Poscashpaidrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Výdej z pokladního místa - řádek [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Výdej z pokladního místa - řádek [nepersistentní položka]")
  public List<Poscashpaidrow> getRows() {
    return rows;
  }

  public void setRows(List<Poscashpaidrow> rows) {
    this.rows = rows;
  }

  public Poscashpaid docQueueID(String docQueueID) {
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

  public Poscashpaid periodID(String periodID) {
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

  public Poscashpaid ordNumber(Integer ordNumber) {
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

  public Poscashpaid docDateDATE(DateTime docDateDATE) {
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

  public Poscashpaid createdByID(String createdByID) {
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

  public Poscashpaid correctedByID(String correctedByID) {
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

  public Poscashpaid newRelatedType(Integer newRelatedType) {
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

  public Poscashpaid newRelatedDocumentID(String newRelatedDocumentID) {
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

  public Poscashpaid accPresetDefID(String accPresetDefID) {
    this.accPresetDefID = accPresetDefID;
    return this;
  }

   /**
   * Předkontace; ID objektu Účetní předkontace [persistentní položka]
   * @return accPresetDefID
  **/
  @ApiModelProperty(example = "null", value = "Předkontace; ID objektu Účetní předkontace [persistentní položka]")
  public String getAccPresetDefID() {
    return accPresetDefID;
  }

  public void setAccPresetDefID(String accPresetDefID) {
    this.accPresetDefID = accPresetDefID;
  }

  public Poscashpaid firmID(String firmID) {
    this.firmID = firmID;
    return this;
  }

   /**
   * Firma; ID objektu Firma [persistentní položka]
   * @return firmID
  **/
  @ApiModelProperty(example = "null", value = "Firma; ID objektu Firma [persistentní položka]")
  public String getFirmID() {
    return firmID;
  }

  public void setFirmID(String firmID) {
    this.firmID = firmID;
  }

  public Poscashpaid firmOfficeID(String firmOfficeID) {
    this.firmOfficeID = firmOfficeID;
    return this;
  }

   /**
   * Provozovna; ID objektu Provozovna [persistentní položka]
   * @return firmOfficeID
  **/
  @ApiModelProperty(example = "null", value = "Provozovna; ID objektu Provozovna [persistentní položka]")
  public String getFirmOfficeID() {
    return firmOfficeID;
  }

  public void setFirmOfficeID(String firmOfficeID) {
    this.firmOfficeID = firmOfficeID;
  }

  public Poscashpaid personID(String personID) {
    this.personID = personID;
    return this;
  }

   /**
   * Osoba; ID objektu Osoba [persistentní položka]
   * @return personID
  **/
  @ApiModelProperty(example = "null", value = "Osoba; ID objektu Osoba [persistentní položka]")
  public String getPersonID() {
    return personID;
  }

  public void setPersonID(String personID) {
    this.personID = personID;
  }

  public Poscashpaid description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Poscashpaid accDateDATE(DateTime accDateDATE) {
    this.accDateDATE = accDateDATE;
    return this;
  }

   /**
   * Datum účt. [persistentní položka]
   * @return accDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum účt. [persistentní položka]")
  public DateTime getAccDateDATE() {
    return accDateDATE;
  }

  public void setAccDateDATE(DateTime accDateDATE) {
    this.accDateDATE = accDateDATE;
  }

  public Poscashpaid accDocQueueID(String accDocQueueID) {
    this.accDocQueueID = accDocQueueID;
    return this;
  }

   /**
   * Účetní řada; ID objektu Účetní řada dokladů [persistentní položka]
   * @return accDocQueueID
  **/
  @ApiModelProperty(example = "null", value = "Účetní řada; ID objektu Účetní řada dokladů [persistentní položka]")
  public String getAccDocQueueID() {
    return accDocQueueID;
  }

  public void setAccDocQueueID(String accDocQueueID) {
    this.accDocQueueID = accDocQueueID;
  }

  public Poscashpaid accountingType(Integer accountingType) {
    this.accountingType = accountingType;
    return this;
  }

   /**
   * Jak účtovat
   * @return accountingType
  **/
  @ApiModelProperty(example = "null", value = "Jak účtovat")
  public Integer getAccountingType() {
    return accountingType;
  }

  public void setAccountingType(Integer accountingType) {
    this.accountingType = accountingType;
  }

  public Poscashpaid isAccounted(Boolean isAccounted) {
    this.isAccounted = isAccounted;
    return this;
  }

   /**
   * Účtováno
   * @return isAccounted
  **/
  @ApiModelProperty(example = "null", value = "Účtováno")
  public Boolean getIsAccounted() {
    return isAccounted;
  }

  public void setIsAccounted(Boolean isAccounted) {
    this.isAccounted = isAccounted;
  }

  public Poscashpaid dirty(Boolean dirty) {
    this.dirty = dirty;
    return this;
  }

   /**
   * Zakázané přepočítání
   * @return dirty
  **/
  @ApiModelProperty(example = "null", value = "Zakázané přepočítání")
  public Boolean getDirty() {
    return dirty;
  }

  public void setDirty(Boolean dirty) {
    this.dirty = dirty;
  }

  public Poscashpaid countryID(String countryID) {
    this.countryID = countryID;
    return this;
  }

   /**
   * Země; ID objektu Země [persistentní položka]
   * @return countryID
  **/
  @ApiModelProperty(example = "null", value = "Země; ID objektu Země [persistentní položka]")
  public String getCountryID() {
    return countryID;
  }

  public void setCountryID(String countryID) {
    this.countryID = countryID;
  }

  public Poscashpaid currencyID(String currencyID) {
    this.currencyID = currencyID;
    return this;
  }

   /**
   * Měna; ID objektu Měna [persistentní položka]
   * @return currencyID
  **/
  @ApiModelProperty(example = "null", value = "Měna; ID objektu Měna [persistentní položka]")
  public String getCurrencyID() {
    return currencyID;
  }

  public void setCurrencyID(String currencyID) {
    this.currencyID = currencyID;
  }

  public Poscashpaid currRate(Double currRate) {
    this.currRate = currRate;
    return this;
  }

   /**
   * Kurz měny [persistentní položka]
   * @return currRate
  **/
  @ApiModelProperty(example = "null", value = "Kurz měny [persistentní položka]")
  public Double getCurrRate() {
    return currRate;
  }

  public void setCurrRate(Double currRate) {
    this.currRate = currRate;
  }

  public Poscashpaid refCurrRate(Double refCurrRate) {
    this.refCurrRate = refCurrRate;
    return this;
  }

   /**
   * Kurz vztažný [persistentní položka]
   * @return refCurrRate
  **/
  @ApiModelProperty(example = "null", value = "Kurz vztažný [persistentní položka]")
  public Double getRefCurrRate() {
    return refCurrRate;
  }

  public void setRefCurrRate(Double refCurrRate) {
    this.refCurrRate = refCurrRate;
  }

  public Poscashpaid coef(Integer coef) {
    this.coef = coef;
    return this;
  }

   /**
   * Koeficient [persistentní položka]
   * @return coef
  **/
  @ApiModelProperty(example = "null", value = "Koeficient [persistentní položka]")
  public Integer getCoef() {
    return coef;
  }

  public void setCoef(Integer coef) {
    this.coef = coef;
  }

  public Poscashpaid localCoef(Integer localCoef) {
    this.localCoef = localCoef;
    return this;
  }

   /**
   * Lokální koeficient [persistentní položka]
   * @return localCoef
  **/
  @ApiModelProperty(example = "null", value = "Lokální koeficient [persistentní položka]")
  public Integer getLocalCoef() {
    return localCoef;
  }

  public void setLocalCoef(Integer localCoef) {
    this.localCoef = localCoef;
  }

  public Poscashpaid zoneID(String zoneID) {
    this.zoneID = zoneID;
    return this;
  }

   /**
   * Zóna; ID objektu Měna [persistentní položka]
   * @return zoneID
  **/
  @ApiModelProperty(example = "null", value = "Zóna; ID objektu Měna [persistentní položka]")
  public String getZoneID() {
    return zoneID;
  }

  public void setZoneID(String zoneID) {
    this.zoneID = zoneID;
  }

  public Poscashpaid localZoneID(String localZoneID) {
    this.localZoneID = localZoneID;
    return this;
  }

   /**
   * Lokální zóna; ID objektu Měna [persistentní položka]
   * @return localZoneID
  **/
  @ApiModelProperty(example = "null", value = "Lokální zóna; ID objektu Měna [persistentní položka]")
  public String getLocalZoneID() {
    return localZoneID;
  }

  public void setLocalZoneID(String localZoneID) {
    this.localZoneID = localZoneID;
  }

   /**
   * Ref.měna; ID objektu Měna
   * @return refCurrencyID
  **/
  @ApiModelProperty(example = "null", value = "Ref.měna; ID objektu Měna")
  public String getRefCurrencyID() {
    return refCurrencyID;
  }

   /**
   * Lok.ref.měna; ID objektu Měna
   * @return localRefCurrencyID
  **/
  @ApiModelProperty(example = "null", value = "Lok.ref.měna; ID objektu Měna")
  public String getLocalRefCurrencyID() {
    return localRefCurrencyID;
  }

   /**
   * Kurz měny textově
   * @return currRateInfo
  **/
  @ApiModelProperty(example = "null", value = "Kurz měny textově")
  public String getCurrRateInfo() {
    return currRateInfo;
  }

  public Poscashpaid amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Celkem [persistentní položka]
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Celkem [persistentní položka]")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Poscashpaid localAmount(Double localAmount) {
    this.localAmount = localAmount;
    return this;
  }

   /**
   * Celkem lokálně [persistentní položka]
   * @return localAmount
  **/
  @ApiModelProperty(example = "null", value = "Celkem lokálně [persistentní položka]")
  public Double getLocalAmount() {
    return localAmount;
  }

  public void setLocalAmount(Double localAmount) {
    this.localAmount = localAmount;
  }

  public Poscashpaid virtualPOSID(String virtualPOSID) {
    this.virtualPOSID = virtualPOSID;
    return this;
  }

   /**
   * Pokladní místo; ID objektu Pokladní místo [persistentní položka]
   * @return virtualPOSID
  **/
  @ApiModelProperty(example = "null", value = "Pokladní místo; ID objektu Pokladní místo [persistentní položka]")
  public String getVirtualPOSID() {
    return virtualPOSID;
  }

  public void setVirtualPOSID(String virtualPOSID) {
    this.virtualPOSID = virtualPOSID;
  }

  public Poscashpaid pOSReceiptID(String pOSReceiptID) {
    this.pOSReceiptID = pOSReceiptID;
    return this;
  }

   /**
   * Tržba; ID objektu Tržba [persistentní položka]
   * @return pOSReceiptID
  **/
  @ApiModelProperty(example = "null", value = "Tržba; ID objektu Tržba [persistentní položka]")
  public String getPOSReceiptID() {
    return pOSReceiptID;
  }

  public void setPOSReceiptID(String pOSReceiptID) {
    this.pOSReceiptID = pOSReceiptID;
  }

  public Poscashpaid roundingAmount(Double roundingAmount) {
    this.roundingAmount = roundingAmount;
    return this;
  }

   /**
   * Hal. [persistentní položka]
   * @return roundingAmount
  **/
  @ApiModelProperty(example = "null", value = "Hal. [persistentní položka]")
  public Double getRoundingAmount() {
    return roundingAmount;
  }

  public void setRoundingAmount(Double roundingAmount) {
    this.roundingAmount = roundingAmount;
  }

  public Poscashpaid localRoundingAmount(Double localRoundingAmount) {
    this.localRoundingAmount = localRoundingAmount;
    return this;
  }

   /**
   * Hal.vyr.lok. [persistentní položka]
   * @return localRoundingAmount
  **/
  @ApiModelProperty(example = "null", value = "Hal.vyr.lok. [persistentní položka]")
  public Double getLocalRoundingAmount() {
    return localRoundingAmount;
  }

  public void setLocalRoundingAmount(Double localRoundingAmount) {
    this.localRoundingAmount = localRoundingAmount;
  }

  public Poscashpaid paidAmount(Double paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }

   /**
   * Převzato [persistentní položka]
   * @return paidAmount
  **/
  @ApiModelProperty(example = "null", value = "Převzato [persistentní položka]")
  public Double getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(Double paidAmount) {
    this.paidAmount = paidAmount;
  }

  public Poscashpaid localPaidAmount(Double localPaidAmount) {
    this.localPaidAmount = localPaidAmount;
    return this;
  }

   /**
   * Převzato lok. [persistentní položka]
   * @return localPaidAmount
  **/
  @ApiModelProperty(example = "null", value = "Převzato lok. [persistentní položka]")
  public Double getLocalPaidAmount() {
    return localPaidAmount;
  }

  public void setLocalPaidAmount(Double localPaidAmount) {
    this.localPaidAmount = localPaidAmount;
  }

  public Poscashpaid remainAmount(Double remainAmount) {
    this.remainAmount = remainAmount;
    return this;
  }

   /**
   * Nepřevzato
   * @return remainAmount
  **/
  @ApiModelProperty(example = "null", value = "Nepřevzato")
  public Double getRemainAmount() {
    return remainAmount;
  }

  public void setRemainAmount(Double remainAmount) {
    this.remainAmount = remainAmount;
  }

  public Poscashpaid localRemainAmount(Double localRemainAmount) {
    this.localRemainAmount = localRemainAmount;
    return this;
  }

   /**
   * Nepřevzato lok.
   * @return localRemainAmount
  **/
  @ApiModelProperty(example = "null", value = "Nepřevzato lok.")
  public Double getLocalRemainAmount() {
    return localRemainAmount;
  }

  public void setLocalRemainAmount(Double localRemainAmount) {
    this.localRemainAmount = localRemainAmount;
  }

  public Poscashpaid varSymbol(String varSymbol) {
    this.varSymbol = varSymbol;
    return this;
  }

   /**
   * Var.symbol [persistentní položka]
   * @return varSymbol
  **/
  @ApiModelProperty(example = "null", value = "Var.symbol [persistentní položka]")
  public String getVarSymbol() {
    return varSymbol;
  }

  public void setVarSymbol(String varSymbol) {
    this.varSymbol = varSymbol;
  }

  public Poscashpaid isProfit(Boolean isProfit) {
    this.isProfit = isProfit;
    return this;
  }

   /**
   * Výnos
   * @return isProfit
  **/
  @ApiModelProperty(example = "null", value = "Výnos")
  public Boolean getIsProfit() {
    return isProfit;
  }

  public void setIsProfit(Boolean isProfit) {
    this.isProfit = isProfit;
  }

  public Poscashpaid paidType(String paidType) {
    this.paidType = paidType;
    return this;
  }

   /**
   * Typ výdeje [persistentní položka]
   * @return paidType
  **/
  @ApiModelProperty(example = "null", value = "Typ výdeje [persistentní položka]")
  public String getPaidType() {
    return paidType;
  }

  public void setPaidType(String paidType) {
    this.paidType = paidType;
  }

  public Poscashpaid paymentTypeID(String paymentTypeID) {
    this.paymentTypeID = paymentTypeID;
    return this;
  }

   /**
   * Druh platby; ID objektu Způsob úhrady [persistentní položka]
   * @return paymentTypeID
  **/
  @ApiModelProperty(example = "null", value = "Druh platby; ID objektu Způsob úhrady [persistentní položka]")
  public String getPaymentTypeID() {
    return paymentTypeID;
  }

  public void setPaymentTypeID(String paymentTypeID) {
    this.paymentTypeID = paymentTypeID;
  }

  public Poscashpaid localNotPaidAmount(Double localNotPaidAmount) {
    this.localNotPaidAmount = localNotPaidAmount;
    return this;
  }

   /**
   * Nezaplaceno lokálně
   * @return localNotPaidAmount
  **/
  @ApiModelProperty(example = "null", value = "Nezaplaceno lokálně")
  public Double getLocalNotPaidAmount() {
    return localNotPaidAmount;
  }

  public void setLocalNotPaidAmount(Double localNotPaidAmount) {
    this.localNotPaidAmount = localNotPaidAmount;
  }

   /**
   * DPH v lokální měně [persistentní položka]
   * @return localVATAmount
  **/
  @ApiModelProperty(example = "null", value = "DPH v lokální měně [persistentní položka]")
  public Double getLocalVATAmount() {
    return localVATAmount;
  }

  public Poscashpaid pAmount(Double pAmount) {
    this.pAmount = pAmount;
    return this;
  }

   /**
   * Platba [persistentní položka]
   * @return pAmount
  **/
  @ApiModelProperty(example = "null", value = "Platba [persistentní položka]")
  public Double getPAmount() {
    return pAmount;
  }

  public void setPAmount(Double pAmount) {
    this.pAmount = pAmount;
  }

  public Poscashpaid pDocumentType(String pDocumentType) {
    this.pDocumentType = pDocumentType;
    return this;
  }

   /**
   * Typ plac.dokl. [persistentní položka]
   * @return pDocumentType
  **/
  @ApiModelProperty(example = "null", value = "Typ plac.dokl. [persistentní položka]")
  public String getPDocumentType() {
    return pDocumentType;
  }

  public void setPDocumentType(String pDocumentType) {
    this.pDocumentType = pDocumentType;
  }

  public Poscashpaid pDocumentID(String pDocumentID) {
    this.pDocumentID = pDocumentID;
    return this;
  }

   /**
   * Plac.doklad; ID objektu Dokument [persistentní položka]
   * @return pDocumentID
  **/
  @ApiModelProperty(example = "null", value = "Plac.doklad; ID objektu Dokument [persistentní položka]")
  public String getPDocumentID() {
    return pDocumentID;
  }

  public void setPDocumentID(String pDocumentID) {
    this.pDocumentID = pDocumentID;
  }

  public Poscashpaid pDisKind(Integer pDisKind) {
    this.pDisKind = pDisKind;
    return this;
  }

   /**
   * Rozdělení [persistentní položka]
   * @return pDisKind
  **/
  @ApiModelProperty(example = "null", value = "Rozdělení [persistentní položka]")
  public Integer getPDisKind() {
    return pDisKind;
  }

  public void setPDisKind(Integer pDisKind) {
    this.pDisKind = pDisKind;
  }

  public Poscashpaid isFiscalized(Boolean isFiscalized) {
    this.isFiscalized = isFiscalized;
    return this;
  }

   /**
   * Fiskalizován [persistentní položka]
   * @return isFiscalized
  **/
  @ApiModelProperty(example = "null", value = "Fiskalizován [persistentní položka]")
  public Boolean getIsFiscalized() {
    return isFiscalized;
  }

  public void setIsFiscalized(Boolean isFiscalized) {
    this.isFiscalized = isFiscalized;
  }

  public Poscashpaid fiscalizationMode(Integer fiscalizationMode) {
    this.fiscalizationMode = fiscalizationMode;
    return this;
  }

   /**
   * Způsob fiskalizace [persistentní položka]
   * @return fiscalizationMode
  **/
  @ApiModelProperty(example = "null", value = "Způsob fiskalizace [persistentní položka]")
  public Integer getFiscalizationMode() {
    return fiscalizationMode;
  }

  public void setFiscalizationMode(Integer fiscalizationMode) {
    this.fiscalizationMode = fiscalizationMode;
  }

  public Poscashpaid eETTurnoverID(Poscashpaid eETTurnoverID) {
    this.eETTurnoverID = eETTurnoverID;
    return this;
  }

   /**
   * Get eETTurnoverID
   * @return eETTurnoverID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Poscashpaid getEETTurnoverID() {
    return eETTurnoverID;
  }

  public void setEETTurnoverID(Poscashpaid eETTurnoverID) {
    this.eETTurnoverID = eETTurnoverID;
  }

  public Poscashpaid EET(Boolean EET) {
    this.EET = EET;
    return this;
  }

   /**
   * EET [persistentní položka]
   * @return EET
  **/
  @ApiModelProperty(example = "null", value = "EET [persistentní položka]")
  public Boolean getEET() {
    return EET;
  }

  public void setEET(Boolean EET) {
    this.EET = EET;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Poscashpaid poscashpaid = (Poscashpaid) o;
    return Objects.equals(this.displayName, poscashpaid.displayName) &&
        Objects.equals(this.ID, poscashpaid.ID) &&
        Objects.equals(this.classID, poscashpaid.classID) &&
        Objects.equals(this.objVersion, poscashpaid.objVersion) &&
        Objects.equals(this.rows, poscashpaid.rows) &&
        Objects.equals(this.docQueueID, poscashpaid.docQueueID) &&
        Objects.equals(this.periodID, poscashpaid.periodID) &&
        Objects.equals(this.ordNumber, poscashpaid.ordNumber) &&
        Objects.equals(this.docDateDATE, poscashpaid.docDateDATE) &&
        Objects.equals(this.createdByID, poscashpaid.createdByID) &&
        Objects.equals(this.correctedByID, poscashpaid.correctedByID) &&
        Objects.equals(this.newRelatedType, poscashpaid.newRelatedType) &&
        Objects.equals(this.newRelatedDocumentID, poscashpaid.newRelatedDocumentID) &&
        Objects.equals(this.accPresetDefID, poscashpaid.accPresetDefID) &&
        Objects.equals(this.firmID, poscashpaid.firmID) &&
        Objects.equals(this.firmOfficeID, poscashpaid.firmOfficeID) &&
        Objects.equals(this.personID, poscashpaid.personID) &&
        Objects.equals(this.description, poscashpaid.description) &&
        Objects.equals(this.accDateDATE, poscashpaid.accDateDATE) &&
        Objects.equals(this.accDocQueueID, poscashpaid.accDocQueueID) &&
        Objects.equals(this.accountingType, poscashpaid.accountingType) &&
        Objects.equals(this.isAccounted, poscashpaid.isAccounted) &&
        Objects.equals(this.dirty, poscashpaid.dirty) &&
        Objects.equals(this.countryID, poscashpaid.countryID) &&
        Objects.equals(this.currencyID, poscashpaid.currencyID) &&
        Objects.equals(this.currRate, poscashpaid.currRate) &&
        Objects.equals(this.refCurrRate, poscashpaid.refCurrRate) &&
        Objects.equals(this.coef, poscashpaid.coef) &&
        Objects.equals(this.localCoef, poscashpaid.localCoef) &&
        Objects.equals(this.zoneID, poscashpaid.zoneID) &&
        Objects.equals(this.localZoneID, poscashpaid.localZoneID) &&
        Objects.equals(this.refCurrencyID, poscashpaid.refCurrencyID) &&
        Objects.equals(this.localRefCurrencyID, poscashpaid.localRefCurrencyID) &&
        Objects.equals(this.currRateInfo, poscashpaid.currRateInfo) &&
        Objects.equals(this.amount, poscashpaid.amount) &&
        Objects.equals(this.localAmount, poscashpaid.localAmount) &&
        Objects.equals(this.virtualPOSID, poscashpaid.virtualPOSID) &&
        Objects.equals(this.pOSReceiptID, poscashpaid.pOSReceiptID) &&
        Objects.equals(this.roundingAmount, poscashpaid.roundingAmount) &&
        Objects.equals(this.localRoundingAmount, poscashpaid.localRoundingAmount) &&
        Objects.equals(this.paidAmount, poscashpaid.paidAmount) &&
        Objects.equals(this.localPaidAmount, poscashpaid.localPaidAmount) &&
        Objects.equals(this.remainAmount, poscashpaid.remainAmount) &&
        Objects.equals(this.localRemainAmount, poscashpaid.localRemainAmount) &&
        Objects.equals(this.varSymbol, poscashpaid.varSymbol) &&
        Objects.equals(this.isProfit, poscashpaid.isProfit) &&
        Objects.equals(this.paidType, poscashpaid.paidType) &&
        Objects.equals(this.paymentTypeID, poscashpaid.paymentTypeID) &&
        Objects.equals(this.localNotPaidAmount, poscashpaid.localNotPaidAmount) &&
        Objects.equals(this.localVATAmount, poscashpaid.localVATAmount) &&
        Objects.equals(this.pAmount, poscashpaid.pAmount) &&
        Objects.equals(this.pDocumentType, poscashpaid.pDocumentType) &&
        Objects.equals(this.pDocumentID, poscashpaid.pDocumentID) &&
        Objects.equals(this.pDisKind, poscashpaid.pDisKind) &&
        Objects.equals(this.isFiscalized, poscashpaid.isFiscalized) &&
        Objects.equals(this.fiscalizationMode, poscashpaid.fiscalizationMode) &&
        Objects.equals(this.eETTurnoverID, poscashpaid.eETTurnoverID) &&
        Objects.equals(this.EET, poscashpaid.EET);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, docQueueID, periodID, ordNumber, docDateDATE, createdByID, correctedByID, newRelatedType, newRelatedDocumentID, accPresetDefID, firmID, firmOfficeID, personID, description, accDateDATE, accDocQueueID, accountingType, isAccounted, dirty, countryID, currencyID, currRate, refCurrRate, coef, localCoef, zoneID, localZoneID, refCurrencyID, localRefCurrencyID, currRateInfo, amount, localAmount, virtualPOSID, pOSReceiptID, roundingAmount, localRoundingAmount, paidAmount, localPaidAmount, remainAmount, localRemainAmount, varSymbol, isProfit, paidType, paymentTypeID, localNotPaidAmount, localVATAmount, pAmount, pDocumentType, pDocumentID, pDisKind, isFiscalized, fiscalizationMode, eETTurnoverID, EET);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Poscashpaid {\n");
    
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
    sb.append("    accPresetDefID: ").append(toIndentedString(accPresetDefID)).append("\n");
    sb.append("    firmID: ").append(toIndentedString(firmID)).append("\n");
    sb.append("    firmOfficeID: ").append(toIndentedString(firmOfficeID)).append("\n");
    sb.append("    personID: ").append(toIndentedString(personID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accDateDATE: ").append(toIndentedString(accDateDATE)).append("\n");
    sb.append("    accDocQueueID: ").append(toIndentedString(accDocQueueID)).append("\n");
    sb.append("    accountingType: ").append(toIndentedString(accountingType)).append("\n");
    sb.append("    isAccounted: ").append(toIndentedString(isAccounted)).append("\n");
    sb.append("    dirty: ").append(toIndentedString(dirty)).append("\n");
    sb.append("    countryID: ").append(toIndentedString(countryID)).append("\n");
    sb.append("    currencyID: ").append(toIndentedString(currencyID)).append("\n");
    sb.append("    currRate: ").append(toIndentedString(currRate)).append("\n");
    sb.append("    refCurrRate: ").append(toIndentedString(refCurrRate)).append("\n");
    sb.append("    coef: ").append(toIndentedString(coef)).append("\n");
    sb.append("    localCoef: ").append(toIndentedString(localCoef)).append("\n");
    sb.append("    zoneID: ").append(toIndentedString(zoneID)).append("\n");
    sb.append("    localZoneID: ").append(toIndentedString(localZoneID)).append("\n");
    sb.append("    refCurrencyID: ").append(toIndentedString(refCurrencyID)).append("\n");
    sb.append("    localRefCurrencyID: ").append(toIndentedString(localRefCurrencyID)).append("\n");
    sb.append("    currRateInfo: ").append(toIndentedString(currRateInfo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    localAmount: ").append(toIndentedString(localAmount)).append("\n");
    sb.append("    virtualPOSID: ").append(toIndentedString(virtualPOSID)).append("\n");
    sb.append("    pOSReceiptID: ").append(toIndentedString(pOSReceiptID)).append("\n");
    sb.append("    roundingAmount: ").append(toIndentedString(roundingAmount)).append("\n");
    sb.append("    localRoundingAmount: ").append(toIndentedString(localRoundingAmount)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    localPaidAmount: ").append(toIndentedString(localPaidAmount)).append("\n");
    sb.append("    remainAmount: ").append(toIndentedString(remainAmount)).append("\n");
    sb.append("    localRemainAmount: ").append(toIndentedString(localRemainAmount)).append("\n");
    sb.append("    varSymbol: ").append(toIndentedString(varSymbol)).append("\n");
    sb.append("    isProfit: ").append(toIndentedString(isProfit)).append("\n");
    sb.append("    paidType: ").append(toIndentedString(paidType)).append("\n");
    sb.append("    paymentTypeID: ").append(toIndentedString(paymentTypeID)).append("\n");
    sb.append("    localNotPaidAmount: ").append(toIndentedString(localNotPaidAmount)).append("\n");
    sb.append("    localVATAmount: ").append(toIndentedString(localVATAmount)).append("\n");
    sb.append("    pAmount: ").append(toIndentedString(pAmount)).append("\n");
    sb.append("    pDocumentType: ").append(toIndentedString(pDocumentType)).append("\n");
    sb.append("    pDocumentID: ").append(toIndentedString(pDocumentID)).append("\n");
    sb.append("    pDisKind: ").append(toIndentedString(pDisKind)).append("\n");
    sb.append("    isFiscalized: ").append(toIndentedString(isFiscalized)).append("\n");
    sb.append("    fiscalizationMode: ").append(toIndentedString(fiscalizationMode)).append("\n");
    sb.append("    eETTurnoverID: ").append(toIndentedString(eETTurnoverID)).append("\n");
    sb.append("    EET: ").append(toIndentedString(EET)).append("\n");
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

