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
 * Gpmparameterrows
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Gpmparameterrows   {
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

  @SerializedName("DocQueue_ID")
  private String docQueueID = null;

  @SerializedName("Division_ID")
  private String divisionID = null;

  @SerializedName("BusOrder_ID")
  private String busOrderID = null;

  @SerializedName("BusTransaction_ID")
  private String busTransactionID = null;

  @SerializedName("BusProject_ID")
  private String busProjectID = null;

  @SerializedName("ProductReception_DocQ_ID")
  private String productReceptionDocQID = null;

  @SerializedName("OutgoingTransfer_DocQ_ID")
  private String outgoingTransferDocQID = null;

  @SerializedName("IncomingTransfer_DocQ_ID")
  private String incomingTransferDocQID = null;

  @SerializedName("ProductStore_ID")
  private String productStoreID = null;

  @SerializedName("OperatingStore_ID")
  private String operatingStoreID = null;

  @SerializedName("Firm_ID")
  private String firmID = null;

  @SerializedName("MaterialDistribution_DocQ_ID")
  private String materialDistributionDocQID = null;

  @SerializedName("MaterialStore_ID")
  private String materialStoreID = null;

  @SerializedName("Waste_DocQ_ID")
  private String wasteDocQID = null;

  @SerializedName("Overplus_DocQ_ID")
  private String overplusDocQID = null;

  @SerializedName("ProductStoreForOrders")
  private Boolean productStoreForOrders = null;

  @SerializedName("OrdersBalanceALStatus")
  private Integer ordersBalanceALStatus = null;

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
   * Vlastník; ID objektu Nastavení gastrovýroby [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Nastavení gastrovýroby [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Gpmparameterrows posIndex(Integer posIndex) {
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

  public Gpmparameterrows docQueueID(String docQueueID) {
    this.docQueueID = docQueueID;
    return this;
  }

   /**
   * Řada dokladů; ID objektu Řada dokladů [persistentní položka]
   * @return docQueueID
  **/
  @ApiModelProperty(example = "null", value = "Řada dokladů; ID objektu Řada dokladů [persistentní položka]")
  public String getDocQueueID() {
    return docQueueID;
  }

  public void setDocQueueID(String docQueueID) {
    this.docQueueID = docQueueID;
  }

  public Gpmparameterrows divisionID(String divisionID) {
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

  public Gpmparameterrows busOrderID(String busOrderID) {
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

  public Gpmparameterrows busTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
    return this;
  }

   /**
   * Obch. případ; ID objektu Obchodní případ [persistentní položka]
   * @return busTransactionID
  **/
  @ApiModelProperty(example = "null", value = "Obch. případ; ID objektu Obchodní případ [persistentní položka]")
  public String getBusTransactionID() {
    return busTransactionID;
  }

  public void setBusTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
  }

  public Gpmparameterrows busProjectID(String busProjectID) {
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

  public Gpmparameterrows productReceptionDocQID(String productReceptionDocQID) {
    this.productReceptionDocQID = productReceptionDocQID;
    return this;
  }

   /**
   * Řada PHV; ID objektu Řada dokladů [persistentní položka]
   * @return productReceptionDocQID
  **/
  @ApiModelProperty(example = "null", value = "Řada PHV; ID objektu Řada dokladů [persistentní položka]")
  public String getProductReceptionDocQID() {
    return productReceptionDocQID;
  }

  public void setProductReceptionDocQID(String productReceptionDocQID) {
    this.productReceptionDocQID = productReceptionDocQID;
  }

  public Gpmparameterrows outgoingTransferDocQID(String outgoingTransferDocQID) {
    this.outgoingTransferDocQID = outgoingTransferDocQID;
    return this;
  }

   /**
   * Řada PRV; ID objektu Řada dokladů [persistentní položka]
   * @return outgoingTransferDocQID
  **/
  @ApiModelProperty(example = "null", value = "Řada PRV; ID objektu Řada dokladů [persistentní položka]")
  public String getOutgoingTransferDocQID() {
    return outgoingTransferDocQID;
  }

  public void setOutgoingTransferDocQID(String outgoingTransferDocQID) {
    this.outgoingTransferDocQID = outgoingTransferDocQID;
  }

  public Gpmparameterrows incomingTransferDocQID(String incomingTransferDocQID) {
    this.incomingTransferDocQID = incomingTransferDocQID;
    return this;
  }

   /**
   * Řada PRP; ID objektu Řada dokladů [persistentní položka]
   * @return incomingTransferDocQID
  **/
  @ApiModelProperty(example = "null", value = "Řada PRP; ID objektu Řada dokladů [persistentní položka]")
  public String getIncomingTransferDocQID() {
    return incomingTransferDocQID;
  }

  public void setIncomingTransferDocQID(String incomingTransferDocQID) {
    this.incomingTransferDocQID = incomingTransferDocQID;
  }

  public Gpmparameterrows productStoreID(String productStoreID) {
    this.productStoreID = productStoreID;
    return this;
  }

   /**
   * Sklad výrobků; ID objektu Sklad [persistentní položka]
   * @return productStoreID
  **/
  @ApiModelProperty(example = "null", value = "Sklad výrobků; ID objektu Sklad [persistentní položka]")
  public String getProductStoreID() {
    return productStoreID;
  }

  public void setProductStoreID(String productStoreID) {
    this.productStoreID = productStoreID;
  }

  public Gpmparameterrows operatingStoreID(String operatingStoreID) {
    this.operatingStoreID = operatingStoreID;
    return this;
  }

   /**
   * Provozní sklad; ID objektu Sklad [persistentní položka]
   * @return operatingStoreID
  **/
  @ApiModelProperty(example = "null", value = "Provozní sklad; ID objektu Sklad [persistentní položka]")
  public String getOperatingStoreID() {
    return operatingStoreID;
  }

  public void setOperatingStoreID(String operatingStoreID) {
    this.operatingStoreID = operatingStoreID;
  }

  public Gpmparameterrows firmID(String firmID) {
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

  public Gpmparameterrows materialDistributionDocQID(String materialDistributionDocQID) {
    this.materialDistributionDocQID = materialDistributionDocQID;
    return this;
  }

   /**
   * Řada VMV; ID objektu Řada dokladů [persistentní položka]
   * @return materialDistributionDocQID
  **/
  @ApiModelProperty(example = "null", value = "Řada VMV; ID objektu Řada dokladů [persistentní položka]")
  public String getMaterialDistributionDocQID() {
    return materialDistributionDocQID;
  }

  public void setMaterialDistributionDocQID(String materialDistributionDocQID) {
    this.materialDistributionDocQID = materialDistributionDocQID;
  }

  public Gpmparameterrows materialStoreID(String materialStoreID) {
    this.materialStoreID = materialStoreID;
    return this;
  }

   /**
   * Sklad surovin; ID objektu Sklad [persistentní položka]
   * @return materialStoreID
  **/
  @ApiModelProperty(example = "null", value = "Sklad surovin; ID objektu Sklad [persistentní položka]")
  public String getMaterialStoreID() {
    return materialStoreID;
  }

  public void setMaterialStoreID(String materialStoreID) {
    this.materialStoreID = materialStoreID;
  }

  public Gpmparameterrows wasteDocQID(String wasteDocQID) {
    this.wasteDocQID = wasteDocQID;
    return this;
  }

   /**
   * Ztráty výroby; ID objektu Řada dokladů [persistentní položka]
   * @return wasteDocQID
  **/
  @ApiModelProperty(example = "null", value = "Ztráty výroby; ID objektu Řada dokladů [persistentní položka]")
  public String getWasteDocQID() {
    return wasteDocQID;
  }

  public void setWasteDocQID(String wasteDocQID) {
    this.wasteDocQID = wasteDocQID;
  }

  public Gpmparameterrows overplusDocQID(String overplusDocQID) {
    this.overplusDocQID = overplusDocQID;
    return this;
  }

   /**
   * Přebytky výroby; ID objektu Řada dokladů [persistentní položka]
   * @return overplusDocQID
  **/
  @ApiModelProperty(example = "null", value = "Přebytky výroby; ID objektu Řada dokladů [persistentní položka]")
  public String getOverplusDocQID() {
    return overplusDocQID;
  }

  public void setOverplusDocQID(String overplusDocQID) {
    this.overplusDocQID = overplusDocQID;
  }

  public Gpmparameterrows productStoreForOrders(Boolean productStoreForOrders) {
    this.productStoreForOrders = productStoreForOrders;
    return this;
  }

   /**
   * Pro bony [persistentní položka]
   * @return productStoreForOrders
  **/
  @ApiModelProperty(example = "null", value = "Pro bony [persistentní položka]")
  public Boolean getProductStoreForOrders() {
    return productStoreForOrders;
  }

  public void setProductStoreForOrders(Boolean productStoreForOrders) {
    this.productStoreForOrders = productStoreForOrders;
  }

  public Gpmparameterrows ordersBalanceALStatus(Integer ordersBalanceALStatus) {
    this.ordersBalanceALStatus = ordersBalanceALStatus;
    return this;
  }

   /**
   * Stav VL [persistentní položka]
   * @return ordersBalanceALStatus
  **/
  @ApiModelProperty(example = "null", value = "Stav VL [persistentní položka]")
  public Integer getOrdersBalanceALStatus() {
    return ordersBalanceALStatus;
  }

  public void setOrdersBalanceALStatus(Integer ordersBalanceALStatus) {
    this.ordersBalanceALStatus = ordersBalanceALStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gpmparameterrows gpmparameterrows = (Gpmparameterrows) o;
    return Objects.equals(this.displayName, gpmparameterrows.displayName) &&
        Objects.equals(this.ID, gpmparameterrows.ID) &&
        Objects.equals(this.classID, gpmparameterrows.classID) &&
        Objects.equals(this.objVersion, gpmparameterrows.objVersion) &&
        Objects.equals(this.parentID, gpmparameterrows.parentID) &&
        Objects.equals(this.posIndex, gpmparameterrows.posIndex) &&
        Objects.equals(this.docQueueID, gpmparameterrows.docQueueID) &&
        Objects.equals(this.divisionID, gpmparameterrows.divisionID) &&
        Objects.equals(this.busOrderID, gpmparameterrows.busOrderID) &&
        Objects.equals(this.busTransactionID, gpmparameterrows.busTransactionID) &&
        Objects.equals(this.busProjectID, gpmparameterrows.busProjectID) &&
        Objects.equals(this.productReceptionDocQID, gpmparameterrows.productReceptionDocQID) &&
        Objects.equals(this.outgoingTransferDocQID, gpmparameterrows.outgoingTransferDocQID) &&
        Objects.equals(this.incomingTransferDocQID, gpmparameterrows.incomingTransferDocQID) &&
        Objects.equals(this.productStoreID, gpmparameterrows.productStoreID) &&
        Objects.equals(this.operatingStoreID, gpmparameterrows.operatingStoreID) &&
        Objects.equals(this.firmID, gpmparameterrows.firmID) &&
        Objects.equals(this.materialDistributionDocQID, gpmparameterrows.materialDistributionDocQID) &&
        Objects.equals(this.materialStoreID, gpmparameterrows.materialStoreID) &&
        Objects.equals(this.wasteDocQID, gpmparameterrows.wasteDocQID) &&
        Objects.equals(this.overplusDocQID, gpmparameterrows.overplusDocQID) &&
        Objects.equals(this.productStoreForOrders, gpmparameterrows.productStoreForOrders) &&
        Objects.equals(this.ordersBalanceALStatus, gpmparameterrows.ordersBalanceALStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, docQueueID, divisionID, busOrderID, busTransactionID, busProjectID, productReceptionDocQID, outgoingTransferDocQID, incomingTransferDocQID, productStoreID, operatingStoreID, firmID, materialDistributionDocQID, materialStoreID, wasteDocQID, overplusDocQID, productStoreForOrders, ordersBalanceALStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gpmparameterrows {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    docQueueID: ").append(toIndentedString(docQueueID)).append("\n");
    sb.append("    divisionID: ").append(toIndentedString(divisionID)).append("\n");
    sb.append("    busOrderID: ").append(toIndentedString(busOrderID)).append("\n");
    sb.append("    busTransactionID: ").append(toIndentedString(busTransactionID)).append("\n");
    sb.append("    busProjectID: ").append(toIndentedString(busProjectID)).append("\n");
    sb.append("    productReceptionDocQID: ").append(toIndentedString(productReceptionDocQID)).append("\n");
    sb.append("    outgoingTransferDocQID: ").append(toIndentedString(outgoingTransferDocQID)).append("\n");
    sb.append("    incomingTransferDocQID: ").append(toIndentedString(incomingTransferDocQID)).append("\n");
    sb.append("    productStoreID: ").append(toIndentedString(productStoreID)).append("\n");
    sb.append("    operatingStoreID: ").append(toIndentedString(operatingStoreID)).append("\n");
    sb.append("    firmID: ").append(toIndentedString(firmID)).append("\n");
    sb.append("    materialDistributionDocQID: ").append(toIndentedString(materialDistributionDocQID)).append("\n");
    sb.append("    materialStoreID: ").append(toIndentedString(materialStoreID)).append("\n");
    sb.append("    wasteDocQID: ").append(toIndentedString(wasteDocQID)).append("\n");
    sb.append("    overplusDocQID: ").append(toIndentedString(overplusDocQID)).append("\n");
    sb.append("    productStoreForOrders: ").append(toIndentedString(productStoreForOrders)).append("\n");
    sb.append("    ordersBalanceALStatus: ").append(toIndentedString(ordersBalanceALStatus)).append("\n");
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

