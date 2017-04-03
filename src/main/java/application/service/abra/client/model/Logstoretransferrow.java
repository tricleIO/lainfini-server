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
 * Logstoretransferrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Logstoretransferrow   {
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

  @SerializedName("store_id")
  private String storeId = null;

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("storebatch_id")
  private String storebatchId = null;

  @SerializedName("storedocrow_id")
  private String storedocrowId = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("qunit")
  private String qunit = null;

  @SerializedName("unitrate")
  private Double unitrate = null;

  @SerializedName("storeposition_id")
  private String storepositionId = null;

  @SerializedName("restquantity")
  private Double restquantity = null;

  @SerializedName("unitrestquantity")
  private Double unitrestquantity = null;

  @SerializedName("inpositionquantity")
  private Double inpositionquantity = null;

  @SerializedName("masterrow_id")
  private String masterrowId = null;

  @SerializedName("sortkey")
  private String sortkey = null;

  @SerializedName("contentunit")
  private String contentunit = null;

  @SerializedName("contentunitrate")
  private Double contentunitrate = null;

  @SerializedName("orderflow")
  private Integer orderflow = null;

  @SerializedName("incomingstoreposition_id")
  private String incomingstorepositionId = null;

  public Logstoretransferrow displayname(String displayname) {
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

  public Logstoretransferrow id(String id) {
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

  public Logstoretransferrow classid(String classid) {
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

  public Logstoretransferrow objversion(Integer objversion) {
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

  public Logstoretransferrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu polohovací doklad [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu polohovací doklad [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Logstoretransferrow posindex(Integer posindex) {
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

  public Logstoretransferrow storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * sklad; id objektu sklad [persistentní položka]
   * @return storeId
  **/
  @ApiModelProperty(example = "null", value = "sklad; id objektu sklad [persistentní položka]")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public Logstoretransferrow storecardId(String storecardId) {
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

  public Logstoretransferrow storebatchId(String storebatchId) {
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

  public Logstoretransferrow storedocrowId(String storedocrowId) {
    this.storedocrowId = storedocrowId;
    return this;
  }

   /**
   * odkaz na skladový řádek [persistentní položka]
   * @return storedocrowId
  **/
  @ApiModelProperty(example = "null", value = "odkaz na skladový řádek [persistentní položka]")
  public String getStoredocrowId() {
    return storedocrowId;
  }

  public void setStoredocrowId(String storedocrowId) {
    this.storedocrowId = storedocrowId;
  }

  public Logstoretransferrow quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * počet v ev.jedn. [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "počet v ev.jedn. [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Logstoretransferrow qunit(String qunit) {
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

  public Logstoretransferrow unitrate(Double unitrate) {
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

  public Logstoretransferrow storepositionId(String storepositionId) {
    this.storepositionId = storepositionId;
    return this;
  }

   /**
   * skladová pozice; id objektu skladová pozice [persistentní položka]
   * @return storepositionId
  **/
  @ApiModelProperty(example = "null", value = "skladová pozice; id objektu skladová pozice [persistentní položka]")
  public String getStorepositionId() {
    return storepositionId;
  }

  public void setStorepositionId(String storepositionId) {
    this.storepositionId = storepositionId;
  }

  public Logstoretransferrow restquantity(Double restquantity) {
    this.restquantity = restquantity;
    return this;
  }

   /**
   * zbývá
   * @return restquantity
  **/
  @ApiModelProperty(example = "null", value = "zbývá")
  public Double getRestquantity() {
    return restquantity;
  }

  public void setRestquantity(Double restquantity) {
    this.restquantity = restquantity;
  }

  public Logstoretransferrow unitrestquantity(Double unitrestquantity) {
    this.unitrestquantity = unitrestquantity;
    return this;
  }

   /**
   * zbývá v ev.jedn.
   * @return unitrestquantity
  **/
  @ApiModelProperty(example = "null", value = "zbývá v ev.jedn.")
  public Double getUnitrestquantity() {
    return unitrestquantity;
  }

  public void setUnitrestquantity(Double unitrestquantity) {
    this.unitrestquantity = unitrestquantity;
  }

  public Logstoretransferrow inpositionquantity(Double inpositionquantity) {
    this.inpositionquantity = inpositionquantity;
    return this;
  }

   /**
   * v pozici
   * @return inpositionquantity
  **/
  @ApiModelProperty(example = "null", value = "v pozici")
  public Double getInpositionquantity() {
    return inpositionquantity;
  }

  public void setInpositionquantity(Double inpositionquantity) {
    this.inpositionquantity = inpositionquantity;
  }

  public Logstoretransferrow masterrowId(String masterrowId) {
    this.masterrowId = masterrowId;
    return this;
  }

   /**
   * Řádek se zdroj. pozicí [persistentní položka]
   * @return masterrowId
  **/
  @ApiModelProperty(example = "null", value = "Řádek se zdroj. pozicí [persistentní položka]")
  public String getMasterrowId() {
    return masterrowId;
  }

  public void setMasterrowId(String masterrowId) {
    this.masterrowId = masterrowId;
  }

  public Logstoretransferrow sortkey(String sortkey) {
    this.sortkey = sortkey;
    return this;
  }

   /**
   * klíč
   * @return sortkey
  **/
  @ApiModelProperty(example = "null", value = "klíč")
  public String getSortkey() {
    return sortkey;
  }

  public void setSortkey(String sortkey) {
    this.sortkey = sortkey;
  }

  public Logstoretransferrow contentunit(String contentunit) {
    this.contentunit = contentunit;
    return this;
  }

   /**
   * jednotka obsahu pozice [persistentní položka]
   * @return contentunit
  **/
  @ApiModelProperty(example = "null", value = "jednotka obsahu pozice [persistentní položka]")
  public String getContentunit() {
    return contentunit;
  }

  public void setContentunit(String contentunit) {
    this.contentunit = contentunit;
  }

  public Logstoretransferrow contentunitrate(Double contentunitrate) {
    this.contentunitrate = contentunitrate;
    return this;
  }

   /**
   * vztah jednotky obsahu pozice [persistentní položka]
   * @return contentunitrate
  **/
  @ApiModelProperty(example = "null", value = "vztah jednotky obsahu pozice [persistentní položka]")
  public Double getContentunitrate() {
    return contentunitrate;
  }

  public void setContentunitrate(Double contentunitrate) {
    this.contentunitrate = contentunitrate;
  }

  public Logstoretransferrow orderflow(Integer orderflow) {
    this.orderflow = orderflow;
    return this;
  }

   /**
   * pořadové číslo pohybu [persistentní položka]
   * @return orderflow
  **/
  @ApiModelProperty(example = "null", value = "pořadové číslo pohybu [persistentní položka]")
  public Integer getOrderflow() {
    return orderflow;
  }

  public void setOrderflow(Integer orderflow) {
    this.orderflow = orderflow;
  }

  public Logstoretransferrow incomingstorepositionId(String incomingstorepositionId) {
    this.incomingstorepositionId = incomingstorepositionId;
    return this;
  }

   /**
   * do pozice; id objektu skladová pozice
   * @return incomingstorepositionId
  **/
  @ApiModelProperty(example = "null", value = "do pozice; id objektu skladová pozice")
  public String getIncomingstorepositionId() {
    return incomingstorepositionId;
  }

  public void setIncomingstorepositionId(String incomingstorepositionId) {
    this.incomingstorepositionId = incomingstorepositionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Logstoretransferrow logstoretransferrow = (Logstoretransferrow) o;
    return Objects.equals(this.displayname, logstoretransferrow.displayname) &&
        Objects.equals(this.id, logstoretransferrow.id) &&
        Objects.equals(this.classid, logstoretransferrow.classid) &&
        Objects.equals(this.objversion, logstoretransferrow.objversion) &&
        Objects.equals(this.parentId, logstoretransferrow.parentId) &&
        Objects.equals(this.posindex, logstoretransferrow.posindex) &&
        Objects.equals(this.storeId, logstoretransferrow.storeId) &&
        Objects.equals(this.storecardId, logstoretransferrow.storecardId) &&
        Objects.equals(this.storebatchId, logstoretransferrow.storebatchId) &&
        Objects.equals(this.storedocrowId, logstoretransferrow.storedocrowId) &&
        Objects.equals(this.quantity, logstoretransferrow.quantity) &&
        Objects.equals(this.qunit, logstoretransferrow.qunit) &&
        Objects.equals(this.unitrate, logstoretransferrow.unitrate) &&
        Objects.equals(this.storepositionId, logstoretransferrow.storepositionId) &&
        Objects.equals(this.restquantity, logstoretransferrow.restquantity) &&
        Objects.equals(this.unitrestquantity, logstoretransferrow.unitrestquantity) &&
        Objects.equals(this.inpositionquantity, logstoretransferrow.inpositionquantity) &&
        Objects.equals(this.masterrowId, logstoretransferrow.masterrowId) &&
        Objects.equals(this.sortkey, logstoretransferrow.sortkey) &&
        Objects.equals(this.contentunit, logstoretransferrow.contentunit) &&
        Objects.equals(this.contentunitrate, logstoretransferrow.contentunitrate) &&
        Objects.equals(this.orderflow, logstoretransferrow.orderflow) &&
        Objects.equals(this.incomingstorepositionId, logstoretransferrow.incomingstorepositionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, storeId, storecardId, storebatchId, storedocrowId, quantity, qunit, unitrate, storepositionId, restquantity, unitrestquantity, inpositionquantity, masterrowId, sortkey, contentunit, contentunitrate, orderflow, incomingstorepositionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Logstoretransferrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    storebatchId: ").append(toIndentedString(storebatchId)).append("\n");
    sb.append("    storedocrowId: ").append(toIndentedString(storedocrowId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    qunit: ").append(toIndentedString(qunit)).append("\n");
    sb.append("    unitrate: ").append(toIndentedString(unitrate)).append("\n");
    sb.append("    storepositionId: ").append(toIndentedString(storepositionId)).append("\n");
    sb.append("    restquantity: ").append(toIndentedString(restquantity)).append("\n");
    sb.append("    unitrestquantity: ").append(toIndentedString(unitrestquantity)).append("\n");
    sb.append("    inpositionquantity: ").append(toIndentedString(inpositionquantity)).append("\n");
    sb.append("    masterrowId: ").append(toIndentedString(masterrowId)).append("\n");
    sb.append("    sortkey: ").append(toIndentedString(sortkey)).append("\n");
    sb.append("    contentunit: ").append(toIndentedString(contentunit)).append("\n");
    sb.append("    contentunitrate: ").append(toIndentedString(contentunitrate)).append("\n");
    sb.append("    orderflow: ").append(toIndentedString(orderflow)).append("\n");
    sb.append("    incomingstorepositionId: ").append(toIndentedString(incomingstorepositionId)).append("\n");
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

