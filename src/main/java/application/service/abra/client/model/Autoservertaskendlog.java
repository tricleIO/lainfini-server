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
 * Autoservertaskendlog
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Autoservertaskendlog   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("finishedat$date")
  private DateTime finishedatdate = null;

  @SerializedName("tasklog_id")
  private String tasklogId = null;

  @SerializedName("resultkind")
  private Integer resultkind = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("resultkindstr")
  private String resultkindstr = null;

  public Autoservertaskendlog displayname(String displayname) {
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

  public Autoservertaskendlog id(String id) {
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

  public Autoservertaskendlog classid(String classid) {
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

  public Autoservertaskendlog objversion(Integer objversion) {
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

  public Autoservertaskendlog finishedatdate(DateTime finishedatdate) {
    this.finishedatdate = finishedatdate;
    return this;
  }

   /**
   * Čas dokončení [persistentní položka]
   * @return finishedatdate
  **/
  @ApiModelProperty(example = "null", value = "Čas dokončení [persistentní položka]")
  public DateTime getFinishedatdate() {
    return finishedatdate;
  }

  public void setFinishedatdate(DateTime finishedatdate) {
    this.finishedatdate = finishedatdate;
  }

  public Autoservertaskendlog tasklogId(String tasklogId) {
    this.tasklogId = tasklogId;
    return this;
  }

   /**
   * začátek logu [persistentní položka]
   * @return tasklogId
  **/
  @ApiModelProperty(example = "null", value = "začátek logu [persistentní položka]")
  public String getTasklogId() {
    return tasklogId;
  }

  public void setTasklogId(String tasklogId) {
    this.tasklogId = tasklogId;
  }

  public Autoservertaskendlog resultkind(Integer resultkind) {
    this.resultkind = resultkind;
    return this;
  }

   /**
   * výsledek [persistentní položka]
   * @return resultkind
  **/
  @ApiModelProperty(example = "null", value = "výsledek [persistentní položka]")
  public Integer getResultkind() {
    return resultkind;
  }

  public void setResultkind(Integer resultkind) {
    this.resultkind = resultkind;
  }

  public Autoservertaskendlog note(String note) {
    this.note = note;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Autoservertaskendlog resultkindstr(String resultkindstr) {
    this.resultkindstr = resultkindstr;
    return this;
  }

   /**
   * výsledek (textově)
   * @return resultkindstr
  **/
  @ApiModelProperty(example = "null", value = "výsledek (textově)")
  public String getResultkindstr() {
    return resultkindstr;
  }

  public void setResultkindstr(String resultkindstr) {
    this.resultkindstr = resultkindstr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Autoservertaskendlog autoservertaskendlog = (Autoservertaskendlog) o;
    return Objects.equals(this.displayname, autoservertaskendlog.displayname) &&
        Objects.equals(this.id, autoservertaskendlog.id) &&
        Objects.equals(this.classid, autoservertaskendlog.classid) &&
        Objects.equals(this.objversion, autoservertaskendlog.objversion) &&
        Objects.equals(this.finishedatdate, autoservertaskendlog.finishedatdate) &&
        Objects.equals(this.tasklogId, autoservertaskendlog.tasklogId) &&
        Objects.equals(this.resultkind, autoservertaskendlog.resultkind) &&
        Objects.equals(this.note, autoservertaskendlog.note) &&
        Objects.equals(this.resultkindstr, autoservertaskendlog.resultkindstr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, finishedatdate, tasklogId, resultkind, note, resultkindstr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Autoservertaskendlog {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    finishedatdate: ").append(toIndentedString(finishedatdate)).append("\n");
    sb.append("    tasklogId: ").append(toIndentedString(tasklogId)).append("\n");
    sb.append("    resultkind: ").append(toIndentedString(resultkind)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    resultkindstr: ").append(toIndentedString(resultkindstr)).append("\n");
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

