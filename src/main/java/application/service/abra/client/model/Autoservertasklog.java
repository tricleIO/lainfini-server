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

import java.util.Objects;


/**
 * Autoservertasklog
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Autoservertasklog   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("createdat$date")
  private DateTime createdatdate = null;

  @SerializedName("instanceid")
  private String instanceid = null;

  @SerializedName("scheduleritem_id")
  private String scheduleritemId = null;

  @SerializedName("queueitem_id")
  private String queueitemId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("taskclsid")
  private String taskclsid = null;

  @SerializedName("taskparameters")
  private String taskparameters = null;

  @SerializedName("spid")
  private Integer spid = null;

  public Autoservertasklog displayname(String displayname) {
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

  public Autoservertasklog id(String id) {
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

  public Autoservertasklog classid(String classid) {
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

  public Autoservertasklog objversion(Integer objversion) {
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

  public Autoservertasklog createdatdate(DateTime createdatdate) {
    this.createdatdate = createdatdate;
    return this;
  }

   /**
   * začátek [persistentní položka]
   * @return createdatdate
  **/
  @ApiModelProperty(example = "null", value = "začátek [persistentní položka]")
  public DateTime getCreatedatdate() {
    return createdatdate;
  }

  public void setCreatedatdate(DateTime createdatdate) {
    this.createdatdate = createdatdate;
  }

  public Autoservertasklog instanceid(String instanceid) {
    this.instanceid = instanceid;
    return this;
  }

   /**
   * identifikace automat.serveru [persistentní položka]
   * @return instanceid
  **/
  @ApiModelProperty(example = "null", value = "identifikace automat.serveru [persistentní položka]")
  public String getInstanceid() {
    return instanceid;
  }

  public void setInstanceid(String instanceid) {
    this.instanceid = instanceid;
  }

  public Autoservertasklog scheduleritemId(String scheduleritemId) {
    this.scheduleritemId = scheduleritemId;
    return this;
  }

   /**
   * naplánovaná úloha [persistentní položka]
   * @return scheduleritemId
  **/
  @ApiModelProperty(example = "null", value = "naplánovaná úloha [persistentní položka]")
  public String getScheduleritemId() {
    return scheduleritemId;
  }

  public void setScheduleritemId(String scheduleritemId) {
    this.scheduleritemId = scheduleritemId;
  }

  public Autoservertasklog queueitemId(String queueitemId) {
    this.queueitemId = queueitemId;
    return this;
  }

   /**
   * Úloha ve frontě [persistentní položka]
   * @return queueitemId
  **/
  @ApiModelProperty(example = "null", value = "Úloha ve frontě [persistentní položka]")
  public String getQueueitemId() {
    return queueitemId;
  }

  public void setQueueitemId(String queueitemId) {
    this.queueitemId = queueitemId;
  }

  public Autoservertasklog description(String description) {
    this.description = description;
    return this;
  }

   /**
   * popis úlohy [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "popis úlohy [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Autoservertasklog taskclsid(String taskclsid) {
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

  public Autoservertasklog taskparameters(String taskparameters) {
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

  public Autoservertasklog spid(Integer spid) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Autoservertasklog autoservertasklog = (Autoservertasklog) o;
    return Objects.equals(this.displayname, autoservertasklog.displayname) &&
        Objects.equals(this.id, autoservertasklog.id) &&
        Objects.equals(this.classid, autoservertasklog.classid) &&
        Objects.equals(this.objversion, autoservertasklog.objversion) &&
        Objects.equals(this.createdatdate, autoservertasklog.createdatdate) &&
        Objects.equals(this.instanceid, autoservertasklog.instanceid) &&
        Objects.equals(this.scheduleritemId, autoservertasklog.scheduleritemId) &&
        Objects.equals(this.queueitemId, autoservertasklog.queueitemId) &&
        Objects.equals(this.description, autoservertasklog.description) &&
        Objects.equals(this.taskclsid, autoservertasklog.taskclsid) &&
        Objects.equals(this.taskparameters, autoservertasklog.taskparameters) &&
        Objects.equals(this.spid, autoservertasklog.spid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, createdatdate, instanceid, scheduleritemId, queueitemId, description, taskclsid, taskparameters, spid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Autoservertasklog {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    createdatdate: ").append(toIndentedString(createdatdate)).append("\n");
    sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
    sb.append("    scheduleritemId: ").append(toIndentedString(scheduleritemId)).append("\n");
    sb.append("    queueitemId: ").append(toIndentedString(queueitemId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    taskclsid: ").append(toIndentedString(taskclsid)).append("\n");
    sb.append("    taskparameters: ").append(toIndentedString(taskparameters)).append("\n");
    sb.append("    spid: ").append(toIndentedString(spid)).append("\n");
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

