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
 * Insuranceperioddetail
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Insuranceperioddetail   {
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

  @SerializedName("wageperiod_id")
  private String wageperiodId = null;

  @SerializedName("insurancebase")
  private Double insurancebase = null;

  @SerializedName("insbasecorrection")
  private Double insbasecorrection = null;

  @SerializedName("excldaysinsbase")
  private Double excldaysinsbase = null;

  @SerializedName("excldaysinsbasecorrection")
  private Double excldaysinsbasecorrection = null;

  @SerializedName("excldays")
  private Integer excldays = null;

  @SerializedName("excldayscorrection")
  private Integer excldayscorrection = null;

  @SerializedName("insurancebasetotal")
  private Double insurancebasetotal = null;

  @SerializedName("excldaysinsbasetotal")
  private Double excldaysinsbasetotal = null;

  @SerializedName("excldaystotal")
  private Integer excldaystotal = null;

  public Insuranceperioddetail displayname(String displayname) {
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

  public Insuranceperioddetail id(String id) {
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

  public Insuranceperioddetail classid(String classid) {
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

  public Insuranceperioddetail objversion(Integer objversion) {
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

  public Insuranceperioddetail parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu hlavičkový objekt [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu hlavičkový objekt [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Insuranceperioddetail wageperiodId(String wageperiodId) {
    this.wageperiodId = wageperiodId;
    return this;
  }

   /**
   * mzdové období; id objektu mzdové období [persistentní položka]
   * @return wageperiodId
  **/
  @ApiModelProperty(example = "null", value = "mzdové období; id objektu mzdové období [persistentní položka]")
  public String getWageperiodId() {
    return wageperiodId;
  }

  public void setWageperiodId(String wageperiodId) {
    this.wageperiodId = wageperiodId;
  }

  public Insuranceperioddetail insurancebase(Double insurancebase) {
    this.insurancebase = insurancebase;
    return this;
  }

   /**
   * vyměřovací základ [persistentní položka]
   * @return insurancebase
  **/
  @ApiModelProperty(example = "null", value = "vyměřovací základ [persistentní položka]")
  public Double getInsurancebase() {
    return insurancebase;
  }

  public void setInsurancebase(Double insurancebase) {
    this.insurancebase = insurancebase;
  }

  public Insuranceperioddetail insbasecorrection(Double insbasecorrection) {
    this.insbasecorrection = insbasecorrection;
    return this;
  }

   /**
   * vym.základ-opr. [persistentní položka]
   * @return insbasecorrection
  **/
  @ApiModelProperty(example = "null", value = "vym.základ-opr. [persistentní položka]")
  public Double getInsbasecorrection() {
    return insbasecorrection;
  }

  public void setInsbasecorrection(Double insbasecorrection) {
    this.insbasecorrection = insbasecorrection;
  }

  public Insuranceperioddetail excldaysinsbase(Double excldaysinsbase) {
    this.excldaysinsbase = excldaysinsbase;
    return this;
  }

   /**
   * vz při vyl.době [persistentní položka]
   * @return excldaysinsbase
  **/
  @ApiModelProperty(example = "null", value = "vz při vyl.době [persistentní položka]")
  public Double getExcldaysinsbase() {
    return excldaysinsbase;
  }

  public void setExcldaysinsbase(Double excldaysinsbase) {
    this.excldaysinsbase = excldaysinsbase;
  }

  public Insuranceperioddetail excldaysinsbasecorrection(Double excldaysinsbasecorrection) {
    this.excldaysinsbasecorrection = excldaysinsbasecorrection;
    return this;
  }

   /**
   * vz při vyl.době-opr [persistentní položka]
   * @return excldaysinsbasecorrection
  **/
  @ApiModelProperty(example = "null", value = "vz při vyl.době-opr [persistentní položka]")
  public Double getExcldaysinsbasecorrection() {
    return excldaysinsbasecorrection;
  }

  public void setExcldaysinsbasecorrection(Double excldaysinsbasecorrection) {
    this.excldaysinsbasecorrection = excldaysinsbasecorrection;
  }

  public Insuranceperioddetail excldays(Integer excldays) {
    this.excldays = excldays;
    return this;
  }

   /**
   * vyloučená doba [persistentní položka]
   * @return excldays
  **/
  @ApiModelProperty(example = "null", value = "vyloučená doba [persistentní položka]")
  public Integer getExcldays() {
    return excldays;
  }

  public void setExcldays(Integer excldays) {
    this.excldays = excldays;
  }

  public Insuranceperioddetail excldayscorrection(Integer excldayscorrection) {
    this.excldayscorrection = excldayscorrection;
    return this;
  }

   /**
   * vyloučená doba-opr. [persistentní položka]
   * @return excldayscorrection
  **/
  @ApiModelProperty(example = "null", value = "vyloučená doba-opr. [persistentní položka]")
  public Integer getExcldayscorrection() {
    return excldayscorrection;
  }

  public void setExcldayscorrection(Integer excldayscorrection) {
    this.excldayscorrection = excldayscorrection;
  }

  public Insuranceperioddetail insurancebasetotal(Double insurancebasetotal) {
    this.insurancebasetotal = insurancebasetotal;
    return this;
  }

   /**
   * celkový vym.základ
   * @return insurancebasetotal
  **/
  @ApiModelProperty(example = "null", value = "celkový vym.základ")
  public Double getInsurancebasetotal() {
    return insurancebasetotal;
  }

  public void setInsurancebasetotal(Double insurancebasetotal) {
    this.insurancebasetotal = insurancebasetotal;
  }

  public Insuranceperioddetail excldaysinsbasetotal(Double excldaysinsbasetotal) {
    this.excldaysinsbasetotal = excldaysinsbasetotal;
    return this;
  }

   /**
   * celkový vym.základ v době vyloučené doby
   * @return excldaysinsbasetotal
  **/
  @ApiModelProperty(example = "null", value = "celkový vym.základ v době vyloučené doby")
  public Double getExcldaysinsbasetotal() {
    return excldaysinsbasetotal;
  }

  public void setExcldaysinsbasetotal(Double excldaysinsbasetotal) {
    this.excldaysinsbasetotal = excldaysinsbasetotal;
  }

  public Insuranceperioddetail excldaystotal(Integer excldaystotal) {
    this.excldaystotal = excldaystotal;
    return this;
  }

   /**
   * celkové vyloučená doba
   * @return excldaystotal
  **/
  @ApiModelProperty(example = "null", value = "celkové vyloučená doba")
  public Integer getExcldaystotal() {
    return excldaystotal;
  }

  public void setExcldaystotal(Integer excldaystotal) {
    this.excldaystotal = excldaystotal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Insuranceperioddetail insuranceperioddetail = (Insuranceperioddetail) o;
    return Objects.equals(this.displayname, insuranceperioddetail.displayname) &&
        Objects.equals(this.id, insuranceperioddetail.id) &&
        Objects.equals(this.classid, insuranceperioddetail.classid) &&
        Objects.equals(this.objversion, insuranceperioddetail.objversion) &&
        Objects.equals(this.parentId, insuranceperioddetail.parentId) &&
        Objects.equals(this.wageperiodId, insuranceperioddetail.wageperiodId) &&
        Objects.equals(this.insurancebase, insuranceperioddetail.insurancebase) &&
        Objects.equals(this.insbasecorrection, insuranceperioddetail.insbasecorrection) &&
        Objects.equals(this.excldaysinsbase, insuranceperioddetail.excldaysinsbase) &&
        Objects.equals(this.excldaysinsbasecorrection, insuranceperioddetail.excldaysinsbasecorrection) &&
        Objects.equals(this.excldays, insuranceperioddetail.excldays) &&
        Objects.equals(this.excldayscorrection, insuranceperioddetail.excldayscorrection) &&
        Objects.equals(this.insurancebasetotal, insuranceperioddetail.insurancebasetotal) &&
        Objects.equals(this.excldaysinsbasetotal, insuranceperioddetail.excldaysinsbasetotal) &&
        Objects.equals(this.excldaystotal, insuranceperioddetail.excldaystotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, wageperiodId, insurancebase, insbasecorrection, excldaysinsbase, excldaysinsbasecorrection, excldays, excldayscorrection, insurancebasetotal, excldaysinsbasetotal, excldaystotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Insuranceperioddetail {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    wageperiodId: ").append(toIndentedString(wageperiodId)).append("\n");
    sb.append("    insurancebase: ").append(toIndentedString(insurancebase)).append("\n");
    sb.append("    insbasecorrection: ").append(toIndentedString(insbasecorrection)).append("\n");
    sb.append("    excldaysinsbase: ").append(toIndentedString(excldaysinsbase)).append("\n");
    sb.append("    excldaysinsbasecorrection: ").append(toIndentedString(excldaysinsbasecorrection)).append("\n");
    sb.append("    excldays: ").append(toIndentedString(excldays)).append("\n");
    sb.append("    excldayscorrection: ").append(toIndentedString(excldayscorrection)).append("\n");
    sb.append("    insurancebasetotal: ").append(toIndentedString(insurancebasetotal)).append("\n");
    sb.append("    excldaysinsbasetotal: ").append(toIndentedString(excldaysinsbasetotal)).append("\n");
    sb.append("    excldaystotal: ").append(toIndentedString(excldaystotal)).append("\n");
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

