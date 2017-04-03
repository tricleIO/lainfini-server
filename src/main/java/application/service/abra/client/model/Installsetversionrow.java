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
 * Installsetversionrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Installsetversionrow   {
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

  @SerializedName("isclassidtext")
  private String isclassidtext = null;

  @SerializedName("kindname")
  private String kindname = null;

  @SerializedName("name")
  private String name = null;

  public Installsetversionrow displayname(String displayname) {
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

  public Installsetversionrow id(String id) {
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

  public Installsetversionrow classid(String classid) {
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

  public Installsetversionrow objversion(Integer objversion) {
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

  public Installsetversionrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu verze instalační sady [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu verze instalační sady [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Installsetversionrow isclassid(String isclassid) {
    this.isclassid = isclassid;
    return this;
  }

   /**
   * třída [persistentní položka]
   * @return isclassid
  **/
  @ApiModelProperty(example = "null", value = "třída [persistentní položka]")
  public String getIsclassid() {
    return isclassid;
  }

  public void setIsclassid(String isclassid) {
    this.isclassid = isclassid;
  }

  public Installsetversionrow identifier(String identifier) {
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

  public Installsetversionrow isclassidtext(String isclassidtext) {
    this.isclassidtext = isclassidtext;
    return this;
  }

   /**
   * typ položky
   * @return isclassidtext
  **/
  @ApiModelProperty(example = "null", value = "typ položky")
  public String getIsclassidtext() {
    return isclassidtext;
  }

  public void setIsclassidtext(String isclassidtext) {
    this.isclassidtext = isclassidtext;
  }

  public Installsetversionrow kindname(String kindname) {
    this.kindname = kindname;
    return this;
  }

   /**
   * zařazení
   * @return kindname
  **/
  @ApiModelProperty(example = "null", value = "zařazení")
  public String getKindname() {
    return kindname;
  }

  public void setKindname(String kindname) {
    this.kindname = kindname;
  }

  public Installsetversionrow name(String name) {
    this.name = name;
    return this;
  }

   /**
   * název
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installsetversionrow installsetversionrow = (Installsetversionrow) o;
    return Objects.equals(this.displayname, installsetversionrow.displayname) &&
        Objects.equals(this.id, installsetversionrow.id) &&
        Objects.equals(this.classid, installsetversionrow.classid) &&
        Objects.equals(this.objversion, installsetversionrow.objversion) &&
        Objects.equals(this.parentId, installsetversionrow.parentId) &&
        Objects.equals(this.isclassid, installsetversionrow.isclassid) &&
        Objects.equals(this.identifier, installsetversionrow.identifier) &&
        Objects.equals(this.isclassidtext, installsetversionrow.isclassidtext) &&
        Objects.equals(this.kindname, installsetversionrow.kindname) &&
        Objects.equals(this.name, installsetversionrow.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, isclassid, identifier, isclassidtext, kindname, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installsetversionrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    isclassid: ").append(toIndentedString(isclassid)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    isclassidtext: ").append(toIndentedString(isclassidtext)).append("\n");
    sb.append("    kindname: ").append(toIndentedString(kindname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

