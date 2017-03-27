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
 * Issueddemandrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Issueddemandrow   {
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

  @SerializedName("RowType")
  private Integer rowType = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("Store_ID")
  private String storeID = null;

  @SerializedName("UnitPrice")
  private Double unitPrice = null;

  @SerializedName("TotalPrice")
  private Double totalPrice = null;

  @SerializedName("TAmount")
  private Double tAmount = null;

  @SerializedName("LocalTAmount")
  private Double localTAmount = null;

  @SerializedName("LocalUAmount")
  private Double localUAmount = null;

  @SerializedName("LocalOtherCostsRatio")
  private Double localOtherCostsRatio = null;

  @SerializedName("RequestedDeliveryDate$DATE")
  private DateTime requestedDeliveryDateDATE = null;

  @SerializedName("SupplyDate$DATE")
  private DateTime supplyDateDATE = null;

  @SerializedName("SupplyConditions")
  private String supplyConditions = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  @SerializedName("UnitQuantity")
  private Double unitQuantity = null;

  @SerializedName("QUnit")
  private String qUnit = null;

  @SerializedName("UnitRate")
  private Double unitRate = null;

  @SerializedName("DemandSheet_ID")
  private String demandSheetID = null;

  @SerializedName("DemandSheetDisplayName")
  private String demandSheetDisplayName = null;

   /**
   * Název
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Název")
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
   * Vlastník; ID objektu Poptávka vydaná [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Poptávka vydaná [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Issueddemandrow posIndex(Integer posIndex) {
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

  public Issueddemandrow rowType(Integer rowType) {
    this.rowType = rowType;
    return this;
  }

   /**
   * Typ řádku [persistentní položka]
   * @return rowType
  **/
  @ApiModelProperty(example = "null", value = "Typ řádku [persistentní položka]")
  public Integer getRowType() {
    return rowType;
  }

  public void setRowType(Integer rowType) {
    this.rowType = rowType;
  }

  public Issueddemandrow text(String text) {
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

  public Issueddemandrow storeCardID(String storeCardID) {
    this.storeCardID = storeCardID;
    return this;
  }

   /**
   * Skladová karta; ID objektu Skladová karta [persistentní položka]
   * @return storeCardID
  **/
  @ApiModelProperty(example = "null", value = "Skladová karta; ID objektu Skladová karta [persistentní položka]")
  public String getStoreCardID() {
    return storeCardID;
  }

  public void setStoreCardID(String storeCardID) {
    this.storeCardID = storeCardID;
  }

  public Issueddemandrow storeID(String storeID) {
    this.storeID = storeID;
    return this;
  }

   /**
   * Sklad; ID objektu Sklad [persistentní položka]
   * @return storeID
  **/
  @ApiModelProperty(example = "null", value = "Sklad; ID objektu Sklad [persistentní položka]")
  public String getStoreID() {
    return storeID;
  }

  public void setStoreID(String storeID) {
    this.storeID = storeID;
  }

  public Issueddemandrow unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Nabídnutá jednotková cena v měně dokladu [persistentní položka]
   * @return unitPrice
  **/
  @ApiModelProperty(example = "null", value = "Nabídnutá jednotková cena v měně dokladu [persistentní položka]")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Issueddemandrow totalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Nabídnutá celková cena v měně dokladu [persistentní položka]
   * @return totalPrice
  **/
  @ApiModelProperty(example = "null", value = "Nabídnutá celková cena v měně dokladu [persistentní položka]")
  public Double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public Issueddemandrow tAmount(Double tAmount) {
    this.tAmount = tAmount;
    return this;
  }

   /**
   * Nabídnutá celková cena v měně dokladu [persistentní položka]
   * @return tAmount
  **/
  @ApiModelProperty(example = "null", value = "Nabídnutá celková cena v měně dokladu [persistentní položka]")
  public Double getTAmount() {
    return tAmount;
  }

  public void setTAmount(Double tAmount) {
    this.tAmount = tAmount;
  }

   /**
   * Nabídnutá celková cena v lok.měně [persistentní položka]
   * @return localTAmount
  **/
  @ApiModelProperty(example = "null", value = "Nabídnutá celková cena v lok.měně [persistentní položka]")
  public Double getLocalTAmount() {
    return localTAmount;
  }

  public Issueddemandrow localUAmount(Double localUAmount) {
    this.localUAmount = localUAmount;
    return this;
  }

   /**
   * Nabídnutá jednotková cena v lok.měně
   * @return localUAmount
  **/
  @ApiModelProperty(example = "null", value = "Nabídnutá jednotková cena v lok.měně")
  public Double getLocalUAmount() {
    return localUAmount;
  }

  public void setLocalUAmount(Double localUAmount) {
    this.localUAmount = localUAmount;
  }

  public Issueddemandrow localOtherCostsRatio(Double localOtherCostsRatio) {
    this.localOtherCostsRatio = localOtherCostsRatio;
    return this;
  }

   /**
   * Poměrná část ostatních výdajů [persistentní položka]
   * @return localOtherCostsRatio
  **/
  @ApiModelProperty(example = "null", value = "Poměrná část ostatních výdajů [persistentní položka]")
  public Double getLocalOtherCostsRatio() {
    return localOtherCostsRatio;
  }

  public void setLocalOtherCostsRatio(Double localOtherCostsRatio) {
    this.localOtherCostsRatio = localOtherCostsRatio;
  }

  public Issueddemandrow requestedDeliveryDateDATE(DateTime requestedDeliveryDateDATE) {
    this.requestedDeliveryDateDATE = requestedDeliveryDateDATE;
    return this;
  }

   /**
   * Požadovaný termín dodání [persistentní položka]
   * @return requestedDeliveryDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Požadovaný termín dodání [persistentní položka]")
  public DateTime getRequestedDeliveryDateDATE() {
    return requestedDeliveryDateDATE;
  }

  public void setRequestedDeliveryDateDATE(DateTime requestedDeliveryDateDATE) {
    this.requestedDeliveryDateDATE = requestedDeliveryDateDATE;
  }

  public Issueddemandrow supplyDateDATE(DateTime supplyDateDATE) {
    this.supplyDateDATE = supplyDateDATE;
    return this;
  }

   /**
   * Termín možného dodání [persistentní položka]
   * @return supplyDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Termín možného dodání [persistentní položka]")
  public DateTime getSupplyDateDATE() {
    return supplyDateDATE;
  }

  public void setSupplyDateDATE(DateTime supplyDateDATE) {
    this.supplyDateDATE = supplyDateDATE;
  }

  public Issueddemandrow supplyConditions(String supplyConditions) {
    this.supplyConditions = supplyConditions;
    return this;
  }

   /**
   * Dodací podmínky [persistentní položka]
   * @return supplyConditions
  **/
  @ApiModelProperty(example = "null", value = "Dodací podmínky [persistentní položka]")
  public String getSupplyConditions() {
    return supplyConditions;
  }

  public void setSupplyConditions(String supplyConditions) {
    this.supplyConditions = supplyConditions;
  }

  public Issueddemandrow quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Potvrzený počet [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "Potvrzený počet [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Issueddemandrow unitQuantity(Double unitQuantity) {
    this.unitQuantity = unitQuantity;
    return this;
  }

   /**
   * Potvrzený počet
   * @return unitQuantity
  **/
  @ApiModelProperty(example = "null", value = "Potvrzený počet")
  public Double getUnitQuantity() {
    return unitQuantity;
  }

  public void setUnitQuantity(Double unitQuantity) {
    this.unitQuantity = unitQuantity;
  }

  public Issueddemandrow qUnit(String qUnit) {
    this.qUnit = qUnit;
    return this;
  }

   /**
   * Jednotka [persistentní položka]
   * @return qUnit
  **/
  @ApiModelProperty(example = "null", value = "Jednotka [persistentní položka]")
  public String getQUnit() {
    return qUnit;
  }

  public void setQUnit(String qUnit) {
    this.qUnit = qUnit;
  }

  public Issueddemandrow unitRate(Double unitRate) {
    this.unitRate = unitRate;
    return this;
  }

   /**
   * Vztah [persistentní položka]
   * @return unitRate
  **/
  @ApiModelProperty(example = "null", value = "Vztah [persistentní položka]")
  public Double getUnitRate() {
    return unitRate;
  }

  public void setUnitRate(Double unitRate) {
    this.unitRate = unitRate;
  }

  public Issueddemandrow demandSheetID(String demandSheetID) {
    this.demandSheetID = demandSheetID;
    return this;
  }

   /**
   * Poptávkový list
   * @return demandSheetID
  **/
  @ApiModelProperty(example = "null", value = "Poptávkový list")
  public String getDemandSheetID() {
    return demandSheetID;
  }

  public void setDemandSheetID(String demandSheetID) {
    this.demandSheetID = demandSheetID;
  }

  public Issueddemandrow demandSheetDisplayName(String demandSheetDisplayName) {
    this.demandSheetDisplayName = demandSheetDisplayName;
    return this;
  }

   /**
   * Poptávkový list ID
   * @return demandSheetDisplayName
  **/
  @ApiModelProperty(example = "null", value = "Poptávkový list ID")
  public String getDemandSheetDisplayName() {
    return demandSheetDisplayName;
  }

  public void setDemandSheetDisplayName(String demandSheetDisplayName) {
    this.demandSheetDisplayName = demandSheetDisplayName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issueddemandrow issueddemandrow = (Issueddemandrow) o;
    return Objects.equals(this.displayName, issueddemandrow.displayName) &&
        Objects.equals(this.ID, issueddemandrow.ID) &&
        Objects.equals(this.classID, issueddemandrow.classID) &&
        Objects.equals(this.objVersion, issueddemandrow.objVersion) &&
        Objects.equals(this.parentID, issueddemandrow.parentID) &&
        Objects.equals(this.posIndex, issueddemandrow.posIndex) &&
        Objects.equals(this.rowType, issueddemandrow.rowType) &&
        Objects.equals(this.text, issueddemandrow.text) &&
        Objects.equals(this.storeCardID, issueddemandrow.storeCardID) &&
        Objects.equals(this.storeID, issueddemandrow.storeID) &&
        Objects.equals(this.unitPrice, issueddemandrow.unitPrice) &&
        Objects.equals(this.totalPrice, issueddemandrow.totalPrice) &&
        Objects.equals(this.tAmount, issueddemandrow.tAmount) &&
        Objects.equals(this.localTAmount, issueddemandrow.localTAmount) &&
        Objects.equals(this.localUAmount, issueddemandrow.localUAmount) &&
        Objects.equals(this.localOtherCostsRatio, issueddemandrow.localOtherCostsRatio) &&
        Objects.equals(this.requestedDeliveryDateDATE, issueddemandrow.requestedDeliveryDateDATE) &&
        Objects.equals(this.supplyDateDATE, issueddemandrow.supplyDateDATE) &&
        Objects.equals(this.supplyConditions, issueddemandrow.supplyConditions) &&
        Objects.equals(this.quantity, issueddemandrow.quantity) &&
        Objects.equals(this.unitQuantity, issueddemandrow.unitQuantity) &&
        Objects.equals(this.qUnit, issueddemandrow.qUnit) &&
        Objects.equals(this.unitRate, issueddemandrow.unitRate) &&
        Objects.equals(this.demandSheetID, issueddemandrow.demandSheetID) &&
        Objects.equals(this.demandSheetDisplayName, issueddemandrow.demandSheetDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, rowType, text, storeCardID, storeID, unitPrice, totalPrice, tAmount, localTAmount, localUAmount, localOtherCostsRatio, requestedDeliveryDateDATE, supplyDateDATE, supplyConditions, quantity, unitQuantity, qUnit, unitRate, demandSheetID, demandSheetDisplayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issueddemandrow {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    storeID: ").append(toIndentedString(storeID)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    tAmount: ").append(toIndentedString(tAmount)).append("\n");
    sb.append("    localTAmount: ").append(toIndentedString(localTAmount)).append("\n");
    sb.append("    localUAmount: ").append(toIndentedString(localUAmount)).append("\n");
    sb.append("    localOtherCostsRatio: ").append(toIndentedString(localOtherCostsRatio)).append("\n");
    sb.append("    requestedDeliveryDateDATE: ").append(toIndentedString(requestedDeliveryDateDATE)).append("\n");
    sb.append("    supplyDateDATE: ").append(toIndentedString(supplyDateDATE)).append("\n");
    sb.append("    supplyConditions: ").append(toIndentedString(supplyConditions)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitQuantity: ").append(toIndentedString(unitQuantity)).append("\n");
    sb.append("    qUnit: ").append(toIndentedString(qUnit)).append("\n");
    sb.append("    unitRate: ").append(toIndentedString(unitRate)).append("\n");
    sb.append("    demandSheetID: ").append(toIndentedString(demandSheetID)).append("\n");
    sb.append("    demandSheetDisplayName: ").append(toIndentedString(demandSheetDisplayName)).append("\n");
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

