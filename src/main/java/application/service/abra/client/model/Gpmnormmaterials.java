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
 * Gpmnormmaterials
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Gpmnormmaterials   {
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

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("Store_ID")
  private String storeID = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  @SerializedName("UnitQuantity")
  private Double unitQuantity = null;

  @SerializedName("Weight")
  private Double weight = null;

  @SerializedName("UnitWeight")
  private Double unitWeight = null;

  @SerializedName("WeightUnit")
  private Integer weightUnit = null;

  @SerializedName("WeightInGrams")
  private Double weightInGrams = null;

  @SerializedName("WastePercentage")
  private Double wastePercentage = null;

  @SerializedName("Replaceable")
  private Integer replaceable = null;

  @SerializedName("Decomposition")
  private Boolean decomposition = null;

  @SerializedName("UseOperatingStore")
  private Boolean useOperatingStore = null;

  @SerializedName("QUnit")
  private String qUnit = null;

  @SerializedName("UnitRate")
  private Double unitRate = null;

  @SerializedName("CalculatedPrice")
  private Double calculatedPrice = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("TransferQUnit")
  private String transferQUnit = null;

  @SerializedName("TransferUnitRate")
  private Double transferUnitRate = null;

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
   * Vlastník; ID objektu Norma gastrovýroby [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Norma gastrovýroby [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Gpmnormmaterials posIndex(Integer posIndex) {
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

  public Gpmnormmaterials storeCardID(String storeCardID) {
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

  public Gpmnormmaterials storeID(String storeID) {
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

  public Gpmnormmaterials quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Počet v jedn.se vzt.1 [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "Počet v jedn.se vzt.1 [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Gpmnormmaterials unitQuantity(Double unitQuantity) {
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

  public Gpmnormmaterials weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Hmotnost
   * @return weight
  **/
  @ApiModelProperty(example = "null", value = "Hmotnost")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Gpmnormmaterials unitWeight(Double unitWeight) {
    this.unitWeight = unitWeight;
    return this;
  }

   /**
   * Hmotnost jednotky
   * @return unitWeight
  **/
  @ApiModelProperty(example = "null", value = "Hmotnost jednotky")
  public Double getUnitWeight() {
    return unitWeight;
  }

  public void setUnitWeight(Double unitWeight) {
    this.unitWeight = unitWeight;
  }

  public Gpmnormmaterials weightUnit(Integer weightUnit) {
    this.weightUnit = weightUnit;
    return this;
  }

   /**
   * Hmotnostní jednotka
   * @return weightUnit
  **/
  @ApiModelProperty(example = "null", value = "Hmotnostní jednotka")
  public Integer getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(Integer weightUnit) {
    this.weightUnit = weightUnit;
  }

  public Gpmnormmaterials weightInGrams(Double weightInGrams) {
    this.weightInGrams = weightInGrams;
    return this;
  }

   /**
   * Hmotnost v gramech
   * @return weightInGrams
  **/
  @ApiModelProperty(example = "null", value = "Hmotnost v gramech")
  public Double getWeightInGrams() {
    return weightInGrams;
  }

  public void setWeightInGrams(Double weightInGrams) {
    this.weightInGrams = weightInGrams;
  }

  public Gpmnormmaterials wastePercentage(Double wastePercentage) {
    this.wastePercentage = wastePercentage;
    return this;
  }

   /**
   * Ztráty [persistentní položka]
   * @return wastePercentage
  **/
  @ApiModelProperty(example = "null", value = "Ztráty [persistentní položka]")
  public Double getWastePercentage() {
    return wastePercentage;
  }

  public void setWastePercentage(Double wastePercentage) {
    this.wastePercentage = wastePercentage;
  }

  public Gpmnormmaterials replaceable(Integer replaceable) {
    this.replaceable = replaceable;
    return this;
  }

   /**
   * Nahrazování [persistentní položka]
   * @return replaceable
  **/
  @ApiModelProperty(example = "null", value = "Nahrazování [persistentní položka]")
  public Integer getReplaceable() {
    return replaceable;
  }

  public void setReplaceable(Integer replaceable) {
    this.replaceable = replaceable;
  }

  public Gpmnormmaterials decomposition(Boolean decomposition) {
    this.decomposition = decomposition;
    return this;
  }

   /**
   * Rozpad [persistentní položka]
   * @return decomposition
  **/
  @ApiModelProperty(example = "null", value = "Rozpad [persistentní položka]")
  public Boolean getDecomposition() {
    return decomposition;
  }

  public void setDecomposition(Boolean decomposition) {
    this.decomposition = decomposition;
  }

  public Gpmnormmaterials useOperatingStore(Boolean useOperatingStore) {
    this.useOperatingStore = useOperatingStore;
    return this;
  }

   /**
   * Z provozního skladu [persistentní položka]
   * @return useOperatingStore
  **/
  @ApiModelProperty(example = "null", value = "Z provozního skladu [persistentní položka]")
  public Boolean getUseOperatingStore() {
    return useOperatingStore;
  }

  public void setUseOperatingStore(Boolean useOperatingStore) {
    this.useOperatingStore = useOperatingStore;
  }

  public Gpmnormmaterials qUnit(String qUnit) {
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

  public Gpmnormmaterials unitRate(Double unitRate) {
    this.unitRate = unitRate;
    return this;
  }

   /**
   * Vztah
   * @return unitRate
  **/
  @ApiModelProperty(example = "null", value = "Vztah")
  public Double getUnitRate() {
    return unitRate;
  }

  public void setUnitRate(Double unitRate) {
    this.unitRate = unitRate;
  }

  public Gpmnormmaterials calculatedPrice(Double calculatedPrice) {
    this.calculatedPrice = calculatedPrice;
    return this;
  }

   /**
   * Cena [persistentní položka]
   * @return calculatedPrice
  **/
  @ApiModelProperty(example = "null", value = "Cena [persistentní položka]")
  public Double getCalculatedPrice() {
    return calculatedPrice;
  }

  public void setCalculatedPrice(Double calculatedPrice) {
    this.calculatedPrice = calculatedPrice;
  }

  public Gpmnormmaterials description(String description) {
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

  public Gpmnormmaterials transferQUnit(String transferQUnit) {
    this.transferQUnit = transferQUnit;
    return this;
  }

   /**
   * Jednotka pro převod [persistentní položka]
   * @return transferQUnit
  **/
  @ApiModelProperty(example = "null", value = "Jednotka pro převod [persistentní položka]")
  public String getTransferQUnit() {
    return transferQUnit;
  }

  public void setTransferQUnit(String transferQUnit) {
    this.transferQUnit = transferQUnit;
  }

  public Gpmnormmaterials transferUnitRate(Double transferUnitRate) {
    this.transferUnitRate = transferUnitRate;
    return this;
  }

   /**
   * Vztah přev.j.
   * @return transferUnitRate
  **/
  @ApiModelProperty(example = "null", value = "Vztah přev.j.")
  public Double getTransferUnitRate() {
    return transferUnitRate;
  }

  public void setTransferUnitRate(Double transferUnitRate) {
    this.transferUnitRate = transferUnitRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gpmnormmaterials gpmnormmaterials = (Gpmnormmaterials) o;
    return Objects.equals(this.displayName, gpmnormmaterials.displayName) &&
        Objects.equals(this.ID, gpmnormmaterials.ID) &&
        Objects.equals(this.classID, gpmnormmaterials.classID) &&
        Objects.equals(this.objVersion, gpmnormmaterials.objVersion) &&
        Objects.equals(this.parentID, gpmnormmaterials.parentID) &&
        Objects.equals(this.posIndex, gpmnormmaterials.posIndex) &&
        Objects.equals(this.storeCardID, gpmnormmaterials.storeCardID) &&
        Objects.equals(this.storeID, gpmnormmaterials.storeID) &&
        Objects.equals(this.quantity, gpmnormmaterials.quantity) &&
        Objects.equals(this.unitQuantity, gpmnormmaterials.unitQuantity) &&
        Objects.equals(this.weight, gpmnormmaterials.weight) &&
        Objects.equals(this.unitWeight, gpmnormmaterials.unitWeight) &&
        Objects.equals(this.weightUnit, gpmnormmaterials.weightUnit) &&
        Objects.equals(this.weightInGrams, gpmnormmaterials.weightInGrams) &&
        Objects.equals(this.wastePercentage, gpmnormmaterials.wastePercentage) &&
        Objects.equals(this.replaceable, gpmnormmaterials.replaceable) &&
        Objects.equals(this.decomposition, gpmnormmaterials.decomposition) &&
        Objects.equals(this.useOperatingStore, gpmnormmaterials.useOperatingStore) &&
        Objects.equals(this.qUnit, gpmnormmaterials.qUnit) &&
        Objects.equals(this.unitRate, gpmnormmaterials.unitRate) &&
        Objects.equals(this.calculatedPrice, gpmnormmaterials.calculatedPrice) &&
        Objects.equals(this.description, gpmnormmaterials.description) &&
        Objects.equals(this.transferQUnit, gpmnormmaterials.transferQUnit) &&
        Objects.equals(this.transferUnitRate, gpmnormmaterials.transferUnitRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, storeCardID, storeID, quantity, unitQuantity, weight, unitWeight, weightUnit, weightInGrams, wastePercentage, replaceable, decomposition, useOperatingStore, qUnit, unitRate, calculatedPrice, description, transferQUnit, transferUnitRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gpmnormmaterials {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    storeID: ").append(toIndentedString(storeID)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitQuantity: ").append(toIndentedString(unitQuantity)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    unitWeight: ").append(toIndentedString(unitWeight)).append("\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
    sb.append("    weightInGrams: ").append(toIndentedString(weightInGrams)).append("\n");
    sb.append("    wastePercentage: ").append(toIndentedString(wastePercentage)).append("\n");
    sb.append("    replaceable: ").append(toIndentedString(replaceable)).append("\n");
    sb.append("    decomposition: ").append(toIndentedString(decomposition)).append("\n");
    sb.append("    useOperatingStore: ").append(toIndentedString(useOperatingStore)).append("\n");
    sb.append("    qUnit: ").append(toIndentedString(qUnit)).append("\n");
    sb.append("    unitRate: ").append(toIndentedString(unitRate)).append("\n");
    sb.append("    calculatedPrice: ").append(toIndentedString(calculatedPrice)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transferQUnit: ").append(toIndentedString(transferQUnit)).append("\n");
    sb.append("    transferUnitRate: ").append(toIndentedString(transferUnitRate)).append("\n");
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

