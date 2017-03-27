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
 * Intrastatreportitem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Intrastatreportitem   {
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

  @SerializedName("ItemNumber")
  private Integer itemNumber = null;

  @SerializedName("Commodities_ID")
  private String commoditiesID = null;

  @SerializedName("MsConsDest_ID")
  private String msConsDestID = null;

  @SerializedName("CountryOfOrigin_ID")
  private String countryOfOriginID = null;

  @SerializedName("NetMass")
  private Double netMass = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  @SerializedName("InvoicedAmount")
  private Double invoicedAmount = null;

  @SerializedName("TransactionType_ID")
  private String transactionTypeID = null;

  @SerializedName("Region_ID")
  private String regionID = null;

  @SerializedName("Transportation_ID")
  private String transportationID = null;

  @SerializedName("DeliveryTerm_ID")
  private String deliveryTermID = null;

  @SerializedName("ExtraType_ID")
  private String extraTypeID = null;

  @SerializedName("FunctionCode")
  private Integer functionCode = null;

  @SerializedName("PreviousDeclaration_ID")
  private String previousDeclarationID = null;

  @SerializedName("FunctionCode_Text")
  private String functionCodeText = null;

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
   * Vlastník; ID objektu Deklarace INTRASTAT [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Deklarace INTRASTAT [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Intrastatreportitem itemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

   /**
   * Číslo položky [persistentní položka]
   * @return itemNumber
  **/
  @ApiModelProperty(example = "null", value = "Číslo položky [persistentní položka]")
  public Integer getItemNumber() {
    return itemNumber;
  }

  public void setItemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
  }

  public Intrastatreportitem commoditiesID(String commoditiesID) {
    this.commoditiesID = commoditiesID;
    return this;
  }

   /**
   * Kód kombinované nomenklatury; ID objektu Kombinovaná nomenklatura [persistentní položka]
   * @return commoditiesID
  **/
  @ApiModelProperty(example = "null", value = "Kód kombinované nomenklatury; ID objektu Kombinovaná nomenklatura [persistentní položka]")
  public String getCommoditiesID() {
    return commoditiesID;
  }

  public void setCommoditiesID(String commoditiesID) {
    this.commoditiesID = commoditiesID;
  }

  public Intrastatreportitem msConsDestID(String msConsDestID) {
    this.msConsDestID = msConsDestID;
    return this;
  }

   /**
   * Země přij./odesl.; ID objektu Země [persistentní položka]
   * @return msConsDestID
  **/
  @ApiModelProperty(example = "null", value = "Země přij./odesl.; ID objektu Země [persistentní položka]")
  public String getMsConsDestID() {
    return msConsDestID;
  }

  public void setMsConsDestID(String msConsDestID) {
    this.msConsDestID = msConsDestID;
  }

  public Intrastatreportitem countryOfOriginID(String countryOfOriginID) {
    this.countryOfOriginID = countryOfOriginID;
    return this;
  }

   /**
   * Země původu; ID objektu Země [persistentní položka]
   * @return countryOfOriginID
  **/
  @ApiModelProperty(example = "null", value = "Země původu; ID objektu Země [persistentní položka]")
  public String getCountryOfOriginID() {
    return countryOfOriginID;
  }

  public void setCountryOfOriginID(String countryOfOriginID) {
    this.countryOfOriginID = countryOfOriginID;
  }

  public Intrastatreportitem netMass(Double netMass) {
    this.netMass = netMass;
    return this;
  }

   /**
   * Hmotnost [persistentní položka]
   * @return netMass
  **/
  @ApiModelProperty(example = "null", value = "Hmotnost [persistentní položka]")
  public Double getNetMass() {
    return netMass;
  }

  public void setNetMass(Double netMass) {
    this.netMass = netMass;
  }

  public Intrastatreportitem quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Množství MJ [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "Množství MJ [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Intrastatreportitem invoicedAmount(Double invoicedAmount) {
    this.invoicedAmount = invoicedAmount;
    return this;
  }

   /**
   * Fakturovaná hodnota [persistentní položka]
   * @return invoicedAmount
  **/
  @ApiModelProperty(example = "null", value = "Fakturovaná hodnota [persistentní položka]")
  public Double getInvoicedAmount() {
    return invoicedAmount;
  }

  public void setInvoicedAmount(Double invoicedAmount) {
    this.invoicedAmount = invoicedAmount;
  }

  public Intrastatreportitem transactionTypeID(String transactionTypeID) {
    this.transactionTypeID = transactionTypeID;
    return this;
  }

   /**
   * Povaha transakce; ID objektu Povaha transakce [persistentní položka]
   * @return transactionTypeID
  **/
  @ApiModelProperty(example = "null", value = "Povaha transakce; ID objektu Povaha transakce [persistentní položka]")
  public String getTransactionTypeID() {
    return transactionTypeID;
  }

  public void setTransactionTypeID(String transactionTypeID) {
    this.transactionTypeID = transactionTypeID;
  }

  public Intrastatreportitem regionID(String regionID) {
    this.regionID = regionID;
    return this;
  }

   /**
   * Kraj přij./odesl.; ID objektu Kraj [persistentní položka]
   * @return regionID
  **/
  @ApiModelProperty(example = "null", value = "Kraj přij./odesl.; ID objektu Kraj [persistentní položka]")
  public String getRegionID() {
    return regionID;
  }

  public void setRegionID(String regionID) {
    this.regionID = regionID;
  }

  public Intrastatreportitem transportationID(String transportationID) {
    this.transportationID = transportationID;
    return this;
  }

   /**
   * Druh dopravy; ID objektu Druh dopravy INTRASTAT [persistentní položka]
   * @return transportationID
  **/
  @ApiModelProperty(example = "null", value = "Druh dopravy; ID objektu Druh dopravy INTRASTAT [persistentní položka]")
  public String getTransportationID() {
    return transportationID;
  }

  public void setTransportationID(String transportationID) {
    this.transportationID = transportationID;
  }

  public Intrastatreportitem deliveryTermID(String deliveryTermID) {
    this.deliveryTermID = deliveryTermID;
    return this;
  }

   /**
   * Dodací podmínky; ID objektu Dodací podmínky [persistentní položka]
   * @return deliveryTermID
  **/
  @ApiModelProperty(example = "null", value = "Dodací podmínky; ID objektu Dodací podmínky [persistentní položka]")
  public String getDeliveryTermID() {
    return deliveryTermID;
  }

  public void setDeliveryTermID(String deliveryTermID) {
    this.deliveryTermID = deliveryTermID;
  }

  public Intrastatreportitem extraTypeID(String extraTypeID) {
    this.extraTypeID = extraTypeID;
    return this;
  }

   /**
   * Kód zvláštního pohybu; ID objektu Zvláštní pohyb [persistentní položka]
   * @return extraTypeID
  **/
  @ApiModelProperty(example = "null", value = "Kód zvláštního pohybu; ID objektu Zvláštní pohyb [persistentní položka]")
  public String getExtraTypeID() {
    return extraTypeID;
  }

  public void setExtraTypeID(String extraTypeID) {
    this.extraTypeID = extraTypeID;
  }

  public Intrastatreportitem functionCode(Integer functionCode) {
    this.functionCode = functionCode;
    return this;
  }

   /**
   * Funkční kód [persistentní položka]
   * @return functionCode
  **/
  @ApiModelProperty(example = "null", value = "Funkční kód [persistentní položka]")
  public Integer getFunctionCode() {
    return functionCode;
  }

  public void setFunctionCode(Integer functionCode) {
    this.functionCode = functionCode;
  }

  public Intrastatreportitem previousDeclarationID(String previousDeclarationID) {
    this.previousDeclarationID = previousDeclarationID;
    return this;
  }

   /**
   * Opravovaná deklarace; ID objektu Položka deklarace [persistentní položka]
   * @return previousDeclarationID
  **/
  @ApiModelProperty(example = "null", value = "Opravovaná deklarace; ID objektu Položka deklarace [persistentní položka]")
  public String getPreviousDeclarationID() {
    return previousDeclarationID;
  }

  public void setPreviousDeclarationID(String previousDeclarationID) {
    this.previousDeclarationID = previousDeclarationID;
  }

   /**
   * Funkční kód - text
   * @return functionCodeText
  **/
  @ApiModelProperty(example = "null", value = "Funkční kód - text")
  public String getFunctionCodeText() {
    return functionCodeText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intrastatreportitem intrastatreportitem = (Intrastatreportitem) o;
    return Objects.equals(this.displayName, intrastatreportitem.displayName) &&
        Objects.equals(this.ID, intrastatreportitem.ID) &&
        Objects.equals(this.classID, intrastatreportitem.classID) &&
        Objects.equals(this.objVersion, intrastatreportitem.objVersion) &&
        Objects.equals(this.parentID, intrastatreportitem.parentID) &&
        Objects.equals(this.itemNumber, intrastatreportitem.itemNumber) &&
        Objects.equals(this.commoditiesID, intrastatreportitem.commoditiesID) &&
        Objects.equals(this.msConsDestID, intrastatreportitem.msConsDestID) &&
        Objects.equals(this.countryOfOriginID, intrastatreportitem.countryOfOriginID) &&
        Objects.equals(this.netMass, intrastatreportitem.netMass) &&
        Objects.equals(this.quantity, intrastatreportitem.quantity) &&
        Objects.equals(this.invoicedAmount, intrastatreportitem.invoicedAmount) &&
        Objects.equals(this.transactionTypeID, intrastatreportitem.transactionTypeID) &&
        Objects.equals(this.regionID, intrastatreportitem.regionID) &&
        Objects.equals(this.transportationID, intrastatreportitem.transportationID) &&
        Objects.equals(this.deliveryTermID, intrastatreportitem.deliveryTermID) &&
        Objects.equals(this.extraTypeID, intrastatreportitem.extraTypeID) &&
        Objects.equals(this.functionCode, intrastatreportitem.functionCode) &&
        Objects.equals(this.previousDeclarationID, intrastatreportitem.previousDeclarationID) &&
        Objects.equals(this.functionCodeText, intrastatreportitem.functionCodeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, itemNumber, commoditiesID, msConsDestID, countryOfOriginID, netMass, quantity, invoicedAmount, transactionTypeID, regionID, transportationID, deliveryTermID, extraTypeID, functionCode, previousDeclarationID, functionCodeText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intrastatreportitem {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    commoditiesID: ").append(toIndentedString(commoditiesID)).append("\n");
    sb.append("    msConsDestID: ").append(toIndentedString(msConsDestID)).append("\n");
    sb.append("    countryOfOriginID: ").append(toIndentedString(countryOfOriginID)).append("\n");
    sb.append("    netMass: ").append(toIndentedString(netMass)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    invoicedAmount: ").append(toIndentedString(invoicedAmount)).append("\n");
    sb.append("    transactionTypeID: ").append(toIndentedString(transactionTypeID)).append("\n");
    sb.append("    regionID: ").append(toIndentedString(regionID)).append("\n");
    sb.append("    transportationID: ").append(toIndentedString(transportationID)).append("\n");
    sb.append("    deliveryTermID: ").append(toIndentedString(deliveryTermID)).append("\n");
    sb.append("    extraTypeID: ").append(toIndentedString(extraTypeID)).append("\n");
    sb.append("    functionCode: ").append(toIndentedString(functionCode)).append("\n");
    sb.append("    previousDeclarationID: ").append(toIndentedString(previousDeclarationID)).append("\n");
    sb.append("    functionCodeText: ").append(toIndentedString(functionCodeText)).append("\n");
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

