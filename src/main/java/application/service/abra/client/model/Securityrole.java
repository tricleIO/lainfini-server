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
 * Securityrole
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Securityrole   {
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

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("DisplayParent")
  private String displayParent = null;

  @SerializedName("IsImpersonal")
  private Boolean isImpersonal = null;

  @SerializedName("ShiftCalendar_ID")
  private String shiftCalendarID = null;

  @SerializedName("ExcludedTimes")
  private List<Securityroleexcludedtime> excludedTimes = new ArrayList<Securityroleexcludedtime>();

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

  public Securityrole hidden(Boolean hidden) {
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

  public Securityrole name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Jméno [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Jméno [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Securityrole shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Zkratka [persistentní položka]
   * @return shortName
  **/
  @ApiModelProperty(example = "null", value = "Zkratka [persistentní položka]")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Securityrole note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Poznámka [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "Poznámka [persistentní položka]")
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
   * Poznámka
   * @return comment
  **/
  @ApiModelProperty(example = "null", value = "Poznámka")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Securityrole parentID(String parentID) {
    this.parentID = parentID;
    return this;
  }

   /**
   * Nadřízená r.; ID objektu Role [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Nadřízená r.; ID objektu Role [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public void setParentID(String parentID) {
    this.parentID = parentID;
  }

   /**
   * Nadřízená(zobr.)
   * @return displayParent
  **/
  @ApiModelProperty(example = "null", value = "Nadřízená(zobr.)")
  public String getDisplayParent() {
    return displayParent;
  }

  public Securityrole isImpersonal(Boolean isImpersonal) {
    this.isImpersonal = isImpersonal;
    return this;
  }

   /**
   * Nepersonální [persistentní položka]
   * @return isImpersonal
  **/
  @ApiModelProperty(example = "null", value = "Nepersonální [persistentní položka]")
  public Boolean getIsImpersonal() {
    return isImpersonal;
  }

  public void setIsImpersonal(Boolean isImpersonal) {
    this.isImpersonal = isImpersonal;
  }

  public Securityrole shiftCalendarID(String shiftCalendarID) {
    this.shiftCalendarID = shiftCalendarID;
    return this;
  }

   /**
   * Pracovní kalendář; ID objektu Pracovní kalendář [persistentní položka]
   * @return shiftCalendarID
  **/
  @ApiModelProperty(example = "null", value = "Pracovní kalendář; ID objektu Pracovní kalendář [persistentní položka]")
  public String getShiftCalendarID() {
    return shiftCalendarID;
  }

  public void setShiftCalendarID(String shiftCalendarID) {
    this.shiftCalendarID = shiftCalendarID;
  }

  public Securityrole excludedTimes(List<Securityroleexcludedtime> excludedTimes) {
    this.excludedTimes = excludedTimes;
    return this;
  }

  public Securityrole addExcludedTimesItem(Securityroleexcludedtime excludedTimesItem) {
    this.excludedTimes.add(excludedTimesItem);
    return this;
  }

   /**
   * Vyloučené časy; kolekce BO Nepracovní časy rolí [nepersistentní položka]
   * @return excludedTimes
  **/
  @ApiModelProperty(example = "null", value = "Vyloučené časy; kolekce BO Nepracovní časy rolí [nepersistentní položka]")
  public List<Securityroleexcludedtime> getExcludedTimes() {
    return excludedTimes;
  }

  public void setExcludedTimes(List<Securityroleexcludedtime> excludedTimes) {
    this.excludedTimes = excludedTimes;
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
    return Objects.equals(this.displayName, securityrole.displayName) &&
        Objects.equals(this.ID, securityrole.ID) &&
        Objects.equals(this.classID, securityrole.classID) &&
        Objects.equals(this.objVersion, securityrole.objVersion) &&
        Objects.equals(this.hidden, securityrole.hidden) &&
        Objects.equals(this.name, securityrole.name) &&
        Objects.equals(this.shortName, securityrole.shortName) &&
        Objects.equals(this.note, securityrole.note) &&
        Objects.equals(this.comment, securityrole.comment) &&
        Objects.equals(this.parentID, securityrole.parentID) &&
        Objects.equals(this.displayParent, securityrole.displayParent) &&
        Objects.equals(this.isImpersonal, securityrole.isImpersonal) &&
        Objects.equals(this.shiftCalendarID, securityrole.shiftCalendarID) &&
        Objects.equals(this.excludedTimes, securityrole.excludedTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, hidden, name, shortName, note, comment, parentID, displayParent, isImpersonal, shiftCalendarID, excludedTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Securityrole {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    displayParent: ").append(toIndentedString(displayParent)).append("\n");
    sb.append("    isImpersonal: ").append(toIndentedString(isImpersonal)).append("\n");
    sb.append("    shiftCalendarID: ").append(toIndentedString(shiftCalendarID)).append("\n");
    sb.append("    excludedTimes: ").append(toIndentedString(excludedTimes)).append("\n");
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

