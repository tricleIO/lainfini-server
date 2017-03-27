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
 * Customassetdocument
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Customassetdocument   {
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

  @SerializedName("AssetCard_Type")
  private Integer assetCardType = null;

  @SerializedName("AssetCard_ID")
  private String assetCardID = null;

  @SerializedName("TaxBasePriceAmount")
  private Double taxBasePriceAmount = null;

  @SerializedName("AccBasePriceAmount")
  private Double accBasePriceAmount = null;

  @SerializedName("TaxRemainderPriceAmount")
  private Double taxRemainderPriceAmount = null;

  @SerializedName("AccRemainderPriceAmount")
  private Double accRemainderPriceAmount = null;

  @SerializedName("Division_ID")
  private String divisionID = null;

  @SerializedName("BusOrder_ID")
  private String busOrderID = null;

  @SerializedName("BusTransaction_ID")
  private String busTransactionID = null;

  @SerializedName("BusProject_ID")
  private String busProjectID = null;

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

  public Customassetdocument docQueueID(String docQueueID) {
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

  public Customassetdocument periodID(String periodID) {
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

  public Customassetdocument ordNumber(Integer ordNumber) {
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

  public Customassetdocument docDateDATE(DateTime docDateDATE) {
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

  public Customassetdocument createdByID(String createdByID) {
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

  public Customassetdocument correctedByID(String correctedByID) {
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

  public Customassetdocument newRelatedType(Integer newRelatedType) {
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

  public Customassetdocument newRelatedDocumentID(String newRelatedDocumentID) {
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

  public Customassetdocument accPresetDefID(String accPresetDefID) {
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

  public Customassetdocument description(String description) {
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

  public Customassetdocument accDateDATE(DateTime accDateDATE) {
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

  public Customassetdocument accDocQueueID(String accDocQueueID) {
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

  public Customassetdocument accountingType(Integer accountingType) {
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

  public Customassetdocument isAccounted(Boolean isAccounted) {
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

  public Customassetdocument dirty(Boolean dirty) {
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

  public Customassetdocument assetCardType(Integer assetCardType) {
    this.assetCardType = assetCardType;
    return this;
  }

   /**
   * Typ karty
   * @return assetCardType
  **/
  @ApiModelProperty(example = "null", value = "Typ karty")
  public Integer getAssetCardType() {
    return assetCardType;
  }

  public void setAssetCardType(Integer assetCardType) {
    this.assetCardType = assetCardType;
  }

  public Customassetdocument assetCardID(String assetCardID) {
    this.assetCardID = assetCardID;
    return this;
  }

   /**
   * Karta majetku; ID objektu Karta majetku [persistentní položka]
   * @return assetCardID
  **/
  @ApiModelProperty(example = "null", value = "Karta majetku; ID objektu Karta majetku [persistentní položka]")
  public String getAssetCardID() {
    return assetCardID;
  }

  public void setAssetCardID(String assetCardID) {
    this.assetCardID = assetCardID;
  }

  public Customassetdocument taxBasePriceAmount(Double taxBasePriceAmount) {
    this.taxBasePriceAmount = taxBasePriceAmount;
    return this;
  }

   /**
   * Daň.vstup.cena [persistentní položka]
   * @return taxBasePriceAmount
  **/
  @ApiModelProperty(example = "null", value = "Daň.vstup.cena [persistentní položka]")
  public Double getTaxBasePriceAmount() {
    return taxBasePriceAmount;
  }

  public void setTaxBasePriceAmount(Double taxBasePriceAmount) {
    this.taxBasePriceAmount = taxBasePriceAmount;
  }

  public Customassetdocument accBasePriceAmount(Double accBasePriceAmount) {
    this.accBasePriceAmount = accBasePriceAmount;
    return this;
  }

   /**
   * Účet.vstup.cena [persistentní položka]
   * @return accBasePriceAmount
  **/
  @ApiModelProperty(example = "null", value = "Účet.vstup.cena [persistentní položka]")
  public Double getAccBasePriceAmount() {
    return accBasePriceAmount;
  }

  public void setAccBasePriceAmount(Double accBasePriceAmount) {
    this.accBasePriceAmount = accBasePriceAmount;
  }

  public Customassetdocument taxRemainderPriceAmount(Double taxRemainderPriceAmount) {
    this.taxRemainderPriceAmount = taxRemainderPriceAmount;
    return this;
  }

   /**
   * Daň.zůst.cena [persistentní položka]
   * @return taxRemainderPriceAmount
  **/
  @ApiModelProperty(example = "null", value = "Daň.zůst.cena [persistentní položka]")
  public Double getTaxRemainderPriceAmount() {
    return taxRemainderPriceAmount;
  }

  public void setTaxRemainderPriceAmount(Double taxRemainderPriceAmount) {
    this.taxRemainderPriceAmount = taxRemainderPriceAmount;
  }

  public Customassetdocument accRemainderPriceAmount(Double accRemainderPriceAmount) {
    this.accRemainderPriceAmount = accRemainderPriceAmount;
    return this;
  }

   /**
   * Účet.zůst.cena [persistentní položka]
   * @return accRemainderPriceAmount
  **/
  @ApiModelProperty(example = "null", value = "Účet.zůst.cena [persistentní položka]")
  public Double getAccRemainderPriceAmount() {
    return accRemainderPriceAmount;
  }

  public void setAccRemainderPriceAmount(Double accRemainderPriceAmount) {
    this.accRemainderPriceAmount = accRemainderPriceAmount;
  }

  public Customassetdocument divisionID(String divisionID) {
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

  public Customassetdocument busOrderID(String busOrderID) {
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

  public Customassetdocument busTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
    return this;
  }

   /**
   * Obch.případ; ID objektu Obchodní případ [persistentní položka]
   * @return busTransactionID
  **/
  @ApiModelProperty(example = "null", value = "Obch.případ; ID objektu Obchodní případ [persistentní položka]")
  public String getBusTransactionID() {
    return busTransactionID;
  }

  public void setBusTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
  }

  public Customassetdocument busProjectID(String busProjectID) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customassetdocument customassetdocument = (Customassetdocument) o;
    return Objects.equals(this.displayName, customassetdocument.displayName) &&
        Objects.equals(this.ID, customassetdocument.ID) &&
        Objects.equals(this.classID, customassetdocument.classID) &&
        Objects.equals(this.objVersion, customassetdocument.objVersion) &&
        Objects.equals(this.docQueueID, customassetdocument.docQueueID) &&
        Objects.equals(this.periodID, customassetdocument.periodID) &&
        Objects.equals(this.ordNumber, customassetdocument.ordNumber) &&
        Objects.equals(this.docDateDATE, customassetdocument.docDateDATE) &&
        Objects.equals(this.createdByID, customassetdocument.createdByID) &&
        Objects.equals(this.correctedByID, customassetdocument.correctedByID) &&
        Objects.equals(this.newRelatedType, customassetdocument.newRelatedType) &&
        Objects.equals(this.newRelatedDocumentID, customassetdocument.newRelatedDocumentID) &&
        Objects.equals(this.accPresetDefID, customassetdocument.accPresetDefID) &&
        Objects.equals(this.description, customassetdocument.description) &&
        Objects.equals(this.accDateDATE, customassetdocument.accDateDATE) &&
        Objects.equals(this.accDocQueueID, customassetdocument.accDocQueueID) &&
        Objects.equals(this.accountingType, customassetdocument.accountingType) &&
        Objects.equals(this.isAccounted, customassetdocument.isAccounted) &&
        Objects.equals(this.dirty, customassetdocument.dirty) &&
        Objects.equals(this.assetCardType, customassetdocument.assetCardType) &&
        Objects.equals(this.assetCardID, customassetdocument.assetCardID) &&
        Objects.equals(this.taxBasePriceAmount, customassetdocument.taxBasePriceAmount) &&
        Objects.equals(this.accBasePriceAmount, customassetdocument.accBasePriceAmount) &&
        Objects.equals(this.taxRemainderPriceAmount, customassetdocument.taxRemainderPriceAmount) &&
        Objects.equals(this.accRemainderPriceAmount, customassetdocument.accRemainderPriceAmount) &&
        Objects.equals(this.divisionID, customassetdocument.divisionID) &&
        Objects.equals(this.busOrderID, customassetdocument.busOrderID) &&
        Objects.equals(this.busTransactionID, customassetdocument.busTransactionID) &&
        Objects.equals(this.busProjectID, customassetdocument.busProjectID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, docQueueID, periodID, ordNumber, docDateDATE, createdByID, correctedByID, newRelatedType, newRelatedDocumentID, accPresetDefID, description, accDateDATE, accDocQueueID, accountingType, isAccounted, dirty, assetCardType, assetCardID, taxBasePriceAmount, accBasePriceAmount, taxRemainderPriceAmount, accRemainderPriceAmount, divisionID, busOrderID, busTransactionID, busProjectID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customassetdocument {\n");
    
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
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accDateDATE: ").append(toIndentedString(accDateDATE)).append("\n");
    sb.append("    accDocQueueID: ").append(toIndentedString(accDocQueueID)).append("\n");
    sb.append("    accountingType: ").append(toIndentedString(accountingType)).append("\n");
    sb.append("    isAccounted: ").append(toIndentedString(isAccounted)).append("\n");
    sb.append("    dirty: ").append(toIndentedString(dirty)).append("\n");
    sb.append("    assetCardType: ").append(toIndentedString(assetCardType)).append("\n");
    sb.append("    assetCardID: ").append(toIndentedString(assetCardID)).append("\n");
    sb.append("    taxBasePriceAmount: ").append(toIndentedString(taxBasePriceAmount)).append("\n");
    sb.append("    accBasePriceAmount: ").append(toIndentedString(accBasePriceAmount)).append("\n");
    sb.append("    taxRemainderPriceAmount: ").append(toIndentedString(taxRemainderPriceAmount)).append("\n");
    sb.append("    accRemainderPriceAmount: ").append(toIndentedString(accRemainderPriceAmount)).append("\n");
    sb.append("    divisionID: ").append(toIndentedString(divisionID)).append("\n");
    sb.append("    busOrderID: ").append(toIndentedString(busOrderID)).append("\n");
    sb.append("    busTransactionID: ").append(toIndentedString(busTransactionID)).append("\n");
    sb.append("    busProjectID: ").append(toIndentedString(busProjectID)).append("\n");
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

