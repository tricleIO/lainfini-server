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
 * Cdconfirmsetting
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Cdconfirmsetting   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("DateFrom$DATE")
  private DateTime dateFromDATE = null;

  @SerializedName("DateTo$DATE")
  private DateTime dateToDATE = null;

  @SerializedName("Status")
  private Integer status = null;

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

  public Cdconfirmsetting dateFromDATE(DateTime dateFromDATE) {
    this.dateFromDATE = dateFromDATE;
    return this;
  }

   /**
   * Datum platnosti od [persistentní položka]
   * @return dateFromDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum platnosti od [persistentní položka]")
  public DateTime getDateFromDATE() {
    return dateFromDATE;
  }

  public void setDateFromDATE(DateTime dateFromDATE) {
    this.dateFromDATE = dateFromDATE;
  }

  public Cdconfirmsetting dateToDATE(DateTime dateToDATE) {
    this.dateToDATE = dateToDATE;
    return this;
  }

   /**
   * Datum platnosti do [persistentní položka]
   * @return dateToDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum platnosti do [persistentní položka]")
  public DateTime getDateToDATE() {
    return dateToDATE;
  }

  public void setDateToDATE(DateTime dateToDATE) {
    this.dateToDATE = dateToDATE;
  }

  public Cdconfirmsetting status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Stav [persistentní položka]
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Stav [persistentní položka]")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cdconfirmsetting cdconfirmsetting = (Cdconfirmsetting) o;
    return Objects.equals(this.displayName, cdconfirmsetting.displayName) &&
        Objects.equals(this.ID, cdconfirmsetting.ID) &&
        Objects.equals(this.classID, cdconfirmsetting.classID) &&
        Objects.equals(this.objVersion, cdconfirmsetting.objVersion) &&
        Objects.equals(this.dateFromDATE, cdconfirmsetting.dateFromDATE) &&
        Objects.equals(this.dateToDATE, cdconfirmsetting.dateToDATE) &&
        Objects.equals(this.status, cdconfirmsetting.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, dateFromDATE, dateToDATE, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cdconfirmsetting {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    dateFromDATE: ").append(toIndentedString(dateFromDATE)).append("\n");
    sb.append("    dateToDATE: ").append(toIndentedString(dateToDATE)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

