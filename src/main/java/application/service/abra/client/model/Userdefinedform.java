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
 * Userdefinedform
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Userdefinedform   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("clsid")
  private String clsid = null;

  @SerializedName("system")
  private Boolean system = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("data")
  private byte[] data = null;

  @SerializedName("sourcecode")
  private String sourcecode = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("owner_id")
  private String ownerId = null;

  @SerializedName("clsidtext")
  private String clsidtext = null;

  @SerializedName("definitionid")
  private String definitionid = null;

  @SerializedName("preferred")
  private Boolean preferred = null;

  @SerializedName("sglobal")
  private Boolean sglobal = null;

  @SerializedName("hash")
  private String hash = null;

  public Userdefinedform displayname(String displayname) {
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

  public Userdefinedform id(String id) {
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

  public Userdefinedform classid(String classid) {
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

  public Userdefinedform objversion(Integer objversion) {
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

  public Userdefinedform clsid(String clsid) {
    this.clsid = clsid;
    return this;
  }

   /**
   * třída [persistentní položka]
   * @return clsid
  **/
  @ApiModelProperty(example = "null", value = "třída [persistentní položka]")
  public String getClsid() {
    return clsid;
  }

  public void setClsid(String clsid) {
    this.clsid = clsid;
  }

  public Userdefinedform system(Boolean system) {
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

  public Userdefinedform name(String name) {
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

  public Userdefinedform data(byte[] data) {
    this.data = data;
    return this;
  }

   /**
   * definice [persistentní položka]
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "definice [persistentní položka]")
  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  public Userdefinedform sourcecode(String sourcecode) {
    this.sourcecode = sourcecode;
    return this;
  }

   /**
   * zdrojový kód
   * @return sourcecode
  **/
  @ApiModelProperty(example = "null", value = "zdrojový kód")
  public String getSourcecode() {
    return sourcecode;
  }

  public void setSourcecode(String sourcecode) {
    this.sourcecode = sourcecode;
  }

  public Userdefinedform createdbyId(String createdbyId) {
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

  public Userdefinedform correctedbyId(String correctedbyId) {
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

  public Userdefinedform ownerId(String ownerId) {
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

  public Userdefinedform clsidtext(String clsidtext) {
    this.clsidtext = clsidtext;
    return this;
  }

   /**
   * třída (textově)
   * @return clsidtext
  **/
  @ApiModelProperty(example = "null", value = "třída (textově)")
  public String getClsidtext() {
    return clsidtext;
  }

  public void setClsidtext(String clsidtext) {
    this.clsidtext = clsidtext;
  }

  public Userdefinedform definitionid(String definitionid) {
    this.definitionid = definitionid;
    return this;
  }

   /**
   * guid definice [persistentní položka]
   * @return definitionid
  **/
  @ApiModelProperty(example = "null", value = "guid definice [persistentní položka]")
  public String getDefinitionid() {
    return definitionid;
  }

  public void setDefinitionid(String definitionid) {
    this.definitionid = definitionid;
  }

  public Userdefinedform preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

   /**
   * preferovaný [persistentní položka]
   * @return preferred
  **/
  @ApiModelProperty(example = "null", value = "preferovaný [persistentní položka]")
  public Boolean getPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  public Userdefinedform sglobal(Boolean sglobal) {
    this.sglobal = sglobal;
    return this;
  }

   /**
   * globální
   * @return sglobal
  **/
  @ApiModelProperty(example = "null", value = "globální")
  public Boolean getSglobal() {
    return sglobal;
  }

  public void setSglobal(Boolean sglobal) {
    this.sglobal = sglobal;
  }

  public Userdefinedform hash(String hash) {
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
    Userdefinedform userdefinedform = (Userdefinedform) o;
    return Objects.equals(this.displayname, userdefinedform.displayname) &&
        Objects.equals(this.id, userdefinedform.id) &&
        Objects.equals(this.classid, userdefinedform.classid) &&
        Objects.equals(this.objversion, userdefinedform.objversion) &&
        Objects.equals(this.clsid, userdefinedform.clsid) &&
        Objects.equals(this.system, userdefinedform.system) &&
        Objects.equals(this.name, userdefinedform.name) &&
        Objects.equals(this.data, userdefinedform.data) &&
        Objects.equals(this.sourcecode, userdefinedform.sourcecode) &&
        Objects.equals(this.createdbyId, userdefinedform.createdbyId) &&
        Objects.equals(this.correctedbyId, userdefinedform.correctedbyId) &&
        Objects.equals(this.ownerId, userdefinedform.ownerId) &&
        Objects.equals(this.clsidtext, userdefinedform.clsidtext) &&
        Objects.equals(this.definitionid, userdefinedform.definitionid) &&
        Objects.equals(this.preferred, userdefinedform.preferred) &&
        Objects.equals(this.sglobal, userdefinedform.sglobal) &&
        Objects.equals(this.hash, userdefinedform.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, clsid, system, name, data, sourcecode, createdbyId, correctedbyId, ownerId, clsidtext, definitionid, preferred, sglobal, hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Userdefinedform {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    clsid: ").append(toIndentedString(clsid)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    sourcecode: ").append(toIndentedString(sourcecode)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    clsidtext: ").append(toIndentedString(clsidtext)).append("\n");
    sb.append("    definitionid: ").append(toIndentedString(definitionid)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    sglobal: ").append(toIndentedString(sglobal)).append("\n");
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
