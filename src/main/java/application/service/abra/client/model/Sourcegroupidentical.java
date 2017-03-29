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
 * Sourcegroupidentical
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Sourcegroupidentical   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("source_id")
  private String sourceId = null;

  @SerializedName("target_id")
  private String targetId = null;

  @SerializedName("isuser")
  private Boolean isuser = null;

  public Sourcegroupidentical displayname(String displayname) {
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

  public Sourcegroupidentical id(String id) {
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

  public Sourcegroupidentical classid(String classid) {
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

  public Sourcegroupidentical objversion(Integer objversion) {
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

  public Sourcegroupidentical sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * zdr. skupina zdroje; id objektu zdrojová skupina [persistentní položka]
   * @return sourceId
  **/
  @ApiModelProperty(example = "null", value = "zdr. skupina zdroje; id objektu zdrojová skupina [persistentní položka]")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public Sourcegroupidentical targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * zdr. skupina cíle; id objektu zdrojová skupina [persistentní položka]
   * @return targetId
  **/
  @ApiModelProperty(example = "null", value = "zdr. skupina cíle; id objektu zdrojová skupina [persistentní položka]")
  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public Sourcegroupidentical isuser(Boolean isuser) {
    this.isuser = isuser;
    return this;
  }

   /**
   * uživatelský záznam [persistentní položka]
   * @return isuser
  **/
  @ApiModelProperty(example = "null", value = "uživatelský záznam [persistentní položka]")
  public Boolean getIsuser() {
    return isuser;
  }

  public void setIsuser(Boolean isuser) {
    this.isuser = isuser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sourcegroupidentical sourcegroupidentical = (Sourcegroupidentical) o;
    return Objects.equals(this.displayname, sourcegroupidentical.displayname) &&
        Objects.equals(this.id, sourcegroupidentical.id) &&
        Objects.equals(this.classid, sourcegroupidentical.classid) &&
        Objects.equals(this.objversion, sourcegroupidentical.objversion) &&
        Objects.equals(this.sourceId, sourcegroupidentical.sourceId) &&
        Objects.equals(this.targetId, sourcegroupidentical.targetId) &&
        Objects.equals(this.isuser, sourcegroupidentical.isuser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, sourceId, targetId, isuser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sourcegroupidentical {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    isuser: ").append(toIndentedString(isuser)).append("\n");
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

