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

import java.util.Objects;


/**
 * Logstoredocumentrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Logstoredocumentrow   {
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

  @SerializedName("Store_ID")
  private String storeID = null;

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("StoreBatch_ID")
  private String storeBatchID = null;

  @SerializedName("StoreDocRow_ID")
  private String storeDocRowID = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  @SerializedName("QUnit")
  private String qUnit = null;

  @SerializedName("UnitRate")
  private Double unitRate = null;

  @SerializedName("StorePosition_ID")
  private String storePositionID = null;

  @SerializedName("RestQuantity")
  private Double restQuantity = null;

  @SerializedName("UnitRestQuantity")
  private Double unitRestQuantity = null;

  @SerializedName("InPositionQuantity")
  private Double inPositionQuantity = null;

  @SerializedName("MasterRow_ID")
  private String masterRowID = null;

  @SerializedName("SortKey")
  private String sortKey = null;

  @SerializedName("ContentUnit")
  private String contentUnit = null;

  @SerializedName("ContentUnitRate")
  private Double contentUnitRate = null;

  @SerializedName("OrderFlow")
  private Integer orderFlow = null;

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
   * Vlastník; ID objektu Polohovací doklad [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Polohovací doklad [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Logstoredocumentrow posIndex(Integer posIndex) {
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

  public Logstoredocumentrow storeID(String storeID) {
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

  public Logstoredocumentrow storeCardID(String storeCardID) {
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

  public Logstoredocumentrow storeBatchID(String storeBatchID) {
    this.storeBatchID = storeBatchID;
    return this;
  }

   /**
   * Sériové číslo/šarže; ID objektu Šarže/sériové číslo [persistentní položka]
   * @return storeBatchID
  **/
  @ApiModelProperty(example = "null", value = "Sériové číslo/šarže; ID objektu Šarže/sériové číslo [persistentní položka]")
  public String getStoreBatchID() {
    return storeBatchID;
  }

  public void setStoreBatchID(String storeBatchID) {
    this.storeBatchID = storeBatchID;
  }

  public Logstoredocumentrow storeDocRowID(String storeDocRowID) {
    this.storeDocRowID = storeDocRowID;
    return this;
  }

   /**
   * Odkaz na skladový řádek [persistentní položka]
   * @return storeDocRowID
  **/
  @ApiModelProperty(example = "null", value = "Odkaz na skladový řádek [persistentní položka]")
  public String getStoreDocRowID() {
    return storeDocRowID;
  }

  public void setStoreDocRowID(String storeDocRowID) {
    this.storeDocRowID = storeDocRowID;
  }

  public Logstoredocumentrow quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Počet v ev.jedn. [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "Počet v ev.jedn. [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Logstoredocumentrow qUnit(String qUnit) {
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

  public Logstoredocumentrow unitRate(Double unitRate) {
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

  public Logstoredocumentrow storePositionID(String storePositionID) {
    this.storePositionID = storePositionID;
    return this;
  }

   /**
   * Skladová pozice; ID objektu Skladová pozice [persistentní položka]
   * @return storePositionID
  **/
  @ApiModelProperty(example = "null", value = "Skladová pozice; ID objektu Skladová pozice [persistentní položka]")
  public String getStorePositionID() {
    return storePositionID;
  }

  public void setStorePositionID(String storePositionID) {
    this.storePositionID = storePositionID;
  }

  public Logstoredocumentrow restQuantity(Double restQuantity) {
    this.restQuantity = restQuantity;
    return this;
  }

   /**
   * Zbývá
   * @return restQuantity
  **/
  @ApiModelProperty(example = "null", value = "Zbývá")
  public Double getRestQuantity() {
    return restQuantity;
  }

  public void setRestQuantity(Double restQuantity) {
    this.restQuantity = restQuantity;
  }

  public Logstoredocumentrow unitRestQuantity(Double unitRestQuantity) {
    this.unitRestQuantity = unitRestQuantity;
    return this;
  }

   /**
   * Zbývá v ev.jedn.
   * @return unitRestQuantity
  **/
  @ApiModelProperty(example = "null", value = "Zbývá v ev.jedn.")
  public Double getUnitRestQuantity() {
    return unitRestQuantity;
  }

  public void setUnitRestQuantity(Double unitRestQuantity) {
    this.unitRestQuantity = unitRestQuantity;
  }

  public Logstoredocumentrow inPositionQuantity(Double inPositionQuantity) {
    this.inPositionQuantity = inPositionQuantity;
    return this;
  }

   /**
   * V pozici
   * @return inPositionQuantity
  **/
  @ApiModelProperty(example = "null", value = "V pozici")
  public Double getInPositionQuantity() {
    return inPositionQuantity;
  }

  public void setInPositionQuantity(Double inPositionQuantity) {
    this.inPositionQuantity = inPositionQuantity;
  }

  public Logstoredocumentrow masterRowID(String masterRowID) {
    this.masterRowID = masterRowID;
    return this;
  }

   /**
   * Řádek se zdroj. pozicí [persistentní položka]
   * @return masterRowID
  **/
  @ApiModelProperty(example = "null", value = "Řádek se zdroj. pozicí [persistentní položka]")
  public String getMasterRowID() {
    return masterRowID;
  }

  public void setMasterRowID(String masterRowID) {
    this.masterRowID = masterRowID;
  }

  public Logstoredocumentrow sortKey(String sortKey) {
    this.sortKey = sortKey;
    return this;
  }

   /**
   * Klíč
   * @return sortKey
  **/
  @ApiModelProperty(example = "null", value = "Klíč")
  public String getSortKey() {
    return sortKey;
  }

  public void setSortKey(String sortKey) {
    this.sortKey = sortKey;
  }

   /**
   * Jednotka obsahu pozice [persistentní položka]
   * @return contentUnit
  **/
  @ApiModelProperty(example = "null", value = "Jednotka obsahu pozice [persistentní položka]")
  public String getContentUnit() {
    return contentUnit;
  }

   /**
   * Vztah jednotky obsahu pozice [persistentní položka]
   * @return contentUnitRate
  **/
  @ApiModelProperty(example = "null", value = "Vztah jednotky obsahu pozice [persistentní položka]")
  public Double getContentUnitRate() {
    return contentUnitRate;
  }

   /**
   * Pořadové číslo pohybu [persistentní položka]
   * @return orderFlow
  **/
  @ApiModelProperty(example = "null", value = "Pořadové číslo pohybu [persistentní položka]")
  public Integer getOrderFlow() {
    return orderFlow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Logstoredocumentrow logstoredocumentrow = (Logstoredocumentrow) o;
    return Objects.equals(this.displayName, logstoredocumentrow.displayName) &&
        Objects.equals(this.ID, logstoredocumentrow.ID) &&
        Objects.equals(this.classID, logstoredocumentrow.classID) &&
        Objects.equals(this.objVersion, logstoredocumentrow.objVersion) &&
        Objects.equals(this.parentID, logstoredocumentrow.parentID) &&
        Objects.equals(this.posIndex, logstoredocumentrow.posIndex) &&
        Objects.equals(this.storeID, logstoredocumentrow.storeID) &&
        Objects.equals(this.storeCardID, logstoredocumentrow.storeCardID) &&
        Objects.equals(this.storeBatchID, logstoredocumentrow.storeBatchID) &&
        Objects.equals(this.storeDocRowID, logstoredocumentrow.storeDocRowID) &&
        Objects.equals(this.quantity, logstoredocumentrow.quantity) &&
        Objects.equals(this.qUnit, logstoredocumentrow.qUnit) &&
        Objects.equals(this.unitRate, logstoredocumentrow.unitRate) &&
        Objects.equals(this.storePositionID, logstoredocumentrow.storePositionID) &&
        Objects.equals(this.restQuantity, logstoredocumentrow.restQuantity) &&
        Objects.equals(this.unitRestQuantity, logstoredocumentrow.unitRestQuantity) &&
        Objects.equals(this.inPositionQuantity, logstoredocumentrow.inPositionQuantity) &&
        Objects.equals(this.masterRowID, logstoredocumentrow.masterRowID) &&
        Objects.equals(this.sortKey, logstoredocumentrow.sortKey) &&
        Objects.equals(this.contentUnit, logstoredocumentrow.contentUnit) &&
        Objects.equals(this.contentUnitRate, logstoredocumentrow.contentUnitRate) &&
        Objects.equals(this.orderFlow, logstoredocumentrow.orderFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, storeID, storeCardID, storeBatchID, storeDocRowID, quantity, qUnit, unitRate, storePositionID, restQuantity, unitRestQuantity, inPositionQuantity, masterRowID, sortKey, contentUnit, contentUnitRate, orderFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Logstoredocumentrow {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    storeID: ").append(toIndentedString(storeID)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    storeBatchID: ").append(toIndentedString(storeBatchID)).append("\n");
    sb.append("    storeDocRowID: ").append(toIndentedString(storeDocRowID)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    qUnit: ").append(toIndentedString(qUnit)).append("\n");
    sb.append("    unitRate: ").append(toIndentedString(unitRate)).append("\n");
    sb.append("    storePositionID: ").append(toIndentedString(storePositionID)).append("\n");
    sb.append("    restQuantity: ").append(toIndentedString(restQuantity)).append("\n");
    sb.append("    unitRestQuantity: ").append(toIndentedString(unitRestQuantity)).append("\n");
    sb.append("    inPositionQuantity: ").append(toIndentedString(inPositionQuantity)).append("\n");
    sb.append("    masterRowID: ").append(toIndentedString(masterRowID)).append("\n");
    sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
    sb.append("    contentUnit: ").append(toIndentedString(contentUnit)).append("\n");
    sb.append("    contentUnitRate: ").append(toIndentedString(contentUnitRate)).append("\n");
    sb.append("    orderFlow: ").append(toIndentedString(orderFlow)).append("\n");
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

