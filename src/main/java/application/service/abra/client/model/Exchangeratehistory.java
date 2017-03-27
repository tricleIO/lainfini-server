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
 * Exchangeratehistory
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Exchangeratehistory   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Date$DATE")
  private DateTime dateDATE = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("CurrRate")
  private Double currRate = null;

  @SerializedName("RefCurrRate")
  private Double refCurrRate = null;

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

  public Exchangeratehistory dateDATE(DateTime dateDATE) {
    this.dateDATE = dateDATE;
    return this;
  }

   /**
   * Datum [persistentní položka]
   * @return dateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum [persistentní položka]")
  public DateTime getDateDATE() {
    return dateDATE;
  }

  public void setDateDATE(DateTime dateDATE) {
    this.dateDATE = dateDATE;
  }

  public Exchangeratehistory parentID(String parentID) {
    this.parentID = parentID;
    return this;
  }

   /**
   * ID lístku [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "ID lístku [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public void setParentID(String parentID) {
    this.parentID = parentID;
  }

  public Exchangeratehistory currRate(Double currRate) {
    this.currRate = currRate;
    return this;
  }

   /**
   * Kurz [persistentní položka]
   * @return currRate
  **/
  @ApiModelProperty(example = "null", value = "Kurz [persistentní položka]")
  public Double getCurrRate() {
    return currRate;
  }

  public void setCurrRate(Double currRate) {
    this.currRate = currRate;
  }

  public Exchangeratehistory refCurrRate(Double refCurrRate) {
    this.refCurrRate = refCurrRate;
    return this;
  }

   /**
   * Kurz vztažný [persistentní položka]
   * @return refCurrRate
  **/
  @ApiModelProperty(example = "null", value = "Kurz vztažný [persistentní položka]")
  public Double getRefCurrRate() {
    return refCurrRate;
  }

  public void setRefCurrRate(Double refCurrRate) {
    this.refCurrRate = refCurrRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exchangeratehistory exchangeratehistory = (Exchangeratehistory) o;
    return Objects.equals(this.displayName, exchangeratehistory.displayName) &&
        Objects.equals(this.ID, exchangeratehistory.ID) &&
        Objects.equals(this.classID, exchangeratehistory.classID) &&
        Objects.equals(this.objVersion, exchangeratehistory.objVersion) &&
        Objects.equals(this.dateDATE, exchangeratehistory.dateDATE) &&
        Objects.equals(this.parentID, exchangeratehistory.parentID) &&
        Objects.equals(this.currRate, exchangeratehistory.currRate) &&
        Objects.equals(this.refCurrRate, exchangeratehistory.refCurrRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, dateDATE, parentID, currRate, refCurrRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exchangeratehistory {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    dateDATE: ").append(toIndentedString(dateDATE)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    currRate: ").append(toIndentedString(currRate)).append("\n");
    sb.append("    refCurrRate: ").append(toIndentedString(refCurrRate)).append("\n");
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

