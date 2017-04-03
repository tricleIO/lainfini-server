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
 * Plmcoopsn
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Plmcoopsn   {
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

  @SerializedName("sn_id")
  private String snId = null;

  @SerializedName("returnedat$date")
  private DateTime returnedatdate = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("qunit")
  private String qunit = null;

  @SerializedName("unitrate")
  private Double unitrate = null;

  @SerializedName("unitquantity")
  private Double unitquantity = null;

  @SerializedName("returnedquantity")
  private Double returnedquantity = null;

  @SerializedName("returnedunitquantity")
  private Double returnedunitquantity = null;

  public Plmcoopsn displayname(String displayname) {
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

  public Plmcoopsn id(String id) {
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

  public Plmcoopsn classid(String classid) {
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

  public Plmcoopsn objversion(Integer objversion) {
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

  public Plmcoopsn parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu koop. - vyráběná položka [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu koop. - vyráběná položka [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Plmcoopsn snId(String snId) {
    this.snId = snId;
    return this;
  }

   /**
   * sériové číslo; id objektu vp - sériové číslo [persistentní položka]
   * @return snId
  **/
  @ApiModelProperty(example = "null", value = "sériové číslo; id objektu vp - sériové číslo [persistentní položka]")
  public String getSnId() {
    return snId;
  }

  public void setSnId(String snId) {
    this.snId = snId;
  }

  public Plmcoopsn returnedatdate(DateTime returnedatdate) {
    this.returnedatdate = returnedatdate;
    return this;
  }

   /**
   * přivezeno zpět [persistentní položka]
   * @return returnedatdate
  **/
  @ApiModelProperty(example = "null", value = "přivezeno zpět [persistentní položka]")
  public DateTime getReturnedatdate() {
    return returnedatdate;
  }

  public void setReturnedatdate(DateTime returnedatdate) {
    this.returnedatdate = returnedatdate;
  }

  public Plmcoopsn quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * množství do kooperace v ev.jedn. [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "množství do kooperace v ev.jedn. [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Plmcoopsn qunit(String qunit) {
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

  public Plmcoopsn unitrate(Double unitrate) {
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

  public Plmcoopsn unitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
    return this;
  }

   /**
   * množství do kooperace
   * @return unitquantity
  **/
  @ApiModelProperty(example = "null", value = "množství do kooperace")
  public Double getUnitquantity() {
    return unitquantity;
  }

  public void setUnitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
  }

  public Plmcoopsn returnedquantity(Double returnedquantity) {
    this.returnedquantity = returnedquantity;
    return this;
  }

   /**
   * množství z kooperace v ev.jedn. [persistentní položka]
   * @return returnedquantity
  **/
  @ApiModelProperty(example = "null", value = "množství z kooperace v ev.jedn. [persistentní položka]")
  public Double getReturnedquantity() {
    return returnedquantity;
  }

  public void setReturnedquantity(Double returnedquantity) {
    this.returnedquantity = returnedquantity;
  }

  public Plmcoopsn returnedunitquantity(Double returnedunitquantity) {
    this.returnedunitquantity = returnedunitquantity;
    return this;
  }

   /**
   * množství z kooperace
   * @return returnedunitquantity
  **/
  @ApiModelProperty(example = "null", value = "množství z kooperace")
  public Double getReturnedunitquantity() {
    return returnedunitquantity;
  }

  public void setReturnedunitquantity(Double returnedunitquantity) {
    this.returnedunitquantity = returnedunitquantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmcoopsn plmcoopsn = (Plmcoopsn) o;
    return Objects.equals(this.displayname, plmcoopsn.displayname) &&
        Objects.equals(this.id, plmcoopsn.id) &&
        Objects.equals(this.classid, plmcoopsn.classid) &&
        Objects.equals(this.objversion, plmcoopsn.objversion) &&
        Objects.equals(this.parentId, plmcoopsn.parentId) &&
        Objects.equals(this.snId, plmcoopsn.snId) &&
        Objects.equals(this.returnedatdate, plmcoopsn.returnedatdate) &&
        Objects.equals(this.quantity, plmcoopsn.quantity) &&
        Objects.equals(this.qunit, plmcoopsn.qunit) &&
        Objects.equals(this.unitrate, plmcoopsn.unitrate) &&
        Objects.equals(this.unitquantity, plmcoopsn.unitquantity) &&
        Objects.equals(this.returnedquantity, plmcoopsn.returnedquantity) &&
        Objects.equals(this.returnedunitquantity, plmcoopsn.returnedunitquantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, snId, returnedatdate, quantity, qunit, unitrate, unitquantity, returnedquantity, returnedunitquantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmcoopsn {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    snId: ").append(toIndentedString(snId)).append("\n");
    sb.append("    returnedatdate: ").append(toIndentedString(returnedatdate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    qunit: ").append(toIndentedString(qunit)).append("\n");
    sb.append("    unitrate: ").append(toIndentedString(unitrate)).append("\n");
    sb.append("    unitquantity: ").append(toIndentedString(unitquantity)).append("\n");
    sb.append("    returnedquantity: ").append(toIndentedString(returnedquantity)).append("\n");
    sb.append("    returnedunitquantity: ").append(toIndentedString(returnedunitquantity)).append("\n");
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

