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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Servicenotification
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Servicenotification   {
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

  @SerializedName("ServicedObject_ID")
  private String servicedObjectID = null;

  @SerializedName("FromServiceDocState_ID")
  private String fromServiceDocStateID = null;

  @SerializedName("ToServiceDocState_ID")
  private String toServiceDocStateID = null;

  @SerializedName("IsActive")
  private Boolean isActive = null;

  @SerializedName("ConfirmationRequired")
  private Boolean confirmationRequired = null;

  @SerializedName("SendImmediately")
  private Boolean sendImmediately = null;

  @SerializedName("EmailAccount_ID")
  private String emailAccountID = null;

  @SerializedName("Rows")
  private List<Servicenotificationrow> rows = new ArrayList<Servicenotificationrow>();

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

  public Servicenotification hidden(Boolean hidden) {
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

  public Servicenotification servicedObjectID(String servicedObjectID) {
    this.servicedObjectID = servicedObjectID;
    return this;
  }

   /**
   * Servisovaný předmět; ID objektu Servisovaný předmět [persistentní položka]
   * @return servicedObjectID
  **/
  @ApiModelProperty(example = "null", value = "Servisovaný předmět; ID objektu Servisovaný předmět [persistentní položka]")
  public String getServicedObjectID() {
    return servicedObjectID;
  }

  public void setServicedObjectID(String servicedObjectID) {
    this.servicedObjectID = servicedObjectID;
  }

  public Servicenotification fromServiceDocStateID(String fromServiceDocStateID) {
    this.fromServiceDocStateID = fromServiceDocStateID;
    return this;
  }

   /**
   * Výchozí stav serv.listu; ID objektu Stav servisního listu [persistentní položka]
   * @return fromServiceDocStateID
  **/
  @ApiModelProperty(example = "null", value = "Výchozí stav serv.listu; ID objektu Stav servisního listu [persistentní položka]")
  public String getFromServiceDocStateID() {
    return fromServiceDocStateID;
  }

  public void setFromServiceDocStateID(String fromServiceDocStateID) {
    this.fromServiceDocStateID = fromServiceDocStateID;
  }

  public Servicenotification toServiceDocStateID(String toServiceDocStateID) {
    this.toServiceDocStateID = toServiceDocStateID;
    return this;
  }

   /**
   * Aktuální stav serv.listu; ID objektu Stav servisního listu [persistentní položka]
   * @return toServiceDocStateID
  **/
  @ApiModelProperty(example = "null", value = "Aktuální stav serv.listu; ID objektu Stav servisního listu [persistentní položka]")
  public String getToServiceDocStateID() {
    return toServiceDocStateID;
  }

  public void setToServiceDocStateID(String toServiceDocStateID) {
    this.toServiceDocStateID = toServiceDocStateID;
  }

  public Servicenotification isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Aktivní [persistentní položka]
   * @return isActive
  **/
  @ApiModelProperty(example = "null", value = "Aktivní [persistentní položka]")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Servicenotification confirmationRequired(Boolean confirmationRequired) {
    this.confirmationRequired = confirmationRequired;
    return this;
  }

   /**
   * Potvrdit [persistentní položka]
   * @return confirmationRequired
  **/
  @ApiModelProperty(example = "null", value = "Potvrdit [persistentní položka]")
  public Boolean getConfirmationRequired() {
    return confirmationRequired;
  }

  public void setConfirmationRequired(Boolean confirmationRequired) {
    this.confirmationRequired = confirmationRequired;
  }

  public Servicenotification sendImmediately(Boolean sendImmediately) {
    this.sendImmediately = sendImmediately;
    return this;
  }

   /**
   * Odeslat ihned [persistentní položka]
   * @return sendImmediately
  **/
  @ApiModelProperty(example = "null", value = "Odeslat ihned [persistentní položka]")
  public Boolean getSendImmediately() {
    return sendImmediately;
  }

  public void setSendImmediately(Boolean sendImmediately) {
    this.sendImmediately = sendImmediately;
  }

  public Servicenotification emailAccountID(String emailAccountID) {
    this.emailAccountID = emailAccountID;
    return this;
  }

   /**
   * E-mailový účet; ID objektu E-mailový účet [persistentní položka]
   * @return emailAccountID
  **/
  @ApiModelProperty(example = "null", value = "E-mailový účet; ID objektu E-mailový účet [persistentní položka]")
  public String getEmailAccountID() {
    return emailAccountID;
  }

  public void setEmailAccountID(String emailAccountID) {
    this.emailAccountID = emailAccountID;
  }

  public Servicenotification rows(List<Servicenotificationrow> rows) {
    this.rows = rows;
    return this;
  }

  public Servicenotification addRowsItem(Servicenotificationrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádek notifikace; kolekce BO Řádek notifikace stavu serv.listu [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádek notifikace; kolekce BO Řádek notifikace stavu serv.listu [nepersistentní položka]")
  public List<Servicenotificationrow> getRows() {
    return rows;
  }

  public void setRows(List<Servicenotificationrow> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servicenotification servicenotification = (Servicenotification) o;
    return Objects.equals(this.displayName, servicenotification.displayName) &&
        Objects.equals(this.ID, servicenotification.ID) &&
        Objects.equals(this.classID, servicenotification.classID) &&
        Objects.equals(this.objVersion, servicenotification.objVersion) &&
        Objects.equals(this.hidden, servicenotification.hidden) &&
        Objects.equals(this.servicedObjectID, servicenotification.servicedObjectID) &&
        Objects.equals(this.fromServiceDocStateID, servicenotification.fromServiceDocStateID) &&
        Objects.equals(this.toServiceDocStateID, servicenotification.toServiceDocStateID) &&
        Objects.equals(this.isActive, servicenotification.isActive) &&
        Objects.equals(this.confirmationRequired, servicenotification.confirmationRequired) &&
        Objects.equals(this.sendImmediately, servicenotification.sendImmediately) &&
        Objects.equals(this.emailAccountID, servicenotification.emailAccountID) &&
        Objects.equals(this.rows, servicenotification.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, hidden, servicedObjectID, fromServiceDocStateID, toServiceDocStateID, isActive, confirmationRequired, sendImmediately, emailAccountID, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servicenotification {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    servicedObjectID: ").append(toIndentedString(servicedObjectID)).append("\n");
    sb.append("    fromServiceDocStateID: ").append(toIndentedString(fromServiceDocStateID)).append("\n");
    sb.append("    toServiceDocStateID: ").append(toIndentedString(toServiceDocStateID)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    confirmationRequired: ").append(toIndentedString(confirmationRequired)).append("\n");
    sb.append("    sendImmediately: ").append(toIndentedString(sendImmediately)).append("\n");
    sb.append("    emailAccountID: ").append(toIndentedString(emailAccountID)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

