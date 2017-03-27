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
 * Posdocumentdiscount
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Posdocumentdiscount   {
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

  @SerializedName("DiscountKind")
  private Integer discountKind = null;

  @SerializedName("DealerDiscount")
  private Double dealerDiscount = null;

  @SerializedName("FinancialDocumentDiscount")
  private Double financialDocumentDiscount = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("DiscountPercent")
  private Double discountPercent = null;

  @SerializedName("Finacial")
  private Double finacial = null;

  @SerializedName("Currency_ID")
  private String currencyID = null;

  @SerializedName("FullRow")
  private Boolean fullRow = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  @SerializedName("TAmount")
  private Double tAmount = null;

  @SerializedName("LocalAmount")
  private Double localAmount = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Row_ID")
  private String rowID = null;

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("InsertedQuantity")
  private Double insertedQuantity = null;

  @SerializedName("Automatic")
  private Boolean automatic = null;

  @SerializedName("Coupon")
  private Boolean coupon = null;

  @SerializedName("Printed")
  private Boolean printed = null;

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
   * Vlastník; ID objektu Účtenka [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Účtenka [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Posdocumentdiscount discountKind(Integer discountKind) {
    this.discountKind = discountKind;
    return this;
  }

   /**
   * Typ [persistentní položka]
   * @return discountKind
  **/
  @ApiModelProperty(example = "null", value = "Typ [persistentní položka]")
  public Integer getDiscountKind() {
    return discountKind;
  }

  public void setDiscountKind(Integer discountKind) {
    this.discountKind = discountKind;
  }

  public Posdocumentdiscount dealerDiscount(Double dealerDiscount) {
    this.dealerDiscount = dealerDiscount;
    return this;
  }

   /**
   * Dealerská [persistentní položka]
   * @return dealerDiscount
  **/
  @ApiModelProperty(example = "null", value = "Dealerská [persistentní položka]")
  public Double getDealerDiscount() {
    return dealerDiscount;
  }

  public void setDealerDiscount(Double dealerDiscount) {
    this.dealerDiscount = dealerDiscount;
  }

  public Posdocumentdiscount financialDocumentDiscount(Double financialDocumentDiscount) {
    this.financialDocumentDiscount = financialDocumentDiscount;
    return this;
  }

   /**
   * Finanční na doklad [persistentní položka]
   * @return financialDocumentDiscount
  **/
  @ApiModelProperty(example = "null", value = "Finanční na doklad [persistentní položka]")
  public Double getFinancialDocumentDiscount() {
    return financialDocumentDiscount;
  }

  public void setFinancialDocumentDiscount(Double financialDocumentDiscount) {
    this.financialDocumentDiscount = financialDocumentDiscount;
  }

  public Posdocumentdiscount name(String name) {
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

  public Posdocumentdiscount code(String code) {
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

  public Posdocumentdiscount discountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * Procentní [persistentní položka]
   * @return discountPercent
  **/
  @ApiModelProperty(example = "null", value = "Procentní [persistentní položka]")
  public Double getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
  }

  public Posdocumentdiscount finacial(Double finacial) {
    this.finacial = finacial;
    return this;
  }

   /**
   * Finanční [persistentní položka]
   * @return finacial
  **/
  @ApiModelProperty(example = "null", value = "Finanční [persistentní položka]")
  public Double getFinacial() {
    return finacial;
  }

  public void setFinacial(Double finacial) {
    this.finacial = finacial;
  }

  public Posdocumentdiscount currencyID(String currencyID) {
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

  public Posdocumentdiscount fullRow(Boolean fullRow) {
    this.fullRow = fullRow;
    return this;
  }

   /**
   * Celý řádek [persistentní položka]
   * @return fullRow
  **/
  @ApiModelProperty(example = "null", value = "Celý řádek [persistentní položka]")
  public Boolean getFullRow() {
    return fullRow;
  }

  public void setFullRow(Boolean fullRow) {
    this.fullRow = fullRow;
  }

  public Posdocumentdiscount quantity(Double quantity) {
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

  public Posdocumentdiscount tAmount(Double tAmount) {
    this.tAmount = tAmount;
    return this;
  }

   /**
   * Cena [persistentní položka]
   * @return tAmount
  **/
  @ApiModelProperty(example = "null", value = "Cena [persistentní položka]")
  public Double getTAmount() {
    return tAmount;
  }

  public void setTAmount(Double tAmount) {
    this.tAmount = tAmount;
  }

  public Posdocumentdiscount localAmount(Double localAmount) {
    this.localAmount = localAmount;
    return this;
  }

   /**
   * Lok.cena [persistentní položka]
   * @return localAmount
  **/
  @ApiModelProperty(example = "null", value = "Lok.cena [persistentní položka]")
  public Double getLocalAmount() {
    return localAmount;
  }

  public void setLocalAmount(Double localAmount) {
    this.localAmount = localAmount;
  }

  public Posdocumentdiscount description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Text [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Text [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Posdocumentdiscount rowID(String rowID) {
    this.rowID = rowID;
    return this;
  }

   /**
   * Řádek; ID objektu Účtenka - řádek [persistentní položka]
   * @return rowID
  **/
  @ApiModelProperty(example = "null", value = "Řádek; ID objektu Účtenka - řádek [persistentní položka]")
  public String getRowID() {
    return rowID;
  }

  public void setRowID(String rowID) {
    this.rowID = rowID;
  }

  public Posdocumentdiscount storeCardID(String storeCardID) {
    this.storeCardID = storeCardID;
    return this;
  }

   /**
   * Karta; ID objektu Skladová karta [persistentní položka]
   * @return storeCardID
  **/
  @ApiModelProperty(example = "null", value = "Karta; ID objektu Skladová karta [persistentní položka]")
  public String getStoreCardID() {
    return storeCardID;
  }

  public void setStoreCardID(String storeCardID) {
    this.storeCardID = storeCardID;
  }

  public Posdocumentdiscount insertedQuantity(Double insertedQuantity) {
    this.insertedQuantity = insertedQuantity;
    return this;
  }

   /**
   * Přijato [persistentní položka]
   * @return insertedQuantity
  **/
  @ApiModelProperty(example = "null", value = "Přijato [persistentní položka]")
  public Double getInsertedQuantity() {
    return insertedQuantity;
  }

  public void setInsertedQuantity(Double insertedQuantity) {
    this.insertedQuantity = insertedQuantity;
  }

  public Posdocumentdiscount automatic(Boolean automatic) {
    this.automatic = automatic;
    return this;
  }

   /**
   * Automatická [persistentní položka]
   * @return automatic
  **/
  @ApiModelProperty(example = "null", value = "Automatická [persistentní položka]")
  public Boolean getAutomatic() {
    return automatic;
  }

  public void setAutomatic(Boolean automatic) {
    this.automatic = automatic;
  }

  public Posdocumentdiscount coupon(Boolean coupon) {
    this.coupon = coupon;
    return this;
  }

   /**
   * Kupónová [persistentní položka]
   * @return coupon
  **/
  @ApiModelProperty(example = "null", value = "Kupónová [persistentní položka]")
  public Boolean getCoupon() {
    return coupon;
  }

  public void setCoupon(Boolean coupon) {
    this.coupon = coupon;
  }

  public Posdocumentdiscount printed(Boolean printed) {
    this.printed = printed;
    return this;
  }

   /**
   * Vytištěná
   * @return printed
  **/
  @ApiModelProperty(example = "null", value = "Vytištěná")
  public Boolean getPrinted() {
    return printed;
  }

  public void setPrinted(Boolean printed) {
    this.printed = printed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posdocumentdiscount posdocumentdiscount = (Posdocumentdiscount) o;
    return Objects.equals(this.displayName, posdocumentdiscount.displayName) &&
        Objects.equals(this.ID, posdocumentdiscount.ID) &&
        Objects.equals(this.classID, posdocumentdiscount.classID) &&
        Objects.equals(this.objVersion, posdocumentdiscount.objVersion) &&
        Objects.equals(this.parentID, posdocumentdiscount.parentID) &&
        Objects.equals(this.discountKind, posdocumentdiscount.discountKind) &&
        Objects.equals(this.dealerDiscount, posdocumentdiscount.dealerDiscount) &&
        Objects.equals(this.financialDocumentDiscount, posdocumentdiscount.financialDocumentDiscount) &&
        Objects.equals(this.name, posdocumentdiscount.name) &&
        Objects.equals(this.code, posdocumentdiscount.code) &&
        Objects.equals(this.discountPercent, posdocumentdiscount.discountPercent) &&
        Objects.equals(this.finacial, posdocumentdiscount.finacial) &&
        Objects.equals(this.currencyID, posdocumentdiscount.currencyID) &&
        Objects.equals(this.fullRow, posdocumentdiscount.fullRow) &&
        Objects.equals(this.quantity, posdocumentdiscount.quantity) &&
        Objects.equals(this.tAmount, posdocumentdiscount.tAmount) &&
        Objects.equals(this.localAmount, posdocumentdiscount.localAmount) &&
        Objects.equals(this.description, posdocumentdiscount.description) &&
        Objects.equals(this.rowID, posdocumentdiscount.rowID) &&
        Objects.equals(this.storeCardID, posdocumentdiscount.storeCardID) &&
        Objects.equals(this.insertedQuantity, posdocumentdiscount.insertedQuantity) &&
        Objects.equals(this.automatic, posdocumentdiscount.automatic) &&
        Objects.equals(this.coupon, posdocumentdiscount.coupon) &&
        Objects.equals(this.printed, posdocumentdiscount.printed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, discountKind, dealerDiscount, financialDocumentDiscount, name, code, discountPercent, finacial, currencyID, fullRow, quantity, tAmount, localAmount, description, rowID, storeCardID, insertedQuantity, automatic, coupon, printed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posdocumentdiscount {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    discountKind: ").append(toIndentedString(discountKind)).append("\n");
    sb.append("    dealerDiscount: ").append(toIndentedString(dealerDiscount)).append("\n");
    sb.append("    financialDocumentDiscount: ").append(toIndentedString(financialDocumentDiscount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    finacial: ").append(toIndentedString(finacial)).append("\n");
    sb.append("    currencyID: ").append(toIndentedString(currencyID)).append("\n");
    sb.append("    fullRow: ").append(toIndentedString(fullRow)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    tAmount: ").append(toIndentedString(tAmount)).append("\n");
    sb.append("    localAmount: ").append(toIndentedString(localAmount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rowID: ").append(toIndentedString(rowID)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    insertedQuantity: ").append(toIndentedString(insertedQuantity)).append("\n");
    sb.append("    automatic: ").append(toIndentedString(automatic)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    printed: ").append(toIndentedString(printed)).append("\n");
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

