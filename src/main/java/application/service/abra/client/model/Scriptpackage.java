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
 * Scriptpackage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Scriptpackage   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Scriptpackagerow> rows = new ArrayList<Scriptpackagerow>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("compiled")
  private Boolean compiled = null;

  @SerializedName("usagestate")
  private Integer usagestate = null;

  @SerializedName("runorder")
  private Integer runorder = null;

  @SerializedName("withoutsources")
  private Boolean withoutsources = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("hashpassword")
  private String hashpassword = null;

  @SerializedName("cryptforexport")
  private Boolean cryptforexport = null;

  @SerializedName("compileonsave")
  private Boolean compileonsave = null;

  public Scriptpackage displayname(String displayname) {
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

  public Scriptpackage id(String id) {
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

  public Scriptpackage classid(String classid) {
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

  public Scriptpackage objversion(Integer objversion) {
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

  public Scriptpackage rows(List<Scriptpackagerow> rows) {
    this.rows = rows;
    return this;
  }

  public Scriptpackage addRowsItem(Scriptpackagerow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo skript [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo skript [nepersistentní položka]")
  public List<Scriptpackagerow> getRows() {
    return rows;
  }

  public void setRows(List<Scriptpackagerow> rows) {
    this.rows = rows;
  }

  public Scriptpackage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Scriptpackage description(String description) {
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

  public Scriptpackage compiled(Boolean compiled) {
    this.compiled = compiled;
    return this;
  }

   /**
   * zkompilováno [persistentní položka]
   * @return compiled
  **/
  @ApiModelProperty(example = "null", value = "zkompilováno [persistentní položka]")
  public Boolean getCompiled() {
    return compiled;
  }

  public void setCompiled(Boolean compiled) {
    this.compiled = compiled;
  }

  public Scriptpackage usagestate(Integer usagestate) {
    this.usagestate = usagestate;
    return this;
  }

   /**
   * stav [persistentní položka]
   * @return usagestate
  **/
  @ApiModelProperty(example = "null", value = "stav [persistentní položka]")
  public Integer getUsagestate() {
    return usagestate;
  }

  public void setUsagestate(Integer usagestate) {
    this.usagestate = usagestate;
  }

  public Scriptpackage runorder(Integer runorder) {
    this.runorder = runorder;
    return this;
  }

   /**
   * pořadí spouštění [persistentní položka]
   * @return runorder
  **/
  @ApiModelProperty(example = "null", value = "pořadí spouštění [persistentní položka]")
  public Integer getRunorder() {
    return runorder;
  }

  public void setRunorder(Integer runorder) {
    this.runorder = runorder;
  }

  public Scriptpackage withoutsources(Boolean withoutsources) {
    this.withoutsources = withoutsources;
    return this;
  }

   /**
   * bez zdr.kódu
   * @return withoutsources
  **/
  @ApiModelProperty(example = "null", value = "bez zdr.kódu")
  public Boolean getWithoutsources() {
    return withoutsources;
  }

  public void setWithoutsources(Boolean withoutsources) {
    this.withoutsources = withoutsources;
  }

  public Scriptpackage createdbyId(String createdbyId) {
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

  public Scriptpackage correctedbyId(String correctedbyId) {
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

  public Scriptpackage note(String note) {
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

  public Scriptpackage hashpassword(String hashpassword) {
    this.hashpassword = hashpassword;
    return this;
  }

   /**
   * heslo [persistentní položka]
   * @return hashpassword
  **/
  @ApiModelProperty(example = "null", value = "heslo [persistentní položka]")
  public String getHashpassword() {
    return hashpassword;
  }

  public void setHashpassword(String hashpassword) {
    this.hashpassword = hashpassword;
  }

  public Scriptpackage cryptforexport(Boolean cryptforexport) {
    this.cryptforexport = cryptforexport;
    return this;
  }

   /**
   * zakódovat při exportu [persistentní položka]
   * @return cryptforexport
  **/
  @ApiModelProperty(example = "null", value = "zakódovat při exportu [persistentní položka]")
  public Boolean getCryptforexport() {
    return cryptforexport;
  }

  public void setCryptforexport(Boolean cryptforexport) {
    this.cryptforexport = cryptforexport;
  }

  public Scriptpackage compileonsave(Boolean compileonsave) {
    this.compileonsave = compileonsave;
    return this;
  }

   /**
   * zkompilovat při uložení
   * @return compileonsave
  **/
  @ApiModelProperty(example = "null", value = "zkompilovat při uložení")
  public Boolean getCompileonsave() {
    return compileonsave;
  }

  public void setCompileonsave(Boolean compileonsave) {
    this.compileonsave = compileonsave;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scriptpackage scriptpackage = (Scriptpackage) o;
    return Objects.equals(this.displayname, scriptpackage.displayname) &&
        Objects.equals(this.id, scriptpackage.id) &&
        Objects.equals(this.classid, scriptpackage.classid) &&
        Objects.equals(this.objversion, scriptpackage.objversion) &&
        Objects.equals(this.rows, scriptpackage.rows) &&
        Objects.equals(this.name, scriptpackage.name) &&
        Objects.equals(this.description, scriptpackage.description) &&
        Objects.equals(this.compiled, scriptpackage.compiled) &&
        Objects.equals(this.usagestate, scriptpackage.usagestate) &&
        Objects.equals(this.runorder, scriptpackage.runorder) &&
        Objects.equals(this.withoutsources, scriptpackage.withoutsources) &&
        Objects.equals(this.createdbyId, scriptpackage.createdbyId) &&
        Objects.equals(this.correctedbyId, scriptpackage.correctedbyId) &&
        Objects.equals(this.note, scriptpackage.note) &&
        Objects.equals(this.hashpassword, scriptpackage.hashpassword) &&
        Objects.equals(this.cryptforexport, scriptpackage.cryptforexport) &&
        Objects.equals(this.compileonsave, scriptpackage.compileonsave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, name, description, compiled, usagestate, runorder, withoutsources, createdbyId, correctedbyId, note, hashpassword, cryptforexport, compileonsave);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scriptpackage {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    compiled: ").append(toIndentedString(compiled)).append("\n");
    sb.append("    usagestate: ").append(toIndentedString(usagestate)).append("\n");
    sb.append("    runorder: ").append(toIndentedString(runorder)).append("\n");
    sb.append("    withoutsources: ").append(toIndentedString(withoutsources)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    hashpassword: ").append(toIndentedString(hashpassword)).append("\n");
    sb.append("    cryptforexport: ").append(toIndentedString(cryptforexport)).append("\n");
    sb.append("    compileonsave: ").append(toIndentedString(compileonsave)).append("\n");
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

