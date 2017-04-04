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
 * Autoserverqueueitem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Autoserverqueueitem   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("taskclsid")
  private String taskclsid = null;

  @SerializedName("taskparameters")
  private String taskparameters = null;

  @SerializedName("taskdisplayname")
  private String taskdisplayname = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("runas_id")
  private String runasId = null;

  @SerializedName("runaspassword")
  private String runaspassword = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("createdat$date")
  private DateTime createdatdate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("statekind")
  private Integer statekind = null;

  @SerializedName("statekindstr")
  private String statekindstr = null;

  @SerializedName("scheduleritem_id")
  private String scheduleritemId = null;

  @SerializedName("recipients")
  private List<Autoserverqueueitemrecipient> recipients = new ArrayList<Autoserverqueueitemrecipient>();

  @SerializedName("spid")
  private Integer spid = null;

  @SerializedName("schedulercode")
  private String schedulercode = null;

  @SerializedName("schedulername")
  private String schedulername = null;

  public Autoserverqueueitem displayname(String displayname) {
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

  public Autoserverqueueitem id(String id) {
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

  public Autoserverqueueitem classid(String classid) {
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

  public Autoserverqueueitem objversion(Integer objversion) {
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

  public Autoserverqueueitem taskclsid(String taskclsid) {
    this.taskclsid = taskclsid;
    return this;
  }

   /**
   * typ úlohy [persistentní položka]
   * @return taskclsid
  **/
  @ApiModelProperty(example = "null", value = "typ úlohy [persistentní položka]")
  public String getTaskclsid() {
    return taskclsid;
  }

  public void setTaskclsid(String taskclsid) {
    this.taskclsid = taskclsid;
  }

  public Autoserverqueueitem taskparameters(String taskparameters) {
    this.taskparameters = taskparameters;
    return this;
  }

   /**
   * parametry úlohy [persistentní položka]
   * @return taskparameters
  **/
  @ApiModelProperty(example = "null", value = "parametry úlohy [persistentní položka]")
  public String getTaskparameters() {
    return taskparameters;
  }

  public void setTaskparameters(String taskparameters) {
    this.taskparameters = taskparameters;
  }

  public Autoserverqueueitem taskdisplayname(String taskdisplayname) {
    this.taskdisplayname = taskdisplayname;
    return this;
  }

   /**
   * název úlohy
   * @return taskdisplayname
  **/
  @ApiModelProperty(example = "null", value = "název úlohy")
  public String getTaskdisplayname() {
    return taskdisplayname;
  }

  public void setTaskdisplayname(String taskdisplayname) {
    this.taskdisplayname = taskdisplayname;
  }

  public Autoserverqueueitem createdbyId(String createdbyId) {
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

  public Autoserverqueueitem correctedbyId(String correctedbyId) {
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

  public Autoserverqueueitem runasId(String runasId) {
    this.runasId = runasId;
    return this;
  }

   /**
   * spustit jako; id objektu uživatel [persistentní položka]
   * @return runasId
  **/
  @ApiModelProperty(example = "null", value = "spustit jako; id objektu uživatel [persistentní položka]")
  public String getRunasId() {
    return runasId;
  }

  public void setRunasId(String runasId) {
    this.runasId = runasId;
  }

  public Autoserverqueueitem runaspassword(String runaspassword) {
    this.runaspassword = runaspassword;
    return this;
  }

   /**
   * heslo
   * @return runaspassword
  **/
  @ApiModelProperty(example = "null", value = "heslo")
  public String getRunaspassword() {
    return runaspassword;
  }

  public void setRunaspassword(String runaspassword) {
    this.runaspassword = runaspassword;
  }

  public Autoserverqueueitem subject(String subject) {
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

  public Autoserverqueueitem createdatdate(DateTime createdatdate) {
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

  public Autoserverqueueitem description(String description) {
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

  public Autoserverqueueitem statekind(Integer statekind) {
    this.statekind = statekind;
    return this;
  }

   /**
   * stav úlohy [persistentní položka]
   * @return statekind
  **/
  @ApiModelProperty(example = "null", value = "stav úlohy [persistentní položka]")
  public Integer getStatekind() {
    return statekind;
  }

  public void setStatekind(Integer statekind) {
    this.statekind = statekind;
  }

  public Autoserverqueueitem statekindstr(String statekindstr) {
    this.statekindstr = statekindstr;
    return this;
  }

   /**
   * stav úlohy (popis)
   * @return statekindstr
  **/
  @ApiModelProperty(example = "null", value = "stav úlohy (popis)")
  public String getStatekindstr() {
    return statekindstr;
  }

  public void setStatekindstr(String statekindstr) {
    this.statekindstr = statekindstr;
  }

  public Autoserverqueueitem scheduleritemId(String scheduleritemId) {
    this.scheduleritemId = scheduleritemId;
    return this;
  }

   /**
   * odkaz na úlohu [persistentní položka]
   * @return scheduleritemId
  **/
  @ApiModelProperty(example = "null", value = "odkaz na úlohu [persistentní položka]")
  public String getScheduleritemId() {
    return scheduleritemId;
  }

  public void setScheduleritemId(String scheduleritemId) {
    this.scheduleritemId = scheduleritemId;
  }

  public Autoserverqueueitem recipients(List<Autoserverqueueitemrecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public Autoserverqueueitem addRecipientsItem(Autoserverqueueitemrecipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * adresáti; kolekce bo Úloha ve frontě automatizačního serveru - adresát [nepersistentní položka]
   * @return recipients
  **/
  @ApiModelProperty(example = "null", value = "adresáti; kolekce bo Úloha ve frontě automatizačního serveru - adresát [nepersistentní položka]")
  public List<Autoserverqueueitemrecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Autoserverqueueitemrecipient> recipients) {
    this.recipients = recipients;
  }

  public Autoserverqueueitem spid(Integer spid) {
    this.spid = spid;
    return this;
  }

   /**
   * pid [persistentní položka]
   * @return spid
  **/
  @ApiModelProperty(example = "null", value = "pid [persistentní položka]")
  public Integer getSpid() {
    return spid;
  }

  public void setSpid(Integer spid) {
    this.spid = spid;
  }

  public Autoserverqueueitem schedulercode(String schedulercode) {
    this.schedulercode = schedulercode;
    return this;
  }

   /**
   * kód úlohy
   * @return schedulercode
  **/
  @ApiModelProperty(example = "null", value = "kód úlohy")
  public String getSchedulercode() {
    return schedulercode;
  }

  public void setSchedulercode(String schedulercode) {
    this.schedulercode = schedulercode;
  }

  public Autoserverqueueitem schedulername(String schedulername) {
    this.schedulername = schedulername;
    return this;
  }

   /**
   * název úlohy
   * @return schedulername
  **/
  @ApiModelProperty(example = "null", value = "název úlohy")
  public String getSchedulername() {
    return schedulername;
  }

  public void setSchedulername(String schedulername) {
    this.schedulername = schedulername;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Autoserverqueueitem autoserverqueueitem = (Autoserverqueueitem) o;
    return Objects.equals(this.displayname, autoserverqueueitem.displayname) &&
        Objects.equals(this.id, autoserverqueueitem.id) &&
        Objects.equals(this.classid, autoserverqueueitem.classid) &&
        Objects.equals(this.objversion, autoserverqueueitem.objversion) &&
        Objects.equals(this.taskclsid, autoserverqueueitem.taskclsid) &&
        Objects.equals(this.taskparameters, autoserverqueueitem.taskparameters) &&
        Objects.equals(this.taskdisplayname, autoserverqueueitem.taskdisplayname) &&
        Objects.equals(this.createdbyId, autoserverqueueitem.createdbyId) &&
        Objects.equals(this.correctedbyId, autoserverqueueitem.correctedbyId) &&
        Objects.equals(this.runasId, autoserverqueueitem.runasId) &&
        Objects.equals(this.runaspassword, autoserverqueueitem.runaspassword) &&
        Objects.equals(this.subject, autoserverqueueitem.subject) &&
        Objects.equals(this.createdatdate, autoserverqueueitem.createdatdate) &&
        Objects.equals(this.description, autoserverqueueitem.description) &&
        Objects.equals(this.statekind, autoserverqueueitem.statekind) &&
        Objects.equals(this.statekindstr, autoserverqueueitem.statekindstr) &&
        Objects.equals(this.scheduleritemId, autoserverqueueitem.scheduleritemId) &&
        Objects.equals(this.recipients, autoserverqueueitem.recipients) &&
        Objects.equals(this.spid, autoserverqueueitem.spid) &&
        Objects.equals(this.schedulercode, autoserverqueueitem.schedulercode) &&
        Objects.equals(this.schedulername, autoserverqueueitem.schedulername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, taskclsid, taskparameters, taskdisplayname, createdbyId, correctedbyId, runasId, runaspassword, subject, createdatdate, description, statekind, statekindstr, scheduleritemId, recipients, spid, schedulercode, schedulername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Autoserverqueueitem {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    taskclsid: ").append(toIndentedString(taskclsid)).append("\n");
    sb.append("    taskparameters: ").append(toIndentedString(taskparameters)).append("\n");
    sb.append("    taskdisplayname: ").append(toIndentedString(taskdisplayname)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    runasId: ").append(toIndentedString(runasId)).append("\n");
    sb.append("    runaspassword: ").append(toIndentedString(runaspassword)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    createdatdate: ").append(toIndentedString(createdatdate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    statekind: ").append(toIndentedString(statekind)).append("\n");
    sb.append("    statekindstr: ").append(toIndentedString(statekindstr)).append("\n");
    sb.append("    scheduleritemId: ").append(toIndentedString(scheduleritemId)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    spid: ").append(toIndentedString(spid)).append("\n");
    sb.append("    schedulercode: ").append(toIndentedString(schedulercode)).append("\n");
    sb.append("    schedulername: ").append(toIndentedString(schedulername)).append("\n");
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
