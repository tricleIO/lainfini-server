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
 * Definedb2bimport
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Definedb2bimport   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("DriverName")
  private String driverName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DriverGUID")
  private String driverGUID = null;

  @SerializedName("CLSID")
  private String CLSID = null;

  @SerializedName("DriverParams")
  private byte[] driverParams = null;

  @SerializedName("CLSIDName")
  private String cLSIDName = null;

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

  public Definedb2bimport driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

   /**
   * Název ovladače [persistentní položka]
   * @return driverName
  **/
  @ApiModelProperty(example = "null", value = "Název ovladače [persistentní položka]")
  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public Definedb2bimport description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Popis importu [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Popis importu [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Definedb2bimport driverGUID(String driverGUID) {
    this.driverGUID = driverGUID;
    return this;
  }

   /**
   * ID ovladače [persistentní položka]
   * @return driverGUID
  **/
  @ApiModelProperty(example = "null", value = "ID ovladače [persistentní položka]")
  public String getDriverGUID() {
    return driverGUID;
  }

  public void setDriverGUID(String driverGUID) {
    this.driverGUID = driverGUID;
  }

  public Definedb2bimport CLSID(String CLSID) {
    this.CLSID = CLSID;
    return this;
  }

   /**
   * Třída [persistentní položka]
   * @return CLSID
  **/
  @ApiModelProperty(example = "null", value = "Třída [persistentní položka]")
  public String getCLSID() {
    return CLSID;
  }

  public void setCLSID(String CLSID) {
    this.CLSID = CLSID;
  }

  public Definedb2bimport driverParams(byte[] driverParams) {
    this.driverParams = driverParams;
    return this;
  }

   /**
   * Parametry [persistentní položka]
   * @return driverParams
  **/
  @ApiModelProperty(example = "null", value = "Parametry [persistentní položka]")
  public byte[] getDriverParams() {
    return driverParams;
  }

  public void setDriverParams(byte[] driverParams) {
    this.driverParams = driverParams;
  }

  public Definedb2bimport cLSIDName(String cLSIDName) {
    this.cLSIDName = cLSIDName;
    return this;
  }

   /**
   * Název třídy [persistentní položka]
   * @return cLSIDName
  **/
  @ApiModelProperty(example = "null", value = "Název třídy [persistentní položka]")
  public String getCLSIDName() {
    return cLSIDName;
  }

  public void setCLSIDName(String cLSIDName) {
    this.cLSIDName = cLSIDName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Definedb2bimport definedb2bimport = (Definedb2bimport) o;
    return Objects.equals(this.displayName, definedb2bimport.displayName) &&
        Objects.equals(this.ID, definedb2bimport.ID) &&
        Objects.equals(this.classID, definedb2bimport.classID) &&
        Objects.equals(this.objVersion, definedb2bimport.objVersion) &&
        Objects.equals(this.driverName, definedb2bimport.driverName) &&
        Objects.equals(this.description, definedb2bimport.description) &&
        Objects.equals(this.driverGUID, definedb2bimport.driverGUID) &&
        Objects.equals(this.CLSID, definedb2bimport.CLSID) &&
        Objects.equals(this.driverParams, definedb2bimport.driverParams) &&
        Objects.equals(this.cLSIDName, definedb2bimport.cLSIDName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, driverName, description, driverGUID, CLSID, driverParams, cLSIDName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Definedb2bimport {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    driverGUID: ").append(toIndentedString(driverGUID)).append("\n");
    sb.append("    CLSID: ").append(toIndentedString(CLSID)).append("\n");
    sb.append("    driverParams: ").append(toIndentedString(driverParams)).append("\n");
    sb.append("    cLSIDName: ").append(toIndentedString(cLSIDName)).append("\n");
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

