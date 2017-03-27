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
 * Compensationrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Compensationrow   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("PosIndex")
  private Integer posIndex = null;

  @SerializedName("Division_ID")
  private String divisionID = null;

  @SerializedName("BusOrder_ID")
  private String busOrderID = null;

  @SerializedName("BusTransaction_ID")
  private String busTransactionID = null;

  @SerializedName("Firm_ID")
  private String firmID = null;

  @SerializedName("Currency_ID")
  private String currencyID = null;

  @SerializedName("CurrRate")
  private Double currRate = null;

  @SerializedName("RefCurrRate")
  private Double refCurrRate = null;

  @SerializedName("Credit")
  private Boolean credit = null;

  @SerializedName("VarSymbol")
  private String varSymbol = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("TAmount")
  private Double tAmount = null;

  @SerializedName("LocalTAmount")
  private Double localTAmount = null;

  @SerializedName("DocDate$DATE")
  private DateTime docDateDATE = null;

  @SerializedName("PAmount")
  private Double pAmount = null;

  @SerializedName("PDocumentType")
  private String pDocumentType = null;

  @SerializedName("PDocument_ID")
  private String pDocumentID = null;

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

  @SerializedName("AccPresetDef_ID")
  private String accPresetDefID = null;

  @SerializedName("AccDate$DATE")
  private DateTime accDateDATE = null;

  @SerializedName("PDisKind")
  private Integer pDisKind = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("BusProject_ID")
  private String busProjectID = null;

  @SerializedName("CorrectionRow")
  private Boolean correctionRow = null;

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

   /**
   * Vlastník; ID objektu Vzájemný zápočet [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Vzájemný zápočet [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Compensationrow posIndex(Integer posIndex) {
    this.posIndex = posIndex;
    return this;
  }

   /**
   * Pořadí [persistentní položka]
   * @return posIndex
  **/
  @ApiModelProperty(example = "null", value = "Pořadí [persistentní položka]")
  public Integer getPosIndex() {
    return posIndex;
  }

  public void setPosIndex(Integer posIndex) {
    this.posIndex = posIndex;
  }

  public Compensationrow divisionID(String divisionID) {
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

  public Compensationrow busOrderID(String busOrderID) {
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

  public Compensationrow busTransactionID(String busTransactionID) {
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

  public Compensationrow firmID(String firmID) {
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

  public Compensationrow currencyID(String currencyID) {
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

  public Compensationrow currRate(Double currRate) {
    this.currRate = currRate;
    return this;
  }

   /**
   * Kurz [persistentní položka]
   * @return currRate
  **/
  @ApiModelProperty(example = "null", value = "Kurz [persistentní položka]")
  public Double getCurrRate() {
    return currRate;
  }

  public void setCurrRate(Double currRate) {
    this.currRate = currRate;
  }

  public Compensationrow refCurrRate(Double refCurrRate) {
    this.refCurrRate = refCurrRate;
    return this;
  }

   /**
   * Vztažný [persistentní položka]
   * @return refCurrRate
  **/
  @ApiModelProperty(example = "null", value = "Vztažný [persistentní položka]")
  public Double getRefCurrRate() {
    return refCurrRate;
  }

  public void setRefCurrRate(Double refCurrRate) {
    this.refCurrRate = refCurrRate;
  }

  public Compensationrow credit(Boolean credit) {
    this.credit = credit;
    return this;
  }

   /**
   * Kredit [persistentní položka]
   * @return credit
  **/
  @ApiModelProperty(example = "null", value = "Kredit [persistentní položka]")
  public Boolean getCredit() {
    return credit;
  }

  public void setCredit(Boolean credit) {
    this.credit = credit;
  }

  public Compensationrow varSymbol(String varSymbol) {
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

  public Compensationrow amount(Double amount) {
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

   /**
   * Celkem [persistentní položka]
   * @return tAmount
  **/
  @ApiModelProperty(example = "null", value = "Celkem [persistentní položka]")
  public Double getTAmount() {
    return tAmount;
  }

   /**
   * Celkem lokální [persistentní položka]
   * @return localTAmount
  **/
  @ApiModelProperty(example = "null", value = "Celkem lokální [persistentní položka]")
  public Double getLocalTAmount() {
    return localTAmount;
  }

  public Compensationrow docDateDATE(DateTime docDateDATE) {
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

  public Compensationrow pAmount(Double pAmount) {
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

  public Compensationrow pDocumentType(String pDocumentType) {
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

  public Compensationrow pDocumentID(String pDocumentID) {
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

  public Compensationrow coef(Integer coef) {
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

  public Compensationrow localCoef(Integer localCoef) {
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

  public Compensationrow zoneID(String zoneID) {
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

  public Compensationrow localZoneID(String localZoneID) {
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

  public Compensationrow accPresetDefID(String accPresetDefID) {
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

  public Compensationrow accDateDATE(DateTime accDateDATE) {
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

  public Compensationrow pDisKind(Integer pDisKind) {
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

  public Compensationrow text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text [persistentní položka]
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "Text [persistentní položka]")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Compensationrow busProjectID(String busProjectID) {
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

  public Compensationrow correctionRow(Boolean correctionRow) {
    this.correctionRow = correctionRow;
    return this;
  }

   /**
   * Korekční řádek [persistentní položka]
   * @return correctionRow
  **/
  @ApiModelProperty(example = "null", value = "Korekční řádek [persistentní položka]")
  public Boolean getCorrectionRow() {
    return correctionRow;
  }

  public void setCorrectionRow(Boolean correctionRow) {
    this.correctionRow = correctionRow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Compensationrow compensationrow = (Compensationrow) o;
    return Objects.equals(this.displayName, compensationrow.displayName) &&
        Objects.equals(this.ID, compensationrow.ID) &&
        Objects.equals(this.classID, compensationrow.classID) &&
        Objects.equals(this.objVersion, compensationrow.objVersion) &&
        Objects.equals(this.parentID, compensationrow.parentID) &&
        Objects.equals(this.posIndex, compensationrow.posIndex) &&
        Objects.equals(this.divisionID, compensationrow.divisionID) &&
        Objects.equals(this.busOrderID, compensationrow.busOrderID) &&
        Objects.equals(this.busTransactionID, compensationrow.busTransactionID) &&
        Objects.equals(this.firmID, compensationrow.firmID) &&
        Objects.equals(this.currencyID, compensationrow.currencyID) &&
        Objects.equals(this.currRate, compensationrow.currRate) &&
        Objects.equals(this.refCurrRate, compensationrow.refCurrRate) &&
        Objects.equals(this.credit, compensationrow.credit) &&
        Objects.equals(this.varSymbol, compensationrow.varSymbol) &&
        Objects.equals(this.amount, compensationrow.amount) &&
        Objects.equals(this.tAmount, compensationrow.tAmount) &&
        Objects.equals(this.localTAmount, compensationrow.localTAmount) &&
        Objects.equals(this.docDateDATE, compensationrow.docDateDATE) &&
        Objects.equals(this.pAmount, compensationrow.pAmount) &&
        Objects.equals(this.pDocumentType, compensationrow.pDocumentType) &&
        Objects.equals(this.pDocumentID, compensationrow.pDocumentID) &&
        Objects.equals(this.coef, compensationrow.coef) &&
        Objects.equals(this.localCoef, compensationrow.localCoef) &&
        Objects.equals(this.zoneID, compensationrow.zoneID) &&
        Objects.equals(this.localZoneID, compensationrow.localZoneID) &&
        Objects.equals(this.refCurrencyID, compensationrow.refCurrencyID) &&
        Objects.equals(this.localRefCurrencyID, compensationrow.localRefCurrencyID) &&
        Objects.equals(this.accPresetDefID, compensationrow.accPresetDefID) &&
        Objects.equals(this.accDateDATE, compensationrow.accDateDATE) &&
        Objects.equals(this.pDisKind, compensationrow.pDisKind) &&
        Objects.equals(this.text, compensationrow.text) &&
        Objects.equals(this.busProjectID, compensationrow.busProjectID) &&
        Objects.equals(this.correctionRow, compensationrow.correctionRow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, divisionID, busOrderID, busTransactionID, firmID, currencyID, currRate, refCurrRate, credit, varSymbol, amount, tAmount, localTAmount, docDateDATE, pAmount, pDocumentType, pDocumentID, coef, localCoef, zoneID, localZoneID, refCurrencyID, localRefCurrencyID, accPresetDefID, accDateDATE, pDisKind, text, busProjectID, correctionRow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compensationrow {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    divisionID: ").append(toIndentedString(divisionID)).append("\n");
    sb.append("    busOrderID: ").append(toIndentedString(busOrderID)).append("\n");
    sb.append("    busTransactionID: ").append(toIndentedString(busTransactionID)).append("\n");
    sb.append("    firmID: ").append(toIndentedString(firmID)).append("\n");
    sb.append("    currencyID: ").append(toIndentedString(currencyID)).append("\n");
    sb.append("    currRate: ").append(toIndentedString(currRate)).append("\n");
    sb.append("    refCurrRate: ").append(toIndentedString(refCurrRate)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    varSymbol: ").append(toIndentedString(varSymbol)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tAmount: ").append(toIndentedString(tAmount)).append("\n");
    sb.append("    localTAmount: ").append(toIndentedString(localTAmount)).append("\n");
    sb.append("    docDateDATE: ").append(toIndentedString(docDateDATE)).append("\n");
    sb.append("    pAmount: ").append(toIndentedString(pAmount)).append("\n");
    sb.append("    pDocumentType: ").append(toIndentedString(pDocumentType)).append("\n");
    sb.append("    pDocumentID: ").append(toIndentedString(pDocumentID)).append("\n");
    sb.append("    coef: ").append(toIndentedString(coef)).append("\n");
    sb.append("    localCoef: ").append(toIndentedString(localCoef)).append("\n");
    sb.append("    zoneID: ").append(toIndentedString(zoneID)).append("\n");
    sb.append("    localZoneID: ").append(toIndentedString(localZoneID)).append("\n");
    sb.append("    refCurrencyID: ").append(toIndentedString(refCurrencyID)).append("\n");
    sb.append("    localRefCurrencyID: ").append(toIndentedString(localRefCurrencyID)).append("\n");
    sb.append("    accPresetDefID: ").append(toIndentedString(accPresetDefID)).append("\n");
    sb.append("    accDateDATE: ").append(toIndentedString(accDateDATE)).append("\n");
    sb.append("    pDisKind: ").append(toIndentedString(pDisKind)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    busProjectID: ").append(toIndentedString(busProjectID)).append("\n");
    sb.append("    correctionRow: ").append(toIndentedString(correctionRow)).append("\n");
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

