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
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Watchdogrequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Watchdogrequest   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("watchdogpoint_id")
  private String watchdogpointId = null;

  @SerializedName("object_clsid")
  private String objectClsid = null;

  @SerializedName("object_clsiddisplayname")
  private String objectClsiddisplayname = null;

  @SerializedName("object_id")
  private String objectId = null;

  @SerializedName("condition")
  private String condition = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("createdat$date")
  private DateTime createdatdate = null;

  @SerializedName("triggeredat$date")
  private DateTime triggeredatdate = null;

  @SerializedName("recipients")
  private List<Watchdogrequestrecipient> recipients = new ArrayList<Watchdogrequestrecipient>();

  @SerializedName("messagetosent")
  private String messagetosent = null;

  @SerializedName("siteclsid")
  private String siteclsid = null;

  @SerializedName("siteclsiddisplayname")
  private String siteclsiddisplayname = null;

  @SerializedName("iscondition")
  private Boolean iscondition = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("object_displayname")
  private String objectDisplayname = null;

  @SerializedName("fieldnames")
  private String fieldnames = null;

  public Watchdogrequest displayname(String displayname) {
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

  public Watchdogrequest id(String id) {
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

  public Watchdogrequest classid(String classid) {
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

  public Watchdogrequest objversion(Integer objversion) {
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

  public Watchdogrequest watchdogpointId(String watchdogpointId) {
    this.watchdogpointId = watchdogpointId;
    return this;
  }

   /**
   * kontrolní bod; id objektu kontrolní bod [persistentní položka]
   * @return watchdogpointId
  **/
  @ApiModelProperty(example = "null", value = "kontrolní bod; id objektu kontrolní bod [persistentní položka]")
  public String getWatchdogpointId() {
    return watchdogpointId;
  }

  public void setWatchdogpointId(String watchdogpointId) {
    this.watchdogpointId = watchdogpointId;
  }

  public Watchdogrequest objectClsid(String objectClsid) {
    this.objectClsid = objectClsid;
    return this;
  }

   /**
   * třída objektu [persistentní položka]
   * @return objectClsid
  **/
  @ApiModelProperty(example = "null", value = "třída objektu [persistentní položka]")
  public String getObjectClsid() {
    return objectClsid;
  }

  public void setObjectClsid(String objectClsid) {
    this.objectClsid = objectClsid;
  }

  public Watchdogrequest objectClsiddisplayname(String objectClsiddisplayname) {
    this.objectClsiddisplayname = objectClsiddisplayname;
    return this;
  }

   /**
   * třída objektu
   * @return objectClsiddisplayname
  **/
  @ApiModelProperty(example = "null", value = "třída objektu")
  public String getObjectClsiddisplayname() {
    return objectClsiddisplayname;
  }

  public void setObjectClsiddisplayname(String objectClsiddisplayname) {
    this.objectClsiddisplayname = objectClsiddisplayname;
  }

  public Watchdogrequest objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * identifikace objektu [persistentní položka]
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "identifikace objektu [persistentní položka]")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public Watchdogrequest condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * výraz [persistentní položka]
   * @return condition
  **/
  @ApiModelProperty(example = "null", value = "výraz [persistentní položka]")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public Watchdogrequest description(String description) {
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

  public Watchdogrequest createdbyId(String createdbyId) {
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

  public Watchdogrequest correctedbyId(String correctedbyId) {
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

  public Watchdogrequest createdatdate(DateTime createdatdate) {
    this.createdatdate = createdatdate;
    return this;
  }

   /**
   * vytvořeno [persistentní položka]
   * @return createdatdate
  **/
  @ApiModelProperty(example = "null", value = "vytvořeno [persistentní položka]")
  public DateTime getCreatedatdate() {
    return createdatdate;
  }

  public void setCreatedatdate(DateTime createdatdate) {
    this.createdatdate = createdatdate;
  }

  public Watchdogrequest triggeredatdate(DateTime triggeredatdate) {
    this.triggeredatdate = triggeredatdate;
    return this;
  }

   /**
   * použito [persistentní položka]
   * @return triggeredatdate
  **/
  @ApiModelProperty(example = "null", value = "použito [persistentní položka]")
  public DateTime getTriggeredatdate() {
    return triggeredatdate;
  }

  public void setTriggeredatdate(DateTime triggeredatdate) {
    this.triggeredatdate = triggeredatdate;
  }

  public Watchdogrequest recipients(List<Watchdogrequestrecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public Watchdogrequest addRecipientsItem(Watchdogrequestrecipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * adresáti; kolekce bo definice automatického vzkazu - adresát [nepersistentní položka]
   * @return recipients
  **/
  @ApiModelProperty(example = "null", value = "adresáti; kolekce bo definice automatického vzkazu - adresát [nepersistentní položka]")
  public List<Watchdogrequestrecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Watchdogrequestrecipient> recipients) {
    this.recipients = recipients;
  }

  public Watchdogrequest messagetosent(String messagetosent) {
    this.messagetosent = messagetosent;
    return this;
  }

   /**
   * zpráva [persistentní položka]
   * @return messagetosent
  **/
  @ApiModelProperty(example = "null", value = "zpráva [persistentní položka]")
  public String getMessagetosent() {
    return messagetosent;
  }

  public void setMessagetosent(String messagetosent) {
    this.messagetosent = messagetosent;
  }

  public Watchdogrequest siteclsid(String siteclsid) {
    this.siteclsid = siteclsid;
    return this;
  }

   /**
   * agenda [persistentní položka]
   * @return siteclsid
  **/
  @ApiModelProperty(example = "null", value = "agenda [persistentní položka]")
  public String getSiteclsid() {
    return siteclsid;
  }

  public void setSiteclsid(String siteclsid) {
    this.siteclsid = siteclsid;
  }

  public Watchdogrequest siteclsiddisplayname(String siteclsiddisplayname) {
    this.siteclsiddisplayname = siteclsiddisplayname;
    return this;
  }

   /**
   * agenda
   * @return siteclsiddisplayname
  **/
  @ApiModelProperty(example = "null", value = "agenda")
  public String getSiteclsiddisplayname() {
    return siteclsiddisplayname;
  }

  public void setSiteclsiddisplayname(String siteclsiddisplayname) {
    this.siteclsiddisplayname = siteclsiddisplayname;
  }

  public Watchdogrequest iscondition(Boolean iscondition) {
    this.iscondition = iscondition;
    return this;
  }

   /**
   * podmínka [persistentní položka]
   * @return iscondition
  **/
  @ApiModelProperty(example = "null", value = "podmínka [persistentní položka]")
  public Boolean getIscondition() {
    return iscondition;
  }

  public void setIscondition(Boolean iscondition) {
    this.iscondition = iscondition;
  }

  public Watchdogrequest subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * předmět [persistentní položka]
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "předmět [persistentní položka]")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Watchdogrequest objectDisplayname(String objectDisplayname) {
    this.objectDisplayname = objectDisplayname;
    return this;
  }

   /**
   * název business objektu
   * @return objectDisplayname
  **/
  @ApiModelProperty(example = "null", value = "název business objektu")
  public String getObjectDisplayname() {
    return objectDisplayname;
  }

  public void setObjectDisplayname(String objectDisplayname) {
    this.objectDisplayname = objectDisplayname;
  }

  public Watchdogrequest fieldnames(String fieldnames) {
    this.fieldnames = fieldnames;
    return this;
  }

   /**
   * sloupce [persistentní položka]
   * @return fieldnames
  **/
  @ApiModelProperty(example = "null", value = "sloupce [persistentní položka]")
  public String getFieldnames() {
    return fieldnames;
  }

  public void setFieldnames(String fieldnames) {
    this.fieldnames = fieldnames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Watchdogrequest watchdogrequest = (Watchdogrequest) o;
    return Objects.equals(this.displayname, watchdogrequest.displayname) &&
        Objects.equals(this.id, watchdogrequest.id) &&
        Objects.equals(this.classid, watchdogrequest.classid) &&
        Objects.equals(this.objversion, watchdogrequest.objversion) &&
        Objects.equals(this.watchdogpointId, watchdogrequest.watchdogpointId) &&
        Objects.equals(this.objectClsid, watchdogrequest.objectClsid) &&
        Objects.equals(this.objectClsiddisplayname, watchdogrequest.objectClsiddisplayname) &&
        Objects.equals(this.objectId, watchdogrequest.objectId) &&
        Objects.equals(this.condition, watchdogrequest.condition) &&
        Objects.equals(this.description, watchdogrequest.description) &&
        Objects.equals(this.createdbyId, watchdogrequest.createdbyId) &&
        Objects.equals(this.correctedbyId, watchdogrequest.correctedbyId) &&
        Objects.equals(this.createdatdate, watchdogrequest.createdatdate) &&
        Objects.equals(this.triggeredatdate, watchdogrequest.triggeredatdate) &&
        Objects.equals(this.recipients, watchdogrequest.recipients) &&
        Objects.equals(this.messagetosent, watchdogrequest.messagetosent) &&
        Objects.equals(this.siteclsid, watchdogrequest.siteclsid) &&
        Objects.equals(this.siteclsiddisplayname, watchdogrequest.siteclsiddisplayname) &&
        Objects.equals(this.iscondition, watchdogrequest.iscondition) &&
        Objects.equals(this.subject, watchdogrequest.subject) &&
        Objects.equals(this.objectDisplayname, watchdogrequest.objectDisplayname) &&
        Objects.equals(this.fieldnames, watchdogrequest.fieldnames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, watchdogpointId, objectClsid, objectClsiddisplayname, objectId, condition, description, createdbyId, correctedbyId, createdatdate, triggeredatdate, recipients, messagetosent, siteclsid, siteclsiddisplayname, iscondition, subject, objectDisplayname, fieldnames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Watchdogrequest {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    watchdogpointId: ").append(toIndentedString(watchdogpointId)).append("\n");
    sb.append("    objectClsid: ").append(toIndentedString(objectClsid)).append("\n");
    sb.append("    objectClsiddisplayname: ").append(toIndentedString(objectClsiddisplayname)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    createdatdate: ").append(toIndentedString(createdatdate)).append("\n");
    sb.append("    triggeredatdate: ").append(toIndentedString(triggeredatdate)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    messagetosent: ").append(toIndentedString(messagetosent)).append("\n");
    sb.append("    siteclsid: ").append(toIndentedString(siteclsid)).append("\n");
    sb.append("    siteclsiddisplayname: ").append(toIndentedString(siteclsiddisplayname)).append("\n");
    sb.append("    iscondition: ").append(toIndentedString(iscondition)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    objectDisplayname: ").append(toIndentedString(objectDisplayname)).append("\n");
    sb.append("    fieldnames: ").append(toIndentedString(fieldnames)).append("\n");
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

