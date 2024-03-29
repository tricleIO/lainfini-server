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
 * Restrictionusagesrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Restrictionusagesrow   {
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

  @SerializedName("conditionid")
  private String conditionid = null;

  @SerializedName("numberofuse")
  private Integer numberofuse = null;

  public Restrictionusagesrow displayname(String displayname) {
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

  public Restrictionusagesrow id(String id) {
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

  public Restrictionusagesrow classid(String classid) {
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

  public Restrictionusagesrow objversion(Integer objversion) {
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

  public Restrictionusagesrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu statistika používání definic omezení [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu statistika používání definic omezení [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Restrictionusagesrow conditionid(String conditionid) {
    this.conditionid = conditionid;
    return this;
  }

   /**
   * podmínka [persistentní položka]
   * @return conditionid
  **/
  @ApiModelProperty(example = "null", value = "podmínka [persistentní položka]")
  public String getConditionid() {
    return conditionid;
  }

  public void setConditionid(String conditionid) {
    this.conditionid = conditionid;
  }

  public Restrictionusagesrow numberofuse(Integer numberofuse) {
    this.numberofuse = numberofuse;
    return this;
  }

   /**
   * počet použití [persistentní položka]
   * @return numberofuse
  **/
  @ApiModelProperty(example = "null", value = "počet použití [persistentní položka]")
  public Integer getNumberofuse() {
    return numberofuse;
  }

  public void setNumberofuse(Integer numberofuse) {
    this.numberofuse = numberofuse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Restrictionusagesrow restrictionusagesrow = (Restrictionusagesrow) o;
    return Objects.equals(this.displayname, restrictionusagesrow.displayname) &&
        Objects.equals(this.id, restrictionusagesrow.id) &&
        Objects.equals(this.classid, restrictionusagesrow.classid) &&
        Objects.equals(this.objversion, restrictionusagesrow.objversion) &&
        Objects.equals(this.parentId, restrictionusagesrow.parentId) &&
        Objects.equals(this.conditionid, restrictionusagesrow.conditionid) &&
        Objects.equals(this.numberofuse, restrictionusagesrow.numberofuse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, conditionid, numberofuse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restrictionusagesrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    conditionid: ").append(toIndentedString(conditionid)).append("\n");
    sb.append("    numberofuse: ").append(toIndentedString(numberofuse)).append("\n");
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

