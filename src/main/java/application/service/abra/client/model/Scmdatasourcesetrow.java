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
 * Scmdatasourcesetrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Scmdatasourcesetrow   {
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

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("datasource_id")
  private String datasourceId = null;

  @SerializedName("conditions")
  private byte[] conditions = null;

  @SerializedName("system")
  private Boolean system = null;

  public Scmdatasourcesetrow displayname(String displayname) {
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

  public Scmdatasourcesetrow id(String id) {
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

  public Scmdatasourcesetrow classid(String classid) {
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

  public Scmdatasourcesetrow objversion(Integer objversion) {
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

  public Scmdatasourcesetrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu sada datových zdrojů [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu sada datových zdrojů [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Scmdatasourcesetrow posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Scmdatasourcesetrow datasourceId(String datasourceId) {
    this.datasourceId = datasourceId;
    return this;
  }

   /**
   * datový zdroj; id objektu datový zdroj [persistentní položka]
   * @return datasourceId
  **/
  @ApiModelProperty(example = "null", value = "datový zdroj; id objektu datový zdroj [persistentní položka]")
  public String getDatasourceId() {
    return datasourceId;
  }

  public void setDatasourceId(String datasourceId) {
    this.datasourceId = datasourceId;
  }

  public Scmdatasourcesetrow conditions(byte[] conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * podmínky [persistentní položka]
   * @return conditions
  **/
  @ApiModelProperty(example = "null", value = "podmínky [persistentní položka]")
  public byte[] getConditions() {
    return conditions;
  }

  public void setConditions(byte[] conditions) {
    this.conditions = conditions;
  }

  public Scmdatasourcesetrow system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * systémový [persistentní položka]
   * @return system
  **/
  @ApiModelProperty(example = "null", value = "systémový [persistentní položka]")
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scmdatasourcesetrow scmdatasourcesetrow = (Scmdatasourcesetrow) o;
    return Objects.equals(this.displayname, scmdatasourcesetrow.displayname) &&
        Objects.equals(this.id, scmdatasourcesetrow.id) &&
        Objects.equals(this.classid, scmdatasourcesetrow.classid) &&
        Objects.equals(this.objversion, scmdatasourcesetrow.objversion) &&
        Objects.equals(this.parentId, scmdatasourcesetrow.parentId) &&
        Objects.equals(this.posindex, scmdatasourcesetrow.posindex) &&
        Objects.equals(this.datasourceId, scmdatasourcesetrow.datasourceId) &&
        Objects.equals(this.conditions, scmdatasourcesetrow.conditions) &&
        Objects.equals(this.system, scmdatasourcesetrow.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, datasourceId, conditions, system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scmdatasourcesetrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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
