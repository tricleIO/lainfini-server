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

import java.util.Objects;


/**
 * Notrealizedexchangedifference
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Notrealizedexchangedifference   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

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

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("Division_ID")
  private String divisionID = null;

  @SerializedName("BusOrder_ID")
  private String busOrderID = null;

  @SerializedName("BusTransaction_ID")
  private String busTransactionID = null;

  @SerializedName("Profit")
  private Boolean profit = null;

  @SerializedName("Currency_ID")
  private String currencyID = null;

  @SerializedName("Country_ID")
  private String countryID = null;

  @SerializedName("RefCurrency_ID")
  private String refCurrencyID = null;

  @SerializedName("LocalRefCurrency_ID")
  private String localRefCurrencyID = null;

  @SerializedName("BusProject_ID")
  private String busProjectID = null;

  @SerializedName("PDocument_ID")
  private String pDocumentID = null;

  @SerializedName("PDocumentType")
  private String pDocumentType = null;

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

  @SerializedName("CurrRateInfo")
  private String currRateInfo = null;

  @SerializedName("ForPeriod")
  private Boolean forPeriod = null;

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

  public Notrealizedexchangedifference docQueueID(String docQueueID) {
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

  public Notrealizedexchangedifference periodID(String periodID) {
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

  public Notrealizedexchangedifference ordNumber(Integer ordNumber) {
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

  public Notrealizedexchangedifference docDateDATE(DateTime docDateDATE) {
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

  public Notrealizedexchangedifference createdByID(String createdByID) {
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

  public Notrealizedexchangedifference correctedByID(String correctedByID) {
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

  public Notrealizedexchangedifference newRelatedType(Integer newRelatedType) {
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

  public Notrealizedexchangedifference newRelatedDocumentID(String newRelatedDocumentID) {
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

  public Notrealizedexchangedifference accPresetDefID(String accPresetDefID) {
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

  public Notrealizedexchangedifference firmID(String firmID) {
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

  public Notrealizedexchangedifference firmOfficeID(String firmOfficeID) {
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

  public Notrealizedexchangedifference personID(String personID) {
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

  public Notrealizedexchangedifference description(String description) {
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

  public Notrealizedexchangedifference accDateDATE(DateTime accDateDATE) {
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

  public Notrealizedexchangedifference accDocQueueID(String accDocQueueID) {
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

  public Notrealizedexchangedifference accountingType(Integer accountingType) {
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

  public Notrealizedexchangedifference isAccounted(Boolean isAccounted) {
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

  public Notrealizedexchangedifference dirty(Boolean dirty) {
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

  public Notrealizedexchangedifference amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Částka [persistentní položka]
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Částka [persistentní položka]")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Notrealizedexchangedifference divisionID(String divisionID) {
    this.divisionID = divisionID;
    return this;
  }

   /**
   * Středisko; ID objektu Středisko [persistentní položka]
   * @return divisionID
  **/
  @ApiModelProperty(example = "null", value = "Středisko; ID objektu Středisko [persistentní položka]")
  public String getDivisionID() {
    return divisionID;
  }

  public void setDivisionID(String divisionID) {
    this.divisionID = divisionID;
  }

  public Notrealizedexchangedifference busOrderID(String busOrderID) {
    this.busOrderID = busOrderID;
    return this;
  }

   /**
   * Zakázka; ID objektu Zakázka [persistentní položka]
   * @return busOrderID
  **/
  @ApiModelProperty(example = "null", value = "Zakázka; ID objektu Zakázka [persistentní položka]")
  public String getBusOrderID() {
    return busOrderID;
  }

  public void setBusOrderID(String busOrderID) {
    this.busOrderID = busOrderID;
  }

  public Notrealizedexchangedifference busTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
    return this;
  }

   /**
   * O.případ; ID objektu Obchodní případ [persistentní položka]
   * @return busTransactionID
  **/
  @ApiModelProperty(example = "null", value = "O.případ; ID objektu Obchodní případ [persistentní položka]")
  public String getBusTransactionID() {
    return busTransactionID;
  }

  public void setBusTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
  }

  public Notrealizedexchangedifference profit(Boolean profit) {
    this.profit = profit;
    return this;
  }

   /**
   * Je zisk [persistentní položka]
   * @return profit
  **/
  @ApiModelProperty(example = "null", value = "Je zisk [persistentní položka]")
  public Boolean getProfit() {
    return profit;
  }

  public void setProfit(Boolean profit) {
    this.profit = profit;
  }

   /**
   * Měna; ID objektu Měna
   * @return currencyID
  **/
  @ApiModelProperty(example = "null", value = "Měna; ID objektu Měna")
  public String getCurrencyID() {
    return currencyID;
  }

   /**
   * Země; ID objektu Země
   * @return countryID
  **/
  @ApiModelProperty(example = "null", value = "Země; ID objektu Země")
  public String getCountryID() {
    return countryID;
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

  public Notrealizedexchangedifference busProjectID(String busProjectID) {
    this.busProjectID = busProjectID;
    return this;
  }

   /**
   * Projekt; ID objektu Projekt [persistentní položka]
   * @return busProjectID
  **/
  @ApiModelProperty(example = "null", value = "Projekt; ID objektu Projekt [persistentní položka]")
  public String getBusProjectID() {
    return busProjectID;
  }

  public void setBusProjectID(String busProjectID) {
    this.busProjectID = busProjectID;
  }

  public Notrealizedexchangedifference pDocumentID(String pDocumentID) {
    this.pDocumentID = pDocumentID;
    return this;
  }

   /**
   * Korig.doklad; ID objektu Dokument [persistentní položka]
   * @return pDocumentID
  **/
  @ApiModelProperty(example = "null", value = "Korig.doklad; ID objektu Dokument [persistentní položka]")
  public String getPDocumentID() {
    return pDocumentID;
  }

  public void setPDocumentID(String pDocumentID) {
    this.pDocumentID = pDocumentID;
  }

  public Notrealizedexchangedifference pDocumentType(String pDocumentType) {
    this.pDocumentType = pDocumentType;
    return this;
  }

   /**
   * Typ korig.dokl. [persistentní položka]
   * @return pDocumentType
  **/
  @ApiModelProperty(example = "null", value = "Typ korig.dokl. [persistentní položka]")
  public String getPDocumentType() {
    return pDocumentType;
  }

  public void setPDocumentType(String pDocumentType) {
    this.pDocumentType = pDocumentType;
  }

  public Notrealizedexchangedifference currRate(Double currRate) {
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

  public Notrealizedexchangedifference refCurrRate(Double refCurrRate) {
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

  public Notrealizedexchangedifference coef(Integer coef) {
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

  public Notrealizedexchangedifference localCoef(Integer localCoef) {
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

  public Notrealizedexchangedifference zoneID(String zoneID) {
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

  public Notrealizedexchangedifference localZoneID(String localZoneID) {
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
   * Kurz měny textově
   * @return currRateInfo
  **/
  @ApiModelProperty(example = "null", value = "Kurz měny textově")
  public String getCurrRateInfo() {
    return currRateInfo;
  }

  public Notrealizedexchangedifference forPeriod(Boolean forPeriod) {
    this.forPeriod = forPeriod;
    return this;
  }

   /**
   * Za období [persistentní položka]
   * @return forPeriod
  **/
  @ApiModelProperty(example = "null", value = "Za období [persistentní položka]")
  public Boolean getForPeriod() {
    return forPeriod;
  }

  public void setForPeriod(Boolean forPeriod) {
    this.forPeriod = forPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notrealizedexchangedifference notrealizedexchangedifference = (Notrealizedexchangedifference) o;
    return Objects.equals(this.displayName, notrealizedexchangedifference.displayName) &&
        Objects.equals(this.ID, notrealizedexchangedifference.ID) &&
        Objects.equals(this.classID, notrealizedexchangedifference.classID) &&
        Objects.equals(this.objVersion, notrealizedexchangedifference.objVersion) &&
        Objects.equals(this.docQueueID, notrealizedexchangedifference.docQueueID) &&
        Objects.equals(this.periodID, notrealizedexchangedifference.periodID) &&
        Objects.equals(this.ordNumber, notrealizedexchangedifference.ordNumber) &&
        Objects.equals(this.docDateDATE, notrealizedexchangedifference.docDateDATE) &&
        Objects.equals(this.createdByID, notrealizedexchangedifference.createdByID) &&
        Objects.equals(this.correctedByID, notrealizedexchangedifference.correctedByID) &&
        Objects.equals(this.newRelatedType, notrealizedexchangedifference.newRelatedType) &&
        Objects.equals(this.newRelatedDocumentID, notrealizedexchangedifference.newRelatedDocumentID) &&
        Objects.equals(this.accPresetDefID, notrealizedexchangedifference.accPresetDefID) &&
        Objects.equals(this.firmID, notrealizedexchangedifference.firmID) &&
        Objects.equals(this.firmOfficeID, notrealizedexchangedifference.firmOfficeID) &&
        Objects.equals(this.personID, notrealizedexchangedifference.personID) &&
        Objects.equals(this.description, notrealizedexchangedifference.description) &&
        Objects.equals(this.accDateDATE, notrealizedexchangedifference.accDateDATE) &&
        Objects.equals(this.accDocQueueID, notrealizedexchangedifference.accDocQueueID) &&
        Objects.equals(this.accountingType, notrealizedexchangedifference.accountingType) &&
        Objects.equals(this.isAccounted, notrealizedexchangedifference.isAccounted) &&
        Objects.equals(this.dirty, notrealizedexchangedifference.dirty) &&
        Objects.equals(this.amount, notrealizedexchangedifference.amount) &&
        Objects.equals(this.divisionID, notrealizedexchangedifference.divisionID) &&
        Objects.equals(this.busOrderID, notrealizedexchangedifference.busOrderID) &&
        Objects.equals(this.busTransactionID, notrealizedexchangedifference.busTransactionID) &&
        Objects.equals(this.profit, notrealizedexchangedifference.profit) &&
        Objects.equals(this.currencyID, notrealizedexchangedifference.currencyID) &&
        Objects.equals(this.countryID, notrealizedexchangedifference.countryID) &&
        Objects.equals(this.refCurrencyID, notrealizedexchangedifference.refCurrencyID) &&
        Objects.equals(this.localRefCurrencyID, notrealizedexchangedifference.localRefCurrencyID) &&
        Objects.equals(this.busProjectID, notrealizedexchangedifference.busProjectID) &&
        Objects.equals(this.pDocumentID, notrealizedexchangedifference.pDocumentID) &&
        Objects.equals(this.pDocumentType, notrealizedexchangedifference.pDocumentType) &&
        Objects.equals(this.currRate, notrealizedexchangedifference.currRate) &&
        Objects.equals(this.refCurrRate, notrealizedexchangedifference.refCurrRate) &&
        Objects.equals(this.coef, notrealizedexchangedifference.coef) &&
        Objects.equals(this.localCoef, notrealizedexchangedifference.localCoef) &&
        Objects.equals(this.zoneID, notrealizedexchangedifference.zoneID) &&
        Objects.equals(this.localZoneID, notrealizedexchangedifference.localZoneID) &&
        Objects.equals(this.currRateInfo, notrealizedexchangedifference.currRateInfo) &&
        Objects.equals(this.forPeriod, notrealizedexchangedifference.forPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, docQueueID, periodID, ordNumber, docDateDATE, createdByID, correctedByID, newRelatedType, newRelatedDocumentID, accPresetDefID, firmID, firmOfficeID, personID, description, accDateDATE, accDocQueueID, accountingType, isAccounted, dirty, amount, divisionID, busOrderID, busTransactionID, profit, currencyID, countryID, refCurrencyID, localRefCurrencyID, busProjectID, pDocumentID, pDocumentType, currRate, refCurrRate, coef, localCoef, zoneID, localZoneID, currRateInfo, forPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notrealizedexchangedifference {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
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
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    divisionID: ").append(toIndentedString(divisionID)).append("\n");
    sb.append("    busOrderID: ").append(toIndentedString(busOrderID)).append("\n");
    sb.append("    busTransactionID: ").append(toIndentedString(busTransactionID)).append("\n");
    sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
    sb.append("    currencyID: ").append(toIndentedString(currencyID)).append("\n");
    sb.append("    countryID: ").append(toIndentedString(countryID)).append("\n");
    sb.append("    refCurrencyID: ").append(toIndentedString(refCurrencyID)).append("\n");
    sb.append("    localRefCurrencyID: ").append(toIndentedString(localRefCurrencyID)).append("\n");
    sb.append("    busProjectID: ").append(toIndentedString(busProjectID)).append("\n");
    sb.append("    pDocumentID: ").append(toIndentedString(pDocumentID)).append("\n");
    sb.append("    pDocumentType: ").append(toIndentedString(pDocumentType)).append("\n");
    sb.append("    currRate: ").append(toIndentedString(currRate)).append("\n");
    sb.append("    refCurrRate: ").append(toIndentedString(refCurrRate)).append("\n");
    sb.append("    coef: ").append(toIndentedString(coef)).append("\n");
    sb.append("    localCoef: ").append(toIndentedString(localCoef)).append("\n");
    sb.append("    zoneID: ").append(toIndentedString(zoneID)).append("\n");
    sb.append("    localZoneID: ").append(toIndentedString(localZoneID)).append("\n");
    sb.append("    currRateInfo: ").append(toIndentedString(currRateInfo)).append("\n");
    sb.append("    forPeriod: ").append(toIndentedString(forPeriod)).append("\n");
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

