/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Posdocumentdiscount   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("discountkind")
  private Integer discountkind = null;

  @SerializedName("dealerdiscount")
  private Double dealerdiscount = null;

  @SerializedName("financialdocumentdiscount")
  private Double financialdocumentdiscount = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("discountpercent")
  private Double discountpercent = null;

  @SerializedName("finacial")
  private Double finacial = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("fullrow")
  private Boolean fullrow = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("tamount")
  private Double tamount = null;

  @SerializedName("localamount")
  private Double localamount = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("row_id")
  private String rowId = null;

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("insertedquantity")
  private Double insertedquantity = null;

  @SerializedName("automatic")
  private Boolean automatic = null;

  @SerializedName("coupon")
  private Boolean coupon = null;

  @SerializedName("printed")
  private Boolean printed = null;

  public Posdocumentdiscount displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Posdocumentdiscount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Posdocumentdiscount classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Posdocumentdiscount objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Posdocumentdiscount parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu Účtenka [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu Účtenka [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Posdocumentdiscount discountkind(Integer discountkind) {
    this.discountkind = discountkind;
    return this;
  }

   /**
   * typ [persistentní položka]
   * @return discountkind
  **/
  @ApiModelProperty(example = "null", value = "typ [persistentní položka]")
  public Integer getDiscountkind() {
    return discountkind;
  }

  public void setDiscountkind(Integer discountkind) {
    this.discountkind = discountkind;
  }

  public Posdocumentdiscount dealerdiscount(Double dealerdiscount) {
    this.dealerdiscount = dealerdiscount;
    return this;
  }

   /**
   * dealerská [persistentní položka]
   * @return dealerdiscount
  **/
  @ApiModelProperty(example = "null", value = "dealerská [persistentní položka]")
  public Double getDealerdiscount() {
    return dealerdiscount;
  }

  public void setDealerdiscount(Double dealerdiscount) {
    this.dealerdiscount = dealerdiscount;
  }

  public Posdocumentdiscount financialdocumentdiscount(Double financialdocumentdiscount) {
    this.financialdocumentdiscount = financialdocumentdiscount;
    return this;
  }

   /**
   * finanční na doklad [persistentní položka]
   * @return financialdocumentdiscount
  **/
  @ApiModelProperty(example = "null", value = "finanční na doklad [persistentní položka]")
  public Double getFinancialdocumentdiscount() {
    return financialdocumentdiscount;
  }

  public void setFinancialdocumentdiscount(Double financialdocumentdiscount) {
    this.financialdocumentdiscount = financialdocumentdiscount;
  }

  public Posdocumentdiscount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "název [persistentní položka]")
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
   * kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Posdocumentdiscount discountpercent(Double discountpercent) {
    this.discountpercent = discountpercent;
    return this;
  }

   /**
   * procentní [persistentní položka]
   * @return discountpercent
  **/
  @ApiModelProperty(example = "null", value = "procentní [persistentní položka]")
  public Double getDiscountpercent() {
    return discountpercent;
  }

  public void setDiscountpercent(Double discountpercent) {
    this.discountpercent = discountpercent;
  }

  public Posdocumentdiscount finacial(Double finacial) {
    this.finacial = finacial;
    return this;
  }

   /**
   * finanční [persistentní položka]
   * @return finacial
  **/
  @ApiModelProperty(example = "null", value = "finanční [persistentní položka]")
  public Double getFinacial() {
    return finacial;
  }

  public void setFinacial(Double finacial) {
    this.finacial = finacial;
  }

  public Posdocumentdiscount currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * měna; id objektu měna [persistentní položka]
   * @return currencyId
  **/
  @ApiModelProperty(example = "null", value = "měna; id objektu měna [persistentní položka]")
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public Posdocumentdiscount fullrow(Boolean fullrow) {
    this.fullrow = fullrow;
    return this;
  }

   /**
   * celý řádek [persistentní položka]
   * @return fullrow
  **/
  @ApiModelProperty(example = "null", value = "celý řádek [persistentní položka]")
  public Boolean getFullrow() {
    return fullrow;
  }

  public void setFullrow(Boolean fullrow) {
    this.fullrow = fullrow;
  }

  public Posdocumentdiscount quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * množství [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "množství [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Posdocumentdiscount tamount(Double tamount) {
    this.tamount = tamount;
    return this;
  }

   /**
   * cena [persistentní položka]
   * @return tamount
  **/
  @ApiModelProperty(example = "null", value = "cena [persistentní položka]")
  public Double getTamount() {
    return tamount;
  }

  public void setTamount(Double tamount) {
    this.tamount = tamount;
  }

  public Posdocumentdiscount localamount(Double localamount) {
    this.localamount = localamount;
    return this;
  }

   /**
   * lok.cena [persistentní položka]
   * @return localamount
  **/
  @ApiModelProperty(example = "null", value = "lok.cena [persistentní položka]")
  public Double getLocalamount() {
    return localamount;
  }

  public void setLocalamount(Double localamount) {
    this.localamount = localamount;
  }

  public Posdocumentdiscount description(String description) {
    this.description = description;
    return this;
  }

   /**
   * text [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "text [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Posdocumentdiscount rowId(String rowId) {
    this.rowId = rowId;
    return this;
  }

   /**
   * Řádek; id objektu Účtenka - řádek [persistentní položka]
   * @return rowId
  **/
  @ApiModelProperty(example = "null", value = "Řádek; id objektu Účtenka - řádek [persistentní položka]")
  public String getRowId() {
    return rowId;
  }

  public void setRowId(String rowId) {
    this.rowId = rowId;
  }

  public Posdocumentdiscount storecardId(String storecardId) {
    this.storecardId = storecardId;
    return this;
  }

   /**
   * karta; id objektu skladová karta [persistentní položka]
   * @return storecardId
  **/
  @ApiModelProperty(example = "null", value = "karta; id objektu skladová karta [persistentní položka]")
  public String getStorecardId() {
    return storecardId;
  }

  public void setStorecardId(String storecardId) {
    this.storecardId = storecardId;
  }

  public Posdocumentdiscount insertedquantity(Double insertedquantity) {
    this.insertedquantity = insertedquantity;
    return this;
  }

   /**
   * přijato [persistentní položka]
   * @return insertedquantity
  **/
  @ApiModelProperty(example = "null", value = "přijato [persistentní položka]")
  public Double getInsertedquantity() {
    return insertedquantity;
  }

  public void setInsertedquantity(Double insertedquantity) {
    this.insertedquantity = insertedquantity;
  }

  public Posdocumentdiscount automatic(Boolean automatic) {
    this.automatic = automatic;
    return this;
  }

   /**
   * automatická [persistentní položka]
   * @return automatic
  **/
  @ApiModelProperty(example = "null", value = "automatická [persistentní položka]")
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
   * kupónová [persistentní položka]
   * @return coupon
  **/
  @ApiModelProperty(example = "null", value = "kupónová [persistentní položka]")
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
   * vytištěná
   * @return printed
  **/
  @ApiModelProperty(example = "null", value = "vytištěná")
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
    return Objects.equals(this.displayname, posdocumentdiscount.displayname) &&
        Objects.equals(this.id, posdocumentdiscount.id) &&
        Objects.equals(this.classid, posdocumentdiscount.classid) &&
        Objects.equals(this.objversion, posdocumentdiscount.objversion) &&
        Objects.equals(this.parentId, posdocumentdiscount.parentId) &&
        Objects.equals(this.discountkind, posdocumentdiscount.discountkind) &&
        Objects.equals(this.dealerdiscount, posdocumentdiscount.dealerdiscount) &&
        Objects.equals(this.financialdocumentdiscount, posdocumentdiscount.financialdocumentdiscount) &&
        Objects.equals(this.name, posdocumentdiscount.name) &&
        Objects.equals(this.code, posdocumentdiscount.code) &&
        Objects.equals(this.discountpercent, posdocumentdiscount.discountpercent) &&
        Objects.equals(this.finacial, posdocumentdiscount.finacial) &&
        Objects.equals(this.currencyId, posdocumentdiscount.currencyId) &&
        Objects.equals(this.fullrow, posdocumentdiscount.fullrow) &&
        Objects.equals(this.quantity, posdocumentdiscount.quantity) &&
        Objects.equals(this.tamount, posdocumentdiscount.tamount) &&
        Objects.equals(this.localamount, posdocumentdiscount.localamount) &&
        Objects.equals(this.description, posdocumentdiscount.description) &&
        Objects.equals(this.rowId, posdocumentdiscount.rowId) &&
        Objects.equals(this.storecardId, posdocumentdiscount.storecardId) &&
        Objects.equals(this.insertedquantity, posdocumentdiscount.insertedquantity) &&
        Objects.equals(this.automatic, posdocumentdiscount.automatic) &&
        Objects.equals(this.coupon, posdocumentdiscount.coupon) &&
        Objects.equals(this.printed, posdocumentdiscount.printed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, discountkind, dealerdiscount, financialdocumentdiscount, name, code, discountpercent, finacial, currencyId, fullrow, quantity, tamount, localamount, description, rowId, storecardId, insertedquantity, automatic, coupon, printed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posdocumentdiscount {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    discountkind: ").append(toIndentedString(discountkind)).append("\n");
    sb.append("    dealerdiscount: ").append(toIndentedString(dealerdiscount)).append("\n");
    sb.append("    financialdocumentdiscount: ").append(toIndentedString(financialdocumentdiscount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    discountpercent: ").append(toIndentedString(discountpercent)).append("\n");
    sb.append("    finacial: ").append(toIndentedString(finacial)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    fullrow: ").append(toIndentedString(fullrow)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    tamount: ").append(toIndentedString(tamount)).append("\n");
    sb.append("    localamount: ").append(toIndentedString(localamount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    insertedquantity: ").append(toIndentedString(insertedquantity)).append("\n");
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

