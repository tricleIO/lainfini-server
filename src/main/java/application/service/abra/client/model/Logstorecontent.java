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
 * Logstorecontent
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Logstorecontent   {
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

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("storebatch_id")
  private String storebatchId = null;

  @SerializedName("qunit")
  private String qunit = null;

  @SerializedName("unitrate")
  private Double unitrate = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("quantityreserved")
  private Double quantityreserved = null;

  @SerializedName("quantityawaited")
  private Double quantityawaited = null;

  @SerializedName("dateofstorage$date")
  private DateTime dateofstoragedate = null;

  @SerializedName("invquantity")
  private Double invquantity = null;

  @SerializedName("invchange")
  private Boolean invchange = null;

  @SerializedName("unitquantity")
  private Double unitquantity = null;

  @SerializedName("unitquantityreserved")
  private Double unitquantityreserved = null;

  @SerializedName("unitquantityawaited")
  private Double unitquantityawaited = null;

  @SerializedName("uniteditinvquantity")
  private Double uniteditinvquantity = null;

  @SerializedName("invunitquantity")
  private Double invunitquantity = null;

  @SerializedName("totalcapacity")
  private Double totalcapacity = null;

  @SerializedName("capacityunit")
  private Integer capacityunit = null;

  @SerializedName("totalweight")
  private Double totalweight = null;

  @SerializedName("weightunit")
  private Integer weightunit = null;

  public Logstorecontent displayname(String displayname) {
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

  public Logstorecontent id(String id) {
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

  public Logstorecontent classid(String classid) {
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

  public Logstorecontent objversion(Integer objversion) {
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

  public Logstorecontent parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu skladová pozice [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu skladová pozice [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Logstorecontent storecardId(String storecardId) {
    this.storecardId = storecardId;
    return this;
  }

   /**
   * skladová karta; id objektu skladová karta [persistentní položka]
   * @return storecardId
  **/
  @ApiModelProperty(example = "null", value = "skladová karta; id objektu skladová karta [persistentní položka]")
  public String getStorecardId() {
    return storecardId;
  }

  public void setStorecardId(String storecardId) {
    this.storecardId = storecardId;
  }

  public Logstorecontent storebatchId(String storebatchId) {
    this.storebatchId = storebatchId;
    return this;
  }

   /**
   * sériové číslo/šarže; id objektu Šarže/sériové číslo [persistentní položka]
   * @return storebatchId
  **/
  @ApiModelProperty(example = "null", value = "sériové číslo/šarže; id objektu Šarže/sériové číslo [persistentní položka]")
  public String getStorebatchId() {
    return storebatchId;
  }

  public void setStorebatchId(String storebatchId) {
    this.storebatchId = storebatchId;
  }

  public Logstorecontent qunit(String qunit) {
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

  public Logstorecontent unitrate(Double unitrate) {
    this.unitrate = unitrate;
    return this;
  }

   /**
   * převodní vztah jedn. [persistentní položka]
   * @return unitrate
  **/
  @ApiModelProperty(example = "null", value = "převodní vztah jedn. [persistentní položka]")
  public Double getUnitrate() {
    return unitrate;
  }

  public void setUnitrate(Double unitrate) {
    this.unitrate = unitrate;
  }

  public Logstorecontent quantity(Double quantity) {
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

  public Logstorecontent quantityreserved(Double quantityreserved) {
    this.quantityreserved = quantityreserved;
    return this;
  }

   /**
   * rezervované množství [persistentní položka]
   * @return quantityreserved
  **/
  @ApiModelProperty(example = "null", value = "rezervované množství [persistentní položka]")
  public Double getQuantityreserved() {
    return quantityreserved;
  }

  public void setQuantityreserved(Double quantityreserved) {
    this.quantityreserved = quantityreserved;
  }

  public Logstorecontent quantityawaited(Double quantityawaited) {
    this.quantityawaited = quantityawaited;
    return this;
  }

   /**
   * očekávané množství [persistentní položka]
   * @return quantityawaited
  **/
  @ApiModelProperty(example = "null", value = "očekávané množství [persistentní položka]")
  public Double getQuantityawaited() {
    return quantityawaited;
  }

  public void setQuantityawaited(Double quantityawaited) {
    this.quantityawaited = quantityawaited;
  }

  public Logstorecontent dateofstoragedate(DateTime dateofstoragedate) {
    this.dateofstoragedate = dateofstoragedate;
    return this;
  }

   /**
   * datum naskladnění [persistentní položka]
   * @return dateofstoragedate
  **/
  @ApiModelProperty(example = "null", value = "datum naskladnění [persistentní položka]")
  public DateTime getDateofstoragedate() {
    return dateofstoragedate;
  }

  public void setDateofstoragedate(DateTime dateofstoragedate) {
    this.dateofstoragedate = dateofstoragedate;
  }

  public Logstorecontent invquantity(Double invquantity) {
    this.invquantity = invquantity;
    return this;
  }

   /**
   * skutečné množství [persistentní položka]
   * @return invquantity
  **/
  @ApiModelProperty(example = "null", value = "skutečné množství [persistentní položka]")
  public Double getInvquantity() {
    return invquantity;
  }

  public void setInvquantity(Double invquantity) {
    this.invquantity = invquantity;
  }

  public Logstorecontent invchange(Boolean invchange) {
    this.invchange = invchange;
    return this;
  }

   /**
   * změna v průběhu inventury [persistentní položka]
   * @return invchange
  **/
  @ApiModelProperty(example = "null", value = "změna v průběhu inventury [persistentní položka]")
  public Boolean getInvchange() {
    return invchange;
  }

  public void setInvchange(Boolean invchange) {
    this.invchange = invchange;
  }

  public Logstorecontent unitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
    return this;
  }

   /**
   * množství v jednotce
   * @return unitquantity
  **/
  @ApiModelProperty(example = "null", value = "množství v jednotce")
  public Double getUnitquantity() {
    return unitquantity;
  }

  public void setUnitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
  }

  public Logstorecontent unitquantityreserved(Double unitquantityreserved) {
    this.unitquantityreserved = unitquantityreserved;
    return this;
  }

   /**
   * rezervované množství v jednotce
   * @return unitquantityreserved
  **/
  @ApiModelProperty(example = "null", value = "rezervované množství v jednotce")
  public Double getUnitquantityreserved() {
    return unitquantityreserved;
  }

  public void setUnitquantityreserved(Double unitquantityreserved) {
    this.unitquantityreserved = unitquantityreserved;
  }

  public Logstorecontent unitquantityawaited(Double unitquantityawaited) {
    this.unitquantityawaited = unitquantityawaited;
    return this;
  }

   /**
   * očekávané množství v jednotce
   * @return unitquantityawaited
  **/
  @ApiModelProperty(example = "null", value = "očekávané množství v jednotce")
  public Double getUnitquantityawaited() {
    return unitquantityawaited;
  }

  public void setUnitquantityawaited(Double unitquantityawaited) {
    this.unitquantityawaited = unitquantityawaited;
  }

  public Logstorecontent uniteditinvquantity(Double uniteditinvquantity) {
    this.uniteditinvquantity = uniteditinvquantity;
    return this;
  }

   /**
   * skutečné množství (pro editaci) v jednotce
   * @return uniteditinvquantity
  **/
  @ApiModelProperty(example = "null", value = "skutečné množství (pro editaci) v jednotce")
  public Double getUniteditinvquantity() {
    return uniteditinvquantity;
  }

  public void setUniteditinvquantity(Double uniteditinvquantity) {
    this.uniteditinvquantity = uniteditinvquantity;
  }

  public Logstorecontent invunitquantity(Double invunitquantity) {
    this.invunitquantity = invunitquantity;
    return this;
  }

   /**
   * skutečné množství v jednotce
   * @return invunitquantity
  **/
  @ApiModelProperty(example = "null", value = "skutečné množství v jednotce")
  public Double getInvunitquantity() {
    return invunitquantity;
  }

  public void setInvunitquantity(Double invunitquantity) {
    this.invunitquantity = invunitquantity;
  }

  public Logstorecontent totalcapacity(Double totalcapacity) {
    this.totalcapacity = totalcapacity;
    return this;
  }

   /**
   * celkový objem v jednotce [persistentní položka]
   * @return totalcapacity
  **/
  @ApiModelProperty(example = "null", value = "celkový objem v jednotce [persistentní položka]")
  public Double getTotalcapacity() {
    return totalcapacity;
  }

  public void setTotalcapacity(Double totalcapacity) {
    this.totalcapacity = totalcapacity;
  }

  public Logstorecontent capacityunit(Integer capacityunit) {
    this.capacityunit = capacityunit;
    return this;
  }

   /**
   * jednotka objemu [persistentní položka]
   * @return capacityunit
  **/
  @ApiModelProperty(example = "null", value = "jednotka objemu [persistentní položka]")
  public Integer getCapacityunit() {
    return capacityunit;
  }

  public void setCapacityunit(Integer capacityunit) {
    this.capacityunit = capacityunit;
  }

  public Logstorecontent totalweight(Double totalweight) {
    this.totalweight = totalweight;
    return this;
  }

   /**
   * celková váha [persistentní položka]
   * @return totalweight
  **/
  @ApiModelProperty(example = "null", value = "celková váha [persistentní položka]")
  public Double getTotalweight() {
    return totalweight;
  }

  public void setTotalweight(Double totalweight) {
    this.totalweight = totalweight;
  }

  public Logstorecontent weightunit(Integer weightunit) {
    this.weightunit = weightunit;
    return this;
  }

   /**
   * jednotka hmotnosti [persistentní položka]
   * @return weightunit
  **/
  @ApiModelProperty(example = "null", value = "jednotka hmotnosti [persistentní položka]")
  public Integer getWeightunit() {
    return weightunit;
  }

  public void setWeightunit(Integer weightunit) {
    this.weightunit = weightunit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Logstorecontent logstorecontent = (Logstorecontent) o;
    return Objects.equals(this.displayname, logstorecontent.displayname) &&
        Objects.equals(this.id, logstorecontent.id) &&
        Objects.equals(this.classid, logstorecontent.classid) &&
        Objects.equals(this.objversion, logstorecontent.objversion) &&
        Objects.equals(this.parentId, logstorecontent.parentId) &&
        Objects.equals(this.storecardId, logstorecontent.storecardId) &&
        Objects.equals(this.storebatchId, logstorecontent.storebatchId) &&
        Objects.equals(this.qunit, logstorecontent.qunit) &&
        Objects.equals(this.unitrate, logstorecontent.unitrate) &&
        Objects.equals(this.quantity, logstorecontent.quantity) &&
        Objects.equals(this.quantityreserved, logstorecontent.quantityreserved) &&
        Objects.equals(this.quantityawaited, logstorecontent.quantityawaited) &&
        Objects.equals(this.dateofstoragedate, logstorecontent.dateofstoragedate) &&
        Objects.equals(this.invquantity, logstorecontent.invquantity) &&
        Objects.equals(this.invchange, logstorecontent.invchange) &&
        Objects.equals(this.unitquantity, logstorecontent.unitquantity) &&
        Objects.equals(this.unitquantityreserved, logstorecontent.unitquantityreserved) &&
        Objects.equals(this.unitquantityawaited, logstorecontent.unitquantityawaited) &&
        Objects.equals(this.uniteditinvquantity, logstorecontent.uniteditinvquantity) &&
        Objects.equals(this.invunitquantity, logstorecontent.invunitquantity) &&
        Objects.equals(this.totalcapacity, logstorecontent.totalcapacity) &&
        Objects.equals(this.capacityunit, logstorecontent.capacityunit) &&
        Objects.equals(this.totalweight, logstorecontent.totalweight) &&
        Objects.equals(this.weightunit, logstorecontent.weightunit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, storecardId, storebatchId, qunit, unitrate, quantity, quantityreserved, quantityawaited, dateofstoragedate, invquantity, invchange, unitquantity, unitquantityreserved, unitquantityawaited, uniteditinvquantity, invunitquantity, totalcapacity, capacityunit, totalweight, weightunit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Logstorecontent {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    storebatchId: ").append(toIndentedString(storebatchId)).append("\n");
    sb.append("    qunit: ").append(toIndentedString(qunit)).append("\n");
    sb.append("    unitrate: ").append(toIndentedString(unitrate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityreserved: ").append(toIndentedString(quantityreserved)).append("\n");
    sb.append("    quantityawaited: ").append(toIndentedString(quantityawaited)).append("\n");
    sb.append("    dateofstoragedate: ").append(toIndentedString(dateofstoragedate)).append("\n");
    sb.append("    invquantity: ").append(toIndentedString(invquantity)).append("\n");
    sb.append("    invchange: ").append(toIndentedString(invchange)).append("\n");
    sb.append("    unitquantity: ").append(toIndentedString(unitquantity)).append("\n");
    sb.append("    unitquantityreserved: ").append(toIndentedString(unitquantityreserved)).append("\n");
    sb.append("    unitquantityawaited: ").append(toIndentedString(unitquantityawaited)).append("\n");
    sb.append("    uniteditinvquantity: ").append(toIndentedString(uniteditinvquantity)).append("\n");
    sb.append("    invunitquantity: ").append(toIndentedString(invunitquantity)).append("\n");
    sb.append("    totalcapacity: ").append(toIndentedString(totalcapacity)).append("\n");
    sb.append("    capacityunit: ").append(toIndentedString(capacityunit)).append("\n");
    sb.append("    totalweight: ").append(toIndentedString(totalweight)).append("\n");
    sb.append("    weightunit: ").append(toIndentedString(weightunit)).append("\n");
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

