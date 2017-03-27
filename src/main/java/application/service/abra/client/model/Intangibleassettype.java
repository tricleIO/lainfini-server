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
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Intangibleassettype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Intangibleassettype   {
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

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("CommmonMonthCount")
  private Integer commmonMonthCount = null;

  @SerializedName("ValorisationMonthCount")
  private Integer valorisationMonthCount = null;

  @SerializedName("ValidFrom$DATE")
  private DateTime validFromDATE = null;

  @SerializedName("ValidTo$DATE")
  private DateTime validToDATE = null;

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

  public Intangibleassettype hidden(Boolean hidden) {
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

  public Intangibleassettype name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Intangibleassettype code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Intangibleassettype commmonMonthCount(Integer commmonMonthCount) {
    this.commmonMonthCount = commmonMonthCount;
    return this;
  }

   /**
   * Běžná doba odp. [persistentní položka]
   * @return commmonMonthCount
  **/
  @ApiModelProperty(example = "null", value = "Běžná doba odp. [persistentní položka]")
  public Integer getCommmonMonthCount() {
    return commmonMonthCount;
  }

  public void setCommmonMonthCount(Integer commmonMonthCount) {
    this.commmonMonthCount = commmonMonthCount;
  }

  public Intangibleassettype valorisationMonthCount(Integer valorisationMonthCount) {
    this.valorisationMonthCount = valorisationMonthCount;
    return this;
  }

   /**
   * Doba odp. pro TZ [persistentní položka]
   * @return valorisationMonthCount
  **/
  @ApiModelProperty(example = "null", value = "Doba odp. pro TZ [persistentní položka]")
  public Integer getValorisationMonthCount() {
    return valorisationMonthCount;
  }

  public void setValorisationMonthCount(Integer valorisationMonthCount) {
    this.valorisationMonthCount = valorisationMonthCount;
  }

  public Intangibleassettype validFromDATE(DateTime validFromDATE) {
    this.validFromDATE = validFromDATE;
    return this;
  }

   /**
   * Platí od [persistentní položka]
   * @return validFromDATE
  **/
  @ApiModelProperty(example = "null", value = "Platí od [persistentní položka]")
  public DateTime getValidFromDATE() {
    return validFromDATE;
  }

  public void setValidFromDATE(DateTime validFromDATE) {
    this.validFromDATE = validFromDATE;
  }

  public Intangibleassettype validToDATE(DateTime validToDATE) {
    this.validToDATE = validToDATE;
    return this;
  }

   /**
   * Platí do [persistentní položka]
   * @return validToDATE
  **/
  @ApiModelProperty(example = "null", value = "Platí do [persistentní položka]")
  public DateTime getValidToDATE() {
    return validToDATE;
  }

  public void setValidToDATE(DateTime validToDATE) {
    this.validToDATE = validToDATE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intangibleassettype intangibleassettype = (Intangibleassettype) o;
    return Objects.equals(this.displayName, intangibleassettype.displayName) &&
        Objects.equals(this.ID, intangibleassettype.ID) &&
        Objects.equals(this.classID, intangibleassettype.classID) &&
        Objects.equals(this.objVersion, intangibleassettype.objVersion) &&
        Objects.equals(this.hidden, intangibleassettype.hidden) &&
        Objects.equals(this.name, intangibleassettype.name) &&
        Objects.equals(this.code, intangibleassettype.code) &&
        Objects.equals(this.commmonMonthCount, intangibleassettype.commmonMonthCount) &&
        Objects.equals(this.valorisationMonthCount, intangibleassettype.valorisationMonthCount) &&
        Objects.equals(this.validFromDATE, intangibleassettype.validFromDATE) &&
        Objects.equals(this.validToDATE, intangibleassettype.validToDATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, hidden, name, code, commmonMonthCount, valorisationMonthCount, validFromDATE, validToDATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intangibleassettype {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    commmonMonthCount: ").append(toIndentedString(commmonMonthCount)).append("\n");
    sb.append("    valorisationMonthCount: ").append(toIndentedString(valorisationMonthCount)).append("\n");
    sb.append("    validFromDATE: ").append(toIndentedString(validFromDATE)).append("\n");
    sb.append("    validToDATE: ").append(toIndentedString(validToDATE)).append("\n");
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

