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
 * Supplierpricelistrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Supplierpricelistrow   {
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

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("QUnit")
  private String qUnit = null;

  @SerializedName("EAN")
  private String EAN = null;

  @SerializedName("PurchasePrice")
  private Double purchasePrice = null;

  @SerializedName("Currency_ID")
  private String currencyID = null;

  @SerializedName("VATRate")
  private Double vATRate = null;

  @SerializedName("DeliveryTime")
  private Integer deliveryTime = null;

  @SerializedName("MinimalQuantity")
  private Double minimalQuantity = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("Picture_ID")
  private String pictureID = null;

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("StoreUnit_ID")
  private String storeUnitID = null;

  @SerializedName("Supplier_ID")
  private String supplierID = null;

  @SerializedName("DiscountedPrice")
  private Double discountedPrice = null;

  @SerializedName("UnitRate")
  private Double unitRate = null;

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
   * Vlastník; ID objektu Dodavatelský ceník [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Dodavatelský ceník [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Supplierpricelistrow posIndex(Integer posIndex) {
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

  public Supplierpricelistrow code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Supplierpricelistrow name(String name) {
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

  public Supplierpricelistrow qUnit(String qUnit) {
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

  public Supplierpricelistrow EAN(String EAN) {
    this.EAN = EAN;
    return this;
  }

   /**
   * EAN [persistentní položka]
   * @return EAN
  **/
  @ApiModelProperty(example = "null", value = "EAN [persistentní položka]")
  public String getEAN() {
    return EAN;
  }

  public void setEAN(String EAN) {
    this.EAN = EAN;
  }

  public Supplierpricelistrow purchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
    return this;
  }

   /**
   * Cena [persistentní položka]
   * @return purchasePrice
  **/
  @ApiModelProperty(example = "null", value = "Cena [persistentní položka]")
  public Double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public Supplierpricelistrow currencyID(String currencyID) {
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

  public Supplierpricelistrow vATRate(Double vATRate) {
    this.vATRate = vATRate;
    return this;
  }

   /**
   * Sazba DPH [persistentní položka]
   * @return vATRate
  **/
  @ApiModelProperty(example = "null", value = "Sazba DPH [persistentní položka]")
  public Double getVATRate() {
    return vATRate;
  }

  public void setVATRate(Double vATRate) {
    this.vATRate = vATRate;
  }

  public Supplierpricelistrow deliveryTime(Integer deliveryTime) {
    this.deliveryTime = deliveryTime;
    return this;
  }

   /**
   * Dodací lhůta [persistentní položka]
   * @return deliveryTime
  **/
  @ApiModelProperty(example = "null", value = "Dodací lhůta [persistentní položka]")
  public Integer getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(Integer deliveryTime) {
    this.deliveryTime = deliveryTime;
  }

  public Supplierpricelistrow minimalQuantity(Double minimalQuantity) {
    this.minimalQuantity = minimalQuantity;
    return this;
  }

   /**
   * Min. množství [persistentní položka]
   * @return minimalQuantity
  **/
  @ApiModelProperty(example = "null", value = "Min. množství [persistentní položka]")
  public Double getMinimalQuantity() {
    return minimalQuantity;
  }

  public void setMinimalQuantity(Double minimalQuantity) {
    this.minimalQuantity = minimalQuantity;
  }

  public Supplierpricelistrow note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Popis [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "Popis [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Supplierpricelistrow pictureID(String pictureID) {
    this.pictureID = pictureID;
    return this;
  }

   /**
   * Obrázek; ID objektu Data obrázku [persistentní položka]
   * @return pictureID
  **/
  @ApiModelProperty(example = "null", value = "Obrázek; ID objektu Data obrázku [persistentní položka]")
  public String getPictureID() {
    return pictureID;
  }

  public void setPictureID(String pictureID) {
    this.pictureID = pictureID;
  }

  public Supplierpricelistrow storeCardID(String storeCardID) {
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

  public Supplierpricelistrow storeUnitID(String storeUnitID) {
    this.storeUnitID = storeUnitID;
    return this;
  }

   /**
   * Skl. jednotka; ID objektu Jednotka skladové karty [persistentní položka]
   * @return storeUnitID
  **/
  @ApiModelProperty(example = "null", value = "Skl. jednotka; ID objektu Jednotka skladové karty [persistentní položka]")
  public String getStoreUnitID() {
    return storeUnitID;
  }

  public void setStoreUnitID(String storeUnitID) {
    this.storeUnitID = storeUnitID;
  }

  public Supplierpricelistrow supplierID(String supplierID) {
    this.supplierID = supplierID;
    return this;
  }

   /**
   * Dodavatel; ID objektu Dodavatel [persistentní položka]
   * @return supplierID
  **/
  @ApiModelProperty(example = "null", value = "Dodavatel; ID objektu Dodavatel [persistentní položka]")
  public String getSupplierID() {
    return supplierID;
  }

  public void setSupplierID(String supplierID) {
    this.supplierID = supplierID;
  }

  public Supplierpricelistrow discountedPrice(Double discountedPrice) {
    this.discountedPrice = discountedPrice;
    return this;
  }

   /**
   * Cena po slevě
   * @return discountedPrice
  **/
  @ApiModelProperty(example = "null", value = "Cena po slevě")
  public Double getDiscountedPrice() {
    return discountedPrice;
  }

  public void setDiscountedPrice(Double discountedPrice) {
    this.discountedPrice = discountedPrice;
  }

  public Supplierpricelistrow unitRate(Double unitRate) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Supplierpricelistrow supplierpricelistrow = (Supplierpricelistrow) o;
    return Objects.equals(this.displayName, supplierpricelistrow.displayName) &&
        Objects.equals(this.ID, supplierpricelistrow.ID) &&
        Objects.equals(this.classID, supplierpricelistrow.classID) &&
        Objects.equals(this.objVersion, supplierpricelistrow.objVersion) &&
        Objects.equals(this.parentID, supplierpricelistrow.parentID) &&
        Objects.equals(this.posIndex, supplierpricelistrow.posIndex) &&
        Objects.equals(this.code, supplierpricelistrow.code) &&
        Objects.equals(this.name, supplierpricelistrow.name) &&
        Objects.equals(this.qUnit, supplierpricelistrow.qUnit) &&
        Objects.equals(this.EAN, supplierpricelistrow.EAN) &&
        Objects.equals(this.purchasePrice, supplierpricelistrow.purchasePrice) &&
        Objects.equals(this.currencyID, supplierpricelistrow.currencyID) &&
        Objects.equals(this.vATRate, supplierpricelistrow.vATRate) &&
        Objects.equals(this.deliveryTime, supplierpricelistrow.deliveryTime) &&
        Objects.equals(this.minimalQuantity, supplierpricelistrow.minimalQuantity) &&
        Objects.equals(this.note, supplierpricelistrow.note) &&
        Objects.equals(this.pictureID, supplierpricelistrow.pictureID) &&
        Objects.equals(this.storeCardID, supplierpricelistrow.storeCardID) &&
        Objects.equals(this.storeUnitID, supplierpricelistrow.storeUnitID) &&
        Objects.equals(this.supplierID, supplierpricelistrow.supplierID) &&
        Objects.equals(this.discountedPrice, supplierpricelistrow.discountedPrice) &&
        Objects.equals(this.unitRate, supplierpricelistrow.unitRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, code, name, qUnit, EAN, purchasePrice, currencyID, vATRate, deliveryTime, minimalQuantity, note, pictureID, storeCardID, storeUnitID, supplierID, discountedPrice, unitRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supplierpricelistrow {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    qUnit: ").append(toIndentedString(qUnit)).append("\n");
    sb.append("    EAN: ").append(toIndentedString(EAN)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    currencyID: ").append(toIndentedString(currencyID)).append("\n");
    sb.append("    vATRate: ").append(toIndentedString(vATRate)).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(deliveryTime)).append("\n");
    sb.append("    minimalQuantity: ").append(toIndentedString(minimalQuantity)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    pictureID: ").append(toIndentedString(pictureID)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    storeUnitID: ").append(toIndentedString(storeUnitID)).append("\n");
    sb.append("    supplierID: ").append(toIndentedString(supplierID)).append("\n");
    sb.append("    discountedPrice: ").append(toIndentedString(discountedPrice)).append("\n");
    sb.append("    unitRate: ").append(toIndentedString(unitRate)).append("\n");
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

