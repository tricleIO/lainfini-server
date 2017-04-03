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
 * Wageoperationtype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Wageoperationtype   {
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

  @SerializedName("operationunit")
  private String operationunit = null;

  @SerializedName("chargeexpression")
  private String chargeexpression = null;

  @SerializedName("externidentification")
  private String externidentification = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("howuseinclosing")
  private Integer howuseinclosing = null;

  @SerializedName("closingexpression")
  private String closingexpression = null;

  public Wageoperationtype displayname(String displayname) {
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

  public Wageoperationtype id(String id) {
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

  public Wageoperationtype classid(String classid) {
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

  public Wageoperationtype objversion(Integer objversion) {
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

  public Wageoperationtype hidden(Boolean hidden) {
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

  public Wageoperationtype code(String code) {
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

  public Wageoperationtype name(String name) {
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

  public Wageoperationtype operationunit(String operationunit) {
    this.operationunit = operationunit;
    return this;
  }

   /**
   * jedn. [persistentní položka]
   * @return operationunit
  **/
  @ApiModelProperty(example = "null", value = "jedn. [persistentní položka]")
  public String getOperationunit() {
    return operationunit;
  }

  public void setOperationunit(String operationunit) {
    this.operationunit = operationunit;
  }

  public Wageoperationtype chargeexpression(String chargeexpression) {
    this.chargeexpression = chargeexpression;
    return this;
  }

   /**
   * výraz [persistentní položka]
   * @return chargeexpression
  **/
  @ApiModelProperty(example = "null", value = "výraz [persistentní položka]")
  public String getChargeexpression() {
    return chargeexpression;
  }

  public void setChargeexpression(String chargeexpression) {
    this.chargeexpression = chargeexpression;
  }

  public Wageoperationtype externidentification(String externidentification) {
    this.externidentification = externidentification;
    return this;
  }

   /**
   * ext. id [persistentní položka]
   * @return externidentification
  **/
  @ApiModelProperty(example = "null", value = "ext. id [persistentní položka]")
  public String getExternidentification() {
    return externidentification;
  }

  public void setExternidentification(String externidentification) {
    this.externidentification = externidentification;
  }

  public Wageoperationtype createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Wageoperationtype correctedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
    return this;
  }

   /**
   * opravil; id objektu uživatel [persistentní položka]
   * @return correctedbyId
  **/
  @ApiModelProperty(example = "null", value = "opravil; id objektu uživatel [persistentní položka]")
  public String getCorrectedbyId() {
    return correctedbyId;
  }

  public void setCorrectedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
  }

  public Wageoperationtype howuseinclosing(Integer howuseinclosing) {
    this.howuseinclosing = howuseinclosing;
    return this;
  }

   /**
   * ocenění uzávěrky [persistentní položka]
   * @return howuseinclosing
  **/
  @ApiModelProperty(example = "null", value = "ocenění uzávěrky [persistentní položka]")
  public Integer getHowuseinclosing() {
    return howuseinclosing;
  }

  public void setHowuseinclosing(Integer howuseinclosing) {
    this.howuseinclosing = howuseinclosing;
  }

  public Wageoperationtype closingexpression(String closingexpression) {
    this.closingexpression = closingexpression;
    return this;
  }

   /**
   * výraz pro uzávěrku [persistentní položka]
   * @return closingexpression
  **/
  @ApiModelProperty(example = "null", value = "výraz pro uzávěrku [persistentní položka]")
  public String getClosingexpression() {
    return closingexpression;
  }

  public void setClosingexpression(String closingexpression) {
    this.closingexpression = closingexpression;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wageoperationtype wageoperationtype = (Wageoperationtype) o;
    return Objects.equals(this.displayname, wageoperationtype.displayname) &&
        Objects.equals(this.id, wageoperationtype.id) &&
        Objects.equals(this.classid, wageoperationtype.classid) &&
        Objects.equals(this.objversion, wageoperationtype.objversion) &&
        Objects.equals(this.hidden, wageoperationtype.hidden) &&
        Objects.equals(this.code, wageoperationtype.code) &&
        Objects.equals(this.name, wageoperationtype.name) &&
        Objects.equals(this.operationunit, wageoperationtype.operationunit) &&
        Objects.equals(this.chargeexpression, wageoperationtype.chargeexpression) &&
        Objects.equals(this.externidentification, wageoperationtype.externidentification) &&
        Objects.equals(this.createdbyId, wageoperationtype.createdbyId) &&
        Objects.equals(this.correctedbyId, wageoperationtype.correctedbyId) &&
        Objects.equals(this.howuseinclosing, wageoperationtype.howuseinclosing) &&
        Objects.equals(this.closingexpression, wageoperationtype.closingexpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, name, operationunit, chargeexpression, externidentification, createdbyId, correctedbyId, howuseinclosing, closingexpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wageoperationtype {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationunit: ").append(toIndentedString(operationunit)).append("\n");
    sb.append("    chargeexpression: ").append(toIndentedString(chargeexpression)).append("\n");
    sb.append("    externidentification: ").append(toIndentedString(externidentification)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    howuseinclosing: ").append(toIndentedString(howuseinclosing)).append("\n");
    sb.append("    closingexpression: ").append(toIndentedString(closingexpression)).append("\n");
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

