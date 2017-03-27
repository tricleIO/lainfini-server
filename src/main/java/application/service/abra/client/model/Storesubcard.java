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
 * Storesubcard
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Storesubcard   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Store_ID")
  private String storeID = null;

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("Location_ID")
  private String locationID = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  @SerializedName("PurchasePrice")
  private Double purchasePrice = null;

  @SerializedName("AdditionalPurchasePrice")
  private Double additionalPurchasePrice = null;

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

  @SerializedName("PurchaseFirm_ID")
  private String purchaseFirmID = null;

  @SerializedName("TransportationPercentage")
  private Double transportationPercentage = null;

  @SerializedName("OtherCostPercentage")
  private Double otherCostPercentage = null;

  @SerializedName("PurchaseDate$DATE")
  private DateTime purchaseDateDATE = null;

  @SerializedName("InvQuantity")
  private Double invQuantity = null;

  @SerializedName("InvQUnitRate")
  private Double invQUnitRate = null;

  @SerializedName("InvQUnitCode")
  private String invQUnitCode = null;

  @SerializedName("InvChange")
  private Boolean invChange = null;

  @SerializedName("LowLimitQuantity")
  private Double lowLimitQuantity = null;

  @SerializedName("HighLimitQuantity")
  private Double highLimitQuantity = null;

  @SerializedName("UnitLowLimitQuantity")
  private Double unitLowLimitQuantity = null;

  @SerializedName("UnitHighLimitQuantity")
  private Double unitHighLimitQuantity = null;

  @SerializedName("MainUnitCode")
  private String mainUnitCode = null;

  @SerializedName("MainUnitQuantity")
  private Double mainUnitQuantity = null;

  @SerializedName("MainUnitPurchasePrice")
  private Double mainUnitPurchasePrice = null;

  @SerializedName("MainUnitAdditionalPurchasePrice")
  private Double mainUnitAdditionalPurchasePrice = null;

  @SerializedName("PurchaseRefCurrency_ID")
  private String purchaseRefCurrencyID = null;

  @SerializedName("LocalPurchaseRefCurrency_ID")
  private String localPurchaseRefCurrencyID = null;

  @SerializedName("CanValidateOutOfStock")
  private Boolean canValidateOutOfStock = null;

  @SerializedName("IntrastatInputStatistic_ID")
  private String intrastatInputStatisticID = null;

  @SerializedName("IntrastatOutputStatistic_ID")
  private String intrastatOutputStatisticID = null;

  @SerializedName("ReceivedOrderedQuantity")
  private Double receivedOrderedQuantity = null;

  @SerializedName("ReceivedOrderedUnitQuantity")
  private Double receivedOrderedUnitQuantity = null;

  @SerializedName("IssuedOrderedQuantity")
  private Double issuedOrderedQuantity = null;

  @SerializedName("IssuedOrderedUnitQuantity")
  private Double issuedOrderedUnitQuantity = null;

  @SerializedName("InventoryStatus")
  private Integer inventoryStatus = null;

  @SerializedName("LastInventory$DATE")
  private DateTime lastInventoryDATE = null;

  @SerializedName("DateOfEndInventory$DATE")
  private DateTime dateOfEndInventoryDATE = null;

  @SerializedName("AverageStorePrice")
  private Double averageStorePrice = null;

  @SerializedName("AverageStorePriceDate$DATE")
  private DateTime averageStorePriceDateDATE = null;

  @SerializedName("MainUnitAverageStorePrice")
  private Double mainUnitAverageStorePrice = null;

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

  public Storesubcard storeID(String storeID) {
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

  public Storesubcard storeCardID(String storeCardID) {
    this.storeCardID = storeCardID;
    return this;
  }

   /**
   * Hl. karta; ID objektu Skladová karta [persistentní položka]
   * @return storeCardID
  **/
  @ApiModelProperty(example = "null", value = "Hl. karta; ID objektu Skladová karta [persistentní položka]")
  public String getStoreCardID() {
    return storeCardID;
  }

  public void setStoreCardID(String storeCardID) {
    this.storeCardID = storeCardID;
  }

  public Storesubcard locationID(String locationID) {
    this.locationID = locationID;
    return this;
  }

   /**
   * Místo; ID objektu Skladové místo [persistentní položka]
   * @return locationID
  **/
  @ApiModelProperty(example = "null", value = "Místo; ID objektu Skladové místo [persistentní položka]")
  public String getLocationID() {
    return locationID;
  }

  public void setLocationID(String locationID) {
    this.locationID = locationID;
  }

  public Storesubcard quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Množství [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "Množství [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Storesubcard purchasePrice(Double purchasePrice) {
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

  public Storesubcard additionalPurchasePrice(Double additionalPurchasePrice) {
    this.additionalPurchasePrice = additionalPurchasePrice;
    return this;
  }

   /**
   * Dopl.nákup.cena [persistentní položka]
   * @return additionalPurchasePrice
  **/
  @ApiModelProperty(example = "null", value = "Dopl.nákup.cena [persistentní položka]")
  public Double getAdditionalPurchasePrice() {
    return additionalPurchasePrice;
  }

  public void setAdditionalPurchasePrice(Double additionalPurchasePrice) {
    this.additionalPurchasePrice = additionalPurchasePrice;
  }

  public Storesubcard purchaseCurrencyID(String purchaseCurrencyID) {
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

  public Storesubcard purchaseCurrRate(Double purchaseCurrRate) {
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

  public Storesubcard purchaseRefCurrRate(Double purchaseRefCurrRate) {
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

  public Storesubcard purchaseCoef(Integer purchaseCoef) {
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

  public Storesubcard localPurchaseCoef(Integer localPurchaseCoef) {
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

  public Storesubcard purchaseZoneID(String purchaseZoneID) {
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

  public Storesubcard localPurchaseZoneID(String localPurchaseZoneID) {
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

  public Storesubcard purchaseFirmID(String purchaseFirmID) {
    this.purchaseFirmID = purchaseFirmID;
    return this;
  }

   /**
   * Dodavatel; ID objektu Firma [persistentní položka]
   * @return purchaseFirmID
  **/
  @ApiModelProperty(example = "null", value = "Dodavatel; ID objektu Firma [persistentní položka]")
  public String getPurchaseFirmID() {
    return purchaseFirmID;
  }

  public void setPurchaseFirmID(String purchaseFirmID) {
    this.purchaseFirmID = purchaseFirmID;
  }

  public Storesubcard transportationPercentage(Double transportationPercentage) {
    this.transportationPercentage = transportationPercentage;
    return this;
  }

   /**
   * Proc.dopravy [persistentní položka]
   * @return transportationPercentage
  **/
  @ApiModelProperty(example = "null", value = "Proc.dopravy [persistentní položka]")
  public Double getTransportationPercentage() {
    return transportationPercentage;
  }

  public void setTransportationPercentage(Double transportationPercentage) {
    this.transportationPercentage = transportationPercentage;
  }

  public Storesubcard otherCostPercentage(Double otherCostPercentage) {
    this.otherCostPercentage = otherCostPercentage;
    return this;
  }

   /**
   * Proc.ost.nákladů [persistentní položka]
   * @return otherCostPercentage
  **/
  @ApiModelProperty(example = "null", value = "Proc.ost.nákladů [persistentní položka]")
  public Double getOtherCostPercentage() {
    return otherCostPercentage;
  }

  public void setOtherCostPercentage(Double otherCostPercentage) {
    this.otherCostPercentage = otherCostPercentage;
  }

  public Storesubcard purchaseDateDATE(DateTime purchaseDateDATE) {
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

  public Storesubcard invQuantity(Double invQuantity) {
    this.invQuantity = invQuantity;
    return this;
  }

   /**
   * Skutečné množství (inv.) [persistentní položka]
   * @return invQuantity
  **/
  @ApiModelProperty(example = "null", value = "Skutečné množství (inv.) [persistentní položka]")
  public Double getInvQuantity() {
    return invQuantity;
  }

  public void setInvQuantity(Double invQuantity) {
    this.invQuantity = invQuantity;
  }

  public Storesubcard invQUnitRate(Double invQUnitRate) {
    this.invQUnitRate = invQUnitRate;
    return this;
  }

   /**
   * Vztah jednotek (inv.) [persistentní položka]
   * @return invQUnitRate
  **/
  @ApiModelProperty(example = "null", value = "Vztah jednotek (inv.) [persistentní položka]")
  public Double getInvQUnitRate() {
    return invQUnitRate;
  }

  public void setInvQUnitRate(Double invQUnitRate) {
    this.invQUnitRate = invQUnitRate;
  }

  public Storesubcard invQUnitCode(String invQUnitCode) {
    this.invQUnitCode = invQUnitCode;
    return this;
  }

   /**
   * Jednotka (inv.) [persistentní položka]
   * @return invQUnitCode
  **/
  @ApiModelProperty(example = "null", value = "Jednotka (inv.) [persistentní položka]")
  public String getInvQUnitCode() {
    return invQUnitCode;
  }

  public void setInvQUnitCode(String invQUnitCode) {
    this.invQUnitCode = invQUnitCode;
  }

  public Storesubcard invChange(Boolean invChange) {
    this.invChange = invChange;
    return this;
  }

   /**
   * Inventární změna [persistentní položka]
   * @return invChange
  **/
  @ApiModelProperty(example = "null", value = "Inventární změna [persistentní položka]")
  public Boolean getInvChange() {
    return invChange;
  }

  public void setInvChange(Boolean invChange) {
    this.invChange = invChange;
  }

  public Storesubcard lowLimitQuantity(Double lowLimitQuantity) {
    this.lowLimitQuantity = lowLimitQuantity;
    return this;
  }

   /**
   * Spodní limit [persistentní položka]
   * @return lowLimitQuantity
  **/
  @ApiModelProperty(example = "null", value = "Spodní limit [persistentní položka]")
  public Double getLowLimitQuantity() {
    return lowLimitQuantity;
  }

  public void setLowLimitQuantity(Double lowLimitQuantity) {
    this.lowLimitQuantity = lowLimitQuantity;
  }

  public Storesubcard highLimitQuantity(Double highLimitQuantity) {
    this.highLimitQuantity = highLimitQuantity;
    return this;
  }

   /**
   * Horní limit [persistentní položka]
   * @return highLimitQuantity
  **/
  @ApiModelProperty(example = "null", value = "Horní limit [persistentní položka]")
  public Double getHighLimitQuantity() {
    return highLimitQuantity;
  }

  public void setHighLimitQuantity(Double highLimitQuantity) {
    this.highLimitQuantity = highLimitQuantity;
  }

  public Storesubcard unitLowLimitQuantity(Double unitLowLimitQuantity) {
    this.unitLowLimitQuantity = unitLowLimitQuantity;
    return this;
  }

   /**
   * Spodní limit
   * @return unitLowLimitQuantity
  **/
  @ApiModelProperty(example = "null", value = "Spodní limit")
  public Double getUnitLowLimitQuantity() {
    return unitLowLimitQuantity;
  }

  public void setUnitLowLimitQuantity(Double unitLowLimitQuantity) {
    this.unitLowLimitQuantity = unitLowLimitQuantity;
  }

  public Storesubcard unitHighLimitQuantity(Double unitHighLimitQuantity) {
    this.unitHighLimitQuantity = unitHighLimitQuantity;
    return this;
  }

   /**
   * Horní limit
   * @return unitHighLimitQuantity
  **/
  @ApiModelProperty(example = "null", value = "Horní limit")
  public Double getUnitHighLimitQuantity() {
    return unitHighLimitQuantity;
  }

  public void setUnitHighLimitQuantity(Double unitHighLimitQuantity) {
    this.unitHighLimitQuantity = unitHighLimitQuantity;
  }

   /**
   * Hlavní jednotka
   * @return mainUnitCode
  **/
  @ApiModelProperty(example = "null", value = "Hlavní jednotka")
  public String getMainUnitCode() {
    return mainUnitCode;
  }

   /**
   * Množství v hl. jednotce
   * @return mainUnitQuantity
  **/
  @ApiModelProperty(example = "null", value = "Množství v hl. jednotce")
  public Double getMainUnitQuantity() {
    return mainUnitQuantity;
  }

  public Storesubcard mainUnitPurchasePrice(Double mainUnitPurchasePrice) {
    this.mainUnitPurchasePrice = mainUnitPurchasePrice;
    return this;
  }

   /**
   * Nákup.cena k hl. jednotce
   * @return mainUnitPurchasePrice
  **/
  @ApiModelProperty(example = "null", value = "Nákup.cena k hl. jednotce")
  public Double getMainUnitPurchasePrice() {
    return mainUnitPurchasePrice;
  }

  public void setMainUnitPurchasePrice(Double mainUnitPurchasePrice) {
    this.mainUnitPurchasePrice = mainUnitPurchasePrice;
  }

  public Storesubcard mainUnitAdditionalPurchasePrice(Double mainUnitAdditionalPurchasePrice) {
    this.mainUnitAdditionalPurchasePrice = mainUnitAdditionalPurchasePrice;
    return this;
  }

   /**
   * Dopl.nákup.cena k hl. jednotce
   * @return mainUnitAdditionalPurchasePrice
  **/
  @ApiModelProperty(example = "null", value = "Dopl.nákup.cena k hl. jednotce")
  public Double getMainUnitAdditionalPurchasePrice() {
    return mainUnitAdditionalPurchasePrice;
  }

  public void setMainUnitAdditionalPurchasePrice(Double mainUnitAdditionalPurchasePrice) {
    this.mainUnitAdditionalPurchasePrice = mainUnitAdditionalPurchasePrice;
  }

   /**
   * Ref.měna nák.měny; ID objektu Měna
   * @return purchaseRefCurrencyID
  **/
  @ApiModelProperty(example = "null", value = "Ref.měna nák.měny; ID objektu Měna")
  public String getPurchaseRefCurrencyID() {
    return purchaseRefCurrencyID;
  }

   /**
   * Lok.ref.měna nák.měny; ID objektu Měna
   * @return localPurchaseRefCurrencyID
  **/
  @ApiModelProperty(example = "null", value = "Lok.ref.měna nák.měny; ID objektu Měna")
  public String getLocalPurchaseRefCurrencyID() {
    return localPurchaseRefCurrencyID;
  }

  public Storesubcard canValidateOutOfStock(Boolean canValidateOutOfStock) {
    this.canValidateOutOfStock = canValidateOutOfStock;
    return this;
  }

   /**
   * Čerpání karty
   * @return canValidateOutOfStock
  **/
  @ApiModelProperty(example = "null", value = "Čerpání karty")
  public Boolean getCanValidateOutOfStock() {
    return canValidateOutOfStock;
  }

  public void setCanValidateOutOfStock(Boolean canValidateOutOfStock) {
    this.canValidateOutOfStock = canValidateOutOfStock;
  }

  public Storesubcard intrastatInputStatisticID(String intrastatInputStatisticID) {
    this.intrastatInputStatisticID = intrastatInputStatisticID;
    return this;
  }

   /**
   * Stat.hodnota na vstupu; ID objektu Definice statistické hodnoty na vstupu [persistentní položka]
   * @return intrastatInputStatisticID
  **/
  @ApiModelProperty(example = "null", value = "Stat.hodnota na vstupu; ID objektu Definice statistické hodnoty na vstupu [persistentní položka]")
  public String getIntrastatInputStatisticID() {
    return intrastatInputStatisticID;
  }

  public void setIntrastatInputStatisticID(String intrastatInputStatisticID) {
    this.intrastatInputStatisticID = intrastatInputStatisticID;
  }

  public Storesubcard intrastatOutputStatisticID(String intrastatOutputStatisticID) {
    this.intrastatOutputStatisticID = intrastatOutputStatisticID;
    return this;
  }

   /**
   * Stat.hodnota na výstupu; ID objektu Definice statistické hodnoty na výstupu [persistentní položka]
   * @return intrastatOutputStatisticID
  **/
  @ApiModelProperty(example = "null", value = "Stat.hodnota na výstupu; ID objektu Definice statistické hodnoty na výstupu [persistentní položka]")
  public String getIntrastatOutputStatisticID() {
    return intrastatOutputStatisticID;
  }

  public void setIntrastatOutputStatisticID(String intrastatOutputStatisticID) {
    this.intrastatOutputStatisticID = intrastatOutputStatisticID;
  }

  public Storesubcard receivedOrderedQuantity(Double receivedOrderedQuantity) {
    this.receivedOrderedQuantity = receivedOrderedQuantity;
    return this;
  }

   /**
   * Obj. přijaté v ev.jedn.(potvrzené)
   * @return receivedOrderedQuantity
  **/
  @ApiModelProperty(example = "null", value = "Obj. přijaté v ev.jedn.(potvrzené)")
  public Double getReceivedOrderedQuantity() {
    return receivedOrderedQuantity;
  }

  public void setReceivedOrderedQuantity(Double receivedOrderedQuantity) {
    this.receivedOrderedQuantity = receivedOrderedQuantity;
  }

  public Storesubcard receivedOrderedUnitQuantity(Double receivedOrderedUnitQuantity) {
    this.receivedOrderedUnitQuantity = receivedOrderedUnitQuantity;
    return this;
  }

   /**
   * Obj. přijaté (potvrzené)
   * @return receivedOrderedUnitQuantity
  **/
  @ApiModelProperty(example = "null", value = "Obj. přijaté (potvrzené)")
  public Double getReceivedOrderedUnitQuantity() {
    return receivedOrderedUnitQuantity;
  }

  public void setReceivedOrderedUnitQuantity(Double receivedOrderedUnitQuantity) {
    this.receivedOrderedUnitQuantity = receivedOrderedUnitQuantity;
  }

  public Storesubcard issuedOrderedQuantity(Double issuedOrderedQuantity) {
    this.issuedOrderedQuantity = issuedOrderedQuantity;
    return this;
  }

   /**
   * Obj. vydané v ev.jedn.(potvrzené)
   * @return issuedOrderedQuantity
  **/
  @ApiModelProperty(example = "null", value = "Obj. vydané v ev.jedn.(potvrzené)")
  public Double getIssuedOrderedQuantity() {
    return issuedOrderedQuantity;
  }

  public void setIssuedOrderedQuantity(Double issuedOrderedQuantity) {
    this.issuedOrderedQuantity = issuedOrderedQuantity;
  }

  public Storesubcard issuedOrderedUnitQuantity(Double issuedOrderedUnitQuantity) {
    this.issuedOrderedUnitQuantity = issuedOrderedUnitQuantity;
    return this;
  }

   /**
   * Obj. vydané (potvrzené)
   * @return issuedOrderedUnitQuantity
  **/
  @ApiModelProperty(example = "null", value = "Obj. vydané (potvrzené)")
  public Double getIssuedOrderedUnitQuantity() {
    return issuedOrderedUnitQuantity;
  }

  public void setIssuedOrderedUnitQuantity(Double issuedOrderedUnitQuantity) {
    this.issuedOrderedUnitQuantity = issuedOrderedUnitQuantity;
  }

  public Storesubcard inventoryStatus(Integer inventoryStatus) {
    this.inventoryStatus = inventoryStatus;
    return this;
  }

   /**
   * Blokace inventurou [persistentní položka]
   * @return inventoryStatus
  **/
  @ApiModelProperty(example = "null", value = "Blokace inventurou [persistentní položka]")
  public Integer getInventoryStatus() {
    return inventoryStatus;
  }

  public void setInventoryStatus(Integer inventoryStatus) {
    this.inventoryStatus = inventoryStatus;
  }

  public Storesubcard lastInventoryDATE(DateTime lastInventoryDATE) {
    this.lastInventoryDATE = lastInventoryDATE;
    return this;
  }

   /**
   * Poslední inventarizace [persistentní položka]
   * @return lastInventoryDATE
  **/
  @ApiModelProperty(example = "null", value = "Poslední inventarizace [persistentní položka]")
  public DateTime getLastInventoryDATE() {
    return lastInventoryDATE;
  }

  public void setLastInventoryDATE(DateTime lastInventoryDATE) {
    this.lastInventoryDATE = lastInventoryDATE;
  }

  public Storesubcard dateOfEndInventoryDATE(DateTime dateOfEndInventoryDATE) {
    this.dateOfEndInventoryDATE = dateOfEndInventoryDATE;
    return this;
  }

   /**
   * Konec inventury [persistentní položka]
   * @return dateOfEndInventoryDATE
  **/
  @ApiModelProperty(example = "null", value = "Konec inventury [persistentní položka]")
  public DateTime getDateOfEndInventoryDATE() {
    return dateOfEndInventoryDATE;
  }

  public void setDateOfEndInventoryDATE(DateTime dateOfEndInventoryDATE) {
    this.dateOfEndInventoryDATE = dateOfEndInventoryDATE;
  }

  public Storesubcard averageStorePrice(Double averageStorePrice) {
    this.averageStorePrice = averageStorePrice;
    return this;
  }

   /**
   * Průměrná skladová cena z ocenění [persistentní položka]
   * @return averageStorePrice
  **/
  @ApiModelProperty(example = "null", value = "Průměrná skladová cena z ocenění [persistentní položka]")
  public Double getAverageStorePrice() {
    return averageStorePrice;
  }

  public void setAverageStorePrice(Double averageStorePrice) {
    this.averageStorePrice = averageStorePrice;
  }

  public Storesubcard averageStorePriceDateDATE(DateTime averageStorePriceDateDATE) {
    this.averageStorePriceDateDATE = averageStorePriceDateDATE;
    return this;
  }

   /**
   * Datum posledního ocenění [persistentní položka]
   * @return averageStorePriceDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum posledního ocenění [persistentní položka]")
  public DateTime getAverageStorePriceDateDATE() {
    return averageStorePriceDateDATE;
  }

  public void setAverageStorePriceDateDATE(DateTime averageStorePriceDateDATE) {
    this.averageStorePriceDateDATE = averageStorePriceDateDATE;
  }

  public Storesubcard mainUnitAverageStorePrice(Double mainUnitAverageStorePrice) {
    this.mainUnitAverageStorePrice = mainUnitAverageStorePrice;
    return this;
  }

   /**
   * Průměrná skl. cena k hl. jednotce
   * @return mainUnitAverageStorePrice
  **/
  @ApiModelProperty(example = "null", value = "Průměrná skl. cena k hl. jednotce")
  public Double getMainUnitAverageStorePrice() {
    return mainUnitAverageStorePrice;
  }

  public void setMainUnitAverageStorePrice(Double mainUnitAverageStorePrice) {
    this.mainUnitAverageStorePrice = mainUnitAverageStorePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Storesubcard storesubcard = (Storesubcard) o;
    return Objects.equals(this.displayName, storesubcard.displayName) &&
        Objects.equals(this.ID, storesubcard.ID) &&
        Objects.equals(this.classID, storesubcard.classID) &&
        Objects.equals(this.objVersion, storesubcard.objVersion) &&
        Objects.equals(this.storeID, storesubcard.storeID) &&
        Objects.equals(this.storeCardID, storesubcard.storeCardID) &&
        Objects.equals(this.locationID, storesubcard.locationID) &&
        Objects.equals(this.quantity, storesubcard.quantity) &&
        Objects.equals(this.purchasePrice, storesubcard.purchasePrice) &&
        Objects.equals(this.additionalPurchasePrice, storesubcard.additionalPurchasePrice) &&
        Objects.equals(this.purchaseCurrencyID, storesubcard.purchaseCurrencyID) &&
        Objects.equals(this.purchaseCurrRate, storesubcard.purchaseCurrRate) &&
        Objects.equals(this.purchaseRefCurrRate, storesubcard.purchaseRefCurrRate) &&
        Objects.equals(this.purchaseCoef, storesubcard.purchaseCoef) &&
        Objects.equals(this.localPurchaseCoef, storesubcard.localPurchaseCoef) &&
        Objects.equals(this.purchaseZoneID, storesubcard.purchaseZoneID) &&
        Objects.equals(this.localPurchaseZoneID, storesubcard.localPurchaseZoneID) &&
        Objects.equals(this.purchaseFirmID, storesubcard.purchaseFirmID) &&
        Objects.equals(this.transportationPercentage, storesubcard.transportationPercentage) &&
        Objects.equals(this.otherCostPercentage, storesubcard.otherCostPercentage) &&
        Objects.equals(this.purchaseDateDATE, storesubcard.purchaseDateDATE) &&
        Objects.equals(this.invQuantity, storesubcard.invQuantity) &&
        Objects.equals(this.invQUnitRate, storesubcard.invQUnitRate) &&
        Objects.equals(this.invQUnitCode, storesubcard.invQUnitCode) &&
        Objects.equals(this.invChange, storesubcard.invChange) &&
        Objects.equals(this.lowLimitQuantity, storesubcard.lowLimitQuantity) &&
        Objects.equals(this.highLimitQuantity, storesubcard.highLimitQuantity) &&
        Objects.equals(this.unitLowLimitQuantity, storesubcard.unitLowLimitQuantity) &&
        Objects.equals(this.unitHighLimitQuantity, storesubcard.unitHighLimitQuantity) &&
        Objects.equals(this.mainUnitCode, storesubcard.mainUnitCode) &&
        Objects.equals(this.mainUnitQuantity, storesubcard.mainUnitQuantity) &&
        Objects.equals(this.mainUnitPurchasePrice, storesubcard.mainUnitPurchasePrice) &&
        Objects.equals(this.mainUnitAdditionalPurchasePrice, storesubcard.mainUnitAdditionalPurchasePrice) &&
        Objects.equals(this.purchaseRefCurrencyID, storesubcard.purchaseRefCurrencyID) &&
        Objects.equals(this.localPurchaseRefCurrencyID, storesubcard.localPurchaseRefCurrencyID) &&
        Objects.equals(this.canValidateOutOfStock, storesubcard.canValidateOutOfStock) &&
        Objects.equals(this.intrastatInputStatisticID, storesubcard.intrastatInputStatisticID) &&
        Objects.equals(this.intrastatOutputStatisticID, storesubcard.intrastatOutputStatisticID) &&
        Objects.equals(this.receivedOrderedQuantity, storesubcard.receivedOrderedQuantity) &&
        Objects.equals(this.receivedOrderedUnitQuantity, storesubcard.receivedOrderedUnitQuantity) &&
        Objects.equals(this.issuedOrderedQuantity, storesubcard.issuedOrderedQuantity) &&
        Objects.equals(this.issuedOrderedUnitQuantity, storesubcard.issuedOrderedUnitQuantity) &&
        Objects.equals(this.inventoryStatus, storesubcard.inventoryStatus) &&
        Objects.equals(this.lastInventoryDATE, storesubcard.lastInventoryDATE) &&
        Objects.equals(this.dateOfEndInventoryDATE, storesubcard.dateOfEndInventoryDATE) &&
        Objects.equals(this.averageStorePrice, storesubcard.averageStorePrice) &&
        Objects.equals(this.averageStorePriceDateDATE, storesubcard.averageStorePriceDateDATE) &&
        Objects.equals(this.mainUnitAverageStorePrice, storesubcard.mainUnitAverageStorePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, storeID, storeCardID, locationID, quantity, purchasePrice, additionalPurchasePrice, purchaseCurrencyID, purchaseCurrRate, purchaseRefCurrRate, purchaseCoef, localPurchaseCoef, purchaseZoneID, localPurchaseZoneID, purchaseFirmID, transportationPercentage, otherCostPercentage, purchaseDateDATE, invQuantity, invQUnitRate, invQUnitCode, invChange, lowLimitQuantity, highLimitQuantity, unitLowLimitQuantity, unitHighLimitQuantity, mainUnitCode, mainUnitQuantity, mainUnitPurchasePrice, mainUnitAdditionalPurchasePrice, purchaseRefCurrencyID, localPurchaseRefCurrencyID, canValidateOutOfStock, intrastatInputStatisticID, intrastatOutputStatisticID, receivedOrderedQuantity, receivedOrderedUnitQuantity, issuedOrderedQuantity, issuedOrderedUnitQuantity, inventoryStatus, lastInventoryDATE, dateOfEndInventoryDATE, averageStorePrice, averageStorePriceDateDATE, mainUnitAverageStorePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Storesubcard {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    storeID: ").append(toIndentedString(storeID)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    additionalPurchasePrice: ").append(toIndentedString(additionalPurchasePrice)).append("\n");
    sb.append("    purchaseCurrencyID: ").append(toIndentedString(purchaseCurrencyID)).append("\n");
    sb.append("    purchaseCurrRate: ").append(toIndentedString(purchaseCurrRate)).append("\n");
    sb.append("    purchaseRefCurrRate: ").append(toIndentedString(purchaseRefCurrRate)).append("\n");
    sb.append("    purchaseCoef: ").append(toIndentedString(purchaseCoef)).append("\n");
    sb.append("    localPurchaseCoef: ").append(toIndentedString(localPurchaseCoef)).append("\n");
    sb.append("    purchaseZoneID: ").append(toIndentedString(purchaseZoneID)).append("\n");
    sb.append("    localPurchaseZoneID: ").append(toIndentedString(localPurchaseZoneID)).append("\n");
    sb.append("    purchaseFirmID: ").append(toIndentedString(purchaseFirmID)).append("\n");
    sb.append("    transportationPercentage: ").append(toIndentedString(transportationPercentage)).append("\n");
    sb.append("    otherCostPercentage: ").append(toIndentedString(otherCostPercentage)).append("\n");
    sb.append("    purchaseDateDATE: ").append(toIndentedString(purchaseDateDATE)).append("\n");
    sb.append("    invQuantity: ").append(toIndentedString(invQuantity)).append("\n");
    sb.append("    invQUnitRate: ").append(toIndentedString(invQUnitRate)).append("\n");
    sb.append("    invQUnitCode: ").append(toIndentedString(invQUnitCode)).append("\n");
    sb.append("    invChange: ").append(toIndentedString(invChange)).append("\n");
    sb.append("    lowLimitQuantity: ").append(toIndentedString(lowLimitQuantity)).append("\n");
    sb.append("    highLimitQuantity: ").append(toIndentedString(highLimitQuantity)).append("\n");
    sb.append("    unitLowLimitQuantity: ").append(toIndentedString(unitLowLimitQuantity)).append("\n");
    sb.append("    unitHighLimitQuantity: ").append(toIndentedString(unitHighLimitQuantity)).append("\n");
    sb.append("    mainUnitCode: ").append(toIndentedString(mainUnitCode)).append("\n");
    sb.append("    mainUnitQuantity: ").append(toIndentedString(mainUnitQuantity)).append("\n");
    sb.append("    mainUnitPurchasePrice: ").append(toIndentedString(mainUnitPurchasePrice)).append("\n");
    sb.append("    mainUnitAdditionalPurchasePrice: ").append(toIndentedString(mainUnitAdditionalPurchasePrice)).append("\n");
    sb.append("    purchaseRefCurrencyID: ").append(toIndentedString(purchaseRefCurrencyID)).append("\n");
    sb.append("    localPurchaseRefCurrencyID: ").append(toIndentedString(localPurchaseRefCurrencyID)).append("\n");
    sb.append("    canValidateOutOfStock: ").append(toIndentedString(canValidateOutOfStock)).append("\n");
    sb.append("    intrastatInputStatisticID: ").append(toIndentedString(intrastatInputStatisticID)).append("\n");
    sb.append("    intrastatOutputStatisticID: ").append(toIndentedString(intrastatOutputStatisticID)).append("\n");
    sb.append("    receivedOrderedQuantity: ").append(toIndentedString(receivedOrderedQuantity)).append("\n");
    sb.append("    receivedOrderedUnitQuantity: ").append(toIndentedString(receivedOrderedUnitQuantity)).append("\n");
    sb.append("    issuedOrderedQuantity: ").append(toIndentedString(issuedOrderedQuantity)).append("\n");
    sb.append("    issuedOrderedUnitQuantity: ").append(toIndentedString(issuedOrderedUnitQuantity)).append("\n");
    sb.append("    inventoryStatus: ").append(toIndentedString(inventoryStatus)).append("\n");
    sb.append("    lastInventoryDATE: ").append(toIndentedString(lastInventoryDATE)).append("\n");
    sb.append("    dateOfEndInventoryDATE: ").append(toIndentedString(dateOfEndInventoryDATE)).append("\n");
    sb.append("    averageStorePrice: ").append(toIndentedString(averageStorePrice)).append("\n");
    sb.append("    averageStorePriceDateDATE: ").append(toIndentedString(averageStorePriceDateDATE)).append("\n");
    sb.append("    mainUnitAverageStorePrice: ").append(toIndentedString(mainUnitAverageStorePrice)).append("\n");
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

