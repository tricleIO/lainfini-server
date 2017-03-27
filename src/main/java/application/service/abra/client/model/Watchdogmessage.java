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
 * Watchdogmessage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Watchdogmessage   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("WatchDogPoint_ID")
  private String watchDogPointID = null;

  @SerializedName("FieldValues")
  private byte[] fieldValues = null;

  @SerializedName("CreatedAt$DATE")
  private DateTime createdAtDATE = null;

  @SerializedName("Object_ID")
  private String objectID = null;

  @SerializedName("Object_CLSID")
  private String objectCLSID = null;

  @SerializedName("FieldNames")
  private String fieldNames = null;

  @SerializedName("Status")
  private Integer status = null;

  @SerializedName("SentAt$DATE")
  private DateTime sentAtDATE = null;

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

  public Watchdogmessage watchDogPointID(String watchDogPointID) {
    this.watchDogPointID = watchDogPointID;
    return this;
  }

   /**
   * Kontrolní bod; ID objektu Kontrolní bod [persistentní položka]
   * @return watchDogPointID
  **/
  @ApiModelProperty(example = "null", value = "Kontrolní bod; ID objektu Kontrolní bod [persistentní položka]")
  public String getWatchDogPointID() {
    return watchDogPointID;
  }

  public void setWatchDogPointID(String watchDogPointID) {
    this.watchDogPointID = watchDogPointID;
  }

  public Watchdogmessage fieldValues(byte[] fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

   /**
   * Data [persistentní položka]
   * @return fieldValues
  **/
  @ApiModelProperty(example = "null", value = "Data [persistentní položka]")
  public byte[] getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(byte[] fieldValues) {
    this.fieldValues = fieldValues;
  }

  public Watchdogmessage createdAtDATE(DateTime createdAtDATE) {
    this.createdAtDATE = createdAtDATE;
    return this;
  }

   /**
   * Vytvořeno [persistentní položka]
   * @return createdAtDATE
  **/
  @ApiModelProperty(example = "null", value = "Vytvořeno [persistentní položka]")
  public DateTime getCreatedAtDATE() {
    return createdAtDATE;
  }

  public void setCreatedAtDATE(DateTime createdAtDATE) {
    this.createdAtDATE = createdAtDATE;
  }

  public Watchdogmessage objectID(String objectID) {
    this.objectID = objectID;
    return this;
  }

   /**
   * Identifikace objektu [persistentní položka]
   * @return objectID
  **/
  @ApiModelProperty(example = "null", value = "Identifikace objektu [persistentní položka]")
  public String getObjectID() {
    return objectID;
  }

  public void setObjectID(String objectID) {
    this.objectID = objectID;
  }

  public Watchdogmessage objectCLSID(String objectCLSID) {
    this.objectCLSID = objectCLSID;
    return this;
  }

   /**
   * Třída objektu [persistentní položka]
   * @return objectCLSID
  **/
  @ApiModelProperty(example = "null", value = "Třída objektu [persistentní položka]")
  public String getObjectCLSID() {
    return objectCLSID;
  }

  public void setObjectCLSID(String objectCLSID) {
    this.objectCLSID = objectCLSID;
  }

  public Watchdogmessage fieldNames(String fieldNames) {
    this.fieldNames = fieldNames;
    return this;
  }

   /**
   * Sloupce [persistentní položka]
   * @return fieldNames
  **/
  @ApiModelProperty(example = "null", value = "Sloupce [persistentní položka]")
  public String getFieldNames() {
    return fieldNames;
  }

  public void setFieldNames(String fieldNames) {
    this.fieldNames = fieldNames;
  }

  public Watchdogmessage status(Integer status) {
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

  public Watchdogmessage sentAtDATE(DateTime sentAtDATE) {
    this.sentAtDATE = sentAtDATE;
    return this;
  }

   /**
   * Odesláno [persistentní položka]
   * @return sentAtDATE
  **/
  @ApiModelProperty(example = "null", value = "Odesláno [persistentní položka]")
  public DateTime getSentAtDATE() {
    return sentAtDATE;
  }

  public void setSentAtDATE(DateTime sentAtDATE) {
    this.sentAtDATE = sentAtDATE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Watchdogmessage watchdogmessage = (Watchdogmessage) o;
    return Objects.equals(this.displayName, watchdogmessage.displayName) &&
        Objects.equals(this.ID, watchdogmessage.ID) &&
        Objects.equals(this.classID, watchdogmessage.classID) &&
        Objects.equals(this.objVersion, watchdogmessage.objVersion) &&
        Objects.equals(this.watchDogPointID, watchdogmessage.watchDogPointID) &&
        Objects.equals(this.fieldValues, watchdogmessage.fieldValues) &&
        Objects.equals(this.createdAtDATE, watchdogmessage.createdAtDATE) &&
        Objects.equals(this.objectID, watchdogmessage.objectID) &&
        Objects.equals(this.objectCLSID, watchdogmessage.objectCLSID) &&
        Objects.equals(this.fieldNames, watchdogmessage.fieldNames) &&
        Objects.equals(this.status, watchdogmessage.status) &&
        Objects.equals(this.sentAtDATE, watchdogmessage.sentAtDATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, watchDogPointID, fieldValues, createdAtDATE, objectID, objectCLSID, fieldNames, status, sentAtDATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Watchdogmessage {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    watchDogPointID: ").append(toIndentedString(watchDogPointID)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    createdAtDATE: ").append(toIndentedString(createdAtDATE)).append("\n");
    sb.append("    objectID: ").append(toIndentedString(objectID)).append("\n");
    sb.append("    objectCLSID: ").append(toIndentedString(objectCLSID)).append("\n");
    sb.append("    fieldNames: ").append(toIndentedString(fieldNames)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sentAtDATE: ").append(toIndentedString(sentAtDATE)).append("\n");
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

