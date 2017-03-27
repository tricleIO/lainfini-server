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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Restrictiondefinition
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Restrictiondefinition   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("UniqueID")
  private String uniqueID = null;

  @SerializedName("Kind")
  private Integer kind = null;

  @SerializedName("ProgramPoint")
  private String programPoint = null;

  @SerializedName("User_ID")
  private String userID = null;

  @SerializedName("DSQLValues")
  private byte[] dSQLValues = null;

  @SerializedName("ColDefName")
  private String colDefName = null;

  @SerializedName("ColDefIsGlobal")
  private Boolean colDefIsGlobal = null;

  @SerializedName("VisibilityKind")
  private Integer visibilityKind = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("ConditionsProps")
  private String conditionsProps = null;

  @SerializedName("CreatedBy_ID")
  private String createdByID = null;

  @SerializedName("CorrectedBy_ID")
  private String correctedByID = null;

  @SerializedName("LastChangeDate$DATE")
  private DateTime lastChangeDateDATE = null;

  @SerializedName("RestrictionSharings")
  private List<Restrictionsharing> restrictionSharings = new ArrayList<Restrictionsharing>();

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

  public Restrictiondefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Restrictiondefinition uniqueID(String uniqueID) {
    this.uniqueID = uniqueID;
    return this;
  }

   /**
   * Jednoznačná identifikace definice omezení [persistentní položka]
   * @return uniqueID
  **/
  @ApiModelProperty(example = "null", value = "Jednoznačná identifikace definice omezení [persistentní položka]")
  public String getUniqueID() {
    return uniqueID;
  }

  public void setUniqueID(String uniqueID) {
    this.uniqueID = uniqueID;
  }

  public Restrictiondefinition kind(Integer kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Druh [persistentní položka]
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "Druh [persistentní položka]")
  public Integer getKind() {
    return kind;
  }

  public void setKind(Integer kind) {
    this.kind = kind;
  }

  public Restrictiondefinition programPoint(String programPoint) {
    this.programPoint = programPoint;
    return this;
  }

   /**
   * Místo v programu (program point) [persistentní položka]
   * @return programPoint
  **/
  @ApiModelProperty(example = "null", value = "Místo v programu (program point) [persistentní položka]")
  public String getProgramPoint() {
    return programPoint;
  }

  public void setProgramPoint(String programPoint) {
    this.programPoint = programPoint;
  }

  public Restrictiondefinition userID(String userID) {
    this.userID = userID;
    return this;
  }

   /**
   * Uživatel; ID objektu Uživatel [persistentní položka]
   * @return userID
  **/
  @ApiModelProperty(example = "null", value = "Uživatel; ID objektu Uživatel [persistentní položka]")
  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public Restrictiondefinition dSQLValues(byte[] dSQLValues) {
    this.dSQLValues = dSQLValues;
    return this;
  }

   /**
   * Obsah definice omezení [persistentní položka]
   * @return dSQLValues
  **/
  @ApiModelProperty(example = "null", value = "Obsah definice omezení [persistentní položka]")
  public byte[] getDSQLValues() {
    return dSQLValues;
  }

  public void setDSQLValues(byte[] dSQLValues) {
    this.dSQLValues = dSQLValues;
  }

  public Restrictiondefinition colDefName(String colDefName) {
    this.colDefName = colDefName;
    return this;
  }

   /**
   * Název def.sloupců [persistentní položka]
   * @return colDefName
  **/
  @ApiModelProperty(example = "null", value = "Název def.sloupců [persistentní položka]")
  public String getColDefName() {
    return colDefName;
  }

  public void setColDefName(String colDefName) {
    this.colDefName = colDefName;
  }

  public Restrictiondefinition colDefIsGlobal(Boolean colDefIsGlobal) {
    this.colDefIsGlobal = colDefIsGlobal;
    return this;
  }

   /**
   * Def.sloupců je globální [persistentní položka]
   * @return colDefIsGlobal
  **/
  @ApiModelProperty(example = "null", value = "Def.sloupců je globální [persistentní položka]")
  public Boolean getColDefIsGlobal() {
    return colDefIsGlobal;
  }

  public void setColDefIsGlobal(Boolean colDefIsGlobal) {
    this.colDefIsGlobal = colDefIsGlobal;
  }

  public Restrictiondefinition visibilityKind(Integer visibilityKind) {
    this.visibilityKind = visibilityKind;
    return this;
  }

   /**
   * Viditelnost [persistentní položka]
   * @return visibilityKind
  **/
  @ApiModelProperty(example = "null", value = "Viditelnost [persistentní položka]")
  public Integer getVisibilityKind() {
    return visibilityKind;
  }

  public void setVisibilityKind(Integer visibilityKind) {
    this.visibilityKind = visibilityKind;
  }

  public Restrictiondefinition note(String note) {
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

  public Restrictiondefinition conditionsProps(String conditionsProps) {
    this.conditionsProps = conditionsProps;
    return this;
  }

   /**
   * Vlastnosti podmínek [persistentní položka]
   * @return conditionsProps
  **/
  @ApiModelProperty(example = "null", value = "Vlastnosti podmínek [persistentní položka]")
  public String getConditionsProps() {
    return conditionsProps;
  }

  public void setConditionsProps(String conditionsProps) {
    this.conditionsProps = conditionsProps;
  }

  public Restrictiondefinition createdByID(String createdByID) {
    this.createdByID = createdByID;
    return this;
  }

   /**
   * Vytvořil; ID objektu Uživatel [persistentní položka]
   * @return createdByID
  **/
  @ApiModelProperty(example = "null", value = "Vytvořil; ID objektu Uživatel [persistentní položka]")
  public String getCreatedByID() {
    return createdByID;
  }

  public void setCreatedByID(String createdByID) {
    this.createdByID = createdByID;
  }

  public Restrictiondefinition correctedByID(String correctedByID) {
    this.correctedByID = correctedByID;
    return this;
  }

   /**
   * Opravil; ID objektu Uživatel [persistentní položka]
   * @return correctedByID
  **/
  @ApiModelProperty(example = "null", value = "Opravil; ID objektu Uživatel [persistentní položka]")
  public String getCorrectedByID() {
    return correctedByID;
  }

  public void setCorrectedByID(String correctedByID) {
    this.correctedByID = correctedByID;
  }

  public Restrictiondefinition lastChangeDateDATE(DateTime lastChangeDateDATE) {
    this.lastChangeDateDATE = lastChangeDateDATE;
    return this;
  }

   /**
   * Datum poslední změny [persistentní položka]
   * @return lastChangeDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum poslední změny [persistentní položka]")
  public DateTime getLastChangeDateDATE() {
    return lastChangeDateDATE;
  }

  public void setLastChangeDateDATE(DateTime lastChangeDateDATE) {
    this.lastChangeDateDATE = lastChangeDateDATE;
  }

  public Restrictiondefinition restrictionSharings(List<Restrictionsharing> restrictionSharings) {
    this.restrictionSharings = restrictionSharings;
    return this;
  }

  public Restrictiondefinition addRestrictionSharingsItem(Restrictionsharing restrictionSharingsItem) {
    this.restrictionSharings.add(restrictionSharingsItem);
    return this;
  }

   /**
   * Kolekce sdílení definice; kolekce BO Sdílení definic omezení [nepersistentní položka]
   * @return restrictionSharings
  **/
  @ApiModelProperty(example = "null", value = "Kolekce sdílení definice; kolekce BO Sdílení definic omezení [nepersistentní položka]")
  public List<Restrictionsharing> getRestrictionSharings() {
    return restrictionSharings;
  }

  public void setRestrictionSharings(List<Restrictionsharing> restrictionSharings) {
    this.restrictionSharings = restrictionSharings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Restrictiondefinition restrictiondefinition = (Restrictiondefinition) o;
    return Objects.equals(this.displayName, restrictiondefinition.displayName) &&
        Objects.equals(this.ID, restrictiondefinition.ID) &&
        Objects.equals(this.classID, restrictiondefinition.classID) &&
        Objects.equals(this.objVersion, restrictiondefinition.objVersion) &&
        Objects.equals(this.name, restrictiondefinition.name) &&
        Objects.equals(this.uniqueID, restrictiondefinition.uniqueID) &&
        Objects.equals(this.kind, restrictiondefinition.kind) &&
        Objects.equals(this.programPoint, restrictiondefinition.programPoint) &&
        Objects.equals(this.userID, restrictiondefinition.userID) &&
        Objects.equals(this.dSQLValues, restrictiondefinition.dSQLValues) &&
        Objects.equals(this.colDefName, restrictiondefinition.colDefName) &&
        Objects.equals(this.colDefIsGlobal, restrictiondefinition.colDefIsGlobal) &&
        Objects.equals(this.visibilityKind, restrictiondefinition.visibilityKind) &&
        Objects.equals(this.note, restrictiondefinition.note) &&
        Objects.equals(this.conditionsProps, restrictiondefinition.conditionsProps) &&
        Objects.equals(this.createdByID, restrictiondefinition.createdByID) &&
        Objects.equals(this.correctedByID, restrictiondefinition.correctedByID) &&
        Objects.equals(this.lastChangeDateDATE, restrictiondefinition.lastChangeDateDATE) &&
        Objects.equals(this.restrictionSharings, restrictiondefinition.restrictionSharings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, name, uniqueID, kind, programPoint, userID, dSQLValues, colDefName, colDefIsGlobal, visibilityKind, note, conditionsProps, createdByID, correctedByID, lastChangeDateDATE, restrictionSharings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restrictiondefinition {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uniqueID: ").append(toIndentedString(uniqueID)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    programPoint: ").append(toIndentedString(programPoint)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    dSQLValues: ").append(toIndentedString(dSQLValues)).append("\n");
    sb.append("    colDefName: ").append(toIndentedString(colDefName)).append("\n");
    sb.append("    colDefIsGlobal: ").append(toIndentedString(colDefIsGlobal)).append("\n");
    sb.append("    visibilityKind: ").append(toIndentedString(visibilityKind)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    conditionsProps: ").append(toIndentedString(conditionsProps)).append("\n");
    sb.append("    createdByID: ").append(toIndentedString(createdByID)).append("\n");
    sb.append("    correctedByID: ").append(toIndentedString(correctedByID)).append("\n");
    sb.append("    lastChangeDateDATE: ").append(toIndentedString(lastChangeDateDATE)).append("\n");
    sb.append("    restrictionSharings: ").append(toIndentedString(restrictionSharings)).append("\n");
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

