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
 * Supplier
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Supplier   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("Firm_ID")
  private String firmID = null;

  @SerializedName("ExternalNumber")
  private String externalNumber = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("DeliveryTime")
  private Integer deliveryTime = null;

  @SerializedName("MinimalQuantity")
  private Double minimalQuantity = null;

  @SerializedName("Packing")
  private Double packing = null;

  @SerializedName("DoDemand")
  private Boolean doDemand = null;

  @SerializedName("PurchasePrice")
  private Double purchasePrice = null;

  @SerializedName("UnitPurchasePrice")
  private Double unitPurchasePrice = null;

  @SerializedName("PurchaseCurrency_ID")
  private String purchaseCurrencyID = null;

  @SerializedName("PurchaseCurrRate")
  private Double purchaseCurrRate = null;

  @SerializedName("PurchaseRefCurrRate")
  private Double purchaseRefCurrRate = null;

  @SerializedName("PurchaseCoef")
  private Integer purchaseCoef = null;

  @SerializedName("LocalPurchaseCoef")
  private Integer localPurchaseCoef = null;

  @SerializedName("PurchaseZone_ID")
  private String purchaseZoneID = null;

  @SerializedName("LocalPurchaseZone_ID")
  private String localPurchaseZoneID = null;

  @SerializedName("PurchaseDate$DATE")
  private DateTime purchaseDateDATE = null;

  @SerializedName("UnitRate")
  private Double unitRate = null;

  @SerializedName("QUnit")
  private String qUnit = null;

  @SerializedName("RefCurrency_ID")
  private String refCurrencyID = null;

  @SerializedName("LocalRefCurrency_ID")
  private String localRefCurrencyID = null;

  @SerializedName("IsApproved")
  private Boolean isApproved = null;

  @SerializedName("Description")
  private String description = null;

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

  public Supplier storeCardID(String storeCardID) {
    this.storeCardID = storeCardID;
    return this;
  }

   /**
   * Skl. karta; ID objektu Skladová karta [persistentní položka]
   * @return storeCardID
  **/
  @ApiModelProperty(example = "null", value = "Skl. karta; ID objektu Skladová karta [persistentní položka]")
  public String getStoreCardID() {
    return storeCardID;
  }

  public void setStoreCardID(String storeCardID) {
    this.storeCardID = storeCardID;
  }

  public Supplier firmID(String firmID) {
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

  public Supplier externalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
    return this;
  }

   /**
   * Ext.číslo [persistentní položka]
   * @return externalNumber
  **/
  @ApiModelProperty(example = "null", value = "Ext.číslo [persistentní položka]")
  public String getExternalNumber() {
    return externalNumber;
  }

  public void setExternalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
  }

  public Supplier name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Supplier deliveryTime(Integer deliveryTime) {
    this.deliveryTime = deliveryTime;
    return this;
  }

   /**
   * Dod.lhůta [persistentní položka]
   * @return deliveryTime
  **/
  @ApiModelProperty(example = "null", value = "Dod.lhůta [persistentní položka]")
  public Integer getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(Integer deliveryTime) {
    this.deliveryTime = deliveryTime;
  }

  public Supplier minimalQuantity(Double minimalQuantity) {
    this.minimalQuantity = minimalQuantity;
    return this;
  }

   /**
   * Min.množství [persistentní položka]
   * @return minimalQuantity
  **/
  @ApiModelProperty(example = "null", value = "Min.množství [persistentní položka]")
  public Double getMinimalQuantity() {
    return minimalQuantity;
  }

  public void setMinimalQuantity(Double minimalQuantity) {
    this.minimalQuantity = minimalQuantity;
  }

  public Supplier packing(Double packing) {
    this.packing = packing;
    return this;
  }

   /**
   * Balení [persistentní položka]
   * @return packing
  **/
  @ApiModelProperty(example = "null", value = "Balení [persistentní položka]")
  public Double getPacking() {
    return packing;
  }

  public void setPacking(Double packing) {
    this.packing = packing;
  }

  public Supplier doDemand(Boolean doDemand) {
    this.doDemand = doDemand;
    return this;
  }

   /**
   * Poptávat dodavatele [persistentní položka]
   * @return doDemand
  **/
  @ApiModelProperty(example = "null", value = "Poptávat dodavatele [persistentní položka]")
  public Boolean getDoDemand() {
    return doDemand;
  }

  public void setDoDemand(Boolean doDemand) {
    this.doDemand = doDemand;
  }

  public Supplier purchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
    return this;
  }

   /**
   * Nákup.cena [persistentní položka]
   * @return purchasePrice
  **/
  @ApiModelProperty(example = "null", value = "Nákup.cena [persistentní položka]")
  public Double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public Supplier unitPurchasePrice(Double unitPurchasePrice) {
    this.unitPurchasePrice = unitPurchasePrice;
    return this;
  }

   /**
   * Jedn.nákup.cena
   * @return unitPurchasePrice
  **/
  @ApiModelProperty(example = "null", value = "Jedn.nákup.cena")
  public Double getUnitPurchasePrice() {
    return unitPurchasePrice;
  }

  public void setUnitPurchasePrice(Double unitPurchasePrice) {
    this.unitPurchasePrice = unitPurchasePrice;
  }

  public Supplier purchaseCurrencyID(String purchaseCurrencyID) {
    this.purchaseCurrencyID = purchaseCurrencyID;
    return this;
  }

   /**
   * Nákup.měna; ID objektu Měna [persistentní položka]
   * @return purchaseCurrencyID
  **/
  @ApiModelProperty(example = "null", value = "Nákup.měna; ID objektu Měna [persistentní položka]")
  public String getPurchaseCurrencyID() {
    return purchaseCurrencyID;
  }

  public void setPurchaseCurrencyID(String purchaseCurrencyID) {
    this.purchaseCurrencyID = purchaseCurrencyID;
  }

  public Supplier purchaseCurrRate(Double purchaseCurrRate) {
    this.purchaseCurrRate = purchaseCurrRate;
    return this;
  }

   /**
   * Nákup.kurz [persistentní položka]
   * @return purchaseCurrRate
  **/
  @ApiModelProperty(example = "null", value = "Nákup.kurz [persistentní položka]")
  public Double getPurchaseCurrRate() {
    return purchaseCurrRate;
  }

  public void setPurchaseCurrRate(Double purchaseCurrRate) {
    this.purchaseCurrRate = purchaseCurrRate;
  }

  public Supplier purchaseRefCurrRate(Double purchaseRefCurrRate) {
    this.purchaseRefCurrRate = purchaseRefCurrRate;
    return this;
  }

   /**
   * Nákup.vzt.kurz [persistentní položka]
   * @return purchaseRefCurrRate
  **/
  @ApiModelProperty(example = "null", value = "Nákup.vzt.kurz [persistentní položka]")
  public Double getPurchaseRefCurrRate() {
    return purchaseRefCurrRate;
  }

  public void setPurchaseRefCurrRate(Double purchaseRefCurrRate) {
    this.purchaseRefCurrRate = purchaseRefCurrRate;
  }

  public Supplier purchaseCoef(Integer purchaseCoef) {
    this.purchaseCoef = purchaseCoef;
    return this;
  }

   /**
   * Koeficient [persistentní položka]
   * @return purchaseCoef
  **/
  @ApiModelProperty(example = "null", value = "Koeficient [persistentní položka]")
  public Integer getPurchaseCoef() {
    return purchaseCoef;
  }

  public void setPurchaseCoef(Integer purchaseCoef) {
    this.purchaseCoef = purchaseCoef;
  }

  public Supplier localPurchaseCoef(Integer localPurchaseCoef) {
    this.localPurchaseCoef = localPurchaseCoef;
    return this;
  }

   /**
   * Lokální koeficient [persistentní položka]
   * @return localPurchaseCoef
  **/
  @ApiModelProperty(example = "null", value = "Lokální koeficient [persistentní položka]")
  public Integer getLocalPurchaseCoef() {
    return localPurchaseCoef;
  }

  public void setLocalPurchaseCoef(Integer localPurchaseCoef) {
    this.localPurchaseCoef = localPurchaseCoef;
  }

  public Supplier purchaseZoneID(String purchaseZoneID) {
    this.purchaseZoneID = purchaseZoneID;
    return this;
  }

   /**
   * Zóna; ID objektu Měna [persistentní položka]
   * @return purchaseZoneID
  **/
  @ApiModelProperty(example = "null", value = "Zóna; ID objektu Měna [persistentní položka]")
  public String getPurchaseZoneID() {
    return purchaseZoneID;
  }

  public void setPurchaseZoneID(String purchaseZoneID) {
    this.purchaseZoneID = purchaseZoneID;
  }

  public Supplier localPurchaseZoneID(String localPurchaseZoneID) {
    this.localPurchaseZoneID = localPurchaseZoneID;
    return this;
  }

   /**
   * Lokální zóna; ID objektu Měna [persistentní položka]
   * @return localPurchaseZoneID
  **/
  @ApiModelProperty(example = "null", value = "Lokální zóna; ID objektu Měna [persistentní položka]")
  public String getLocalPurchaseZoneID() {
    return localPurchaseZoneID;
  }

  public void setLocalPurchaseZoneID(String localPurchaseZoneID) {
    this.localPurchaseZoneID = localPurchaseZoneID;
  }

  public Supplier purchaseDateDATE(DateTime purchaseDateDATE) {
    this.purchaseDateDATE = purchaseDateDATE;
    return this;
  }

   /**
   * Datum nák. [persistentní položka]
   * @return purchaseDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum nák. [persistentní položka]")
  public DateTime getPurchaseDateDATE() {
    return purchaseDateDATE;
  }

  public void setPurchaseDateDATE(DateTime purchaseDateDATE) {
    this.purchaseDateDATE = purchaseDateDATE;
  }

  public Supplier unitRate(Double unitRate) {
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

  public Supplier qUnit(String qUnit) {
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

  public Supplier isApproved(Boolean isApproved) {
    this.isApproved = isApproved;
    return this;
  }

   /**
   * Je dodavatel schválený
   * @return isApproved
  **/
  @ApiModelProperty(example = "null", value = "Je dodavatel schválený")
  public Boolean getIsApproved() {
    return isApproved;
  }

  public void setIsApproved(Boolean isApproved) {
    this.isApproved = isApproved;
  }

  public Supplier description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Poznámka [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Poznámka [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Supplier supplier = (Supplier) o;
    return Objects.equals(this.displayName, supplier.displayName) &&
        Objects.equals(this.ID, supplier.ID) &&
        Objects.equals(this.classID, supplier.classID) &&
        Objects.equals(this.objVersion, supplier.objVersion) &&
        Objects.equals(this.storeCardID, supplier.storeCardID) &&
        Objects.equals(this.firmID, supplier.firmID) &&
        Objects.equals(this.externalNumber, supplier.externalNumber) &&
        Objects.equals(this.name, supplier.name) &&
        Objects.equals(this.deliveryTime, supplier.deliveryTime) &&
        Objects.equals(this.minimalQuantity, supplier.minimalQuantity) &&
        Objects.equals(this.packing, supplier.packing) &&
        Objects.equals(this.doDemand, supplier.doDemand) &&
        Objects.equals(this.purchasePrice, supplier.purchasePrice) &&
        Objects.equals(this.unitPurchasePrice, supplier.unitPurchasePrice) &&
        Objects.equals(this.purchaseCurrencyID, supplier.purchaseCurrencyID) &&
        Objects.equals(this.purchaseCurrRate, supplier.purchaseCurrRate) &&
        Objects.equals(this.purchaseRefCurrRate, supplier.purchaseRefCurrRate) &&
        Objects.equals(this.purchaseCoef, supplier.purchaseCoef) &&
        Objects.equals(this.localPurchaseCoef, supplier.localPurchaseCoef) &&
        Objects.equals(this.purchaseZoneID, supplier.purchaseZoneID) &&
        Objects.equals(this.localPurchaseZoneID, supplier.localPurchaseZoneID) &&
        Objects.equals(this.purchaseDateDATE, supplier.purchaseDateDATE) &&
        Objects.equals(this.unitRate, supplier.unitRate) &&
        Objects.equals(this.qUnit, supplier.qUnit) &&
        Objects.equals(this.refCurrencyID, supplier.refCurrencyID) &&
        Objects.equals(this.localRefCurrencyID, supplier.localRefCurrencyID) &&
        Objects.equals(this.isApproved, supplier.isApproved) &&
        Objects.equals(this.description, supplier.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, storeCardID, firmID, externalNumber, name, deliveryTime, minimalQuantity, packing, doDemand, purchasePrice, unitPurchasePrice, purchaseCurrencyID, purchaseCurrRate, purchaseRefCurrRate, purchaseCoef, localPurchaseCoef, purchaseZoneID, localPurchaseZoneID, purchaseDateDATE, unitRate, qUnit, refCurrencyID, localRefCurrencyID, isApproved, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supplier {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    firmID: ").append(toIndentedString(firmID)).append("\n");
    sb.append("    externalNumber: ").append(toIndentedString(externalNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(deliveryTime)).append("\n");
    sb.append("    minimalQuantity: ").append(toIndentedString(minimalQuantity)).append("\n");
    sb.append("    packing: ").append(toIndentedString(packing)).append("\n");
    sb.append("    doDemand: ").append(toIndentedString(doDemand)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    unitPurchasePrice: ").append(toIndentedString(unitPurchasePrice)).append("\n");
    sb.append("    purchaseCurrencyID: ").append(toIndentedString(purchaseCurrencyID)).append("\n");
    sb.append("    purchaseCurrRate: ").append(toIndentedString(purchaseCurrRate)).append("\n");
    sb.append("    purchaseRefCurrRate: ").append(toIndentedString(purchaseRefCurrRate)).append("\n");
    sb.append("    purchaseCoef: ").append(toIndentedString(purchaseCoef)).append("\n");
    sb.append("    localPurchaseCoef: ").append(toIndentedString(localPurchaseCoef)).append("\n");
    sb.append("    purchaseZoneID: ").append(toIndentedString(purchaseZoneID)).append("\n");
    sb.append("    localPurchaseZoneID: ").append(toIndentedString(localPurchaseZoneID)).append("\n");
    sb.append("    purchaseDateDATE: ").append(toIndentedString(purchaseDateDATE)).append("\n");
    sb.append("    unitRate: ").append(toIndentedString(unitRate)).append("\n");
    sb.append("    qUnit: ").append(toIndentedString(qUnit)).append("\n");
    sb.append("    refCurrencyID: ").append(toIndentedString(refCurrencyID)).append("\n");
    sb.append("    localRefCurrencyID: ").append(toIndentedString(localRefCurrencyID)).append("\n");
    sb.append("    isApproved: ").append(toIndentedString(isApproved)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

