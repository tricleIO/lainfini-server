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
 * Intrastatcommodity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Intrastatcommodity   {
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

  @SerializedName("description")
  private String description = null;

  @SerializedName("unitcode")
  private String unitcode = null;

  @SerializedName("weightisoptional")
  private Boolean weightisoptional = null;

  @SerializedName("constantweight")
  private Double constantweight = null;

  public Intrastatcommodity displayname(String displayname) {
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

  public Intrastatcommodity id(String id) {
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

  public Intrastatcommodity classid(String classid) {
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

  public Intrastatcommodity objversion(Integer objversion) {
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

  public Intrastatcommodity hidden(Boolean hidden) {
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

  public Intrastatcommodity code(String code) {
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

  public Intrastatcommodity description(String description) {
    this.description = description;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Intrastatcommodity unitcode(String unitcode) {
    this.unitcode = unitcode;
    return this;
  }

   /**
   * dop.měr.jednotka [persistentní položka]
   * @return unitcode
  **/
  @ApiModelProperty(example = "null", value = "dop.měr.jednotka [persistentní položka]")
  public String getUnitcode() {
    return unitcode;
  }

  public void setUnitcode(String unitcode) {
    this.unitcode = unitcode;
  }

  public Intrastatcommodity weightisoptional(Boolean weightisoptional) {
    this.weightisoptional = weightisoptional;
    return this;
  }

   /**
   * nepovinná hmotnost [persistentní položka]
   * @return weightisoptional
  **/
  @ApiModelProperty(example = "null", value = "nepovinná hmotnost [persistentní položka]")
  public Boolean getWeightisoptional() {
    return weightisoptional;
  }

  public void setWeightisoptional(Boolean weightisoptional) {
    this.weightisoptional = weightisoptional;
  }

  public Intrastatcommodity constantweight(Double constantweight) {
    this.constantweight = constantweight;
    return this;
  }

   /**
   * vlastní hmotnost - konstantní hodnota [persistentní položka]
   * @return constantweight
  **/
  @ApiModelProperty(example = "null", value = "vlastní hmotnost - konstantní hodnota [persistentní položka]")
  public Double getConstantweight() {
    return constantweight;
  }

  public void setConstantweight(Double constantweight) {
    this.constantweight = constantweight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intrastatcommodity intrastatcommodity = (Intrastatcommodity) o;
    return Objects.equals(this.displayname, intrastatcommodity.displayname) &&
        Objects.equals(this.id, intrastatcommodity.id) &&
        Objects.equals(this.classid, intrastatcommodity.classid) &&
        Objects.equals(this.objversion, intrastatcommodity.objversion) &&
        Objects.equals(this.hidden, intrastatcommodity.hidden) &&
        Objects.equals(this.code, intrastatcommodity.code) &&
        Objects.equals(this.description, intrastatcommodity.description) &&
        Objects.equals(this.unitcode, intrastatcommodity.unitcode) &&
        Objects.equals(this.weightisoptional, intrastatcommodity.weightisoptional) &&
        Objects.equals(this.constantweight, intrastatcommodity.constantweight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, description, unitcode, weightisoptional, constantweight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intrastatcommodity {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unitcode: ").append(toIndentedString(unitcode)).append("\n");
    sb.append("    weightisoptional: ").append(toIndentedString(weightisoptional)).append("\n");
    sb.append("    constantweight: ").append(toIndentedString(constantweight)).append("\n");
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
