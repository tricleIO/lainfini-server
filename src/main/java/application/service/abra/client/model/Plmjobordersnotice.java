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
 * Plmjobordersnotice
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Plmjobordersnotice   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("joborder_id")
  private String joborderId = null;

  @SerializedName("sn_id")
  private String snId = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("created$date")
  private DateTime createddate = null;

  @SerializedName("note")
  private String note = null;

  public Plmjobordersnotice displayname(String displayname) {
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

  public Plmjobordersnotice id(String id) {
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

  public Plmjobordersnotice classid(String classid) {
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

  public Plmjobordersnotice objversion(Integer objversion) {
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

  public Plmjobordersnotice joborderId(String joborderId) {
    this.joborderId = joborderId;
    return this;
  }

   /**
   * výrobní příkaz; id objektu výrobní příkaz [persistentní položka]
   * @return joborderId
  **/
  @ApiModelProperty(example = "null", value = "výrobní příkaz; id objektu výrobní příkaz [persistentní položka]")
  public String getJoborderId() {
    return joborderId;
  }

  public void setJoborderId(String joborderId) {
    this.joborderId = joborderId;
  }

  public Plmjobordersnotice snId(String snId) {
    this.snId = snId;
    return this;
  }

   /**
   * výrobek; id objektu vp - sériové číslo [persistentní položka]
   * @return snId
  **/
  @ApiModelProperty(example = "null", value = "výrobek; id objektu vp - sériové číslo [persistentní položka]")
  public String getSnId() {
    return snId;
  }

  public void setSnId(String snId) {
    this.snId = snId;
  }

  public Plmjobordersnotice createdbyId(String createdbyId) {
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

  public Plmjobordersnotice createddate(DateTime createddate) {
    this.createddate = createddate;
    return this;
  }

   /**
   * vytvořeno [persistentní položka]
   * @return createddate
  **/
  @ApiModelProperty(example = "null", value = "vytvořeno [persistentní položka]")
  public DateTime getCreateddate() {
    return createddate;
  }

  public void setCreateddate(DateTime createddate) {
    this.createddate = createddate;
  }

  public Plmjobordersnotice note(String note) {
    this.note = note;
    return this;
  }

   /**
   * poznámka [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "poznámka [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmjobordersnotice plmjobordersnotice = (Plmjobordersnotice) o;
    return Objects.equals(this.displayname, plmjobordersnotice.displayname) &&
        Objects.equals(this.id, plmjobordersnotice.id) &&
        Objects.equals(this.classid, plmjobordersnotice.classid) &&
        Objects.equals(this.objversion, plmjobordersnotice.objversion) &&
        Objects.equals(this.joborderId, plmjobordersnotice.joborderId) &&
        Objects.equals(this.snId, plmjobordersnotice.snId) &&
        Objects.equals(this.createdbyId, plmjobordersnotice.createdbyId) &&
        Objects.equals(this.createddate, plmjobordersnotice.createddate) &&
        Objects.equals(this.note, plmjobordersnotice.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, joborderId, snId, createdbyId, createddate, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmjobordersnotice {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    joborderId: ").append(toIndentedString(joborderId)).append("\n");
    sb.append("    snId: ").append(toIndentedString(snId)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    createddate: ").append(toIndentedString(createddate)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

