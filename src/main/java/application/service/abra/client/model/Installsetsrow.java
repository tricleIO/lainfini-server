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
 * Installsetsrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Installsetsrow   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("isclassid")
  private String isclassid = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("datainstalled")
  private byte[] datainstalled = null;

  @SerializedName("dataimported")
  private byte[] dataimported = null;

  @SerializedName("installeddataversion")
  private Integer installeddataversion = null;

  @SerializedName("instalationdate$date")
  private DateTime instalationdatedate = null;

  @SerializedName("redundantfromversion")
  private Integer redundantfromversion = null;

  @SerializedName("exportable")
  private Boolean exportable = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("typ")
  private String typ = null;

  @SerializedName("kindname")
  private String kindname = null;

  @SerializedName("deleteanduninstall")
  private Boolean deleteanduninstall = null;

  @SerializedName("isinstalled")
  private Boolean isinstalled = null;

  public Installsetsrow displayname(String displayname) {
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

  public Installsetsrow id(String id) {
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

  public Installsetsrow classid(String classid) {
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

  public Installsetsrow objversion(Integer objversion) {
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

  public Installsetsrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu instalační sada [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu instalační sada [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Installsetsrow isclassid(String isclassid) {
    this.isclassid = isclassid;
    return this;
  }

   /**
   * třída instalační položky [persistentní položka]
   * @return isclassid
  **/
  @ApiModelProperty(example = "null", value = "třída instalační položky [persistentní položka]")
  public String getIsclassid() {
    return isclassid;
  }

  public void setIsclassid(String isclassid) {
    this.isclassid = isclassid;
  }

  public Installsetsrow identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * identifikátor [persistentní položka]
   * @return identifier
  **/
  @ApiModelProperty(example = "null", value = "identifikátor [persistentní položka]")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Installsetsrow category(String category) {
    this.category = category;
    return this;
  }

   /**
   * kategorie položky instalační sady [persistentní položka]
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "kategorie položky instalační sady [persistentní položka]")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Installsetsrow note(String note) {
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

  public Installsetsrow datainstalled(byte[] datainstalled) {
    this.datainstalled = datainstalled;
    return this;
  }

   /**
   * data položky [persistentní položka]
   * @return datainstalled
  **/
  @ApiModelProperty(example = "null", value = "data položky [persistentní položka]")
  public byte[] getDatainstalled() {
    return datainstalled;
  }

  public void setDatainstalled(byte[] datainstalled) {
    this.datainstalled = datainstalled;
  }

  public Installsetsrow dataimported(byte[] dataimported) {
    this.dataimported = dataimported;
    return this;
  }

   /**
   * data importovaná z jiné verze sady [persistentní položka]
   * @return dataimported
  **/
  @ApiModelProperty(example = "null", value = "data importovaná z jiné verze sady [persistentní položka]")
  public byte[] getDataimported() {
    return dataimported;
  }

  public void setDataimported(byte[] dataimported) {
    this.dataimported = dataimported;
  }

  public Installsetsrow installeddataversion(Integer installeddataversion) {
    this.installeddataversion = installeddataversion;
    return this;
  }

   /**
   * Číslo instalované verze [persistentní položka]
   * @return installeddataversion
  **/
  @ApiModelProperty(example = "null", value = "Číslo instalované verze [persistentní položka]")
  public Integer getInstalleddataversion() {
    return installeddataversion;
  }

  public void setInstalleddataversion(Integer installeddataversion) {
    this.installeddataversion = installeddataversion;
  }

  public Installsetsrow instalationdatedate(DateTime instalationdatedate) {
    this.instalationdatedate = instalationdatedate;
    return this;
  }

   /**
   * datum instalace [persistentní položka]
   * @return instalationdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum instalace [persistentní položka]")
  public DateTime getInstalationdatedate() {
    return instalationdatedate;
  }

  public void setInstalationdatedate(DateTime instalationdatedate) {
    this.instalationdatedate = instalationdatedate;
  }

  public Installsetsrow redundantfromversion(Integer redundantfromversion) {
    this.redundantfromversion = redundantfromversion;
    return this;
  }

   /**
   * datum odstranění [persistentní položka]
   * @return redundantfromversion
  **/
  @ApiModelProperty(example = "null", value = "datum odstranění [persistentní položka]")
  public Integer getRedundantfromversion() {
    return redundantfromversion;
  }

  public void setRedundantfromversion(Integer redundantfromversion) {
    this.redundantfromversion = redundantfromversion;
  }

  public Installsetsrow exportable(Boolean exportable) {
    this.exportable = exportable;
    return this;
  }

   /**
   * exportovatelná položka [persistentní položka]
   * @return exportable
  **/
  @ApiModelProperty(example = "null", value = "exportovatelná položka [persistentní položka]")
  public Boolean getExportable() {
    return exportable;
  }

  public void setExportable(Boolean exportable) {
    this.exportable = exportable;
  }

  public Installsetsrow name(String name) {
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

  public Installsetsrow typ(String typ) {
    this.typ = typ;
    return this;
  }

   /**
   * typ
   * @return typ
  **/
  @ApiModelProperty(example = "null", value = "typ")
  public String getTyp() {
    return typ;
  }

  public void setTyp(String typ) {
    this.typ = typ;
  }

  public Installsetsrow kindname(String kindname) {
    this.kindname = kindname;
    return this;
  }

   /**
   * zařazení [persistentní položka]
   * @return kindname
  **/
  @ApiModelProperty(example = "null", value = "zařazení [persistentní položka]")
  public String getKindname() {
    return kindname;
  }

  public void setKindname(String kindname) {
    this.kindname = kindname;
  }

  public Installsetsrow deleteanduninstall(Boolean deleteanduninstall) {
    this.deleteanduninstall = deleteanduninstall;
    return this;
  }

   /**
   * Řádek může být odebrán ze sady
   * @return deleteanduninstall
  **/
  @ApiModelProperty(example = "null", value = "Řádek může být odebrán ze sady")
  public Boolean getDeleteanduninstall() {
    return deleteanduninstall;
  }

  public void setDeleteanduninstall(Boolean deleteanduninstall) {
    this.deleteanduninstall = deleteanduninstall;
  }

  public Installsetsrow isinstalled(Boolean isinstalled) {
    this.isinstalled = isinstalled;
    return this;
  }

   /**
   * instalováno
   * @return isinstalled
  **/
  @ApiModelProperty(example = "null", value = "instalováno")
  public Boolean getIsinstalled() {
    return isinstalled;
  }

  public void setIsinstalled(Boolean isinstalled) {
    this.isinstalled = isinstalled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installsetsrow installsetsrow = (Installsetsrow) o;
    return Objects.equals(this.displayname, installsetsrow.displayname) &&
        Objects.equals(this.id, installsetsrow.id) &&
        Objects.equals(this.classid, installsetsrow.classid) &&
        Objects.equals(this.objversion, installsetsrow.objversion) &&
        Objects.equals(this.parentId, installsetsrow.parentId) &&
        Objects.equals(this.isclassid, installsetsrow.isclassid) &&
        Objects.equals(this.identifier, installsetsrow.identifier) &&
        Objects.equals(this.category, installsetsrow.category) &&
        Objects.equals(this.note, installsetsrow.note) &&
        Objects.equals(this.datainstalled, installsetsrow.datainstalled) &&
        Objects.equals(this.dataimported, installsetsrow.dataimported) &&
        Objects.equals(this.installeddataversion, installsetsrow.installeddataversion) &&
        Objects.equals(this.instalationdatedate, installsetsrow.instalationdatedate) &&
        Objects.equals(this.redundantfromversion, installsetsrow.redundantfromversion) &&
        Objects.equals(this.exportable, installsetsrow.exportable) &&
        Objects.equals(this.name, installsetsrow.name) &&
        Objects.equals(this.typ, installsetsrow.typ) &&
        Objects.equals(this.kindname, installsetsrow.kindname) &&
        Objects.equals(this.deleteanduninstall, installsetsrow.deleteanduninstall) &&
        Objects.equals(this.isinstalled, installsetsrow.isinstalled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, isclassid, identifier, category, note, datainstalled, dataimported, installeddataversion, instalationdatedate, redundantfromversion, exportable, name, typ, kindname, deleteanduninstall, isinstalled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installsetsrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    isclassid: ").append(toIndentedString(isclassid)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    datainstalled: ").append(toIndentedString(datainstalled)).append("\n");
    sb.append("    dataimported: ").append(toIndentedString(dataimported)).append("\n");
    sb.append("    installeddataversion: ").append(toIndentedString(installeddataversion)).append("\n");
    sb.append("    instalationdatedate: ").append(toIndentedString(instalationdatedate)).append("\n");
    sb.append("    redundantfromversion: ").append(toIndentedString(redundantfromversion)).append("\n");
    sb.append("    exportable: ").append(toIndentedString(exportable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    typ: ").append(toIndentedString(typ)).append("\n");
    sb.append("    kindname: ").append(toIndentedString(kindname)).append("\n");
    sb.append("    deleteanduninstall: ").append(toIndentedString(deleteanduninstall)).append("\n");
    sb.append("    isinstalled: ").append(toIndentedString(isinstalled)).append("\n");
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
