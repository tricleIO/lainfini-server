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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Securityrole
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Securityrole   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("shortname")
  private String shortname = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("displayparent")
  private String displayparent = null;

  @SerializedName("isimpersonal")
  private Boolean isimpersonal = null;

  @SerializedName("shiftcalendar_id")
  private String shiftcalendarId = null;

  @SerializedName("excludedtimes")
  private List<Securityroleexcludedtime> excludedtimes = new ArrayList<Securityroleexcludedtime>();

  public Securityrole displayname(String displayname) {
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

  public Securityrole id(String id) {
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

  public Securityrole classid(String classid) {
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

  public Securityrole objversion(Integer objversion) {
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

  public Securityrole hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Securityrole name(String name) {
    this.name = name;
    return this;
  }

   /**
   * jméno [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "jméno [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Securityrole shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

   /**
   * zkratka [persistentní položka]
   * @return shortname
  **/
  @ApiModelProperty(example = "null", value = "zkratka [persistentní položka]")
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }

  public Securityrole note(String note) {
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

  public Securityrole comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * poznámka
   * @return comment
  **/
  @ApiModelProperty(example = "null", value = "poznámka")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Securityrole parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * nadřízená r.; id objektu role [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "nadřízená r.; id objektu role [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Securityrole displayparent(String displayparent) {
    this.displayparent = displayparent;
    return this;
  }

   /**
   * nadřízená(zobr.)
   * @return displayparent
  **/
  @ApiModelProperty(example = "null", value = "nadřízená(zobr.)")
  public String getDisplayparent() {
    return displayparent;
  }

  public void setDisplayparent(String displayparent) {
    this.displayparent = displayparent;
  }

  public Securityrole isimpersonal(Boolean isimpersonal) {
    this.isimpersonal = isimpersonal;
    return this;
  }

   /**
   * nepersonální [persistentní položka]
   * @return isimpersonal
  **/
  @ApiModelProperty(example = "null", value = "nepersonální [persistentní položka]")
  public Boolean getIsimpersonal() {
    return isimpersonal;
  }

  public void setIsimpersonal(Boolean isimpersonal) {
    this.isimpersonal = isimpersonal;
  }

  public Securityrole shiftcalendarId(String shiftcalendarId) {
    this.shiftcalendarId = shiftcalendarId;
    return this;
  }

   /**
   * pracovní kalendář; id objektu pracovní kalendář [persistentní položka]
   * @return shiftcalendarId
  **/
  @ApiModelProperty(example = "null", value = "pracovní kalendář; id objektu pracovní kalendář [persistentní položka]")
  public String getShiftcalendarId() {
    return shiftcalendarId;
  }

  public void setShiftcalendarId(String shiftcalendarId) {
    this.shiftcalendarId = shiftcalendarId;
  }

  public Securityrole excludedtimes(List<Securityroleexcludedtime> excludedtimes) {
    this.excludedtimes = excludedtimes;
    return this;
  }

  public Securityrole addExcludedtimesItem(Securityroleexcludedtime excludedtimesItem) {
    this.excludedtimes.add(excludedtimesItem);
    return this;
  }

   /**
   * vyloučené časy; kolekce bo nepracovní časy rolí [nepersistentní položka]
   * @return excludedtimes
  **/
  @ApiModelProperty(example = "null", value = "vyloučené časy; kolekce bo nepracovní časy rolí [nepersistentní položka]")
  public List<Securityroleexcludedtime> getExcludedtimes() {
    return excludedtimes;
  }

  public void setExcludedtimes(List<Securityroleexcludedtime> excludedtimes) {
    this.excludedtimes = excludedtimes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Securityrole securityrole = (Securityrole) o;
    return Objects.equals(this.displayname, securityrole.displayname) &&
        Objects.equals(this.id, securityrole.id) &&
        Objects.equals(this.classid, securityrole.classid) &&
        Objects.equals(this.objversion, securityrole.objversion) &&
        Objects.equals(this.hidden, securityrole.hidden) &&
        Objects.equals(this.name, securityrole.name) &&
        Objects.equals(this.shortname, securityrole.shortname) &&
        Objects.equals(this.note, securityrole.note) &&
        Objects.equals(this.comment, securityrole.comment) &&
        Objects.equals(this.parentId, securityrole.parentId) &&
        Objects.equals(this.displayparent, securityrole.displayparent) &&
        Objects.equals(this.isimpersonal, securityrole.isimpersonal) &&
        Objects.equals(this.shiftcalendarId, securityrole.shiftcalendarId) &&
        Objects.equals(this.excludedtimes, securityrole.excludedtimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, name, shortname, note, comment, parentId, displayparent, isimpersonal, shiftcalendarId, excludedtimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Securityrole {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    displayparent: ").append(toIndentedString(displayparent)).append("\n");
    sb.append("    isimpersonal: ").append(toIndentedString(isimpersonal)).append("\n");
    sb.append("    shiftcalendarId: ").append(toIndentedString(shiftcalendarId)).append("\n");
    sb.append("    excludedtimes: ").append(toIndentedString(excludedtimes)).append("\n");
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
