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
 * Actionstorepricerow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Actionstorepricerow   {
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

  @SerializedName("price_id")
  private String priceId = null;

  @SerializedName("qunit")
  private String qunit = null;

  @SerializedName("unitrate")
  private Double unitrate = null;

  @SerializedName("amount")
  private Double amount = null;

  public Actionstorepricerow displayname(String displayname) {
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

  public Actionstorepricerow id(String id) {
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

  public Actionstorepricerow classid(String classid) {
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

  public Actionstorepricerow objversion(Integer objversion) {
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

  public Actionstorepricerow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu položka akčního ceníku [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu položka akčního ceníku [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Actionstorepricerow priceId(String priceId) {
    this.priceId = priceId;
    return this;
  }

   /**
   * cena; id objektu definice ceny [persistentní položka]
   * @return priceId
  **/
  @ApiModelProperty(example = "null", value = "cena; id objektu definice ceny [persistentní položka]")
  public String getPriceId() {
    return priceId;
  }

  public void setPriceId(String priceId) {
    this.priceId = priceId;
  }

  public Actionstorepricerow qunit(String qunit) {
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

  public Actionstorepricerow unitrate(Double unitrate) {
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

  public Actionstorepricerow amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Částka [persistentní položka]
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Částka [persistentní položka]")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actionstorepricerow actionstorepricerow = (Actionstorepricerow) o;
    return Objects.equals(this.displayname, actionstorepricerow.displayname) &&
        Objects.equals(this.id, actionstorepricerow.id) &&
        Objects.equals(this.classid, actionstorepricerow.classid) &&
        Objects.equals(this.objversion, actionstorepricerow.objversion) &&
        Objects.equals(this.parentId, actionstorepricerow.parentId) &&
        Objects.equals(this.priceId, actionstorepricerow.priceId) &&
        Objects.equals(this.qunit, actionstorepricerow.qunit) &&
        Objects.equals(this.unitrate, actionstorepricerow.unitrate) &&
        Objects.equals(this.amount, actionstorepricerow.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, priceId, qunit, unitrate, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actionstorepricerow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    priceId: ").append(toIndentedString(priceId)).append("\n");
    sb.append("    qunit: ").append(toIndentedString(qunit)).append("\n");
    sb.append("    unitrate: ").append(toIndentedString(unitrate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

