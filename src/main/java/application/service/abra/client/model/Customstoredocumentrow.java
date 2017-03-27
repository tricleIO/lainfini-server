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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Customstoredocumentrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Customstoredocumentrow   {
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

  @SerializedName("Text")
  private String text = null;

  @SerializedName("RowType")
  private Integer rowType = null;

  @SerializedName("Division_ID")
  private String divisionID = null;

  @SerializedName("BusOrder_ID")
  private String busOrderID = null;

  @SerializedName("BusTransaction_ID")
  private String busTransactionID = null;

  @SerializedName("TAmount")
  private Double tAmount = null;

  @SerializedName("LocalTAmount")
  private Double localTAmount = null;

  @SerializedName("QUnit")
  private String qUnit = null;

  @SerializedName("UnitRate")
  private Double unitRate = null;

  @SerializedName("MainUnitRate")
  private Double mainUnitRate = null;

  @SerializedName("Store_ID")
  private String storeID = null;

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("ClosingOrder")
  private Integer closingOrder = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  @SerializedName("UnitQuantity")
  private Double unitQuantity = null;

  @SerializedName("MainUnitQuantity")
  private Double mainUnitQuantity = null;

  @SerializedName("UnitPrice")
  private Double unitPrice = null;

  @SerializedName("TotalPrice")
  private Double totalPrice = null;

  @SerializedName("ClosingIndex")
  private Integer closingIndex = null;

  @SerializedName("RDocumentRow_ID")
  private String rDocumentRowID = null;

  @SerializedName("CompletePrices")
  private Boolean completePrices = null;

  @SerializedName("Weight")
  private Double weight = null;

  @SerializedName("Capacity")
  private Double capacity = null;

  @SerializedName("WeightUnit")
  private Integer weightUnit = null;

  @SerializedName("CapacityUnit")
  private Integer capacityUnit = null;

  @SerializedName("ReservedQuantity")
  private Double reservedQuantity = null;

  @SerializedName("BatchStatus")
  private Integer batchStatus = null;

  @SerializedName("DeliveredQuantity")
  private Double deliveredQuantity = null;

  @SerializedName("DeliveredQuantityStr")
  private String deliveredQuantityStr = null;

  @SerializedName("ProvideRow_ID")
  private String provideRowID = null;

  @SerializedName("DocRowBatches")
  private List<Docrowbatch> docRowBatches = new ArrayList<Docrowbatch>();

  @SerializedName("AdditionalCosts_ID")
  private Customstoredocumentrow additionalCostsID = null;

  @SerializedName("ProductionTask_ID")
  private String productionTaskID = null;

  @SerializedName("ToIntrastat")
  private Boolean toIntrastat = null;

  @SerializedName("OriginCountry_ID")
  private String originCountryID = null;

  @SerializedName("IntrastatRegion_ID")
  private String intrastatRegionID = null;

  @SerializedName("IntrastatInputStatistic_ID")
  private String intrastatInputStatisticID = null;

  @SerializedName("StatisticAmount")
  private Double statisticAmount = null;

  @SerializedName("IntrastatTransport")
  private Boolean intrastatTransport = null;

  @SerializedName("IntrastatCurrency_ID")
  private String intrastatCurrencyID = null;

  @SerializedName("IntrastatAmount")
  private Double intrastatAmount = null;

  @SerializedName("LocalIntrastatAmount")
  private Double localIntrastatAmount = null;

  @SerializedName("IntrastatOutputStatistic_ID")
  private String intrastatOutputStatisticID = null;

  @SerializedName("Provide_ID")
  private String provideID = null;

  @SerializedName("IntrastatStatus")
  private Integer intrastatStatus = null;

  @SerializedName("BusProject_ID")
  private String busProjectID = null;

  @SerializedName("RowExtID")
  private String rowExtID = null;

  @SerializedName("InventoryCoupon")
  private Boolean inventoryCoupon = null;

  @SerializedName("OrderFlow")
  private Integer orderFlow = null;

  @SerializedName("Valuated")
  private Boolean valuated = null;

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
   * Vlastník; ID objektu Skladový doklad [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Skladový doklad [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Customstoredocumentrow posIndex(Integer posIndex) {
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

  public Customstoredocumentrow text(String text) {
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

  public Customstoredocumentrow rowType(Integer rowType) {
    this.rowType = rowType;
    return this;
  }

   /**
   * Typ [persistentní položka]
   * @return rowType
  **/
  @ApiModelProperty(example = "null", value = "Typ [persistentní položka]")
  public Integer getRowType() {
    return rowType;
  }

  public void setRowType(Integer rowType) {
    this.rowType = rowType;
  }

  public Customstoredocumentrow divisionID(String divisionID) {
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

  public Customstoredocumentrow busOrderID(String busOrderID) {
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

  public Customstoredocumentrow busTransactionID(String busTransactionID) {
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

   /**
   * Celkem [persistentní položka]
   * @return tAmount
  **/
  @ApiModelProperty(example = "null", value = "Celkem [persistentní položka]")
  public Double getTAmount() {
    return tAmount;
  }

   /**
   * Celkem lokálně [persistentní položka]
   * @return localTAmount
  **/
  @ApiModelProperty(example = "null", value = "Celkem lokálně [persistentní položka]")
  public Double getLocalTAmount() {
    return localTAmount;
  }

  public Customstoredocumentrow qUnit(String qUnit) {
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

  public Customstoredocumentrow unitRate(Double unitRate) {
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

  public Customstoredocumentrow mainUnitRate(Double mainUnitRate) {
    this.mainUnitRate = mainUnitRate;
    return this;
  }

   /**
   * Vztah hl. jednotky
   * @return mainUnitRate
  **/
  @ApiModelProperty(example = "null", value = "Vztah hl. jednotky")
  public Double getMainUnitRate() {
    return mainUnitRate;
  }

  public void setMainUnitRate(Double mainUnitRate) {
    this.mainUnitRate = mainUnitRate;
  }

  public Customstoredocumentrow storeID(String storeID) {
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

  public Customstoredocumentrow storeCardID(String storeCardID) {
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

   /**
   * Číslo uzávěrky [persistentní položka]
   * @return closingOrder
  **/
  @ApiModelProperty(example = "null", value = "Číslo uzávěrky [persistentní položka]")
  public Integer getClosingOrder() {
    return closingOrder;
  }

  public Customstoredocumentrow quantity(Double quantity) {
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

  public Customstoredocumentrow unitQuantity(Double unitQuantity) {
    this.unitQuantity = unitQuantity;
    return this;
  }

   /**
   * Počet
   * @return unitQuantity
  **/
  @ApiModelProperty(example = "null", value = "Počet")
  public Double getUnitQuantity() {
    return unitQuantity;
  }

  public void setUnitQuantity(Double unitQuantity) {
    this.unitQuantity = unitQuantity;
  }

  public Customstoredocumentrow mainUnitQuantity(Double mainUnitQuantity) {
    this.mainUnitQuantity = mainUnitQuantity;
    return this;
  }

   /**
   * Počet v hl. jednotce
   * @return mainUnitQuantity
  **/
  @ApiModelProperty(example = "null", value = "Počet v hl. jednotce")
  public Double getMainUnitQuantity() {
    return mainUnitQuantity;
  }

  public void setMainUnitQuantity(Double mainUnitQuantity) {
    this.mainUnitQuantity = mainUnitQuantity;
  }

  public Customstoredocumentrow unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Jedn.cena [persistentní položka]
   * @return unitPrice
  **/
  @ApiModelProperty(example = "null", value = "Jedn.cena [persistentní položka]")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Customstoredocumentrow totalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Celk.cena [persistentní položka]
   * @return totalPrice
  **/
  @ApiModelProperty(example = "null", value = "Celk.cena [persistentní položka]")
  public Double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }

   /**
   * Poř.číslo [persistentní položka]
   * @return closingIndex
  **/
  @ApiModelProperty(example = "null", value = "Poř.číslo [persistentní položka]")
  public Integer getClosingIndex() {
    return closingIndex;
  }

  public Customstoredocumentrow rDocumentRowID(String rDocumentRowID) {
    this.rDocumentRowID = rDocumentRowID;
    return this;
  }

   /**
   * Vazební řádka; ID objektu Skladový doklad - řádek [persistentní položka]
   * @return rDocumentRowID
  **/
  @ApiModelProperty(example = "null", value = "Vazební řádka; ID objektu Skladový doklad - řádek [persistentní položka]")
  public String getRDocumentRowID() {
    return rDocumentRowID;
  }

  public void setRDocumentRowID(String rDocumentRowID) {
    this.rDocumentRowID = rDocumentRowID;
  }

  public Customstoredocumentrow completePrices(Boolean completePrices) {
    this.completePrices = completePrices;
    return this;
  }

   /**
   * Kompletní ceny [persistentní položka]
   * @return completePrices
  **/
  @ApiModelProperty(example = "null", value = "Kompletní ceny [persistentní položka]")
  public Boolean getCompletePrices() {
    return completePrices;
  }

  public void setCompletePrices(Boolean completePrices) {
    this.completePrices = completePrices;
  }

  public Customstoredocumentrow weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Celk.hmot.
   * @return weight
  **/
  @ApiModelProperty(example = "null", value = "Celk.hmot.")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Customstoredocumentrow capacity(Double capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Celk.obj.
   * @return capacity
  **/
  @ApiModelProperty(example = "null", value = "Celk.obj.")
  public Double getCapacity() {
    return capacity;
  }

  public void setCapacity(Double capacity) {
    this.capacity = capacity;
  }

  public Customstoredocumentrow weightUnit(Integer weightUnit) {
    this.weightUnit = weightUnit;
    return this;
  }

   /**
   * Jedn.celk.hm.
   * @return weightUnit
  **/
  @ApiModelProperty(example = "null", value = "Jedn.celk.hm.")
  public Integer getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(Integer weightUnit) {
    this.weightUnit = weightUnit;
  }

  public Customstoredocumentrow capacityUnit(Integer capacityUnit) {
    this.capacityUnit = capacityUnit;
    return this;
  }

   /**
   * Jedn.celk.obj.
   * @return capacityUnit
  **/
  @ApiModelProperty(example = "null", value = "Jedn.celk.obj.")
  public Integer getCapacityUnit() {
    return capacityUnit;
  }

  public void setCapacityUnit(Integer capacityUnit) {
    this.capacityUnit = capacityUnit;
  }

   /**
   * Z rezervace [persistentní položka]
   * @return reservedQuantity
  **/
  @ApiModelProperty(example = "null", value = "Z rezervace [persistentní položka]")
  public Double getReservedQuantity() {
    return reservedQuantity;
  }

  public Customstoredocumentrow batchStatus(Integer batchStatus) {
    this.batchStatus = batchStatus;
    return this;
  }

   /**
   * Status šarží [persistentní položka]
   * @return batchStatus
  **/
  @ApiModelProperty(example = "null", value = "Status šarží [persistentní položka]")
  public Integer getBatchStatus() {
    return batchStatus;
  }

  public void setBatchStatus(Integer batchStatus) {
    this.batchStatus = batchStatus;
  }

   /**
   * Dodáno [persistentní položka]
   * @return deliveredQuantity
  **/
  @ApiModelProperty(example = "null", value = "Dodáno [persistentní položka]")
  public Double getDeliveredQuantity() {
    return deliveredQuantity;
  }

   /**
   * Dodáno
   * @return deliveredQuantityStr
  **/
  @ApiModelProperty(example = "null", value = "Dodáno")
  public String getDeliveredQuantityStr() {
    return deliveredQuantityStr;
  }

   /**
   * OID zdrojového řádku [persistentní položka]
   * @return provideRowID
  **/
  @ApiModelProperty(example = "null", value = "OID zdrojového řádku [persistentní položka]")
  public String getProvideRowID() {
    return provideRowID;
  }

  public Customstoredocumentrow docRowBatches(List<Docrowbatch> docRowBatches) {
    this.docRowBatches = docRowBatches;
    return this;
  }

  public Customstoredocumentrow addDocRowBatchesItem(Docrowbatch docRowBatchesItem) {
    this.docRowBatches.add(docRowBatchesItem);
    return this;
  }

   /**
   * Řádky šarží; kolekce BO Skladový doklad - pohyb šarže/sériového čísla [nepersistentní položka]
   * @return docRowBatches
  **/
  @ApiModelProperty(example = "null", value = "Řádky šarží; kolekce BO Skladový doklad - pohyb šarže/sériového čísla [nepersistentní položka]")
  public List<Docrowbatch> getDocRowBatches() {
    return docRowBatches;
  }

  public void setDocRowBatches(List<Docrowbatch> docRowBatches) {
    this.docRowBatches = docRowBatches;
  }

  public Customstoredocumentrow additionalCostsID(Customstoredocumentrow additionalCostsID) {
    this.additionalCostsID = additionalCostsID;
    return this;
  }

   /**
   * Get additionalCostsID
   * @return additionalCostsID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Customstoredocumentrow getAdditionalCostsID() {
    return additionalCostsID;
  }

  public void setAdditionalCostsID(Customstoredocumentrow additionalCostsID) {
    this.additionalCostsID = additionalCostsID;
  }

  public Customstoredocumentrow productionTaskID(String productionTaskID) {
    this.productionTaskID = productionTaskID;
    return this;
  }

   /**
   * Výrobní úloha; ID objektu Výrobní úloha [persistentní položka]
   * @return productionTaskID
  **/
  @ApiModelProperty(example = "null", value = "Výrobní úloha; ID objektu Výrobní úloha [persistentní položka]")
  public String getProductionTaskID() {
    return productionTaskID;
  }

  public void setProductionTaskID(String productionTaskID) {
    this.productionTaskID = productionTaskID;
  }

  public Customstoredocumentrow toIntrastat(Boolean toIntrastat) {
    this.toIntrastat = toIntrastat;
    return this;
  }

   /**
   * Do Intrastat [persistentní položka]
   * @return toIntrastat
  **/
  @ApiModelProperty(example = "null", value = "Do Intrastat [persistentní položka]")
  public Boolean getToIntrastat() {
    return toIntrastat;
  }

  public void setToIntrastat(Boolean toIntrastat) {
    this.toIntrastat = toIntrastat;
  }

  public Customstoredocumentrow originCountryID(String originCountryID) {
    this.originCountryID = originCountryID;
    return this;
  }

   /**
   * Země původu; ID objektu Země [persistentní položka]
   * @return originCountryID
  **/
  @ApiModelProperty(example = "null", value = "Země původu; ID objektu Země [persistentní položka]")
  public String getOriginCountryID() {
    return originCountryID;
  }

  public void setOriginCountryID(String originCountryID) {
    this.originCountryID = originCountryID;
  }

  public Customstoredocumentrow intrastatRegionID(String intrastatRegionID) {
    this.intrastatRegionID = intrastatRegionID;
    return this;
  }

   /**
   * Kraj určení; ID objektu Kraj [persistentní položka]
   * @return intrastatRegionID
  **/
  @ApiModelProperty(example = "null", value = "Kraj určení; ID objektu Kraj [persistentní položka]")
  public String getIntrastatRegionID() {
    return intrastatRegionID;
  }

  public void setIntrastatRegionID(String intrastatRegionID) {
    this.intrastatRegionID = intrastatRegionID;
  }

  public Customstoredocumentrow intrastatInputStatisticID(String intrastatInputStatisticID) {
    this.intrastatInputStatisticID = intrastatInputStatisticID;
    return this;
  }

   /**
   * Def.stat.hodnoty na vstupu; ID objektu Definice statistické hodnoty na vstupu [persistentní položka]
   * @return intrastatInputStatisticID
  **/
  @ApiModelProperty(example = "null", value = "Def.stat.hodnoty na vstupu; ID objektu Definice statistické hodnoty na vstupu [persistentní položka]")
  public String getIntrastatInputStatisticID() {
    return intrastatInputStatisticID;
  }

  public void setIntrastatInputStatisticID(String intrastatInputStatisticID) {
    this.intrastatInputStatisticID = intrastatInputStatisticID;
  }

  public Customstoredocumentrow statisticAmount(Double statisticAmount) {
    this.statisticAmount = statisticAmount;
    return this;
  }

   /**
   * Stat.hodnota [persistentní položka]
   * @return statisticAmount
  **/
  @ApiModelProperty(example = "null", value = "Stat.hodnota [persistentní položka]")
  public Double getStatisticAmount() {
    return statisticAmount;
  }

  public void setStatisticAmount(Double statisticAmount) {
    this.statisticAmount = statisticAmount;
  }

  public Customstoredocumentrow intrastatTransport(Boolean intrastatTransport) {
    this.intrastatTransport = intrastatTransport;
    return this;
  }

   /**
   * Doprava do Intrastatu [persistentní položka]
   * @return intrastatTransport
  **/
  @ApiModelProperty(example = "null", value = "Doprava do Intrastatu [persistentní položka]")
  public Boolean getIntrastatTransport() {
    return intrastatTransport;
  }

  public void setIntrastatTransport(Boolean intrastatTransport) {
    this.intrastatTransport = intrastatTransport;
  }

  public Customstoredocumentrow intrastatCurrencyID(String intrastatCurrencyID) {
    this.intrastatCurrencyID = intrastatCurrencyID;
    return this;
  }

   /**
   * Měna Intrastat; ID objektu Měna [persistentní položka]
   * @return intrastatCurrencyID
  **/
  @ApiModelProperty(example = "null", value = "Měna Intrastat; ID objektu Měna [persistentní položka]")
  public String getIntrastatCurrencyID() {
    return intrastatCurrencyID;
  }

  public void setIntrastatCurrencyID(String intrastatCurrencyID) {
    this.intrastatCurrencyID = intrastatCurrencyID;
  }

  public Customstoredocumentrow intrastatAmount(Double intrastatAmount) {
    this.intrastatAmount = intrastatAmount;
    return this;
  }

   /**
   * Částka pro Intrastat [persistentní položka]
   * @return intrastatAmount
  **/
  @ApiModelProperty(example = "null", value = "Částka pro Intrastat [persistentní položka]")
  public Double getIntrastatAmount() {
    return intrastatAmount;
  }

  public void setIntrastatAmount(Double intrastatAmount) {
    this.intrastatAmount = intrastatAmount;
  }

  public Customstoredocumentrow localIntrastatAmount(Double localIntrastatAmount) {
    this.localIntrastatAmount = localIntrastatAmount;
    return this;
  }

   /**
   * Částka pro Intrastat [persistentní položka]
   * @return localIntrastatAmount
  **/
  @ApiModelProperty(example = "null", value = "Částka pro Intrastat [persistentní položka]")
  public Double getLocalIntrastatAmount() {
    return localIntrastatAmount;
  }

  public void setLocalIntrastatAmount(Double localIntrastatAmount) {
    this.localIntrastatAmount = localIntrastatAmount;
  }

  public Customstoredocumentrow intrastatOutputStatisticID(String intrastatOutputStatisticID) {
    this.intrastatOutputStatisticID = intrastatOutputStatisticID;
    return this;
  }

   /**
   * Def.stat.hodnoty na výstupu; ID objektu Definice statistické hodnoty na vstupu [persistentní položka]
   * @return intrastatOutputStatisticID
  **/
  @ApiModelProperty(example = "null", value = "Def.stat.hodnoty na výstupu; ID objektu Definice statistické hodnoty na vstupu [persistentní položka]")
  public String getIntrastatOutputStatisticID() {
    return intrastatOutputStatisticID;
  }

  public void setIntrastatOutputStatisticID(String intrastatOutputStatisticID) {
    this.intrastatOutputStatisticID = intrastatOutputStatisticID;
  }

   /**
   * OID zdrojového dokladu [persistentní položka]
   * @return provideID
  **/
  @ApiModelProperty(example = "null", value = "OID zdrojového dokladu [persistentní položka]")
  public String getProvideID() {
    return provideID;
  }

   /**
   * Do Intrastat
   * @return intrastatStatus
  **/
  @ApiModelProperty(example = "null", value = "Do Intrastat")
  public Integer getIntrastatStatus() {
    return intrastatStatus;
  }

  public Customstoredocumentrow busProjectID(String busProjectID) {
    this.busProjectID = busProjectID;
    return this;
  }

   /**
   * Zakázka; ID objektu Projekt [persistentní položka]
   * @return busProjectID
  **/
  @ApiModelProperty(example = "null", value = "Zakázka; ID objektu Projekt [persistentní položka]")
  public String getBusProjectID() {
    return busProjectID;
  }

  public void setBusProjectID(String busProjectID) {
    this.busProjectID = busProjectID;
  }

  public Customstoredocumentrow rowExtID(String rowExtID) {
    this.rowExtID = rowExtID;
    return this;
  }

   /**
   * Odkaz na ISDOC [persistentní položka]
   * @return rowExtID
  **/
  @ApiModelProperty(example = "null", value = "Odkaz na ISDOC [persistentní položka]")
  public String getRowExtID() {
    return rowExtID;
  }

  public void setRowExtID(String rowExtID) {
    this.rowExtID = rowExtID;
  }

  public Customstoredocumentrow inventoryCoupon(Boolean inventoryCoupon) {
    this.inventoryCoupon = inventoryCoupon;
    return this;
  }

   /**
   * Inventární lístek [persistentní položka]
   * @return inventoryCoupon
  **/
  @ApiModelProperty(example = "null", value = "Inventární lístek [persistentní položka]")
  public Boolean getInventoryCoupon() {
    return inventoryCoupon;
  }

  public void setInventoryCoupon(Boolean inventoryCoupon) {
    this.inventoryCoupon = inventoryCoupon;
  }

   /**
   * OrderFlow [persistentní položka]
   * @return orderFlow
  **/
  @ApiModelProperty(example = "null", value = "OrderFlow [persistentní položka]")
  public Integer getOrderFlow() {
    return orderFlow;
  }

  public Customstoredocumentrow valuated(Boolean valuated) {
    this.valuated = valuated;
    return this;
  }

   /**
   * Oceněno [persistentní položka]
   * @return valuated
  **/
  @ApiModelProperty(example = "null", value = "Oceněno [persistentní položka]")
  public Boolean getValuated() {
    return valuated;
  }

  public void setValuated(Boolean valuated) {
    this.valuated = valuated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customstoredocumentrow customstoredocumentrow = (Customstoredocumentrow) o;
    return Objects.equals(this.displayName, customstoredocumentrow.displayName) &&
        Objects.equals(this.ID, customstoredocumentrow.ID) &&
        Objects.equals(this.classID, customstoredocumentrow.classID) &&
        Objects.equals(this.objVersion, customstoredocumentrow.objVersion) &&
        Objects.equals(this.parentID, customstoredocumentrow.parentID) &&
        Objects.equals(this.posIndex, customstoredocumentrow.posIndex) &&
        Objects.equals(this.text, customstoredocumentrow.text) &&
        Objects.equals(this.rowType, customstoredocumentrow.rowType) &&
        Objects.equals(this.divisionID, customstoredocumentrow.divisionID) &&
        Objects.equals(this.busOrderID, customstoredocumentrow.busOrderID) &&
        Objects.equals(this.busTransactionID, customstoredocumentrow.busTransactionID) &&
        Objects.equals(this.tAmount, customstoredocumentrow.tAmount) &&
        Objects.equals(this.localTAmount, customstoredocumentrow.localTAmount) &&
        Objects.equals(this.qUnit, customstoredocumentrow.qUnit) &&
        Objects.equals(this.unitRate, customstoredocumentrow.unitRate) &&
        Objects.equals(this.mainUnitRate, customstoredocumentrow.mainUnitRate) &&
        Objects.equals(this.storeID, customstoredocumentrow.storeID) &&
        Objects.equals(this.storeCardID, customstoredocumentrow.storeCardID) &&
        Objects.equals(this.closingOrder, customstoredocumentrow.closingOrder) &&
        Objects.equals(this.quantity, customstoredocumentrow.quantity) &&
        Objects.equals(this.unitQuantity, customstoredocumentrow.unitQuantity) &&
        Objects.equals(this.mainUnitQuantity, customstoredocumentrow.mainUnitQuantity) &&
        Objects.equals(this.unitPrice, customstoredocumentrow.unitPrice) &&
        Objects.equals(this.totalPrice, customstoredocumentrow.totalPrice) &&
        Objects.equals(this.closingIndex, customstoredocumentrow.closingIndex) &&
        Objects.equals(this.rDocumentRowID, customstoredocumentrow.rDocumentRowID) &&
        Objects.equals(this.completePrices, customstoredocumentrow.completePrices) &&
        Objects.equals(this.weight, customstoredocumentrow.weight) &&
        Objects.equals(this.capacity, customstoredocumentrow.capacity) &&
        Objects.equals(this.weightUnit, customstoredocumentrow.weightUnit) &&
        Objects.equals(this.capacityUnit, customstoredocumentrow.capacityUnit) &&
        Objects.equals(this.reservedQuantity, customstoredocumentrow.reservedQuantity) &&
        Objects.equals(this.batchStatus, customstoredocumentrow.batchStatus) &&
        Objects.equals(this.deliveredQuantity, customstoredocumentrow.deliveredQuantity) &&
        Objects.equals(this.deliveredQuantityStr, customstoredocumentrow.deliveredQuantityStr) &&
        Objects.equals(this.provideRowID, customstoredocumentrow.provideRowID) &&
        Objects.equals(this.docRowBatches, customstoredocumentrow.docRowBatches) &&
        Objects.equals(this.additionalCostsID, customstoredocumentrow.additionalCostsID) &&
        Objects.equals(this.productionTaskID, customstoredocumentrow.productionTaskID) &&
        Objects.equals(this.toIntrastat, customstoredocumentrow.toIntrastat) &&
        Objects.equals(this.originCountryID, customstoredocumentrow.originCountryID) &&
        Objects.equals(this.intrastatRegionID, customstoredocumentrow.intrastatRegionID) &&
        Objects.equals(this.intrastatInputStatisticID, customstoredocumentrow.intrastatInputStatisticID) &&
        Objects.equals(this.statisticAmount, customstoredocumentrow.statisticAmount) &&
        Objects.equals(this.intrastatTransport, customstoredocumentrow.intrastatTransport) &&
        Objects.equals(this.intrastatCurrencyID, customstoredocumentrow.intrastatCurrencyID) &&
        Objects.equals(this.intrastatAmount, customstoredocumentrow.intrastatAmount) &&
        Objects.equals(this.localIntrastatAmount, customstoredocumentrow.localIntrastatAmount) &&
        Objects.equals(this.intrastatOutputStatisticID, customstoredocumentrow.intrastatOutputStatisticID) &&
        Objects.equals(this.provideID, customstoredocumentrow.provideID) &&
        Objects.equals(this.intrastatStatus, customstoredocumentrow.intrastatStatus) &&
        Objects.equals(this.busProjectID, customstoredocumentrow.busProjectID) &&
        Objects.equals(this.rowExtID, customstoredocumentrow.rowExtID) &&
        Objects.equals(this.inventoryCoupon, customstoredocumentrow.inventoryCoupon) &&
        Objects.equals(this.orderFlow, customstoredocumentrow.orderFlow) &&
        Objects.equals(this.valuated, customstoredocumentrow.valuated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, text, rowType, divisionID, busOrderID, busTransactionID, tAmount, localTAmount, qUnit, unitRate, mainUnitRate, storeID, storeCardID, closingOrder, quantity, unitQuantity, mainUnitQuantity, unitPrice, totalPrice, closingIndex, rDocumentRowID, completePrices, weight, capacity, weightUnit, capacityUnit, reservedQuantity, batchStatus, deliveredQuantity, deliveredQuantityStr, provideRowID, docRowBatches, additionalCostsID, productionTaskID, toIntrastat, originCountryID, intrastatRegionID, intrastatInputStatisticID, statisticAmount, intrastatTransport, intrastatCurrencyID, intrastatAmount, localIntrastatAmount, intrastatOutputStatisticID, provideID, intrastatStatus, busProjectID, rowExtID, inventoryCoupon, orderFlow, valuated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customstoredocumentrow {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
    sb.append("    divisionID: ").append(toIndentedString(divisionID)).append("\n");
    sb.append("    busOrderID: ").append(toIndentedString(busOrderID)).append("\n");
    sb.append("    busTransactionID: ").append(toIndentedString(busTransactionID)).append("\n");
    sb.append("    tAmount: ").append(toIndentedString(tAmount)).append("\n");
    sb.append("    localTAmount: ").append(toIndentedString(localTAmount)).append("\n");
    sb.append("    qUnit: ").append(toIndentedString(qUnit)).append("\n");
    sb.append("    unitRate: ").append(toIndentedString(unitRate)).append("\n");
    sb.append("    mainUnitRate: ").append(toIndentedString(mainUnitRate)).append("\n");
    sb.append("    storeID: ").append(toIndentedString(storeID)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    closingOrder: ").append(toIndentedString(closingOrder)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitQuantity: ").append(toIndentedString(unitQuantity)).append("\n");
    sb.append("    mainUnitQuantity: ").append(toIndentedString(mainUnitQuantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    closingIndex: ").append(toIndentedString(closingIndex)).append("\n");
    sb.append("    rDocumentRowID: ").append(toIndentedString(rDocumentRowID)).append("\n");
    sb.append("    completePrices: ").append(toIndentedString(completePrices)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
    sb.append("    capacityUnit: ").append(toIndentedString(capacityUnit)).append("\n");
    sb.append("    reservedQuantity: ").append(toIndentedString(reservedQuantity)).append("\n");
    sb.append("    batchStatus: ").append(toIndentedString(batchStatus)).append("\n");
    sb.append("    deliveredQuantity: ").append(toIndentedString(deliveredQuantity)).append("\n");
    sb.append("    deliveredQuantityStr: ").append(toIndentedString(deliveredQuantityStr)).append("\n");
    sb.append("    provideRowID: ").append(toIndentedString(provideRowID)).append("\n");
    sb.append("    docRowBatches: ").append(toIndentedString(docRowBatches)).append("\n");
    sb.append("    additionalCostsID: ").append(toIndentedString(additionalCostsID)).append("\n");
    sb.append("    productionTaskID: ").append(toIndentedString(productionTaskID)).append("\n");
    sb.append("    toIntrastat: ").append(toIndentedString(toIntrastat)).append("\n");
    sb.append("    originCountryID: ").append(toIndentedString(originCountryID)).append("\n");
    sb.append("    intrastatRegionID: ").append(toIndentedString(intrastatRegionID)).append("\n");
    sb.append("    intrastatInputStatisticID: ").append(toIndentedString(intrastatInputStatisticID)).append("\n");
    sb.append("    statisticAmount: ").append(toIndentedString(statisticAmount)).append("\n");
    sb.append("    intrastatTransport: ").append(toIndentedString(intrastatTransport)).append("\n");
    sb.append("    intrastatCurrencyID: ").append(toIndentedString(intrastatCurrencyID)).append("\n");
    sb.append("    intrastatAmount: ").append(toIndentedString(intrastatAmount)).append("\n");
    sb.append("    localIntrastatAmount: ").append(toIndentedString(localIntrastatAmount)).append("\n");
    sb.append("    intrastatOutputStatisticID: ").append(toIndentedString(intrastatOutputStatisticID)).append("\n");
    sb.append("    provideID: ").append(toIndentedString(provideID)).append("\n");
    sb.append("    intrastatStatus: ").append(toIndentedString(intrastatStatus)).append("\n");
    sb.append("    busProjectID: ").append(toIndentedString(busProjectID)).append("\n");
    sb.append("    rowExtID: ").append(toIndentedString(rowExtID)).append("\n");
    sb.append("    inventoryCoupon: ").append(toIndentedString(inventoryCoupon)).append("\n");
    sb.append("    orderFlow: ").append(toIndentedString(orderFlow)).append("\n");
    sb.append("    valuated: ").append(toIndentedString(valuated)).append("\n");
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

