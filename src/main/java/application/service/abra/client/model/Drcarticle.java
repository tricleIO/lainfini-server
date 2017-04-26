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
 * Drcarticle
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Drcarticle   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("qunit")
  private String qunit = null;

  @SerializedName("outofuse")
  private Boolean outofuse = null;

  @SerializedName("limitamount")
  private Double limitamount = null;

  @SerializedName("limitgroup")
  private String limitgroup = null;

  @SerializedName("country_id")
  private String countryId = null;

  @SerializedName("vatcheckreportkind")
  private Integer vatcheckreportkind = null;

  public Drcarticle displayname(String displayname) {
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

  public Drcarticle id(String id) {
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

  public Drcarticle classid(String classid) {
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

  public Drcarticle objversion(Integer objversion) {
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

  public Drcarticle hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Drcarticle code(String code) {
    this.code = code;
    return this;
  }

   /**
   * kód typu [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "kód typu [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Drcarticle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Drcarticle qunit(String qunit) {
    this.qunit = qunit;
    return this;
  }

   /**
   * vykazovaná jednotka [persistentní položka]
   * @return qunit
  **/
  @ApiModelProperty(example = "null", value = "vykazovaná jednotka [persistentní položka]")
  public String getQunit() {
    return qunit;
  }

  public void setQunit(String qunit) {
    this.qunit = qunit;
  }

  public Drcarticle outofuse(Boolean outofuse) {
    this.outofuse = outofuse;
    return this;
  }

   /**
   * nepoužívaný [persistentní položka]
   * @return outofuse
  **/
  @ApiModelProperty(example = "null", value = "nepoužívaný [persistentní položka]")
  public Boolean getOutofuse() {
    return outofuse;
  }

  public void setOutofuse(Boolean outofuse) {
    this.outofuse = outofuse;
  }

  public Drcarticle limitamount(Double limitamount) {
    this.limitamount = limitamount;
    return this;
  }

   /**
   * limit [persistentní položka]
   * @return limitamount
  **/
  @ApiModelProperty(example = "null", value = "limit [persistentní položka]")
  public Double getLimitamount() {
    return limitamount;
  }

  public void setLimitamount(Double limitamount) {
    this.limitamount = limitamount;
  }

  public Drcarticle limitgroup(String limitgroup) {
    this.limitgroup = limitgroup;
    return this;
  }

   /**
   * skupina pro limit [persistentní položka]
   * @return limitgroup
  **/
  @ApiModelProperty(example = "null", value = "skupina pro limit [persistentní položka]")
  public String getLimitgroup() {
    return limitgroup;
  }

  public void setLimitgroup(String limitgroup) {
    this.limitgroup = limitgroup;
  }

  public Drcarticle countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

   /**
   * země; id objektu země [persistentní položka]
   * @return countryId
  **/
  @ApiModelProperty(example = "null", value = "země; id objektu země [persistentní položka]")
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public Drcarticle vatcheckreportkind(Integer vatcheckreportkind) {
    this.vatcheckreportkind = vatcheckreportkind;
    return this;
  }

   /**
   * do kv dph [persistentní položka]
   * @return vatcheckreportkind
  **/
  @ApiModelProperty(example = "null", value = "do kv dph [persistentní položka]")
  public Integer getVatcheckreportkind() {
    return vatcheckreportkind;
  }

  public void setVatcheckreportkind(Integer vatcheckreportkind) {
    this.vatcheckreportkind = vatcheckreportkind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drcarticle drcarticle = (Drcarticle) o;
    return Objects.equals(this.displayname, drcarticle.displayname) &&
        Objects.equals(this.id, drcarticle.id) &&
        Objects.equals(this.classid, drcarticle.classid) &&
        Objects.equals(this.objversion, drcarticle.objversion) &&
        Objects.equals(this.hidden, drcarticle.hidden) &&
        Objects.equals(this.code, drcarticle.code) &&
        Objects.equals(this.name, drcarticle.name) &&
        Objects.equals(this.qunit, drcarticle.qunit) &&
        Objects.equals(this.outofuse, drcarticle.outofuse) &&
        Objects.equals(this.limitamount, drcarticle.limitamount) &&
        Objects.equals(this.limitgroup, drcarticle.limitgroup) &&
        Objects.equals(this.countryId, drcarticle.countryId) &&
        Objects.equals(this.vatcheckreportkind, drcarticle.vatcheckreportkind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, name, qunit, outofuse, limitamount, limitgroup, countryId, vatcheckreportkind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drcarticle {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    qunit: ").append(toIndentedString(qunit)).append("\n");
    sb.append("    outofuse: ").append(toIndentedString(outofuse)).append("\n");
    sb.append("    limitamount: ").append(toIndentedString(limitamount)).append("\n");
    sb.append("    limitgroup: ").append(toIndentedString(limitgroup)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    vatcheckreportkind: ").append(toIndentedString(vatcheckreportkind)).append("\n");
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

