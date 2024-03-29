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

import java.util.Objects;


/**
 * Export
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Export   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("system")
  private Boolean system = null;

  @SerializedName("datasource")
  private String datasource = null;

  @SerializedName("exportid")
  private String exportid = null;

  @SerializedName("data")
  private byte[] data = null;

  @SerializedName("isform")
  private Boolean isform = null;

  @SerializedName("owner_id")
  private String ownerId = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("hash")
  private String hash = null;

  public Export displayname(String displayname) {
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

  public Export id(String id) {
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

  public Export classid(String classid) {
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

  public Export objversion(Integer objversion) {
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

  public Export title(String title) {
    this.title = title;
    return this;
  }

   /**
   * název [persistentní položka]
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "název [persistentní položka]")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Export system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * systémová [persistentní položka]
   * @return system
  **/
  @ApiModelProperty(example = "null", value = "systémová [persistentní položka]")
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }

  public Export datasource(String datasource) {
    this.datasource = datasource;
    return this;
  }

   /**
   * datový zdroj [persistentní položka]
   * @return datasource
  **/
  @ApiModelProperty(example = "null", value = "datový zdroj [persistentní položka]")
  public String getDatasource() {
    return datasource;
  }

  public void setDatasource(String datasource) {
    this.datasource = datasource;
  }

  public Export exportid(String exportid) {
    this.exportid = exportid;
    return this;
  }

   /**
   * guid sestavy [persistentní položka]
   * @return exportid
  **/
  @ApiModelProperty(example = "null", value = "guid sestavy [persistentní položka]")
  public String getExportid() {
    return exportid;
  }

  public void setExportid(String exportid) {
    this.exportid = exportid;
  }

  public Export data(byte[] data) {
    this.data = data;
    return this;
  }

   /**
   * data sestavy [persistentní položka]
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "data sestavy [persistentní položka]")
  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  public Export isform(Boolean isform) {
    this.isform = isform;
    return this;
  }

   /**
   * je formulář [persistentní položka]
   * @return isform
  **/
  @ApiModelProperty(example = "null", value = "je formulář [persistentní položka]")
  public Boolean getIsform() {
    return isform;
  }

  public void setIsform(Boolean isform) {
    this.isform = isform;
  }

  public Export ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * vlastník; id objektu uživatel [persistentní položka]
   * @return ownerId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu uživatel [persistentní položka]")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public Export createdbyId(String createdbyId) {
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

  public Export correctedbyId(String correctedbyId) {
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

  public Export hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * hash [persistentní položka]
   * @return hash
  **/
  @ApiModelProperty(example = "null", value = "hash [persistentní položka]")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Export export = (Export) o;
    return Objects.equals(this.displayname, export.displayname) &&
        Objects.equals(this.id, export.id) &&
        Objects.equals(this.classid, export.classid) &&
        Objects.equals(this.objversion, export.objversion) &&
        Objects.equals(this.title, export.title) &&
        Objects.equals(this.system, export.system) &&
        Objects.equals(this.datasource, export.datasource) &&
        Objects.equals(this.exportid, export.exportid) &&
        Objects.equals(this.data, export.data) &&
        Objects.equals(this.isform, export.isform) &&
        Objects.equals(this.ownerId, export.ownerId) &&
        Objects.equals(this.createdbyId, export.createdbyId) &&
        Objects.equals(this.correctedbyId, export.correctedbyId) &&
        Objects.equals(this.hash, export.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, title, system, datasource, exportid, data, isform, ownerId, createdbyId, correctedbyId, hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Export {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
    sb.append("    exportid: ").append(toIndentedString(exportid)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isform: ").append(toIndentedString(isform)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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

