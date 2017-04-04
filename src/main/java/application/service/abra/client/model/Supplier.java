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
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Supplier
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Supplier   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("firm_id")
  private String firmId = null;

  @SerializedName("externalnumber")
  private String externalnumber = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("deliverytime")
  private Integer deliverytime = null;

  @SerializedName("minimalquantity")
  private Double minimalquantity = null;

  @SerializedName("packing")
  private Double packing = null;

  @SerializedName("dodemand")
  private Boolean dodemand = null;

  @SerializedName("purchaseprice")
  private Double purchaseprice = null;

  @SerializedName("unitpurchaseprice")
  private Double unitpurchaseprice = null;

  @SerializedName("purchasecurrency_id")
  private String purchasecurrencyId = null;

  @SerializedName("purchasecurrrate")
  private Double purchasecurrrate = null;

  @SerializedName("purchaserefcurrrate")
  private Double purchaserefcurrrate = null;

  @SerializedName("purchasecoef")
  private Integer purchasecoef = null;

  @SerializedName("localpurchasecoef")
  private Integer localpurchasecoef = null;

  @SerializedName("purchasezone_id")
  private String purchasezoneId = null;

  @SerializedName("localpurchasezone_id")
  private String localpurchasezoneId = null;

  @SerializedName("purchasedate$date")
  private DateTime purchasedatedate = null;

  @SerializedName("unitrate")
  private Double unitrate = null;

  @SerializedName("qunit")
  private String qunit = null;

  @SerializedName("refcurrency_id")
  private String refcurrencyId = null;

  @SerializedName("localrefcurrency_id")
  private String localrefcurrencyId = null;

  @SerializedName("isapproved")
  private Boolean isapproved = null;

  @SerializedName("description")
  private String description = null;

  public Supplier displayname(String displayname) {
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

  public Supplier id(String id) {
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

  public Supplier classid(String classid) {
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

  public Supplier objversion(Integer objversion) {
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

  public Supplier storecardId(String storecardId) {
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

  public Supplier firmId(String firmId) {
    this.firmId = firmId;
    return this;
  }

   /**
   * firma; id objektu firma [persistentní položka]
   * @return firmId
  **/
  @ApiModelProperty(example = "null", value = "firma; id objektu firma [persistentní položka]")
  public String getFirmId() {
    return firmId;
  }

  public void setFirmId(String firmId) {
    this.firmId = firmId;
  }

  public Supplier externalnumber(String externalnumber) {
    this.externalnumber = externalnumber;
    return this;
  }

   /**
   * ext.číslo [persistentní položka]
   * @return externalnumber
  **/
  @ApiModelProperty(example = "null", value = "ext.číslo [persistentní položka]")
  public String getExternalnumber() {
    return externalnumber;
  }

  public void setExternalnumber(String externalnumber) {
    this.externalnumber = externalnumber;
  }

  public Supplier name(String name) {
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

  public Supplier deliverytime(Integer deliverytime) {
    this.deliverytime = deliverytime;
    return this;
  }

   /**
   * dod.lhůta [persistentní položka]
   * @return deliverytime
  **/
  @ApiModelProperty(example = "null", value = "dod.lhůta [persistentní položka]")
  public Integer getDeliverytime() {
    return deliverytime;
  }

  public void setDeliverytime(Integer deliverytime) {
    this.deliverytime = deliverytime;
  }

  public Supplier minimalquantity(Double minimalquantity) {
    this.minimalquantity = minimalquantity;
    return this;
  }

   /**
   * min.množství [persistentní položka]
   * @return minimalquantity
  **/
  @ApiModelProperty(example = "null", value = "min.množství [persistentní položka]")
  public Double getMinimalquantity() {
    return minimalquantity;
  }

  public void setMinimalquantity(Double minimalquantity) {
    this.minimalquantity = minimalquantity;
  }

  public Supplier packing(Double packing) {
    this.packing = packing;
    return this;
  }

   /**
   * balení [persistentní položka]
   * @return packing
  **/
  @ApiModelProperty(example = "null", value = "balení [persistentní položka]")
  public Double getPacking() {
    return packing;
  }

  public void setPacking(Double packing) {
    this.packing = packing;
  }

  public Supplier dodemand(Boolean dodemand) {
    this.dodemand = dodemand;
    return this;
  }

   /**
   * poptávat dodavatele [persistentní položka]
   * @return dodemand
  **/
  @ApiModelProperty(example = "null", value = "poptávat dodavatele [persistentní položka]")
  public Boolean getDodemand() {
    return dodemand;
  }

  public void setDodemand(Boolean dodemand) {
    this.dodemand = dodemand;
  }

  public Supplier purchaseprice(Double purchaseprice) {
    this.purchaseprice = purchaseprice;
    return this;
  }

   /**
   * nákup.cena [persistentní položka]
   * @return purchaseprice
  **/
  @ApiModelProperty(example = "null", value = "nákup.cena [persistentní položka]")
  public Double getPurchaseprice() {
    return purchaseprice;
  }

  public void setPurchaseprice(Double purchaseprice) {
    this.purchaseprice = purchaseprice;
  }

  public Supplier unitpurchaseprice(Double unitpurchaseprice) {
    this.unitpurchaseprice = unitpurchaseprice;
    return this;
  }

   /**
   * jedn.nákup.cena
   * @return unitpurchaseprice
  **/
  @ApiModelProperty(example = "null", value = "jedn.nákup.cena")
  public Double getUnitpurchaseprice() {
    return unitpurchaseprice;
  }

  public void setUnitpurchaseprice(Double unitpurchaseprice) {
    this.unitpurchaseprice = unitpurchaseprice;
  }

  public Supplier purchasecurrencyId(String purchasecurrencyId) {
    this.purchasecurrencyId = purchasecurrencyId;
    return this;
  }

   /**
   * nákup.měna; id objektu měna [persistentní položka]
   * @return purchasecurrencyId
  **/
  @ApiModelProperty(example = "null", value = "nákup.měna; id objektu měna [persistentní položka]")
  public String getPurchasecurrencyId() {
    return purchasecurrencyId;
  }

  public void setPurchasecurrencyId(String purchasecurrencyId) {
    this.purchasecurrencyId = purchasecurrencyId;
  }

  public Supplier purchasecurrrate(Double purchasecurrrate) {
    this.purchasecurrrate = purchasecurrrate;
    return this;
  }

   /**
   * nákup.kurz [persistentní položka]
   * @return purchasecurrrate
  **/
  @ApiModelProperty(example = "null", value = "nákup.kurz [persistentní položka]")
  public Double getPurchasecurrrate() {
    return purchasecurrrate;
  }

  public void setPurchasecurrrate(Double purchasecurrrate) {
    this.purchasecurrrate = purchasecurrrate;
  }

  public Supplier purchaserefcurrrate(Double purchaserefcurrrate) {
    this.purchaserefcurrrate = purchaserefcurrrate;
    return this;
  }

   /**
   * nákup.vzt.kurz [persistentní položka]
   * @return purchaserefcurrrate
  **/
  @ApiModelProperty(example = "null", value = "nákup.vzt.kurz [persistentní položka]")
  public Double getPurchaserefcurrrate() {
    return purchaserefcurrrate;
  }

  public void setPurchaserefcurrrate(Double purchaserefcurrrate) {
    this.purchaserefcurrrate = purchaserefcurrrate;
  }

  public Supplier purchasecoef(Integer purchasecoef) {
    this.purchasecoef = purchasecoef;
    return this;
  }

   /**
   * koeficient [persistentní položka]
   * @return purchasecoef
  **/
  @ApiModelProperty(example = "null", value = "koeficient [persistentní položka]")
  public Integer getPurchasecoef() {
    return purchasecoef;
  }

  public void setPurchasecoef(Integer purchasecoef) {
    this.purchasecoef = purchasecoef;
  }

  public Supplier localpurchasecoef(Integer localpurchasecoef) {
    this.localpurchasecoef = localpurchasecoef;
    return this;
  }

   /**
   * lokální koeficient [persistentní položka]
   * @return localpurchasecoef
  **/
  @ApiModelProperty(example = "null", value = "lokální koeficient [persistentní položka]")
  public Integer getLocalpurchasecoef() {
    return localpurchasecoef;
  }

  public void setLocalpurchasecoef(Integer localpurchasecoef) {
    this.localpurchasecoef = localpurchasecoef;
  }

  public Supplier purchasezoneId(String purchasezoneId) {
    this.purchasezoneId = purchasezoneId;
    return this;
  }

   /**
   * zóna; id objektu měna [persistentní položka]
   * @return purchasezoneId
  **/
  @ApiModelProperty(example = "null", value = "zóna; id objektu měna [persistentní položka]")
  public String getPurchasezoneId() {
    return purchasezoneId;
  }

  public void setPurchasezoneId(String purchasezoneId) {
    this.purchasezoneId = purchasezoneId;
  }

  public Supplier localpurchasezoneId(String localpurchasezoneId) {
    this.localpurchasezoneId = localpurchasezoneId;
    return this;
  }

   /**
   * lokální zóna; id objektu měna [persistentní položka]
   * @return localpurchasezoneId
  **/
  @ApiModelProperty(example = "null", value = "lokální zóna; id objektu měna [persistentní položka]")
  public String getLocalpurchasezoneId() {
    return localpurchasezoneId;
  }

  public void setLocalpurchasezoneId(String localpurchasezoneId) {
    this.localpurchasezoneId = localpurchasezoneId;
  }

  public Supplier purchasedatedate(DateTime purchasedatedate) {
    this.purchasedatedate = purchasedatedate;
    return this;
  }

   /**
   * datum nák. [persistentní položka]
   * @return purchasedatedate
  **/
  @ApiModelProperty(example = "null", value = "datum nák. [persistentní položka]")
  public DateTime getPurchasedatedate() {
    return purchasedatedate;
  }

  public void setPurchasedatedate(DateTime purchasedatedate) {
    this.purchasedatedate = purchasedatedate;
  }

  public Supplier unitrate(Double unitrate) {
    this.unitrate = unitrate;
    return this;
  }

   /**
   * vztah [persistentní položka]
   * @return unitrate
  **/
  @ApiModelProperty(example = "null", value = "vztah [persistentní položka]")
  public Double getUnitrate() {
    return unitrate;
  }

  public void setUnitrate(Double unitrate) {
    this.unitrate = unitrate;
  }

  public Supplier qunit(String qunit) {
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

  public Supplier refcurrencyId(String refcurrencyId) {
    this.refcurrencyId = refcurrencyId;
    return this;
  }

   /**
   * ref.měna; id objektu měna
   * @return refcurrencyId
  **/
  @ApiModelProperty(example = "null", value = "ref.měna; id objektu měna")
  public String getRefcurrencyId() {
    return refcurrencyId;
  }

  public void setRefcurrencyId(String refcurrencyId) {
    this.refcurrencyId = refcurrencyId;
  }

  public Supplier localrefcurrencyId(String localrefcurrencyId) {
    this.localrefcurrencyId = localrefcurrencyId;
    return this;
  }

   /**
   * lok.ref.měna; id objektu měna
   * @return localrefcurrencyId
  **/
  @ApiModelProperty(example = "null", value = "lok.ref.měna; id objektu měna")
  public String getLocalrefcurrencyId() {
    return localrefcurrencyId;
  }

  public void setLocalrefcurrencyId(String localrefcurrencyId) {
    this.localrefcurrencyId = localrefcurrencyId;
  }

  public Supplier isapproved(Boolean isapproved) {
    this.isapproved = isapproved;
    return this;
  }

   /**
   * je dodavatel schválený
   * @return isapproved
  **/
  @ApiModelProperty(example = "null", value = "je dodavatel schválený")
  public Boolean getIsapproved() {
    return isapproved;
  }

  public void setIsapproved(Boolean isapproved) {
    this.isapproved = isapproved;
  }

  public Supplier description(String description) {
    this.description = description;
    return this;
  }

   /**
   * poznámka [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "poznámka [persistentní položka]")
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
    return Objects.equals(this.displayname, supplier.displayname) &&
        Objects.equals(this.id, supplier.id) &&
        Objects.equals(this.classid, supplier.classid) &&
        Objects.equals(this.objversion, supplier.objversion) &&
        Objects.equals(this.storecardId, supplier.storecardId) &&
        Objects.equals(this.firmId, supplier.firmId) &&
        Objects.equals(this.externalnumber, supplier.externalnumber) &&
        Objects.equals(this.name, supplier.name) &&
        Objects.equals(this.deliverytime, supplier.deliverytime) &&
        Objects.equals(this.minimalquantity, supplier.minimalquantity) &&
        Objects.equals(this.packing, supplier.packing) &&
        Objects.equals(this.dodemand, supplier.dodemand) &&
        Objects.equals(this.purchaseprice, supplier.purchaseprice) &&
        Objects.equals(this.unitpurchaseprice, supplier.unitpurchaseprice) &&
        Objects.equals(this.purchasecurrencyId, supplier.purchasecurrencyId) &&
        Objects.equals(this.purchasecurrrate, supplier.purchasecurrrate) &&
        Objects.equals(this.purchaserefcurrrate, supplier.purchaserefcurrrate) &&
        Objects.equals(this.purchasecoef, supplier.purchasecoef) &&
        Objects.equals(this.localpurchasecoef, supplier.localpurchasecoef) &&
        Objects.equals(this.purchasezoneId, supplier.purchasezoneId) &&
        Objects.equals(this.localpurchasezoneId, supplier.localpurchasezoneId) &&
        Objects.equals(this.purchasedatedate, supplier.purchasedatedate) &&
        Objects.equals(this.unitrate, supplier.unitrate) &&
        Objects.equals(this.qunit, supplier.qunit) &&
        Objects.equals(this.refcurrencyId, supplier.refcurrencyId) &&
        Objects.equals(this.localrefcurrencyId, supplier.localrefcurrencyId) &&
        Objects.equals(this.isapproved, supplier.isapproved) &&
        Objects.equals(this.description, supplier.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, storecardId, firmId, externalnumber, name, deliverytime, minimalquantity, packing, dodemand, purchaseprice, unitpurchaseprice, purchasecurrencyId, purchasecurrrate, purchaserefcurrrate, purchasecoef, localpurchasecoef, purchasezoneId, localpurchasezoneId, purchasedatedate, unitrate, qunit, refcurrencyId, localrefcurrencyId, isapproved, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supplier {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    firmId: ").append(toIndentedString(firmId)).append("\n");
    sb.append("    externalnumber: ").append(toIndentedString(externalnumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deliverytime: ").append(toIndentedString(deliverytime)).append("\n");
    sb.append("    minimalquantity: ").append(toIndentedString(minimalquantity)).append("\n");
    sb.append("    packing: ").append(toIndentedString(packing)).append("\n");
    sb.append("    dodemand: ").append(toIndentedString(dodemand)).append("\n");
    sb.append("    purchaseprice: ").append(toIndentedString(purchaseprice)).append("\n");
    sb.append("    unitpurchaseprice: ").append(toIndentedString(unitpurchaseprice)).append("\n");
    sb.append("    purchasecurrencyId: ").append(toIndentedString(purchasecurrencyId)).append("\n");
    sb.append("    purchasecurrrate: ").append(toIndentedString(purchasecurrrate)).append("\n");
    sb.append("    purchaserefcurrrate: ").append(toIndentedString(purchaserefcurrrate)).append("\n");
    sb.append("    purchasecoef: ").append(toIndentedString(purchasecoef)).append("\n");
    sb.append("    localpurchasecoef: ").append(toIndentedString(localpurchasecoef)).append("\n");
    sb.append("    purchasezoneId: ").append(toIndentedString(purchasezoneId)).append("\n");
    sb.append("    localpurchasezoneId: ").append(toIndentedString(localpurchasezoneId)).append("\n");
    sb.append("    purchasedatedate: ").append(toIndentedString(purchasedatedate)).append("\n");
    sb.append("    unitrate: ").append(toIndentedString(unitrate)).append("\n");
    sb.append("    qunit: ").append(toIndentedString(qunit)).append("\n");
    sb.append("    refcurrencyId: ").append(toIndentedString(refcurrencyId)).append("\n");
    sb.append("    localrefcurrencyId: ").append(toIndentedString(localrefcurrencyId)).append("\n");
    sb.append("    isapproved: ").append(toIndentedString(isapproved)).append("\n");
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
