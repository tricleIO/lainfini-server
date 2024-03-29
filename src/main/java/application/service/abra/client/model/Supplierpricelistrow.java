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
 * Supplierpricelistrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Supplierpricelistrow   {
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

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("qunit")
  private String qunit = null;

  @SerializedName("ean")
  private String ean = null;

  @SerializedName("purchaseprice")
  private Double purchaseprice = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("vatrate")
  private Double vatrate = null;

  @SerializedName("deliverytime")
  private Integer deliverytime = null;

  @SerializedName("minimalquantity")
  private Double minimalquantity = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("picture_id")
  private String pictureId = null;

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("storeunit_id")
  private String storeunitId = null;

  @SerializedName("supplier_id")
  private String supplierId = null;

  @SerializedName("discountedprice")
  private Double discountedprice = null;

  @SerializedName("unitrate")
  private Double unitrate = null;

  public Supplierpricelistrow displayname(String displayname) {
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

  public Supplierpricelistrow id(String id) {
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

  public Supplierpricelistrow classid(String classid) {
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

  public Supplierpricelistrow objversion(Integer objversion) {
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

  public Supplierpricelistrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu dodavatelský ceník [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu dodavatelský ceník [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Supplierpricelistrow posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Supplierpricelistrow code(String code) {
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

  public Supplierpricelistrow name(String name) {
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

  public Supplierpricelistrow qunit(String qunit) {
    this.qunit = qunit;
    return this;
  }

   /**
   * jednotka [persistentní položka]
   * @return qunit
  **/
  @ApiModelProperty(example = "null", value = "jednotka [persistentní položka]")
  public String getQunit() {
    return qunit;
  }

  public void setQunit(String qunit) {
    this.qunit = qunit;
  }

  public Supplierpricelistrow ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * ean [persistentní položka]
   * @return ean
  **/
  @ApiModelProperty(example = "null", value = "ean [persistentní položka]")
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public Supplierpricelistrow purchaseprice(Double purchaseprice) {
    this.purchaseprice = purchaseprice;
    return this;
  }

   /**
   * cena [persistentní položka]
   * @return purchaseprice
  **/
  @ApiModelProperty(example = "null", value = "cena [persistentní položka]")
  public Double getPurchaseprice() {
    return purchaseprice;
  }

  public void setPurchaseprice(Double purchaseprice) {
    this.purchaseprice = purchaseprice;
  }

  public Supplierpricelistrow currencyId(String currencyId) {
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

  public Supplierpricelistrow vatrate(Double vatrate) {
    this.vatrate = vatrate;
    return this;
  }

   /**
   * sazba dph [persistentní položka]
   * @return vatrate
  **/
  @ApiModelProperty(example = "null", value = "sazba dph [persistentní položka]")
  public Double getVatrate() {
    return vatrate;
  }

  public void setVatrate(Double vatrate) {
    this.vatrate = vatrate;
  }

  public Supplierpricelistrow deliverytime(Integer deliverytime) {
    this.deliverytime = deliverytime;
    return this;
  }

   /**
   * dodací lhůta [persistentní položka]
   * @return deliverytime
  **/
  @ApiModelProperty(example = "null", value = "dodací lhůta [persistentní položka]")
  public Integer getDeliverytime() {
    return deliverytime;
  }

  public void setDeliverytime(Integer deliverytime) {
    this.deliverytime = deliverytime;
  }

  public Supplierpricelistrow minimalquantity(Double minimalquantity) {
    this.minimalquantity = minimalquantity;
    return this;
  }

   /**
   * min. množství [persistentní položka]
   * @return minimalquantity
  **/
  @ApiModelProperty(example = "null", value = "min. množství [persistentní položka]")
  public Double getMinimalquantity() {
    return minimalquantity;
  }

  public void setMinimalquantity(Double minimalquantity) {
    this.minimalquantity = minimalquantity;
  }

  public Supplierpricelistrow note(String note) {
    this.note = note;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Supplierpricelistrow pictureId(String pictureId) {
    this.pictureId = pictureId;
    return this;
  }

   /**
   * obrázek; id objektu data obrázku [persistentní položka]
   * @return pictureId
  **/
  @ApiModelProperty(example = "null", value = "obrázek; id objektu data obrázku [persistentní položka]")
  public String getPictureId() {
    return pictureId;
  }

  public void setPictureId(String pictureId) {
    this.pictureId = pictureId;
  }

  public Supplierpricelistrow storecardId(String storecardId) {
    this.storecardId = storecardId;
    return this;
  }

   /**
   * skl. karta; id objektu skladová karta [persistentní položka]
   * @return storecardId
  **/
  @ApiModelProperty(example = "null", value = "skl. karta; id objektu skladová karta [persistentní položka]")
  public String getStorecardId() {
    return storecardId;
  }

  public void setStorecardId(String storecardId) {
    this.storecardId = storecardId;
  }

  public Supplierpricelistrow storeunitId(String storeunitId) {
    this.storeunitId = storeunitId;
    return this;
  }

   /**
   * skl. jednotka; id objektu jednotka skladové karty [persistentní položka]
   * @return storeunitId
  **/
  @ApiModelProperty(example = "null", value = "skl. jednotka; id objektu jednotka skladové karty [persistentní položka]")
  public String getStoreunitId() {
    return storeunitId;
  }

  public void setStoreunitId(String storeunitId) {
    this.storeunitId = storeunitId;
  }

  public Supplierpricelistrow supplierId(String supplierId) {
    this.supplierId = supplierId;
    return this;
  }

   /**
   * dodavatel; id objektu dodavatel [persistentní položka]
   * @return supplierId
  **/
  @ApiModelProperty(example = "null", value = "dodavatel; id objektu dodavatel [persistentní položka]")
  public String getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(String supplierId) {
    this.supplierId = supplierId;
  }

  public Supplierpricelistrow discountedprice(Double discountedprice) {
    this.discountedprice = discountedprice;
    return this;
  }

   /**
   * cena po slevě
   * @return discountedprice
  **/
  @ApiModelProperty(example = "null", value = "cena po slevě")
  public Double getDiscountedprice() {
    return discountedprice;
  }

  public void setDiscountedprice(Double discountedprice) {
    this.discountedprice = discountedprice;
  }

  public Supplierpricelistrow unitrate(Double unitrate) {
    this.unitrate = unitrate;
    return this;
  }

   /**
   * vztah
   * @return unitrate
  **/
  @ApiModelProperty(example = "null", value = "vztah")
  public Double getUnitrate() {
    return unitrate;
  }

  public void setUnitrate(Double unitrate) {
    this.unitrate = unitrate;
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
    return Objects.equals(this.displayname, supplierpricelistrow.displayname) &&
        Objects.equals(this.id, supplierpricelistrow.id) &&
        Objects.equals(this.classid, supplierpricelistrow.classid) &&
        Objects.equals(this.objversion, supplierpricelistrow.objversion) &&
        Objects.equals(this.parentId, supplierpricelistrow.parentId) &&
        Objects.equals(this.posindex, supplierpricelistrow.posindex) &&
        Objects.equals(this.code, supplierpricelistrow.code) &&
        Objects.equals(this.name, supplierpricelistrow.name) &&
        Objects.equals(this.qunit, supplierpricelistrow.qunit) &&
        Objects.equals(this.ean, supplierpricelistrow.ean) &&
        Objects.equals(this.purchaseprice, supplierpricelistrow.purchaseprice) &&
        Objects.equals(this.currencyId, supplierpricelistrow.currencyId) &&
        Objects.equals(this.vatrate, supplierpricelistrow.vatrate) &&
        Objects.equals(this.deliverytime, supplierpricelistrow.deliverytime) &&
        Objects.equals(this.minimalquantity, supplierpricelistrow.minimalquantity) &&
        Objects.equals(this.note, supplierpricelistrow.note) &&
        Objects.equals(this.pictureId, supplierpricelistrow.pictureId) &&
        Objects.equals(this.storecardId, supplierpricelistrow.storecardId) &&
        Objects.equals(this.storeunitId, supplierpricelistrow.storeunitId) &&
        Objects.equals(this.supplierId, supplierpricelistrow.supplierId) &&
        Objects.equals(this.discountedprice, supplierpricelistrow.discountedprice) &&
        Objects.equals(this.unitrate, supplierpricelistrow.unitrate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, code, name, qunit, ean, purchaseprice, currencyId, vatrate, deliverytime, minimalquantity, note, pictureId, storecardId, storeunitId, supplierId, discountedprice, unitrate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supplierpricelistrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    qunit: ").append(toIndentedString(qunit)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    purchaseprice: ").append(toIndentedString(purchaseprice)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    vatrate: ").append(toIndentedString(vatrate)).append("\n");
    sb.append("    deliverytime: ").append(toIndentedString(deliverytime)).append("\n");
    sb.append("    minimalquantity: ").append(toIndentedString(minimalquantity)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    pictureId: ").append(toIndentedString(pictureId)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    storeunitId: ").append(toIndentedString(storeunitId)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
    sb.append("    discountedprice: ").append(toIndentedString(discountedprice)).append("\n");
    sb.append("    unitrate: ").append(toIndentedString(unitrate)).append("\n");
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

