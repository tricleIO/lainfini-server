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
 * Calcchart
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Calcchart   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Calcexpression> rows = new ArrayList<Calcexpression>();

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("system")
  private Boolean system = null;

  @SerializedName("clsid")
  private String clsid = null;

  @SerializedName("specification")
  private Integer specification = null;

  @SerializedName("clsidname")
  private String clsidname = null;

  @SerializedName("calcfieldsspecialbehaviour")
  private Boolean calcfieldsspecialbehaviour = null;

  @SerializedName("usercalcfieldsspecialbehaviour")
  private Integer usercalcfieldsspecialbehaviour = null;

  @SerializedName("sourcechart_id")
  private String sourcechartId = null;

  @SerializedName("copied")
  private Boolean copied = null;

  @SerializedName("scripts")
  private List<Calcchartscript> scripts = new ArrayList<Calcchartscript>();

  public Calcchart displayname(String displayname) {
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

  public Calcchart id(String id) {
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

  public Calcchart classid(String classid) {
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

  public Calcchart objversion(Integer objversion) {
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

  public Calcchart rows(List<Calcexpression> rows) {
    this.rows = rows;
    return this;
  }

  public Calcchart addRowsItem(Calcexpression rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * položky; kolekce bo výpočtový vzorec [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "položky; kolekce bo výpočtový vzorec [nepersistentní položka]")
  public List<Calcexpression> getRows() {
    return rows;
  }

  public void setRows(List<Calcexpression> rows) {
    this.rows = rows;
  }

  public Calcchart hidden(Boolean hidden) {
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

  public Calcchart createdbyId(String createdbyId) {
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

  public Calcchart correctedbyId(String correctedbyId) {
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

  public Calcchart code(String code) {
    this.code = code;
    return this;
  }

   /**
   * kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Calcchart name(String name) {
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

  public Calcchart system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * syst. [persistentní položka]
   * @return system
  **/
  @ApiModelProperty(example = "null", value = "syst. [persistentní položka]")
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }

  public Calcchart clsid(String clsid) {
    this.clsid = clsid;
    return this;
  }

   /**
   * třída objektu [persistentní položka]
   * @return clsid
  **/
  @ApiModelProperty(example = "null", value = "třída objektu [persistentní položka]")
  public String getClsid() {
    return clsid;
  }

  public void setClsid(String clsid) {
    this.clsid = clsid;
  }

  public Calcchart specification(Integer specification) {
    this.specification = specification;
    return this;
  }

   /**
   * specifikace [persistentní položka]
   * @return specification
  **/
  @ApiModelProperty(example = "null", value = "specifikace [persistentní položka]")
  public Integer getSpecification() {
    return specification;
  }

  public void setSpecification(Integer specification) {
    this.specification = specification;
  }

  public Calcchart clsidname(String clsidname) {
    this.clsidname = clsidname;
    return this;
  }

   /**
   * třída
   * @return clsidname
  **/
  @ApiModelProperty(example = "null", value = "třída")
  public String getClsidname() {
    return clsidname;
  }

  public void setClsidname(String clsidname) {
    this.clsidname = clsidname;
  }

  public Calcchart calcfieldsspecialbehaviour(Boolean calcfieldsspecialbehaviour) {
    this.calcfieldsspecialbehaviour = calcfieldsspecialbehaviour;
    return this;
  }

   /**
   * způsob součtování [persistentní položka]
   * @return calcfieldsspecialbehaviour
  **/
  @ApiModelProperty(example = "null", value = "způsob součtování [persistentní položka]")
  public Boolean getCalcfieldsspecialbehaviour() {
    return calcfieldsspecialbehaviour;
  }

  public void setCalcfieldsspecialbehaviour(Boolean calcfieldsspecialbehaviour) {
    this.calcfieldsspecialbehaviour = calcfieldsspecialbehaviour;
  }

  public Calcchart usercalcfieldsspecialbehaviour(Integer usercalcfieldsspecialbehaviour) {
    this.usercalcfieldsspecialbehaviour = usercalcfieldsspecialbehaviour;
    return this;
  }

   /**
   * způsob součtování - uživ. část
   * @return usercalcfieldsspecialbehaviour
  **/
  @ApiModelProperty(example = "null", value = "způsob součtování - uživ. část")
  public Integer getUsercalcfieldsspecialbehaviour() {
    return usercalcfieldsspecialbehaviour;
  }

  public void setUsercalcfieldsspecialbehaviour(Integer usercalcfieldsspecialbehaviour) {
    this.usercalcfieldsspecialbehaviour = usercalcfieldsspecialbehaviour;
  }

  public Calcchart sourcechartId(String sourcechartId) {
    this.sourcechartId = sourcechartId;
    return this;
  }

   /**
   * zdrojový vzorec; id objektu výpočtové schéma [persistentní položka]
   * @return sourcechartId
  **/
  @ApiModelProperty(example = "null", value = "zdrojový vzorec; id objektu výpočtové schéma [persistentní položka]")
  public String getSourcechartId() {
    return sourcechartId;
  }

  public void setSourcechartId(String sourcechartId) {
    this.sourcechartId = sourcechartId;
  }

  public Calcchart copied(Boolean copied) {
    this.copied = copied;
    return this;
  }

   /**
   * kopie [persistentní položka]
   * @return copied
  **/
  @ApiModelProperty(example = "null", value = "kopie [persistentní položka]")
  public Boolean getCopied() {
    return copied;
  }

  public void setCopied(Boolean copied) {
    this.copied = copied;
  }

  public Calcchart scripts(List<Calcchartscript> scripts) {
    this.scripts = scripts;
    return this;
  }

  public Calcchart addScriptsItem(Calcchartscript scriptsItem) {
    this.scripts.add(scriptsItem);
    return this;
  }

   /**
   * skripty; kolekce bo skripty výpočtového vzorce [nepersistentní položka]
   * @return scripts
  **/
  @ApiModelProperty(example = "null", value = "skripty; kolekce bo skripty výpočtového vzorce [nepersistentní položka]")
  public List<Calcchartscript> getScripts() {
    return scripts;
  }

  public void setScripts(List<Calcchartscript> scripts) {
    this.scripts = scripts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Calcchart calcchart = (Calcchart) o;
    return Objects.equals(this.displayname, calcchart.displayname) &&
        Objects.equals(this.id, calcchart.id) &&
        Objects.equals(this.classid, calcchart.classid) &&
        Objects.equals(this.objversion, calcchart.objversion) &&
        Objects.equals(this.rows, calcchart.rows) &&
        Objects.equals(this.hidden, calcchart.hidden) &&
        Objects.equals(this.createdbyId, calcchart.createdbyId) &&
        Objects.equals(this.correctedbyId, calcchart.correctedbyId) &&
        Objects.equals(this.code, calcchart.code) &&
        Objects.equals(this.name, calcchart.name) &&
        Objects.equals(this.system, calcchart.system) &&
        Objects.equals(this.clsid, calcchart.clsid) &&
        Objects.equals(this.specification, calcchart.specification) &&
        Objects.equals(this.clsidname, calcchart.clsidname) &&
        Objects.equals(this.calcfieldsspecialbehaviour, calcchart.calcfieldsspecialbehaviour) &&
        Objects.equals(this.usercalcfieldsspecialbehaviour, calcchart.usercalcfieldsspecialbehaviour) &&
        Objects.equals(this.sourcechartId, calcchart.sourcechartId) &&
        Objects.equals(this.copied, calcchart.copied) &&
        Objects.equals(this.scripts, calcchart.scripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, hidden, createdbyId, correctedbyId, code, name, system, clsid, specification, clsidname, calcfieldsspecialbehaviour, usercalcfieldsspecialbehaviour, sourcechartId, copied, scripts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calcchart {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    clsid: ").append(toIndentedString(clsid)).append("\n");
    sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
    sb.append("    clsidname: ").append(toIndentedString(clsidname)).append("\n");
    sb.append("    calcfieldsspecialbehaviour: ").append(toIndentedString(calcfieldsspecialbehaviour)).append("\n");
    sb.append("    usercalcfieldsspecialbehaviour: ").append(toIndentedString(usercalcfieldsspecialbehaviour)).append("\n");
    sb.append("    sourcechartId: ").append(toIndentedString(sourcechartId)).append("\n");
    sb.append("    copied: ").append(toIndentedString(copied)).append("\n");
    sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
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

