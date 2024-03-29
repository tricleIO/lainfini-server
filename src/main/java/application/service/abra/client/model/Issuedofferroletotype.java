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
 * Issuedofferroletotype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Issuedofferroletotype   {
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

  @SerializedName("securityrole_id")
  private String securityroleId = null;

  @SerializedName("securityuser_id")
  private String securityuserId = null;

  public Issuedofferroletotype displayname(String displayname) {
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

  public Issuedofferroletotype id(String id) {
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

  public Issuedofferroletotype classid(String classid) {
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

  public Issuedofferroletotype objversion(Integer objversion) {
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

  public Issuedofferroletotype parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu typ nabídky [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu typ nabídky [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Issuedofferroletotype securityroleId(String securityroleId) {
    this.securityroleId = securityroleId;
    return this;
  }

   /**
   * role řešitele; id objektu role [persistentní položka]
   * @return securityroleId
  **/
  @ApiModelProperty(example = "null", value = "role řešitele; id objektu role [persistentní položka]")
  public String getSecurityroleId() {
    return securityroleId;
  }

  public void setSecurityroleId(String securityroleId) {
    this.securityroleId = securityroleId;
  }

  public Issuedofferroletotype securityuserId(String securityuserId) {
    this.securityuserId = securityuserId;
    return this;
  }

   /**
   * Řešitel; id objektu uživatel [persistentní položka]
   * @return securityuserId
  **/
  @ApiModelProperty(example = "null", value = "Řešitel; id objektu uživatel [persistentní položka]")
  public String getSecurityuserId() {
    return securityuserId;
  }

  public void setSecurityuserId(String securityuserId) {
    this.securityuserId = securityuserId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issuedofferroletotype issuedofferroletotype = (Issuedofferroletotype) o;
    return Objects.equals(this.displayname, issuedofferroletotype.displayname) &&
        Objects.equals(this.id, issuedofferroletotype.id) &&
        Objects.equals(this.classid, issuedofferroletotype.classid) &&
        Objects.equals(this.objversion, issuedofferroletotype.objversion) &&
        Objects.equals(this.parentId, issuedofferroletotype.parentId) &&
        Objects.equals(this.securityroleId, issuedofferroletotype.securityroleId) &&
        Objects.equals(this.securityuserId, issuedofferroletotype.securityuserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, securityroleId, securityuserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issuedofferroletotype {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    securityroleId: ").append(toIndentedString(securityroleId)).append("\n");
    sb.append("    securityuserId: ").append(toIndentedString(securityuserId)).append("\n");
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

