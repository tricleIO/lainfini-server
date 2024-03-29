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
 * Postouchsubpage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Postouchsubpage   {
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

  @SerializedName("subpagecode")
  private Integer subpagecode = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("used")
  private Boolean used = null;

  @SerializedName("keys")
  private List<Postouchkey> keys = new ArrayList<Postouchkey>();

  public Postouchsubpage displayname(String displayname) {
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

  public Postouchsubpage id(String id) {
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

  public Postouchsubpage classid(String classid) {
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

  public Postouchsubpage objversion(Integer objversion) {
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

  public Postouchsubpage parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu sada tlačítek dotykové kasy - stránky [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu sada tlačítek dotykové kasy - stránky [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Postouchsubpage subpagecode(Integer subpagecode) {
    this.subpagecode = subpagecode;
    return this;
  }

   /**
   * kód [persistentní položka]
   * @return subpagecode
  **/
  @ApiModelProperty(example = "null", value = "kód [persistentní položka]")
  public Integer getSubpagecode() {
    return subpagecode;
  }

  public void setSubpagecode(Integer subpagecode) {
    this.subpagecode = subpagecode;
  }

  public Postouchsubpage name(String name) {
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

  public Postouchsubpage used(Boolean used) {
    this.used = used;
    return this;
  }

   /**
   * používat [persistentní položka]
   * @return used
  **/
  @ApiModelProperty(example = "null", value = "používat [persistentní položka]")
  public Boolean getUsed() {
    return used;
  }

  public void setUsed(Boolean used) {
    this.used = used;
  }

  public Postouchsubpage keys(List<Postouchkey> keys) {
    this.keys = keys;
    return this;
  }

  public Postouchsubpage addKeysItem(Postouchkey keysItem) {
    this.keys.add(keysItem);
    return this;
  }

   /**
   * tlačítka; kolekce bo sada tlačítek dotykové kasy - klávesa [nepersistentní položka]
   * @return keys
  **/
  @ApiModelProperty(example = "null", value = "tlačítka; kolekce bo sada tlačítek dotykové kasy - klávesa [nepersistentní položka]")
  public List<Postouchkey> getKeys() {
    return keys;
  }

  public void setKeys(List<Postouchkey> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Postouchsubpage postouchsubpage = (Postouchsubpage) o;
    return Objects.equals(this.displayname, postouchsubpage.displayname) &&
        Objects.equals(this.id, postouchsubpage.id) &&
        Objects.equals(this.classid, postouchsubpage.classid) &&
        Objects.equals(this.objversion, postouchsubpage.objversion) &&
        Objects.equals(this.parentId, postouchsubpage.parentId) &&
        Objects.equals(this.subpagecode, postouchsubpage.subpagecode) &&
        Objects.equals(this.name, postouchsubpage.name) &&
        Objects.equals(this.used, postouchsubpage.used) &&
        Objects.equals(this.keys, postouchsubpage.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, subpagecode, name, used, keys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Postouchsubpage {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    subpagecode: ").append(toIndentedString(subpagecode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

