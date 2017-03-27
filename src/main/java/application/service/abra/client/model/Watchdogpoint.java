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
 * Watchdogpoint
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Watchdogpoint   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Notpositionedrowbusinessobject> rows = new ArrayList<Notpositionedrowbusinessobject>();

  @SerializedName("Hidden")
  private Boolean hidden = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("System")
  private Boolean system = null;

  @SerializedName("InternalName")
  private String internalName = null;

  @SerializedName("ScriptPackage")
  private String scriptPackage = null;

  @SerializedName("LibraryName")
  private String libraryName = null;

  @SerializedName("AgendaRows")
  private List<Watchdogpointagenda> agendaRows = new ArrayList<Watchdogpointagenda>();

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

  public Watchdogpoint rows(List<Notpositionedrowbusinessobject> rows) {
    this.rows = rows;
    return this;
  }

  public Watchdogpoint addRowsItem(Notpositionedrowbusinessobject rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Řádek bez pořadí [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Řádek bez pořadí [nepersistentní položka]")
  public List<Notpositionedrowbusinessobject> getRows() {
    return rows;
  }

  public void setRows(List<Notpositionedrowbusinessobject> rows) {
    this.rows = rows;
  }

  public Watchdogpoint hidden(Boolean hidden) {
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

  public Watchdogpoint name(String name) {
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

  public Watchdogpoint description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Watchdogpoint system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * Syst. [persistentní položka]
   * @return system
  **/
  @ApiModelProperty(example = "null", value = "Syst. [persistentní položka]")
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }

  public Watchdogpoint internalName(String internalName) {
    this.internalName = internalName;
    return this;
  }

   /**
   * Interní název [persistentní položka]
   * @return internalName
  **/
  @ApiModelProperty(example = "null", value = "Interní název [persistentní položka]")
  public String getInternalName() {
    return internalName;
  }

  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }

  public Watchdogpoint scriptPackage(String scriptPackage) {
    this.scriptPackage = scriptPackage;
    return this;
  }

   /**
   * Balíček skriptů [persistentní položka]
   * @return scriptPackage
  **/
  @ApiModelProperty(example = "null", value = "Balíček skriptů [persistentní položka]")
  public String getScriptPackage() {
    return scriptPackage;
  }

  public void setScriptPackage(String scriptPackage) {
    this.scriptPackage = scriptPackage;
  }

  public Watchdogpoint libraryName(String libraryName) {
    this.libraryName = libraryName;
    return this;
  }

   /**
   * Knihovna [persistentní položka]
   * @return libraryName
  **/
  @ApiModelProperty(example = "null", value = "Knihovna [persistentní položka]")
  public String getLibraryName() {
    return libraryName;
  }

  public void setLibraryName(String libraryName) {
    this.libraryName = libraryName;
  }

  public Watchdogpoint agendaRows(List<Watchdogpointagenda> agendaRows) {
    this.agendaRows = agendaRows;
    return this;
  }

  public Watchdogpoint addAgendaRowsItem(Watchdogpointagenda agendaRowsItem) {
    this.agendaRows.add(agendaRowsItem);
    return this;
  }

   /**
   * Agendy; kolekce BO Agenda kontrolního bodu [nepersistentní položka]
   * @return agendaRows
  **/
  @ApiModelProperty(example = "null", value = "Agendy; kolekce BO Agenda kontrolního bodu [nepersistentní položka]")
  public List<Watchdogpointagenda> getAgendaRows() {
    return agendaRows;
  }

  public void setAgendaRows(List<Watchdogpointagenda> agendaRows) {
    this.agendaRows = agendaRows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Watchdogpoint watchdogpoint = (Watchdogpoint) o;
    return Objects.equals(this.displayName, watchdogpoint.displayName) &&
        Objects.equals(this.ID, watchdogpoint.ID) &&
        Objects.equals(this.classID, watchdogpoint.classID) &&
        Objects.equals(this.objVersion, watchdogpoint.objVersion) &&
        Objects.equals(this.rows, watchdogpoint.rows) &&
        Objects.equals(this.hidden, watchdogpoint.hidden) &&
        Objects.equals(this.name, watchdogpoint.name) &&
        Objects.equals(this.description, watchdogpoint.description) &&
        Objects.equals(this.system, watchdogpoint.system) &&
        Objects.equals(this.internalName, watchdogpoint.internalName) &&
        Objects.equals(this.scriptPackage, watchdogpoint.scriptPackage) &&
        Objects.equals(this.libraryName, watchdogpoint.libraryName) &&
        Objects.equals(this.agendaRows, watchdogpoint.agendaRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, hidden, name, description, system, internalName, scriptPackage, libraryName, agendaRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Watchdogpoint {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    scriptPackage: ").append(toIndentedString(scriptPackage)).append("\n");
    sb.append("    libraryName: ").append(toIndentedString(libraryName)).append("\n");
    sb.append("    agendaRows: ").append(toIndentedString(agendaRows)).append("\n");
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

