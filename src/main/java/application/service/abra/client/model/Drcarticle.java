/**
 * ABRA Gen Web API (spojení testapi)
 * Webové API systému 17.03.03
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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Drcarticle   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Hidden")
  private Boolean hidden = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("QUnit")
  private String qUnit = null;

  @SerializedName("OutOfUse")
  private Boolean outOfUse = null;

  @SerializedName("LimitAmount")
  private Double limitAmount = null;

  @SerializedName("LimitGroup")
  private String limitGroup = null;

  @SerializedName("Country_ID")
  private String countryID = null;

  @SerializedName("VATCheckReportKind")
  private Integer vATCheckReportKind = null;

   /**
   * Název
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Název")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Vlastní ID [persistentní položka]
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "Vlastní ID [persistentní položka]")
  public String getID() {
    return ID;
  }

   /**
   * ID třídy
   * @return classID
  **/
  @ApiModelProperty(example = "null", value = "ID třídy")
  public String getClassID() {
    return classID;
  }

   /**
   * Verze objektu [persistentní položka]
   * @return objVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze objektu [persistentní položka]")
  public Integer getObjVersion() {
    return objVersion;
  }

  public Drcarticle hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "Skrytý [persistentní položka]")
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
   * Kód typu [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Kód typu [persistentní položka]")
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
   * Popis [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Popis [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Drcarticle qUnit(String qUnit) {
    this.qUnit = qUnit;
    return this;
  }

   /**
   * Vykazovaná jednotka [persistentní položka]
   * @return qUnit
  **/
  @ApiModelProperty(example = "null", value = "Vykazovaná jednotka [persistentní položka]")
  public String getQUnit() {
    return qUnit;
  }

  public void setQUnit(String qUnit) {
    this.qUnit = qUnit;
  }

  public Drcarticle outOfUse(Boolean outOfUse) {
    this.outOfUse = outOfUse;
    return this;
  }

   /**
   * Nepoužívaný [persistentní položka]
   * @return outOfUse
  **/
  @ApiModelProperty(example = "null", value = "Nepoužívaný [persistentní položka]")
  public Boolean getOutOfUse() {
    return outOfUse;
  }

  public void setOutOfUse(Boolean outOfUse) {
    this.outOfUse = outOfUse;
  }

  public Drcarticle limitAmount(Double limitAmount) {
    this.limitAmount = limitAmount;
    return this;
  }

   /**
   * Limit [persistentní položka]
   * @return limitAmount
  **/
  @ApiModelProperty(example = "null", value = "Limit [persistentní položka]")
  public Double getLimitAmount() {
    return limitAmount;
  }

  public void setLimitAmount(Double limitAmount) {
    this.limitAmount = limitAmount;
  }

  public Drcarticle limitGroup(String limitGroup) {
    this.limitGroup = limitGroup;
    return this;
  }

   /**
   * Skupina pro limit [persistentní položka]
   * @return limitGroup
  **/
  @ApiModelProperty(example = "null", value = "Skupina pro limit [persistentní položka]")
  public String getLimitGroup() {
    return limitGroup;
  }

  public void setLimitGroup(String limitGroup) {
    this.limitGroup = limitGroup;
  }

  public Drcarticle countryID(String countryID) {
    this.countryID = countryID;
    return this;
  }

   /**
   * Země; ID objektu Země [persistentní položka]
   * @return countryID
  **/
  @ApiModelProperty(example = "null", value = "Země; ID objektu Země [persistentní položka]")
  public String getCountryID() {
    return countryID;
  }

  public void setCountryID(String countryID) {
    this.countryID = countryID;
  }

  public Drcarticle vATCheckReportKind(Integer vATCheckReportKind) {
    this.vATCheckReportKind = vATCheckReportKind;
    return this;
  }

   /**
   * Do KV DPH [persistentní položka]
   * @return vATCheckReportKind
  **/
  @ApiModelProperty(example = "null", value = "Do KV DPH [persistentní položka]")
  public Integer getVATCheckReportKind() {
    return vATCheckReportKind;
  }

  public void setVATCheckReportKind(Integer vATCheckReportKind) {
    this.vATCheckReportKind = vATCheckReportKind;
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
    return Objects.equals(this.displayName, drcarticle.displayName) &&
        Objects.equals(this.ID, drcarticle.ID) &&
        Objects.equals(this.classID, drcarticle.classID) &&
        Objects.equals(this.objVersion, drcarticle.objVersion) &&
        Objects.equals(this.hidden, drcarticle.hidden) &&
        Objects.equals(this.code, drcarticle.code) &&
        Objects.equals(this.name, drcarticle.name) &&
        Objects.equals(this.qUnit, drcarticle.qUnit) &&
        Objects.equals(this.outOfUse, drcarticle.outOfUse) &&
        Objects.equals(this.limitAmount, drcarticle.limitAmount) &&
        Objects.equals(this.limitGroup, drcarticle.limitGroup) &&
        Objects.equals(this.countryID, drcarticle.countryID) &&
        Objects.equals(this.vATCheckReportKind, drcarticle.vATCheckReportKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, hidden, code, name, qUnit, outOfUse, limitAmount, limitGroup, countryID, vATCheckReportKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drcarticle {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    qUnit: ").append(toIndentedString(qUnit)).append("\n");
    sb.append("    outOfUse: ").append(toIndentedString(outOfUse)).append("\n");
    sb.append("    limitAmount: ").append(toIndentedString(limitAmount)).append("\n");
    sb.append("    limitGroup: ").append(toIndentedString(limitGroup)).append("\n");
    sb.append("    countryID: ").append(toIndentedString(countryID)).append("\n");
    sb.append("    vATCheckReportKind: ").append(toIndentedString(vATCheckReportKind)).append("\n");
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

